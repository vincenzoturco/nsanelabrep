/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nsanelab.dandy.usecase.impl;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import org.nsanelab.dandy.ui.impl.TopFrame;
import org.nsanelab.dandy.utils.ExtensionFileFilter;

/**
 *
 * @author vin
 */
public class ExportImage {

    private TopFrame frame;

    public ExportImage(TopFrame frame) {
        this.frame = frame;
    }

    public void doUseCase() {
        Component tab;
        JFileChooser chooser;
        String filePath;
        FileFilter filter;
        int returnVal;

        filter = new ExtensionFileFilter("Image files", new String[]{"JPG", "JPEG", "GIF", "PNG"});
        chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setFileFilter(filter);


        returnVal = chooser.showOpenDialog(frame);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            filePath = chooser.getSelectedFile().getAbsolutePath();

        } else {
            return;
        }




        tab = frame.getTabs().getSelectedComponent();
        Dimension size = tab.getSize();
        int w = size.width;
        int h = size.height;
        int type = BufferedImage.TYPE_INT_RGB;
        BufferedImage image = new BufferedImage(w, h, type);
        Graphics2D g2 = image.createGraphics();
        tab.paint(g2);
        g2.dispose();
        try {
            String ext = "png";  // bmp, gif, png okay
            File file = new File(filePath);
            if (file.exists()) {
                Object[] options = {"OK", "CANCEL"};
              int userChoice = JOptionPane.showOptionDialog(null, "File already exists, overwrite?", "Warning",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                        null, options, options[0]);
              if(userChoice!=0){
                  return;
              }
            }
            javax.imageio.ImageIO.write(image, ext, file);
        } catch (IOException e) {
            System.out.println("write error: " + e.getMessage());
        }
    }
}
