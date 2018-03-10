package com.pereira.encomiendas.view.salida;

import com.pereira.encomiendas.controller.SalidaController;
import com.pereira.encomiendas.view.tablemodels.SalidasTableModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class SalidasFrame extends javax.swing.JInternalFrame {

    private static final SalidasFrame FRAME = new SalidasFrame();
    private final SalidaController controller;
    private final SalidasTableModel tmSalida;
    TableRowSorter<TableModel> sorter;

    public SalidasFrame() {
        controller = SalidaController.getCONTROLLER();
        tmSalida = new SalidasTableModel(controller.getRecientes());
        initComponents();
        sorter = new TableRowSorter<>(table.getModel());
        table.setRowSorter(sorter);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        panelFiltro = new javax.swing.JPanel();
        cbxFilter = new javax.swing.JComboBox<>();
        txtFilter = new javax.swing.JTextField();
        chkRecientes = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        panelControles = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnReport1 = new javax.swing.JButton();
        btnReporte2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("SALIDAS");
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        panelFiltro.setBackground(new java.awt.Color(255, 255, 255));
        panelFiltro.setLayout(new java.awt.GridBagLayout());

        cbxFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BUSCAR POR:", "Destino", "Detalle", "Fecha", "# Ordenes", "Estado" }));
        cbxFilter.setMinimumSize(new java.awt.Dimension(150, 30));
        cbxFilter.setPreferredSize(new java.awt.Dimension(150, 30));
        cbxFilter.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxFilterItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelFiltro.add(cbxFilter, gridBagConstraints);

        txtFilter.setMaximumSize(new java.awt.Dimension(250, 30));
        txtFilter.setMinimumSize(new java.awt.Dimension(250, 30));
        txtFilter.setPreferredSize(new java.awt.Dimension(250, 30));
        txtFilter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFilterKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelFiltro.add(txtFilter, gridBagConstraints);

        chkRecientes.setText("Ver no enviados");
        chkRecientes.setOpaque(false);
        chkRecientes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkRecientesItemStateChanged(evt);
            }
        });
        panelFiltro.add(chkRecientes, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(panelFiltro, gridBagConstraints);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        table.setModel(tmSalida);
        table.setRowHeight(30);
        table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(table);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(jScrollPane2, gridBagConstraints);

        panelControles.setBackground(new java.awt.Color(255, 255, 255));
        panelControles.setLayout(new java.awt.GridBagLayout());

        btnAgregar.setText("AGREGAR");
        btnAgregar.setMaximumSize(new java.awt.Dimension(150, 30));
        btnAgregar.setMinimumSize(new java.awt.Dimension(150, 30));
        btnAgregar.setPreferredSize(new java.awt.Dimension(150, 30));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelControles.add(btnAgregar, gridBagConstraints);

        btnVer.setText("VER");
        btnVer.setMaximumSize(new java.awt.Dimension(150, 30));
        btnVer.setMinimumSize(new java.awt.Dimension(150, 30));
        btnVer.setPreferredSize(new java.awt.Dimension(150, 30));
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelControles.add(btnVer, gridBagConstraints);

        btnEditar.setText("EDITAR");
        btnEditar.setMaximumSize(new java.awt.Dimension(150, 30));
        btnEditar.setMinimumSize(new java.awt.Dimension(150, 30));
        btnEditar.setPreferredSize(new java.awt.Dimension(150, 30));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelControles.add(btnEditar, gridBagConstraints);

        btnEliminar.setText("ELIMINAR");
        btnEliminar.setMaximumSize(new java.awt.Dimension(150, 30));
        btnEliminar.setMinimumSize(new java.awt.Dimension(150, 30));
        btnEliminar.setPreferredSize(new java.awt.Dimension(150, 30));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelControles.add(btnEliminar, gridBagConstraints);

        btnReport1.setText("REP. INGRESOS");
        btnReport1.setMaximumSize(new java.awt.Dimension(150, 30));
        btnReport1.setMinimumSize(new java.awt.Dimension(150, 30));
        btnReport1.setPreferredSize(new java.awt.Dimension(150, 30));
        btnReport1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReport1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelControles.add(btnReport1, gridBagConstraints);

        btnReporte2.setText("REP. ENTREGA");
        btnReporte2.setMaximumSize(new java.awt.Dimension(150, 30));
        btnReporte2.setMinimumSize(new java.awt.Dimension(150, 30));
        btnReporte2.setPreferredSize(new java.awt.Dimension(150, 30));
        btnReporte2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporte2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelControles.add(btnReporte2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(panelControles, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFilterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFilterKeyReleased
        filtrar();
    }//GEN-LAST:event_txtFilterKeyReleased

    private void cbxFilterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxFilterItemStateChanged
        filtrar();
    }//GEN-LAST:event_cbxFilterItemStateChanged

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        controller.prepareCreate();
        Create dialog = new Create(new JFrame(), true, "NUEVO SALIDA");
        dialog.setVisible(true);
        recargarTabla();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (isSelectedRow()) {
            controller.setSeleccionado(tmSalida.getRow(table.convertRowIndexToModel(table.getSelectedRow())));
            Create dialog = new Create(new JFrame(), true, "EDITAR SALIDA", true);
            dialog.setVisible(true);
            recargarTabla();
        } else {
            JOptionPane.showMessageDialog(new JFrame(),
                    "Seleccione un elemento de la tabla",
                    "ENCOM",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        if (isSelectedRow()) {
            controller.setSeleccionado(tmSalida.getRow(table.convertRowIndexToModel(table.getSelectedRow())));
            View dialog = new View(new JFrame(), true, "VER SALIDA");
            dialog.setVisible(true);
            recargarTabla();
        } else {
            JOptionPane.showMessageDialog(new JFrame(),
                    "Seleccione un elemento de la tabla",
                    "ENCOM",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnVerActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (isSelectedRow()) {
            int n = JOptionPane.showConfirmDialog(
                    new JFrame(),
                    "Desea Eliminar Registro?",
                    "ENCOM",
                    JOptionPane.YES_NO_OPTION);
            if(n==0){
                controller.setSeleccionado(tmSalida.getRow(table.convertRowIndexToModel(table.getSelectedRow())));
                controller.delete();
                recargarTabla();
            }
        } else {
            JOptionPane.showMessageDialog(new JFrame(),
                    "Seleccione un elemento de la tabla",
                    "ENCOM",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        recargarTabla();
    }//GEN-LAST:event_formInternalFrameActivated

    private void btnReport1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReport1ActionPerformed
        if (isSelectedRow()) {
            controller.setSeleccionado(tmSalida.getRow(table.convertRowIndexToModel(table.getSelectedRow())));
            controller.test(tmSalida.getRow(table.convertRowIndexToModel(table.getSelectedRow())));
        } else {
            JOptionPane.showMessageDialog(new JFrame(),
                    "Seleccione un elemento de la tabla",
                    "ENCOM",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnReport1ActionPerformed

    private void chkRecientesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkRecientesItemStateChanged
        if(chkRecientes.isSelected()){
            verRecientes();
        }else{
            verEnviados();
        }
    }//GEN-LAST:event_chkRecientesItemStateChanged

    private void btnReporte2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporte2ActionPerformed
        if (isSelectedRow()) {
            controller.setSeleccionado(tmSalida.getRow(table.convertRowIndexToModel(table.getSelectedRow())));
            controller.reporteEntregas(tmSalida.getRow(table.convertRowIndexToModel(table.getSelectedRow())));
        } else {
            JOptionPane.showMessageDialog(new JFrame(),
                    "Seleccione un elemento de la tabla",
                    "ENCOM",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnReporte2ActionPerformed

    public static SalidasFrame getFrame() {
        return FRAME;
    }

    private void filtrar() {
        RowFilter<TableModel, Object> rf = null;
        try {
            switch (cbxFilter.getSelectedIndex()) {
                case 1:
                    rf = RowFilter.regexFilter(txtFilter.getText(), 0);
                    break;
                case 2:
                    rf = RowFilter.regexFilter(txtFilter.getText(), 1);
                    break;
                case 3:
                    rf = RowFilter.regexFilter(txtFilter.getText(), 2);
                    break;
                case 4:
                    rf = RowFilter.regexFilter(txtFilter.getText(), 3);
                    break;
                default:
                    txtFilter.setText("");
                    break;
            }
        } catch (java.util.regex.PatternSyntaxException e) {
            return;
        }
        sorter.setRowFilter(rf);
    }

    public void recargarTabla() {
        tmSalida.setList(controller.getItems());
        tmSalida.fireTableDataChanged();
        filtrar();
    }

    private boolean isSelectedRow() {
        return table.getSelectedRow() > -1;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnReport1;
    private javax.swing.JButton btnReporte2;
    private javax.swing.JButton btnVer;
    private javax.swing.JComboBox<String> cbxFilter;
    private javax.swing.JCheckBox chkRecientes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelControles;
    private javax.swing.JPanel panelFiltro;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtFilter;
    // End of variables declaration//GEN-END:variables

    private void verRecientes() {
        tmSalida.setList(controller.getRecientes());
        tmSalida.fireTableDataChanged();
        filtrar();
    }

    private void verEnviados() {
        recargarTabla();
    }
}
