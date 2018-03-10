package com.pereira.encomiendas.view.tablemodels;

import com.pereira.encomiendas.model.Emisor;
import com.pereira.encomiendas.model.Orden;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class OrdenesTableModel extends AbstractTableModel {

    private List<Orden> list;
    private final String[] colNames = new String[]{"# ORDEN", "EMISOR ","TELEFONO", "RECEPTOR", "TELEFONO","# PAQUETES","RECIBIDO"};
    private final Class[] colClass = new Class[]{int.class, String.class, String.class, String.class,String.class,int.class,String.class};

    public OrdenesTableModel(List<Orden> list) {
        this.list = list;
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
        Orden row = getList().get(rowIndex);
        switch (columnIndex) {
            case 0:
                return row.getNorden();
            case 1:
                return row.getEmisor().getNombres()+" "+row.getEmisor().getApellidos();
            case 2:
                return row.getEmisor().getTelefono();
            case 3:
                return row.getReceptor().getNombres()+" "+row.getReceptor().getApellidos();
            case 4:
                return row.getReceptor().getTelefono();
            case 5:
                return row.getPaqueteList().size();
            case 6:
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                return sdf.format(row.getFrecibido());
            default:
                return null;
        }
    }

    public Orden getRow(int rowIndex) {
        return getList().get(rowIndex);
    }
    
    public List<Orden> getList() {
        return list;
    }

    public void setList(List<Orden> list) {
        this.list = list;
    }
    
    
    

}
