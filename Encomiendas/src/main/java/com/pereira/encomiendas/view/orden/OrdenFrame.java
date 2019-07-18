package com.pereira.encomiendas.view.orden;

import com.pereira.encomiendas.controller.OrdenController;
import com.pereira.encomiendas.controller.SalidaController;
import com.pereira.encomiendas.model.Salida;
import com.pereira.encomiendas.view.tablemodels.OrdenesTableModel;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.sf.jasperreports.engine.JRException;

public class OrdenFrame extends javax.swing.JInternalFrame {

    private static final OrdenFrame FRAME = new OrdenFrame();
    private final OrdenController controller;
    private final OrdenesTableModel tmOrdenes;
    TableRowSorter<TableModel> sorter;

    private final SalidaController salidaController;
    private final DefaultComboBoxModel<Salida> cbmSalidas = new DefaultComboBoxModel<>();

    public OrdenFrame() {
        controller = OrdenController.getCONTROLLER();
        tmOrdenes = new OrdenesTableModel(controller.getItems());
        salidaController = SalidaController.getCONTROLLER();
        buscarSalidasRecientes();
        initComponents();
        //buscarPorSalida();
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
        btnEliminar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbxViajes = new javax.swing.JComboBox<>();
        chkViajes = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("ORDENES");
        setMinimumSize(new java.awt.Dimension(950, 500));
        setPreferredSize(new java.awt.Dimension(950, 500));
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

        cbxFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BUSCAR POR:", "# Orden", "Emisor", "Tel. Emisor", "Receptor", "Tel Receptor", "F. Recibido" }));
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
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(panelFiltro, gridBagConstraints);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        table.setModel(tmOrdenes);
        table.setRowHeight(30);
        table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(table);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
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

        btnImprimir.setText("IMPRIMIR");
        btnImprimir.setMinimumSize(new java.awt.Dimension(100, 30));
        btnImprimir.setPreferredSize(new java.awt.Dimension(100, 30));
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelControles.add(btnImprimir, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(panelControles, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("PROXIMOS VIAJES:");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel1.setMaximumSize(new java.awt.Dimension(150, 14));
        jLabel1.setMinimumSize(new java.awt.Dimension(150, 14));
        jLabel1.setPreferredSize(new java.awt.Dimension(150, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(jLabel1, gridBagConstraints);

        cbxViajes.setModel(cbmSalidas);
        cbxViajes.setMaximumSize(new java.awt.Dimension(175, 30));
        cbxViajes.setMinimumSize(new java.awt.Dimension(175, 30));
        cbxViajes.setPreferredSize(new java.awt.Dimension(175, 30));
        cbxViajes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxViajesItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(cbxViajes, gridBagConstraints);

        chkViajes.setText("VER TODOS LOS VIAJES");
        chkViajes.setOpaque(false);
        chkViajes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkViajesItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(chkViajes, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(jPanel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFilterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFilterKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            filtrar();
        }
    }//GEN-LAST:event_txtFilterKeyReleased

    private void cbxFilterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxFilterItemStateChanged
        filtrar();
    }//GEN-LAST:event_cbxFilterItemStateChanged

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        controller.prepareCreate();
        Create dialog = new Create(new JFrame(), true, "NUEVA ORDEN");
        dialog.setVisible(true);
        recargarTabla();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        if (isSelectedRow()) {
            controller.setSeleccionado(tmOrdenes.getRow(table.convertRowIndexToModel(table.getSelectedRow())));
            View dialog = new View(new JFrame(), true, "VER ORDEN");
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
            if (n == 0) {
                controller.setSeleccionado(tmOrdenes.getRow(table.convertRowIndexToModel(table.getSelectedRow())));
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
        buscarPorSalida();
    }//GEN-LAST:event_formInternalFrameActivated

    private void chkViajesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkViajesItemStateChanged
        if (chkViajes.isSelected()) {
            buscarTodasSalidas();
            jLabel1.setText("VIAJES: ");
        } else {
            buscarSalidasRecientes();
            jLabel1.setText("PROXIMOS VIAJES: ");
        }
    }//GEN-LAST:event_chkViajesItemStateChanged

    private void cbxViajesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxViajesItemStateChanged
        if (cbxViajes.getItemCount() > 0) {
            buscarPorSalida();
        } else {
            tmOrdenes.deleteRows();
        }
    }//GEN-LAST:event_cbxViajesItemStateChanged

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        if (table.getSelectedRow() > -1) {
            OrdenController.getCONTROLLER().setSeleccionado(tmOrdenes.getRow(table.convertRowIndexToModel(table.getSelectedRow())));
            try {
                OrdenController.getCONTROLLER().printOrden();
            } catch (JRException | IOException ex) {
                Logger.getLogger(OrdenFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(new JFrame(),
                    "Seleccione un elemento de la tabla",
                    "ENCOM",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnVer;
    private javax.swing.JComboBox<String> cbxFilter;
    private javax.swing.JComboBox<Salida> cbxViajes;
    private javax.swing.JCheckBox chkViajes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelControles;
    private javax.swing.JPanel panelFiltro;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtFilter;
    // End of variables declaration//GEN-END:variables

    private void buscarSalidasRecientes() {
        cbmSalidas.removeAllElements();
        salidaController.getRecientes().forEach((salida) -> {
            cbmSalidas.addElement(salida);
        });
        //filtrar();
    }

    private void buscarTodasSalidas() {
        cbmSalidas.removeAllElements();
        salidaController.getItems().forEach((salida) -> {
            cbmSalidas.addElement(salida);
        });
        //filtrar();
    }

    private void buscarPorSalida() {
        tmOrdenes.setList(controller.getOrdenPorViaje((Salida) cbxViajes.getSelectedItem()));
        tmOrdenes.fireTableDataChanged();
        filtrar();
    }

    public static OrdenFrame getFrame() {
        return FRAME;
    }

    private void filtrar() {
        if (cbxViajes.getItemCount() > 0) {
            RowFilter<TableModel, Object> rf = null;
            try {
                switch (cbxFilter.getSelectedIndex()) {
                    case 1:
                        rf = RowFilter.regexFilter("(?i)" + txtFilter.getText(), 0);
                        break;
                    case 2:
                        rf = RowFilter.regexFilter("(?i)" + txtFilter.getText(), 1);
                        break;
                    case 3:
                        rf = RowFilter.regexFilter("(?i)" + txtFilter.getText(), 2);
                        break;
                    case 4:
                        rf = RowFilter.regexFilter("(?i)" + txtFilter.getText(), 3);
                        break;
                    default:
                        rf = RowFilter.regexFilter("(?i)" + txtFilter.getText());
                        break;
                }
            } catch (java.util.regex.PatternSyntaxException e) {
                return;
            }
            sorter.setRowFilter(rf);
        }
    }

    private void recargarTabla() {
        tmOrdenes.setList(controller.getItems());
        tmOrdenes.fireTableDataChanged();
        buscarPorSalida();
        filtrar();
    }

    private boolean isSelectedRow() {
        return table.getSelectedRow() > -1;
    }
}
