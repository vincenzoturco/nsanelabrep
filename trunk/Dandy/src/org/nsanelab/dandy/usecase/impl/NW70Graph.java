/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nsanelab.dandy.usecase.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import org.nsanelab.dandy.domain.iface.IGenericComp;
import org.nsanelab.dandy.domain.iface.IGenericCompFactory;
import org.nsanelab.dandy.domain.iface.IGenericCompFactoryBuilder;
import org.nsanelab.dandy.domain.impl.GenericCompFactoryBuilder;
import org.nsanelab.dandy.utils.PathFinder;
import org.nsanelab.dandy.xml.iface.ICompMetadata;
import org.nsanelab.dandy.xml.iface.ICompMetadataFactory;
import org.nsanelab.dandy.xml.iface.ICompMetadataFactoryBuilder;
import org.nsanelab.dandy.xml.impl.CompMetadataFactoryBuilder;

/**
 *
 * @author vin
 */
public class NW70Graph {

    private JFrame mainFrame;

    public NW70Graph(JFrame frame) {
        this.mainFrame = frame;
    }

    public void doUseCase() {
        ICompMetadataFactoryBuilder xmlbuilder = new CompMetadataFactoryBuilder();
        ICompMetadataFactory xmlfactory = xmlbuilder.factoryInstance();
        IGenericCompFactoryBuilder domBuilder = new GenericCompFactoryBuilder();
        IGenericCompFactory domFactory = domBuilder.factoryInstance();

        JFileChooser chooser = new JFileChooser();
        Collection<String> descPaths;
        Iterator<String> descPathStr;
        Collection<ICompMetadata> xmlCompColl;
        Collection<IGenericComp> domCompColl;

        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        String retVal = "";
        //chooser.addChoosableFileFilter (new FileNameExtensionFilter ("File XML", "xml"));

        int returnVal = chooser.showOpenDialog(mainFrame);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            retVal = chooser.getSelectedFile().getAbsolutePath();

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


       




        System.out.println(domCompColl);
    }
}
