package com.pereira.encomiendas.view.tablemodels;

import com.pereira.encomiendas.model.Emisor;
import com.pereira.encomiendas.model.Receptor;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

public class ReceptoresTableModel extends AbstractTableModel {

    private List<Receptor> list;
    private final String[] colNames = new String[]{"NOMBRE", "APELLIDO ", "DIRECCION", "TELEFONO"};
    private final Class[] colClass = new Class[]{String.class, String.class, String.class, String.class};

    public ReceptoresTableModel(List<Receptor> receptores) {
        this.list = receptores;
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
        Receptor row = getList().get(rowIndex);
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

    public Receptor getRow(int rowIndex) {
        return getList().get(rowIndex);
    }
    
    public List<Receptor> getList() {
        return list;
    }

    public void setList(List<Receptor> list) {
        this.list = list;
    }
    
    
    

}
