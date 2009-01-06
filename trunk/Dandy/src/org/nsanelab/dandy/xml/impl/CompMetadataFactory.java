package org.nsanelab.dandy.xml.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.nsanelab.dandy.xml.iface.ICompMetadata;
import org.nsanelab.dandy.xml.iface.ICompMetadataFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.wutka.jox.JOXBeanInputStream;

public class CompMetadataFactory implements ICompMetadataFactory {

    private static final String levelOneTag = "ProjectProperties.LibraryReferences";
    private static final String levelTwoAttrName = "libraryName";
    private static final String dcDefFileName = ".dcdef";
    private static final String projPropsFileName = "ProjectProperties.wdproperties";
    private static final String projPropsRelativeFilePath = File.separator + "src" + File.separator + "packages" + File.separator + projPropsFileName;

    /**
     * Creates a new ICompMetadata instance.
     */
    @Override
    public ICompMetadata create(String pathToDescriptor)
            throws FileNotFoundException, IOException {
        ICompMetadata outDC = null;
        GenericCompDefinition compDef;
        SharingDependency[] sharDep = new SharingDependency[0];
        outDC = new CompMetadata();
        compDef = readCompDefinition(pathToDescriptor);
        try {
            sharDep = readSharingDependencies(pathToDescriptor);
        } catch (ParserConfigurationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        outDC.setDcData(compDef);
        outDC.setSharingDependencies(sharDep);


        return outDC;

    }

    private GenericCompDefinition readCompDefinition(String path)
            throws FileNotFoundException, IOException {
        FileInputStream in;
        JOXBeanInputStream joxIn;
        GenericCompDefinition outBean;
//JOX reads the .dcdef file
        in = new FileInputStream(path);

        joxIn = new JOXBeanInputStream(in);

        outBean = (GenericCompDefinition) joxIn.readObject(GenericCompDefinition.class);


        return outBean;
    }

    /**
     * Parses all the ProjectProperties.LibraryReferences sharing dependencies detected in the file found at the provided path
     * @param pathToDCDef the path to a valid .dcdef file
     * @return an array of SharingDependency, one for each detected dependency
     * @throws ParserConfigurationException
     * @throws Exception
     */
    private SharingDependency[] readSharingDependencies(String pathToDCDef)
            throws ParserConfigurationException, Exception {

        String pathToWdProps;
        ArrayList<SharingDependency> arrayOut;

        arrayOut = new ArrayList<SharingDependency>();
        DocumentBuilderFactory dbfac = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = dbfac.newDocumentBuilder();

        try {
            pathToWdProps = computeWdPropertiesPath(pathToDCDef);
        } catch (IllegalArgumentException e) {
            return arrayOut.toArray(new SharingDependency[0]);
        }



        Document doc = docBuilder.parse(pathToWdProps);
        Element root = doc.getDocumentElement();
        NodeList nl = root.getElementsByTagName(levelOneTag);
        if (nl.getLength() > 0) {
            Node firstNode = nl.item(0);
            nl = firstNode.getChildNodes();
            for (int i = 1; i < nl.getLength(); i++) {
                Node myNode = nl.item(i);
                if (myNode.hasAttributes()) {
                    NamedNodeMap attr = myNode.getAttributes();
                    String depQualifiedName = attr.getNamedItem(levelTwoAttrName).getNodeValue();
                    SharingDependency depObj = createSharingDependency(depQualifiedName);
                    arrayOut.add(depObj);
                }
            }
        }

        return arrayOut.toArray(new SharingDependency[0]);
    }

    private SharingDependency createSharingDependency(String qualifiedName) {
        int firstSlash;
        String vendor, dcName;
        SharingDependency shDep;
        BaseCompDefinition baseComp;

        firstSlash = qualifiedName.indexOf("/");
        vendor = qualifiedName.substring(0, firstSlash);
        dcName = qualifiedName.substring(firstSlash + 1);

        shDep = new SharingDependency();
        baseComp = new BaseCompDefinition();
        baseComp.setName(dcName);
        baseComp.setVendor(vendor);
        shDep.setIBaseCompDefinition(baseComp);

        return shDep;

    }

    private String computeWdPropertiesPath(String pathToDCDesc) throws IllegalArgumentException {
        File dcdef, projPropsFile;
        String rootDirPath, projPropsPath;

        dcdef = new File(pathToDCDesc);
        rootDirPath = dcdef.getParent();
        projPropsPath = rootDirPath + projPropsRelativeFilePath;

        projPropsFile = new File(projPropsPath);
        if (!projPropsFile.exists()) {
            throw new IllegalArgumentException("The path provided does not correspond to an existing file");
        } else {
            return projPropsPath;
        }


    }
}
