/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nsanelab.dandy.usecase.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.JFileChooser;
import org.nsanelab.dandy.domain.iface.IGenericComp;
import org.nsanelab.dandy.domain.iface.IGenericCompFactory;
import org.nsanelab.dandy.domain.iface.IGenericCompFactoryBuilder;
import org.nsanelab.dandy.domain.impl.GenericCompFactoryBuilder;
import org.nsanelab.dandy.utils.PathFinder;
import org.nsanelab.dandy.xml.iface.ICompMetadata;
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
import javax.swing.JComponent;
import org.apache.commons.collections15.Transformer;
import org.nsanelab.dandy.domain.EDependencyTime;
import org.nsanelab.dandy.domain.iface.IBaseDependency;
import org.nsanelab.dandy.graph.iface.IGraphFactory;
import org.nsanelab.dandy.graph.iface.IGraphFactoryBuilder;
import org.nsanelab.dandy.graph.impl.GraphFactoryBuilder;
import org.nsanelab.dandy.ui.impl.TopFrame;

/**
 *
 * @author vin
 */
public class NW70Graph {

    private TopFrame mainFrame;

    public NW70Graph(TopFrame frame) {
        this.mainFrame = frame;
    }

    public void doUseCase() {
        ICompMetadataFactoryBuilder xmlbuilder = new CompMetadataFactoryBuilder();
        ICompMetadataFactory xmlfactory = xmlbuilder.factoryInstance();
        IGenericCompFactoryBuilder domBuilder = new GenericCompFactoryBuilder();
        IGenericCompFactory domFactory = domBuilder.factoryInstance();
        IGraphFactoryBuilder graphBuilder = new GraphFactoryBuilder();
        IGraphFactory graphFactory = graphBuilder.factoryInstance();

        JFileChooser chooser = new JFileChooser();
        Collection<String> descPaths;
        Iterator<String> descPathStr;
        Collection<ICompMetadata> xmlCompColl;
        Collection<IGenericComp> domCompColl;

        DirectedGraph<IGenericComp, IBaseDependency> graph;

        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        String retVal = "";
        //chooser.addChoosableFileFilter (new FileNameExtensionFilter ("File XML", "xml"));

        int returnVal = chooser.showOpenDialog(mainFrame);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            retVal = chooser.getSelectedFile().getAbsolutePath();

        } else{
            return;
        }

        descPaths = PathFinder.getDescriptors(retVal);
        //   xmlCompColl = new LinkedList<ICompMetadata>();
        domCompColl = new LinkedList<IGenericComp>();

        for (descPathStr = descPaths.iterator(); descPathStr.hasNext();) {
            try {
                domCompColl.add(domFactory.create(xmlfactory.create(descPathStr.next())));
            } catch (Exception f) {
                f.printStackTrace();
            }
        }

        graph = graphFactory.create(domCompColl);

        JComponent outcomp = visualizzaGrafo(graph);
        outcomp.setBackground(Color.WHITE);
        this.mainFrame.getTabs().addTab(retVal.substring(retVal.lastIndexOf(File.separator)+1), outcomp);
        this.mainFrame.getTabs().setSelectedComponent(outcomp);

    }

    private JComponent visualizzaGrafo(
            Graph<IGenericComp, IBaseDependency> inGraph) {
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
        final Stroke buildStroke = new BasicStroke(0.5f, BasicStroke.CAP_SQUARE,
                BasicStroke.JOIN_ROUND, 10.0f, buildDash, 0.0f);
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
}
