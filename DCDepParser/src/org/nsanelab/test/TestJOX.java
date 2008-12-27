package org.nsanelab.test;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Paint;
import java.awt.Stroke;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JFrame;

import org.apache.commons.collections15.Transformer;

import com.wutka.jox.JOXBeanInputStream;
import com.wutka.jox.JOXBeanOutputStream;

import edu.uci.ics.jung.algorithms.layout.FRLayout;
import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.graph.DirectedGraph;
import edu.uci.ics.jung.graph.DirectedSparseGraph;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.visualization.BasicVisualizationServer;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;
import edu.uci.ics.jung.visualization.renderers.Renderer.VertexLabel.Position;

public class TestJOX {
	 public static void main(String[] args)
	    {
	        try
	        {

	        GenericComponent gComp;
	        GenericDependency[] gDep;
	        DependencyAggregation depAgg;
	        DirectedGraph<BaseComponent, GenericDependency> g = new DirectedSparseGraph<BaseComponent,GenericDependency>();
	 	   
	        gComp = read("/home/sarge/storage/sapspace/DCDepParser/comps/master/.dcdef");
	        depAgg = gComp.getDependencies();
	        gDep = depAgg.getDependency();
	            g.addVertex(gComp);
	        for(int i=0;i<gDep.length;i++){
	        	if(!g.containsVertex(gComp)){
	        	g.addVertex(gDep[i].getDc_ref());
	        	}
	        	if(!g.containsEdge(gDep[i])){
	        	g.addEdge(gDep[i], gComp,gDep[i].getDc_ref());
	        	}
	        }
	        
	        gComp = read("/home/sarge/storage/sapspace/DCDepParser/comps/slave/.dcdef");
	        depAgg = gComp.getDependencies();
	        gDep = depAgg.getDependency();
	            g.addVertex(gComp);
	        for(int i=0;i<gDep.length;i++){
	        	if(!g.containsVertex(gDep[i].getDc_ref())){
	        	g.addVertex(gDep[i].getDc_ref());
	        	}
	        	if(!g.containsEdge(gDep[i])){
	        	g.addEdge(gDep[i], gComp,gDep[i].getDc_ref());
	        	}
	        }
	        
	     //   System.out.println(g.toString());
	        visualizzaGrafo(g);
	        	
	        	
	        }
	        catch (Exception exc)
	        {
	            exc.printStackTrace();
	        }
	    }
	 private static GenericComponent read(String path) throws Exception{
         FileInputStream in = new FileInputStream(path);

         JOXBeanInputStream joxIn = new JOXBeanInputStream(in);

        GenericComponent testBean = (GenericComponent) joxIn.readObject(
             GenericComponent.class);

         return testBean;
	 }
	 
	 private static void write() throws Exception{
			GenericComponent master, slave;
        	GenericDependency dep, dep2;
        	DependencyAggregation depAgg;
        	
        	master = new GenericComponent();
        	master.setVendor("org.nsanelab");
        	master.setName("myMaster");
        	
        	dep = new GenericDependency();
      //  	dep.setType(DependencyType.TYPE_BUILDTIME);
        	dep.setDc_ref(master);
        	
        	dep2 = new GenericDependency();
        //	dep2.setType(DependencyType.TYPE_BUILDTIME);
        	dep2.setDc_ref(master);
        	
        	depAgg = new DependencyAggregation();
        	depAgg.setDependency(new GenericDependency[]{dep,dep2});
        	
        	slave = new GenericComponent();
        	slave.setVendor("org.nsanelab");
        	slave.setName("mySlave");
        	slave.setDependencies(depAgg);
        	
        	
        	FileOutputStream fileOut = new FileOutputStream("mytest.xml");
            JOXBeanOutputStream joxOut = new JOXBeanOutputStream(fileOut);

            joxOut.writeObject("VinTest", slave);

            joxOut.close();
	 }
	 private static void visualizzaGrafo(Graph< BaseComponent, GenericDependency> inGraph){
		// Layout<V, E>, BasicVisualizationServer<V,E>
		Layout<BaseComponent,GenericDependency> layout = new FRLayout<BaseComponent,GenericDependency>( inGraph);
		layout.setSize(new Dimension(1024,768));
		BasicVisualizationServer<BaseComponent,GenericDependency> vv =
		new BasicVisualizationServer<BaseComponent,GenericDependency>(layout);
		vv.setPreferredSize(new Dimension(1024,768));
		// Setup up a new vertex to paint transformer...
		Transformer<BaseComponent,Paint> vertexPaint = new Transformer<BaseComponent,Paint>() {
		public Paint transform(BaseComponent i) {
			Color retVal;
			if(i.getVendor().equals("sap.com")){
				retVal = Color.GRAY;
			} else{
				retVal = Color.WHITE;
			}
		return retVal;
		}
		};
		// Set up a new stroke Transformer for the edges
		float dash[] = {0.5f};
		final Stroke edgeStroke = new BasicStroke(0.5f, BasicStroke.CAP_SQUARE,
		BasicStroke.JOIN_ROUND, 10.0f, dash, 0.0f);
		Transformer<GenericDependency, Stroke> edgeStrokeTransformer =
		new Transformer<GenericDependency, Stroke>() {
		public Stroke transform(GenericDependency s) {
		return edgeStroke;
		}
		};
		vv.getRenderContext().setVertexFillPaintTransformer(vertexPaint);
		vv.getRenderContext().setEdgeStrokeTransformer(edgeStrokeTransformer);
		vv.getRenderContext().setVertexLabelTransformer(new ToStringLabeller());
		vv.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller());
		vv.getRenderer().getVertexLabelRenderer().setPosition(Position.CNTR);
		JFrame frame = new JFrame("Simple Graph View 2");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(vv);
		frame.pack();
		frame.setVisible(true);
	 }
}
