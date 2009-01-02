package org.nsanelab.prototypes;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class TestDOM {

	public static void main(String[] args) {
		try {
			//
			// Create the XML Document
			//

			DocumentBuilderFactory dbfac = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = dbfac.newDocumentBuilder();
			Document doc = docBuilder.parse("./wdProperties");
			Element root = doc.getDocumentElement();
			NodeList nl = root.getElementsByTagName("ProjectProperties.LibraryReferences");
			Node firstNode = nl.item(0);
	//		System.out.println("proj prop: "+firstNode.getNodeName()+"; "+firstNode.getNodeValue());
			nl = firstNode.getChildNodes();
			
			for(int i=1;i<nl.getLength();i++){
				Node myNode = nl.item(i);
				//System.out.println(myNode.getNodeName()+"; "+myNode.getNodeValue());
				if(myNode.hasAttributes()){
				NamedNodeMap attr = myNode.getAttributes();
				System.out.println(attr.getNamedItem("libraryName").getNodeValue());
				System.out.println(attr.getNamedItem("name").getNodeValue());
				}
				}
			
			
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
