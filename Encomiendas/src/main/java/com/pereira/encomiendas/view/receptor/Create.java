package com.pereira.encomiendas.view.receptor;

import com.pereira.encomiendas.view.emisor.*;
import com.pereira.encomiendas.controller.EmisorController;
import com.pereira.encomiendas.controller.ReceptorController;

public class Create extends javax.swing.JDialog {

    private ReceptorController controller;
    private boolean isEditar = false;

    public Create(java.awt.Frame parent, boolean modal, String titulo) {
        super(parent, modal);
        controller = ReceptorController.getCONTROLLER();
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle(titulo);
    }
    
    public Create(java.awt.Frame parent, boolean modal, String titulo, boolean isEditar) {
        super(parent, modal);
        this.isEditar=isEditar;
        controller = ReceptorController.getCONTROLLER();
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
        txtNombre = new javax.swing.JTextField();
        lblApellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JFormattedTextField();
        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblMunicipio = new javax.swing.JLabel();
        txtMunicipio = new javax.swing.JTextField();
        lblDepto = new javax.swing.JLabel();
        txtDepto = new javax.swing.JTextField();
        lblZipcode = new javax.swing.JLabel();
        txtZipcode = new javax.swing.JTextField();
        panelControles = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
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

        txtNombre.setMaximumSize(new java.awt.Dimension(200, 2147483647));
        txtNombre.setMinimumSize(new java.awt.Dimension(200, 30));
        txtNombre.setPreferredSize(new java.awt.Dimension(200, 30));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelDatos.add(txtNombre, gridBagConstraints);

        lblApellido.setText("Apellido:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelDatos.add(lblApellido, gridBagConstraints);

        txtApellido.setMaximumSize(new java.awt.Dimension(200, 2147483647));
        txtApellido.setMinimumSize(new java.awt.Dimension(200, 30));
        txtApellido.setPreferredSize(new java.awt.Dimension(200, 30));
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidoKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelDatos.add(txtApellido, gridBagConstraints);

        lblTelefono.setText("Teléfono:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelDatos.add(lblTelefono, gridBagConstraints);

        try {
            txtTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefono.setMaximumSize(new java.awt.Dimension(200, 2147483647));
        txtTelefono.setMinimumSize(new java.awt.Dimension(200, 30));
        txtTelefono.setPreferredSize(new java.awt.Dimension(200, 30));
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelDatos.add(txtTelefono, gridBagConstraints);

        lblDireccion.setText("Dirección:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelDatos.add(lblDireccion, gridBagConstraints);

        txtDireccion.setMaximumSize(new java.awt.Dimension(200, 2147483647));
        txtDireccion.setMinimumSize(new java.awt.Dimension(200, 30));
        txtDireccion.setPreferredSize(new java.awt.Dimension(200, 30));
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDireccionKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelDatos.add(txtDireccion, gridBagConstraints);

        lblMunicipio.setText("Ciudad:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelDatos.add(lblMunicipio, gridBagConstraints);

        txtMunicipio.setMaximumSize(new java.awt.Dimension(200, 2147483647));
        txtMunicipio.setMinimumSize(new java.awt.Dimension(200, 30));
        txtMunicipio.setPreferredSize(new java.awt.Dimension(200, 30));
        txtMunicipio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMunicipioKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelDatos.add(txtMunicipio, gridBagConstraints);

        lblDepto.setText("Estado:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelDatos.add(lblDepto, gridBagConstraints);

        txtDepto.setMaximumSize(new java.awt.Dimension(200, 2147483647));
        txtDepto.setMinimumSize(new java.awt.Dimension(200, 30));
        txtDepto.setPreferredSize(new java.awt.Dimension(200, 30));
        txtDepto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDeptoKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelDatos.add(txtDepto, gridBagConstraints);

        lblZipcode.setText("Zipcode");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelDatos.add(lblZipcode, gridBagConstraints);

        txtZipcode.setMaximumSize(new java.awt.Dimension(200, 2147483647));
        txtZipcode.setMinimumSize(new java.awt.Dimension(200, 30));
        txtZipcode.setPreferredSize(new java.awt.Dimension(200, 30));
        txtZipcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtZipcodeKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelDatos.add(txtZipcode, gridBagConstraints);

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
        if(isEditar){
            controller.create();
        }else{
            controller.update();
        }        
        this.dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        controller.getSeleccionado().setNombres(txtNombre.getText());
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyReleased
        controller.getSeleccionado().setApellidos(txtApellido.getText());
    }//GEN-LAST:event_txtApellidoKeyReleased

    private void txtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyReleased
        controller.getSeleccionado().setTelefono(txtTelefono.getText());
    }//GEN-LAST:event_txtTelefonoKeyReleased

    private void txtDireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyReleased
        controller.getSeleccionado().setDireccion(txtDireccion.getText());
    }//GEN-LAST:event_txtDireccionKeyReleased

    private void txtMunicipioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMunicipioKeyReleased
        controller.getSeleccionado().setCiudad(txtMunicipio.getText());
    }//GEN-LAST:event_txtMunicipioKeyReleased

    private void txtDeptoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDeptoKeyReleased
        controller.getSeleccionado().setEstado(txtDepto.getText());
    }//GEN-LAST:event_txtDeptoKeyReleased

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtZipcodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtZipcodeKeyReleased
        controller.getSeleccionado().setZipcode(txtZipcode.getText());
    }//GEN-LAST:event_txtZipcodeKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblDepto;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblMunicipio;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblZipcode;
    private javax.swing.JPanel panelControles;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDepto;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtMunicipio;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JFormattedTextField txtTelefono;
    private javax.swing.JTextField txtZipcode;
    // End of variables declaration//GEN-END:variables

    private void cargarForm() {
        this.txtNombre.setText(controller.getSeleccionado().getNombres());
        this.txtApellido.setText(controller.getSeleccionado().getApellidos());
        this.txtTelefono.setText(controller.getSeleccionado().getTelefono());
        this.txtDireccion.setText(controller.getSeleccionado().getDireccion());
        this.txtMunicipio.setText(controller.getSeleccionado().getCiudad());
        this.txtDepto.setText(controller.getSeleccionado().getEstado());
        this.txtZipcode.setText(controller.getSeleccionado().getZipcode());
    }
}
