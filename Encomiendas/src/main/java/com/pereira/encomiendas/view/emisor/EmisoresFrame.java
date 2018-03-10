package com.pereira.encomiendas.view.emisor;

import com.pereira.encomiendas.beans.EmisorFacade;
import com.pereira.encomiendas.controller.EmisorController;
import com.pereira.encomiendas.model.Emisor;
import com.pereira.encomiendas.view.emisor.Create;
import com.pereira.encomiendas.view.tablemodels.EmisoresTableModel;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class EmisoresFrame extends javax.swing.JInternalFrame {

    private static final EmisoresFrame FRAME = new EmisoresFrame();
    private final EmisorController emisorController;
    private final EmisoresTableModel tmEmisores;
    TableRowSorter<TableModel> sorter;

    public EmisoresFrame() {
        emisorController = EmisorController.getCONTROLLER();
        tmEmisores = new EmisoresTableModel(emisorController.getItems());
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
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        panelControles = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("EMISORES");
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

        cbxFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BUSCAR POR:", "Nombre", "Apellido", "Direccion", "Telefono" }));
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

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(panelFiltro, gridBagConstraints);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        table.setModel(tmEmisores);
        table.setRowHeight(30);
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
        btnAgregar.setMinimumSize(new java.awt.Dimension(100, 30));
        btnAgregar.setPreferredSize(new java.awt.Dimension(100, 30));
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
        btnVer.setMinimumSize(new java.awt.Dimension(100, 30));
        btnVer.setPreferredSize(new java.awt.Dimension(100, 30));
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
        btnEditar.setMinimumSize(new java.awt.Dimension(100, 30));
        btnEditar.setPreferredSize(new java.awt.Dimension(100, 30));
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
        btnEliminar.setMinimumSize(new java.awt.Dimension(100, 30));
        btnEliminar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelControles.add(btnEliminar, gridBagConstraints);

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
        emisorController.prepareCreate();
        Create dialog = new Create(new JFrame(), true, "NUEVO EMISOR");
        dialog.setVisible(true);
        recargarTabla();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (isSelectedRow()) {
            emisorController.setSeleccionado(tmEmisores.getRow(table.convertRowIndexToModel(table.getSelectedRow())));
            Create dialog = new Create(new JFrame(), true, "EDITAR EMISOR", true);
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
            emisorController.setSeleccionado(tmEmisores.getRow(table.convertRowIndexToModel(table.getSelectedRow())));
            View dialog = new View(new JFrame(), true, "VER EMISOR");
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
                emisorController.setSeleccionado(tmEmisores.getRow(table.convertRowIndexToModel(table.getSelectedRow())));
                emisorController.delete();
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

    public static EmisoresFrame getFrame() {
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

    private void recargarTabla() {
        tmEmisores.setList(emisorController.getItems());
        tmEmisores.fireTableDataChanged();
        filtrar();
    }

    private boolean isSelectedRow() {
        return table.getSelectedRow() > -1;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVer;
    private javax.swing.JComboBox<String> cbxFilter;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelControles;
    private javax.swing.JPanel panelFiltro;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtFilter;
    // End of variables declaration//GEN-END:variables
}
