/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nsanelab.dandy.usecase.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.JFileChooser;
import javax.swing.JTabbedPane;

import org.nsanelab.dandy.domain.iface.IGenericComp;
import org.nsanelab.dandy.domain.iface.IGenericCompFactory;
import org.nsanelab.dandy.domain.iface.IGenericCompFactoryBuilder;
import org.nsanelab.dandy.domain.impl.GenericCompFactoryBuilder;
import org.nsanelab.dandy.usecase.iface.IUIDependencyGraph;
import org.nsanelab.dandy.utils.PathFinder;
import org.nsanelab.dandy.xml.iface.ICompMetadataFactory;
import org.nsanelab.dandy.xml.iface.ICompMetadataFactoryBuilder;
import org.nsanelab.dandy.xml.impl.CompMetadataFactoryBuilder;
import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.graph.DirectedGraph;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.visualization.BasicVisualizationServer;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;
import edu.uci.ics.jung.visualization.renderers.Renderer.VertexLabel.Position;
import edu.uci.ics.jung.algorithms.layout.CircleLayout;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Paint;
import java.awt.Stroke;
import java.io.File;
import java.io.Serializable;
import javax.swing.JComponent;
import javax.swing.SwingWorker;
import org.apache.commons.collections15.Transformer;
import org.nsanelab.dandy.domain.EDependencyTime;
import org.nsanelab.dandy.domain.iface.IBaseDependency;
import org.nsanelab.dandy.exceptions.NoDescriptorFoundException;
import org.nsanelab.dandy.graph.iface.IGraphFactory;
import org.nsanelab.dandy.graph.iface.IGraphFactoryBuilder;
import org.nsanelab.dandy.graph.impl.GraphFactoryBuilder;
import org.nsanelab.dandy.graph.impl.GraphFactoryWithStandardBuilder;
import org.nsanelab.dandy.ui.impl.StatusMngr;
import org.nsanelab.dandy.ui.impl.TopFrame;

/**
 * @author vin
 * @uml.dependency 
 *                 supplier="org.nsanelab.dandy.graph.iface.IGraphFactoryBuilder"
 * @uml.dependency supplier="org.nsanelab.dandy.graph.iface.IGraphFactory"
 */
public class NW70Graph extends SwingWorker<Void, Void> implements IUIDependencyGraph, Serializable {

    boolean includeStandard;

    public NW70Graph(TopFrame frame) {
        this.mainFrame = frame;
        this.includeStandard = false;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.nsanelab.dandy.usecase.impl.UIGraph#doGraph()
     */
    public void doGraph() {
        ICompMetadataFactoryBuilder xmlbuilder = new CompMetadataFactoryBuilder();
        ICompMetadataFactory xmlfactory = xmlbuilder.factoryInstance();
        IGenericCompFactoryBuilder domBuilder = new GenericCompFactoryBuilder();
        IGenericCompFactory domFactory = domBuilder.factoryInstance();
        IGraphFactory graphFactory = buildFactory();

        JFileChooser chooser = new JFileChooser();
        Collection<String> descPaths = null;
        Iterator<String> descPathStr;

        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setDialogTitle("Select root directory for component auto-detection");
        String retVal = "";
        // chooser.addChoosableFileFilter (new FileNameExtensionFilter
        // ("File XML", "xml"));

        this.mainFrame.setOperationRunning(StatusMngr.ST_SELECTING);
        int returnVal = chooser.showOpenDialog(mainFrame);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            retVal = chooser.getSelectedFile().getAbsolutePath();

        } else {
            this.mainFrame.setOperationStopped(StatusMngr.ST_ABORTED);
            return;
        }

        descPaths = PathFinder.getDescriptors(retVal);

        // xmlCompColl = new LinkedList<ICompMetadata>();
        domCompColl = new LinkedList<IGenericComp>();
        if (descPaths.size() == 0) {
            //no descriptor found
            this.mainFrame.setOperationStopped(StatusMngr.ST_NO_DC_FOUND);
            return;

        } else {
            //set the ui status
            this.mainFrame.setOperationRunning(StatusMngr.ST_GRAPH_GENERATION);
            for (descPathStr = descPaths.iterator(); descPathStr.hasNext();) {
                try {
                    domCompColl.add(domFactory.create(xmlfactory.create(descPathStr.next())));
                } catch (Exception f) {
                    f.printStackTrace();
                }
            }

            graph = graphFactory.create(domCompColl);

            outComp = showGraph(graph);
            outComp.setBackground(Color.WHITE);
            this.mainFrame.getTabs().addTab(
                    retVal.substring(retVal.lastIndexOf(File.separator) + 1),
                    outComp);
            this.mainFrame.getTabs().setSelectedComponent(outComp);
            this.mainFrame.setAllIcons();
            //set the ui status
            this.mainFrame.setOperationStopped(StatusMngr.ST_TASK_COMPLETE);
            this.mainFrame.setOperationCompletionLevel(StatusMngr.DEFAULT_TASK_SIZE, StatusMngr.DEFAULT_TASK_SIZE);
        }
    }

    private JComponent showGraph(Graph<IGenericComp, IBaseDependency> inGraph) {
        // Layout<V, E>, BasicVisualizationServer<V,E>
        Layout<IGenericComp, IBaseDependency> layout = new CircleLayout<IGenericComp, IBaseDependency>(
                inGraph);
        Dimension graphDim = mainFrame.getTabs().getSize();
        graphDim.height -= 50;
        layout.setSize(graphDim);
        BasicVisualizationServer<IGenericComp, IBaseDependency> vv = new BasicVisualizationServer<IGenericComp, IBaseDependency>(
                layout);
        vv.setPreferredSize(graphDim);
        // Setup up a new vertex to paint transformer...
        Transformer<IGenericComp, Paint> vertexPaint = new Transformer<IGenericComp, Paint>() {

            public Paint transform(IGenericComp i) {
                Color retVal;
                if (i.isStandard()) {
                    retVal = Color.GRAY;
                } else {
                    retVal = Color.WHITE;
                }
                return retVal;
            }
        };
        // Set up a new stroke Transformer for the edges
        float buildDash[] = {0.5f};
        float runDash[] = {3.5f};
        final Stroke buildStroke = new BasicStroke(0.5f,
                BasicStroke.CAP_SQUARE, BasicStroke.JOIN_ROUND, 10.0f,
                buildDash, 0.0f);
        final Stroke runStroke = new BasicStroke(0.5f, BasicStroke.CAP_SQUARE,
                BasicStroke.JOIN_ROUND, 10.0f, runDash, 0.0f);
        Transformer<IBaseDependency, Stroke> edgeStrokeTransformer = new Transformer<IBaseDependency, Stroke>() {

            public Stroke transform(IBaseDependency s) {
                if (s.getInfo().getDepTime().equals(EDependencyTime.build)) {
                    return buildStroke;
                } else {
                    return runStroke;

                }
            }
        };
        vv.getRenderContext().setVertexFillPaintTransformer(vertexPaint);
        vv.getRenderContext().setEdgeStrokeTransformer(edgeStrokeTransformer);
        vv.getRenderContext().setVertexLabelTransformer(new ToStringLabeller());
        vv.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller());
        vv.getRenderer().getVertexLabelRenderer().setPosition(Position.AUTO);
        vv.setBackground(Color.WHITE);
        return vv;

    }
    /**
     * @uml.property name="mainFrame"
     *
     */
    private TopFrame mainFrame;

    /**
     * Getter of the property <tt>mainFrame</tt>
     *
     * @return Returns the frame.
     * @uml.property name="mainFrame"
     */
    public TopFrame getMainFrame() {
        return mainFrame;
    }

    /**
     * Setter of the property <tt>mainFrame</tt>
     *
     * @param mainFrame
     *            The frame to set.
     * @uml.property name="mainFrame"
     */
    public void setMainFrame(TopFrame mainFrame) {
        this.mainFrame = mainFrame;
    }
    /**
     * @uml.property name="domCompColl"
     *
     *
     */
    private LinkedList<IGenericComp> domCompColl;

    /**
     * Getter of the property <tt>domCompColl</tt>
     *
     * @return Returns the domCompColl.
     * @uml.property name="domCompColl"
     */
    public LinkedList<IGenericComp> getDomCompColl() {
        return domCompColl;
    }

    /**
     * Setter of the property <tt>domCompColl</tt>
     *
     * @param domCompColl
     *            The domCompColl to set.
     * @uml.property name="domCompColl"
     */
    public void setDomCompColl(LinkedList<IGenericComp> domCompColl) {
        this.domCompColl = domCompColl;
    }
    /**
     * @uml.property name="graph"
     *
     */
    private DirectedGraph<IGenericComp, IBaseDependency> graph;

    /**
     * Getter of the property <tt>graph</tt>
     *
     * @return Returns the graph.
     * @uml.property name="graph"
     */
    public DirectedGraph<IGenericComp, IBaseDependency> getGraph() {
        return graph;
    }

    /**
     * Setter of the property <tt>graph</tt>
     *
     * @param graph
     *            The graph to set.
     * @uml.property name="graph"
     */
    public void setGraph(DirectedGraph<IGenericComp, IBaseDependency> graph) {
        this.graph = graph;
    }
    /**
     * Rendering component for generated graph.
     *
     * @uml.property name="outComp"
     */
    private JComponent outComp;

    /**
     * Getter of the property <tt>outComp</tt>
     *
     * @return Returns the outComp.
     * @uml.property name="outComp"
     */
    public JComponent getOutComp() {
        return outComp;
    }

    /**
     * Setter of the property <tt>outComp</tt>
     *
     * @param outComp
     *            The outComp to set.
     * @uml.property name="outComp"
     */
    public void setOutComp(JComponent outComp) {
        this.outComp = outComp;
    }

    /**
     * Performs re-rendering of the ui-graph representation of this graph
     */
    public JComponent refreshGraph() {

        return this.showGraph(graph);
    }

    @Override
    protected Void doInBackground() throws Exception {
        doGraph();
        return null;
    }

    public void setIncludeStandard(boolean val) {
        this.includeStandard = val;
    }

    @Override
    public boolean isIncludeStandard() {
        return this.includeStandard;
    }

    private IGraphFactory buildFactory() {

        IGraphFactoryBuilder builder;
        if (!this.includeStandard) {
            builder = new GraphFactoryBuilder();
        } else {
            builder = new GraphFactoryWithStandardBuilder();
        }
        return builder.factoryInstance();
    }

    @Override
    public boolean checkRuntimeCycles() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean checkComponentDefinitionCycles() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

 
