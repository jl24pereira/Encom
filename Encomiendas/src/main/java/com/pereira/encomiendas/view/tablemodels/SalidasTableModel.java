package com.pereira.encomiendas.view.tablemodels;

import com.pereira.encomiendas.controller.SalidaController;
import com.pereira.encomiendas.model.Salida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JButton;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

public class SalidasTableModel extends AbstractTableModel {

    private List<Salida> list;
    private final String[] colNames = new String[]{"DESTINO", "DETALLE ", "FECHA", "# ORDENES", "ESTADO"};
    private final Class[] colClass = new Class[]{String.class, String.class, String.class, int.class, String.class};

    public SalidasTableModel(List<Salida> salidas) {
        this.list = salidas;
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
        return getList().size();
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Salida row = getList().get(rowIndex);
        switch (columnIndex) {
            case 0:
                return row.getDestino();
            case 1:
                return row.getDetalle();
            case 2:
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                return sdf.format(row.getFecha());
            case 3:
                return row.getOrdenList().size();
            case 4:
                if(row.getFecha().before(new Date())){
                    return "ENVIADA";
                }else{
                    return "EN ESPERA";
                }
            default:
                return null;
        }
    }

    public Salida getRow(int rowIndex) {
        return getList().get(rowIndex);
    }
    
    public List<Salida> getList() {
        return list;
    }

    public void setList(List<Salida> list) {
        this.list = list;
    }
    
    
    

}
