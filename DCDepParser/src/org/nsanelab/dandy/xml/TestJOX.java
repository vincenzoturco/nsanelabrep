package org.nsanelab.dandy.xml;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Paint;
import java.awt.Stroke;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

import org.apache.commons.collections15.Transformer;

import com.wutka.jox.JOXBeanInputStream;
import com.wutka.jox.JOXBeanOutputStream;

import edu.uci.ics.jung.algorithms.layout.CircleLayout;
import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.graph.DirectedGraph;
import edu.uci.ics.jung.graph.DirectedSparseGraph;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.visualization.BasicVisualizationServer;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;
import edu.uci.ics.jung.visualization.renderers.Renderer.VertexLabel.Position;

public class TestJOX {

	private static void addComp2Graph(
			DirectedGraph<BaseCompDefinition, GenericDependency> g, String path)
			throws Exception {
		GenericCompDefinition gComp;
		GenericDependency[] gDep;
		DependencyAggregation depAgg;

		gComp = read(path);
		depAgg = gComp.getDependencies();
		gDep = depAgg.getDependency();
		if (!gComp.isStandard()) {
			g.addVertex(gComp);
			for (int i = 0; i < gDep.length; i++) {

				if (!g.containsVertex(gComp)) {
					g.addVertex(gDep[i].getDc_ref());
				}
				if (!g.containsEdge(gDep[i])
						&& !gDep[i].getDc_ref().isStandard()) {
					g.addEdge(gDep[i], gComp, gDep[i].getDc_ref());
				}
			}
		}
	}

	public static void main(String[] args) {
		try {

			GenericCompDefinition gComp;
			GenericDependency[] gDep;
			DependencyAggregation depAgg;
			DirectedGraph<BaseCompDefinition, GenericDependency> g = new DirectedSparseGraph<BaseCompDefinition, GenericDependency>();
			Collection<String> descList;
			Iterator<String> descListIt;
			
			descList = getDescriptors(chooseRoot());
			descListIt = descList.iterator();
			
			while(descListIt.hasNext()){
				addComp2Graph(g, descListIt.next());
			}
			
//			addComp2Graph(g,
//					"/home/sarge/storage/sapspace/DCDepParser/comps/master/.dcdef");
//			addComp2Graph(g,
//					"/home/sarge/storage/sapspace/DCDepParser/comps/slave/.dcdef");
//			addComp2Graph(g,
//					"/home/sarge/storage/sapspace/DCDepParser/comps/master/.dcdef2");
//			addComp2Graph(g,
//					"/home/sarge/storage/sapspace/DCDepParser/comps/master/.dcdef3");
			
			// System.out.println(g.toString());
			visualizzaGrafo(g);

		} catch (Exception exc) {
			exc.printStackTrace();
		}
	}
	
	private static String chooseRoot(){
		JFrame frame = new JFrame("Selezione directory root");
		JFileChooser chooser = new JFileChooser ();
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		String retVal = "";
		//chooser.addChoosableFileFilter (new FileNameExtensionFilter ("File XML", "xml"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		int returnVal = chooser.showOpenDialog (frame);

		if (returnVal == JFileChooser.APPROVE_OPTION) {
		    retVal = chooser.getSelectedFile().getAbsolutePath();
		    
		}
		frame.setVisible(false);
		frame.dispose();
		return retVal;

	}
	
	private static GenericCompDefinition read(String path) throws Exception {
		FileInputStream in = new FileInputStream(path);

		JOXBeanInputStream joxIn = new JOXBeanInputStream(in);

		GenericCompDefinition testBean = (GenericCompDefinition) joxIn
				.readObject(GenericCompDefinition.class);

		return testBean;
	}

	private static void write() throws Exception {
		GenericCompDefinition master, slave;
		GenericDependency dep, dep2;
		DependencyAggregation depAgg;

		master = new GenericCompDefinition();
		master.setVendor("org.nsanelab");
		master.setName("myMaster");

		dep = new GenericDependency();
		// dep.setType(DependencyType.TYPE_BUILDTIME);
		dep.setDc_ref(master);

		dep2 = new GenericDependency();
		// dep2.setType(DependencyType.TYPE_BUILDTIME);
		dep2.setDc_ref(master);

		depAgg = new DependencyAggregation();
		depAgg.setDependency(new GenericDependency[] { dep, dep2 });

		slave = new GenericCompDefinition();
		slave.setVendor("org.nsanelab");
		slave.setName("mySlave");
		slave.setDependencies(depAgg);

		FileOutputStream fileOut = new FileOutputStream("mytest.xml");
		JOXBeanOutputStream joxOut = new JOXBeanOutputStream(fileOut);

		joxOut.writeObject("VinTest", slave);

		joxOut.close();
	}

	private static void visualizzaGrafo(
			Graph<BaseCompDefinition, GenericDependency> inGraph) {
		// Layout<V, E>, BasicVisualizationServer<V,E>
		Layout<BaseCompDefinition, GenericDependency> layout = new CircleLayout<BaseCompDefinition, GenericDependency>(
				inGraph);
		layout.setSize(new Dimension(1500, 900));
		BasicVisualizationServer<BaseCompDefinition, GenericDependency> vv = new BasicVisualizationServer<BaseCompDefinition, GenericDependency>(
				layout);
		vv.setPreferredSize(new Dimension(1500, 900));
		// Setup up a new vertex to paint transformer...
		Transformer<BaseCompDefinition, Paint> vertexPaint = new Transformer<BaseCompDefinition, Paint>() {
			public Paint transform(BaseCompDefinition i) {
				Color retVal;
				if (i.getVendor().equals("sap.com")) {
					retVal = Color.GRAY;
				} else {
					retVal = Color.WHITE;
				}
				return retVal;
			}
		};
		// Set up a new stroke Transformer for the edges
		float dash[] = { 0.5f };
		final Stroke edgeStroke = new BasicStroke(0.5f, BasicStroke.CAP_SQUARE,
				BasicStroke.JOIN_ROUND, 10.0f, dash, 0.0f);
		Transformer<GenericDependency, Stroke> edgeStrokeTransformer = new Transformer<GenericDependency, Stroke>() {
			public Stroke transform(GenericDependency s) {
				return edgeStroke;
			}
		};
		vv.getRenderContext().setVertexFillPaintTransformer(vertexPaint);
		vv.getRenderContext().setEdgeStrokeTransformer(edgeStrokeTransformer);
		vv.getRenderContext().setVertexLabelTransformer(new ToStringLabeller());
		vv.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller());
		vv.getRenderer().getVertexLabelRenderer().setPosition(Position.AUTO);
		JFrame frame = new JFrame("Dependency Pattern detector");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(vv);
		frame.pack();
		frame.setVisible(true);
	}

	private static Collection<String> getDescriptors(String rootPath) {
		File root, temp;
		File[] childrenList;
		Collection<String> descPathList;

		descPathList = new LinkedList<String>();

		root = new File(rootPath);

		if (!root.isDirectory()) {
			// do nothing
		} else {
			childrenList = root.listFiles();
			for (int i = 0; i < childrenList.length; i++) {
				if (childrenList[i].isDirectory()) {
					descPathList.addAll(getDescriptors(childrenList[i]
							.getAbsolutePath()));
				} else{
					if(childrenList[i].getName().indexOf(".dcdef")!=-1){
							descPathList.add(childrenList[i].getAbsolutePath());
				}
			}

		}
		
	}
		return descPathList;
}
}
