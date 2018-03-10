package com.pereira.encomiendas.view.salida;

import com.pereira.encomiendas.view.emisor.*;
import com.pereira.encomiendas.controller.EmisorController;
import com.pereira.encomiendas.controller.SalidaController;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Create extends javax.swing.JDialog {

    private SalidaController controller;
    private boolean isEditar = false;

    public Create(java.awt.Frame parent, boolean modal, String titulo) {
        super(parent, modal);
        controller = SalidaController.getCONTROLLER();
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle(titulo);
    }
    
    public Create(java.awt.Frame parent, boolean modal, String titulo, boolean isEditar) {
        super(parent, modal);
        this.isEditar=isEditar;
        controller = SalidaController.getCONTROLLER();
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
        lblNombre = new javax.swing.JLabel();
        txtDestino = new javax.swing.JTextField();
        lblApellido = new javax.swing.JLabel();
        txtDetalle = new javax.swing.JTextField();
        lblDui = new javax.swing.JLabel();
        calendar = new com.toedter.calendar.JCalendar();
        panelControles = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        panelDatos.setBackground(new java.awt.Color(255, 255, 255));
        panelDatos.setLayout(new java.awt.GridBagLayout());

        lblNombre.setText("Destino:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelDatos.add(lblNombre, gridBagConstraints);

        txtDestino.setMinimumSize(new java.awt.Dimension(200, 30));
        txtDestino.setPreferredSize(new java.awt.Dimension(200, 30));
        txtDestino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDestinoKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelDatos.add(txtDestino, gridBagConstraints);

        lblApellido.setText("Detalle:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelDatos.add(lblApellido, gridBagConstraints);

        txtDetalle.setMinimumSize(new java.awt.Dimension(200, 30));
        txtDetalle.setPreferredSize(new java.awt.Dimension(200, 30));
        txtDetalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDetalleKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelDatos.add(txtDetalle, gridBagConstraints);

        lblDui.setText("F. Salida:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelDatos.add(lblDui, gridBagConstraints);

        calendar.setBackground(new java.awt.Color(255, 255, 255));
        calendar.setOpaque(false);
        calendar.setTodayButtonVisible(true);
        calendar.setWeekOfYearVisible(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelDatos.add(calendar, gridBagConstraints);

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

        btnGuardar.setText("Guardar");
        btnGuardar.setMinimumSize(new java.awt.Dimension(100, 30));
        btnGuardar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelControles.add(btnGuardar, gridBagConstraints);

        btnCancelar.setText("Cancelar");
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

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        controller.getSeleccionado().setFecha(calendar.getDate());
        if(isEditar){
            controller.create();
        }else{
            controller.update();
        }        
        this.dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtDestinoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDestinoKeyReleased
        controller.getSeleccionado().setDestino(txtDestino.getText());
    }//GEN-LAST:event_txtDestinoKeyReleased

    private void txtDetalleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDetalleKeyReleased
        controller.getSeleccionado().setDetalle(txtDetalle.getText());
    }//GEN-LAST:event_txtDetalleKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private com.toedter.calendar.JCalendar calendar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblDui;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JPanel panelControles;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtDetalle;
    // End of variables declaration//GEN-END:variables

    private void cargarForm() {
        this.txtDestino.setText(controller.getSeleccionado().getDestino());
        this.txtDetalle.setText(controller.getSeleccionado().getDetalle());
        this.calendar.setDate(controller.getSeleccionado().getFecha());
    }
}
