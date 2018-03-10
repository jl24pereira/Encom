package com.pereira.encomiendas.view.orden;

import com.pereira.encomiendas.view.emisor.*;
import com.pereira.encomiendas.controller.EmisorController;
import com.pereira.encomiendas.controller.OrdenController;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

public class View extends javax.swing.JDialog {

    private final OrdenController controller;

    public View(java.awt.Frame parent, boolean modal, String titulo) {
        super(parent, modal);
        controller = OrdenController.getCONTROLLER();
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle(titulo);
        cargarForm();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        panelDatos = new javax.swing.JPanel();
        lblOrden = new javax.swing.JLabel();
        txtOrden = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        lblEmisor = new javax.swing.JLabel();
        txtEmisor = new javax.swing.JLabel();
        lblReceptor = new javax.swing.JLabel();
        txtReceptor = new javax.swing.JLabel();
        lblViaje = new javax.swing.JLabel();
        txtViaje = new javax.swing.JLabel();
        lblPaquetes = new javax.swing.JLabel();
        txtPaquetes = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tPaquetes = new javax.swing.JTable();
        lblPeso = new javax.swing.JLabel();
        txtPeso = new javax.swing.JLabel();
        lblCosto = new javax.swing.JLabel();
        txtCosto = new javax.swing.JLabel();
        panelControles = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(350, 450));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        panelDatos.setBackground(new java.awt.Color(255, 255, 255));
        panelDatos.setMinimumSize(new java.awt.Dimension(350, 550));
        panelDatos.setPreferredSize(new java.awt.Dimension(350, 550));
        panelDatos.setLayout(new java.awt.GridBagLayout());

        lblOrden.setText("# Orden");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelDatos.add(lblOrden, gridBagConstraints);

        txtOrden.setMaximumSize(new java.awt.Dimension(300, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelDatos.add(txtOrden, gridBagConstraints);

        lblFecha.setText("F. Recibido:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelDatos.add(lblFecha, gridBagConstraints);

        txtFecha.setMaximumSize(new java.awt.Dimension(300, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelDatos.add(txtFecha, gridBagConstraints);

        lblEmisor.setText("Emisor:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelDatos.add(lblEmisor, gridBagConstraints);

        txtEmisor.setMaximumSize(new java.awt.Dimension(300, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelDatos.add(txtEmisor, gridBagConstraints);

        lblReceptor.setText("Receptor:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelDatos.add(lblReceptor, gridBagConstraints);

        txtReceptor.setMaximumSize(new java.awt.Dimension(300, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelDatos.add(txtReceptor, gridBagConstraints);

        lblViaje.setText("Viaje:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelDatos.add(lblViaje, gridBagConstraints);

        txtViaje.setMaximumSize(new java.awt.Dimension(300, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelDatos.add(txtViaje, gridBagConstraints);

        lblPaquetes.setText("# Paquetes:");
        lblPaquetes.setMaximumSize(new java.awt.Dimension(300, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelDatos.add(lblPaquetes, gridBagConstraints);

        txtPaquetes.setMaximumSize(new java.awt.Dimension(300, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelDatos.add(txtPaquetes, gridBagConstraints);

        tPaquetes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DETALLE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tPaquetes.setRowHeight(30);
        jScrollPane3.setViewportView(tPaquetes);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 10.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelDatos.add(jScrollPane3, gridBagConstraints);

        lblPeso.setText("Peso:");
        lblPeso.setMaximumSize(new java.awt.Dimension(300, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelDatos.add(lblPeso, gridBagConstraints);

        txtPeso.setMaximumSize(new java.awt.Dimension(300, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelDatos.add(txtPeso, gridBagConstraints);

        lblCosto.setText("Costo:");
        lblCosto.setMaximumSize(new java.awt.Dimension(300, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelDatos.add(lblCosto, gridBagConstraints);

        txtCosto.setMaximumSize(new java.awt.Dimension(300, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelDatos.add(txtCosto, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(panelDatos, gridBagConstraints);

        panelControles.setBackground(new java.awt.Color(255, 255, 255));
        panelControles.setLayout(new java.awt.GridBagLayout());

        btnCancelar.setText("Volver");
        btnCancelar.setMinimumSize(new java.awt.Dimension(100, 30));
        btnCancelar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelControles.add(btnCancelar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        jPanel1.add(panelControles, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblEmisor;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblOrden;
    private javax.swing.JLabel lblPaquetes;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblReceptor;
    private javax.swing.JLabel lblViaje;
    private javax.swing.JPanel panelControles;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JTable tPaquetes;
    private javax.swing.JLabel txtCosto;
    private javax.swing.JLabel txtEmisor;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JLabel txtOrden;
    private javax.swing.JLabel txtPaquetes;
    private javax.swing.JLabel txtPeso;
    private javax.swing.JLabel txtReceptor;
    private javax.swing.JLabel txtViaje;
    // End of variables declaration//GEN-END:variables

    private void cargarForm() {
        //System.out.println("ordenes enviadas: "+controller.getSeleccionado().getOrdenList().size());
        this.txtOrden.setText(""+controller.getSeleccionado().getNorden());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.txtFecha.setText(sdf.format(controller.getSeleccionado().getFrecibido()));
        this.txtEmisor.setText(controller.getSeleccionado().getEmisor().getNombres()+" "+controller.getSeleccionado().getEmisor().getApellidos());
        this.txtReceptor.setText(controller.getSeleccionado().getReceptor().getNombres()+" "+controller.getSeleccionado().getReceptor().getApellidos());
        this.txtViaje.setText(controller.getSeleccionado().getSalida().toString());
        this.txtCosto.setText("$ "+controller.getSeleccionado().getCosto());
        this.txtPeso.setText(controller.getSeleccionado().getPeso()+" LB");        
        controller.getSeleccionado().getPaqueteList().forEach(paquete->{
            Object row[] = {paquete.getDescripcion()};
            ((DefaultTableModel)tPaquetes.getModel()).addRow(row);
        });
    }
}
