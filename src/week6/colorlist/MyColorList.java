/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6.colorlist;

import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;


/**
 *
 * @author Yavuuz
 */
public class MyColorList extends JList<Object>{
    private Color oddColor;
    private Color evenColor;
    private DefaultListModel<Object> exampleModel;
    public MyColorList(){
        exampleModel = new DefaultListModel<>();
        exampleModel.addElement("Ornek1");
        exampleModel.addElement("Ornek2");
        exampleModel.addElement("Ornek3");
        setModel(exampleModel);
        this.setCellRenderer(new MyColorListCellRenderer());
        
    }

    public void setOddColor(Color oddColor) {
        this.oddColor = oddColor;
    }

    public void setEvenColor(Color evenColor) {
        this.evenColor = evenColor;
    }
    
    private class MyColorListCellRenderer extends DefaultListCellRenderer{

        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            System.out.println("aaaa");
            Component c = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            
            if(index % 2 == 0)
                c.setBackground(evenColor);
            else
                c.setBackground(oddColor);
            
            return c;
        }
        
       
        
    }
    
}
