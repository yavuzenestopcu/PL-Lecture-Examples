/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week7;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Yavuuz
 */
public class ColorCellRenderer extends JLabel implements TableCellRenderer {

    public ColorCellRenderer() {
        setOpaque(true);
    }

    
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object color, boolean isSelected, boolean hasFocus, int row, int column) {
        Color newColor = (Color)color;
        setBackground(newColor);
        return this;
    }
    
}
