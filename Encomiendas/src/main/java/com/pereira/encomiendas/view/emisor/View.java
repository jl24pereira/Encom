package com.pereira.encomiendas.view.emisor;

import com.pereira.encomiendas.controller.EmisorController;
import java.text.SimpleDateFormat;

public class View extends javax.swing.JDialog {

    private EmisorController controller;

    public View(java.awt.Frame parent, boolean modal, String titulo) {
        super(parent, modal);
        controller = EmisorController.getCONTROLLER();
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
        lblApellido = new javax.swing.JLabel();
        lblDui = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblMunicipio = new javax.swing.JLabel();
        lblDepto = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        txtApellido = new javax.swing.JLabel();
        txtDui = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JLabel();
        txtMunicipio = new javax.swing.JLabel();
        txtDepartamento = new javax.swing.JLabel();
        lblEnviadas = new javax.swing.JLabel();
        txtEnviadas = new javax.swing.JLabel();
        lblUltima = new javax.swing.JLabel();
        txtUltima = new javax.swing.JLabel();
        panelControles = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(350, 450));
        setPreferredSize(new java.awt.Dimension(350, 450));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        panelDatos.setBackground(new java.awt.Color(255, 255, 255));
        panelDatos.setLayout(new java.awt.GridBagLayout());

        lblNombre.setText("Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelDatos.add(lblNombre, gridBagConstraints);

        lblApellido.setText("Apellido:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelDatos.add(lblApellido, gridBagConstraints);

        lblDui.setText("DUI:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelDatos.add(lblDui, gridBagConstraints);

        lblTelefono.setText("Teléfono:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelDatos.add(lblTelefono, gridBagConstraints);

        lblDireccion.setText("Dirección:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelDatos.add(lblDireccion, gridBagConstraints);

        lblMunicipio.setText("Municipio:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelDatos.add(lblMunicipio, gridBagConstraints);

        lblDepto.setText("Departamento:");
        lblDepto.setMaximumSize(new java.awt.Dimension(300, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelDatos.add(lblDepto, gridBagConstraints);

        txtNombre.setMaximumSize(new java.awt.Dimension(300, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelDatos.add(txtNombre, gridBagConstraints);

        txtApellido.setMaximumSize(new java.awt.Dimension(300, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelDatos.add(txtApellido, gridBagConstraints);

        txtDui.setMaximumSize(new java.awt.Dimension(300, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelDatos.add(txtDui, gridBagConstraints);

        txtTelefono.setMaximumSize(new java.awt.Dimension(300, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelDatos.add(txtTelefono, gridBagConstraints);

        txtDireccion.setMaximumSize(new java.awt.Dimension(300, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelDatos.add(txtDireccion, gridBagConstraints);

        txtMunicipio.setMaximumSize(new java.awt.Dimension(300, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelDatos.add(txtMunicipio, gridBagConstraints);

        txtDepartamento.setMaximumSize(new java.awt.Dimension(300, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelDatos.add(txtDepartamento, gridBagConstraints);

        lblEnviadas.setText("# Ordenes enviadas:");
        lblEnviadas.setMaximumSize(new java.awt.Dimension(300, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelDatos.add(lblEnviadas, gridBagConstraints);

        txtEnviadas.setMaximumSize(new java.awt.Dimension(300, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelDatos.add(txtEnviadas, gridBagConstraints);

        lblUltima.setText("Ultima Orden:");
        lblUltima.setMaximumSize(new java.awt.Dimension(300, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelDatos.add(lblUltima, gridBagConstraints);

        txtUltima.setMaximumSize(new java.awt.Dimension(300, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelDatos.add(txtUltima, gridBagConstraints);

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
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblDepto;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblDui;
    private javax.swing.JLabel lblEnviadas;
    private javax.swing.JLabel lblMunicipio;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblUltima;
    private javax.swing.JPanel panelControles;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JLabel txtApellido;
    private javax.swing.JLabel txtDepartamento;
    private javax.swing.JLabel txtDireccion;
    private javax.swing.JLabel txtDui;
    private javax.swing.JLabel txtEnviadas;
    private javax.swing.JLabel txtMunicipio;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtTelefono;
    private javax.swing.JLabel txtUltima;
    // End of variables declaration//GEN-END:variables

    private void cargarForm() {
        System.out.println("ordenes enviadas: "+controller.getSeleccionado().getOrdenList().size());
        this.txtNombre.setText(controller.getSeleccionado().getNombres());
        this.txtApellido.setText(controller.getSeleccionado().getApellidos());
        this.txtDui.setText(controller.getSeleccionado().getDui());
        this.txtTelefono.setText(controller.getSeleccionado().getTelefono());
        this.txtDireccion.setText(controller.getSeleccionado().getDireccion());
        this.txtMunicipio.setText(controller.getSeleccionado().getMunicipio());
        this.txtDepartamento.setText(controller.getSeleccionado().getDepartamento());
        this.txtEnviadas.setText(controller.getSeleccionado().getOrdenList().size()+" Orden/es");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        if(controller.getSeleccionado().getOrdenList().size()==0){
            this.txtUltima.setText(" - - - - - - - - - - ");
        }else{
          this.txtUltima.setText(sdf.format(controller.getSeleccionado().getOrdenList().get(controller.getSeleccionado().getOrdenList().size()-1).getFrecibido()));  
        }
        
    }
}
