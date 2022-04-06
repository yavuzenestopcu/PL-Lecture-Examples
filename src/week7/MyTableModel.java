/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week7;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Yavuuz
 */
public class MyTableModel extends AbstractTableModel{

    private Object[] columnNames;
    private Object[][] data;

    public MyTableModel(Object[] columnNames, Object[][] data) {
        this.columnNames = columnNames;
        this.data = data;
    }

      
    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if(columnIndex == 1)
            return false;
        else
            return true;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        data[rowIndex][columnIndex] = aValue;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return data[0][columnIndex].getClass();
    }
    
    
    
    
    
    
    
}
