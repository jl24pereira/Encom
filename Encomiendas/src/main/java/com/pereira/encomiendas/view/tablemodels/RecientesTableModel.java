package com.pereira.encomiendas.view.tablemodels;

import com.pereira.encomiendas.model.Receptor;
import com.pereira.encomiendas.model.Reciente;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

public class RecientesTableModel extends AbstractTableModel {

    private List<Reciente> list;
    private String[][] vectorList;
    private final String[] colNames = new String[]{"NOMBRE", "APELLIDO ", "DIRECCION", "TELEFONO"};
    private final Class[] colClass = new Class[]{String.class, String.class, String.class, String.class};

    public RecientesTableModel(List<Reciente> emisores) {
        super();
        this.list = emisores;        
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return colClass[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return colNames[column];
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Receptor row = getList().get(rowIndex).getReceptor();
        switch (columnIndex) {
            case 0:
                return row.getNombres();
            case 1:
                return row.getApellidos();
            case 2:
                return row.getDireccion();
            case 3:
                return row.getTelefono();
            default:
                return null;
        }
    }

    public Reciente getRow(int rowIndex) {
        return getList().get(rowIndex);
    }
    
    public List<Reciente> getList() {
        return list;
    }

    public void setList(List<Reciente> list) {
        this.list = list;
    }
    
    
    

}
