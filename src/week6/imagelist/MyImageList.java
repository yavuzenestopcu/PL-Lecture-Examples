/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6.imagelist;

import java.awt.Component;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;

/**
 *
 * @author Yavuuz
 */
public class MyImageList extends JList<Object> {

    private String imagePath = "C:\\Users\\Yavuuz\\Documents\\GitHub\\PL-Lecture-Examples\\resources";
    private Map<String, ImageIcon> imageMap;
    private DefaultListModel<Object> exampleModel;

    public MyImageList() {
        generateImageList();
        exampleModel = new DefaultListModel();
        modelUpdate();
        setModel(exampleModel);
        this.setCellRenderer(new MyImageListCellRenderer());

    }
    
    private void modelUpdate(){
         exampleModel.clear();
         for (String str : imageMap.keySet())
            exampleModel.addElement(str);

    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
        generateImageList();
        modelUpdate();
    }

    private void generateImageList() {

        imageMap = new HashMap<>();
        File file = new File(imagePath);
        File[] files = file.listFiles();
        for (File fl : files) 
            imageMap.put(fl.getName(), new ImageIcon(imagePath
                    + "\\" + fl.getName()));
        
    }

    private class MyImageListCellRenderer extends DefaultListCellRenderer {

        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            JLabel c = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            if (c != null) {
                c.setIcon(imageMap.get(value.toString()));
                c.setHorizontalTextPosition(JLabel.RIGHT);
            }
            return c;
        }

    }

}
