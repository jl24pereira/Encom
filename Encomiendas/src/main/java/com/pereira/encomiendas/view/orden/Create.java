package com.pereira.encomiendas.view.orden;

import com.pereira.encomiendas.controller.EmisorController;
import com.pereira.encomiendas.controller.OrdenController;
import com.pereira.encomiendas.controller.ReceptorController;
import com.pereira.encomiendas.controller.RecienteController;
import com.pereira.encomiendas.controller.SalidaController;
import com.pereira.encomiendas.model.Paquete;
import com.pereira.encomiendas.model.Receptor;
import com.pereira.encomiendas.model.Salida;
import com.pereira.encomiendas.view.tablemodels.EmisoresTableModel;
import com.pereira.encomiendas.view.tablemodels.ReceptoresTableModel;
import com.pereira.encomiendas.view.tablemodels.RecientesTableModel;
import java.awt.HeadlessException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.sf.jasperreports.engine.JRException;

public class Create extends javax.swing.JDialog {

    private final EmisorController emisorController;
    private final EmisoresTableModel tmEmisores;
    TableRowSorter<TableModel> sorterEmisor;

    private final ReceptorController receptorController;
    private final ReceptoresTableModel tmReceptores;
    TableRowSorter<TableModel> sorterReceptor;

    private final RecienteController recienteController;
    private final RecientesTableModel tmReciente;
    TableRowSorter<TableModel> sorterReciente;

    private final SalidaController salidaController;
    private DefaultComboBoxModel<Salida> cbmSalidas = new DefaultComboBoxModel<>();

    private final OrdenController ordenController;

    DefaultTableModel tmPaquete;

    public Create(java.awt.Frame parent, boolean modal, String titulo) {
        super(parent, modal);
        emisorController = EmisorController.getCONTROLLER();
        System.out.println("registros: " + emisorController.getItems().size());
        tmEmisores = new EmisoresTableModel(emisorController.getItems());
        receptorController = ReceptorController.getCONTROLLER();
        tmReceptores = new ReceptoresTableModel(receptorController.getItems());
        salidaController = SalidaController.getCONTROLLER();
        salidaController.getRecientes().forEach((salida) -> {
            cbmSalidas.addElement(salida);
        });
        recienteController = RecienteController.getCONTROLLER();
        tmReciente = new RecientesTableModel(recienteController.getItems());
        ordenController = OrdenController.getCONTROLLER();
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle(titulo);
        tmPaquete = (DefaultTableModel) tPaquetes.getModel();
        sorterEmisor = new TableRowSorter<>(tEmisores.getModel());
        tEmisores.setRowSorter(sorterEmisor);
        sorterReceptor = new TableRowSorter<>(tReceptores.getModel());
        tReceptores.setRowSorter(sorterReceptor);
        cargarNumeroOrden();
        tEmisores.getSelectionModel().addListSelectionListener((ListSelectionEvent e) -> {
            if (chkRecientes.isSelected()) {
                cargarRecientes();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        panelEmisor = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        panelFiltro = new javax.swing.JPanel();
        cbxFilterEmisor = new javax.swing.JComboBox<>();
        txtFilterEmisor = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tEmisores = new javax.swing.JTable();
        panelControles = new javax.swing.JPanel();
        btnAgregarEmisor = new javax.swing.JButton();
        btnVerEmisor = new javax.swing.JButton();
        btnEditarEmisor = new javax.swing.JButton();
        panelReceptor = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        panelFiltro1 = new javax.swing.JPanel();
        cbxFilterReceptor = new javax.swing.JComboBox<>();
        txtFilterReceptor = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tReceptores = new javax.swing.JTable();
        panelControles2 = new javax.swing.JPanel();
        btnAgregarReceptor = new javax.swing.JButton();
        btnVerReceptor = new javax.swing.JButton();
        btnEditarReceptor = new javax.swing.JButton();
        chkRecientes = new javax.swing.JCheckBox();
        panelPaquetes = new javax.swing.JPanel();
        panelExtras = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbxSalidas = new javax.swing.JComboBox<>();
        txtFecha = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        lblOrden = new javax.swing.JLabel();
        panelTabla = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnAgregarPaquete = new javax.swing.JButton();
        btnEliminarPaquete = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tPaquetes = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        txtCosto = new javax.swing.JSpinner();
        jPanel4 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 600));
        setPreferredSize(new java.awt.Dimension(900, 600));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        panelEmisor.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Emisor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        panelEmisor.setOpaque(false);
        panelEmisor.setLayout(new java.awt.GridBagLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        panelFiltro.setBackground(new java.awt.Color(255, 255, 255));
        panelFiltro.setLayout(new java.awt.GridBagLayout());

        cbxFilterEmisor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BUSCAR POR:", "Nombre", "Apellido", "Direccion", "Telefono" }));
        cbxFilterEmisor.setMinimumSize(new java.awt.Dimension(150, 30));
        cbxFilterEmisor.setPreferredSize(new java.awt.Dimension(150, 30));
        cbxFilterEmisor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxFilterEmisorItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        panelFiltro.add(cbxFilterEmisor, gridBagConstraints);

        txtFilterEmisor.setMaximumSize(new java.awt.Dimension(250, 30));
        txtFilterEmisor.setMinimumSize(new java.awt.Dimension(250, 30));
        txtFilterEmisor.setPreferredSize(new java.awt.Dimension(250, 30));
        txtFilterEmisor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFilterEmisorKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        panelFiltro.add(txtFilterEmisor, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel6.add(panelFiltro, gridBagConstraints);

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));

        tEmisores.setModel(tmEmisores);
        tEmisores.setRowHeight(30);
        tEmisores.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(tEmisores);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel6.add(jScrollPane4, gridBagConstraints);

        panelControles.setBackground(new java.awt.Color(255, 255, 255));
        panelControles.setLayout(new java.awt.GridBagLayout());

        btnAgregarEmisor.setText("AGREGAR");
        btnAgregarEmisor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarEmisor.setMinimumSize(new java.awt.Dimension(100, 30));
        btnAgregarEmisor.setPreferredSize(new java.awt.Dimension(100, 30));
        btnAgregarEmisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEmisorActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        panelControles.add(btnAgregarEmisor, gridBagConstraints);

        btnVerEmisor.setText("VER");
        btnVerEmisor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerEmisor.setMinimumSize(new java.awt.Dimension(100, 30));
        btnVerEmisor.setPreferredSize(new java.awt.Dimension(100, 30));
        btnVerEmisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerEmisorActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        panelControles.add(btnVerEmisor, gridBagConstraints);

        btnEditarEmisor.setText("EDITAR");
        btnEditarEmisor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarEmisor.setMinimumSize(new java.awt.Dimension(100, 30));
        btnEditarEmisor.setPreferredSize(new java.awt.Dimension(100, 30));
        btnEditarEmisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarEmisorActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        panelControles.add(btnEditarEmisor, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel6.add(panelControles, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelEmisor.add(jPanel6, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(panelEmisor, gridBagConstraints);

        panelReceptor.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Receptor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        panelReceptor.setOpaque(false);
        panelReceptor.setLayout(new java.awt.GridBagLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.GridBagLayout());

        panelFiltro1.setBackground(new java.awt.Color(255, 255, 255));
        panelFiltro1.setLayout(new java.awt.GridBagLayout());

        cbxFilterReceptor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BUSCAR POR:", "Nombre", "Apellido", "Direccion", "Telefono" }));
        cbxFilterReceptor.setMinimumSize(new java.awt.Dimension(150, 30));
        cbxFilterReceptor.setPreferredSize(new java.awt.Dimension(150, 30));
        cbxFilterReceptor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxFilterReceptorItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        panelFiltro1.add(cbxFilterReceptor, gridBagConstraints);

        txtFilterReceptor.setMaximumSize(new java.awt.Dimension(250, 30));
        txtFilterReceptor.setMinimumSize(new java.awt.Dimension(250, 30));
        txtFilterReceptor.setPreferredSize(new java.awt.Dimension(250, 30));
        txtFilterReceptor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFilterReceptorKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        panelFiltro1.add(txtFilterReceptor, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel7.add(panelFiltro1, gridBagConstraints);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        tReceptores.setModel(tmReceptores);
        tReceptores.setRowHeight(30);
        tReceptores.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(tReceptores);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel7.add(jScrollPane2, gridBagConstraints);

        panelControles2.setBackground(new java.awt.Color(255, 255, 255));
        panelControles2.setLayout(new java.awt.GridBagLayout());

        btnAgregarReceptor.setText("AGREGAR");
        btnAgregarReceptor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarReceptor.setMinimumSize(new java.awt.Dimension(100, 30));
        btnAgregarReceptor.setPreferredSize(new java.awt.Dimension(100, 30));
        btnAgregarReceptor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarReceptorActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        panelControles2.add(btnAgregarReceptor, gridBagConstraints);

        btnVerReceptor.setText("VER");
        btnVerReceptor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerReceptor.setMinimumSize(new java.awt.Dimension(100, 30));
        btnVerReceptor.setPreferredSize(new java.awt.Dimension(100, 30));
        btnVerReceptor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerReceptorActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        panelControles2.add(btnVerReceptor, gridBagConstraints);

        btnEditarReceptor.setText("EDITAR");
        btnEditarReceptor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarReceptor.setMinimumSize(new java.awt.Dimension(100, 30));
        btnEditarReceptor.setPreferredSize(new java.awt.Dimension(100, 30));
        btnEditarReceptor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarReceptorActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        panelControles2.add(btnEditarReceptor, gridBagConstraints);

        chkRecientes.setText("Ver Recep. Frecuente");
        chkRecientes.setOpaque(false);
        chkRecientes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkRecientesItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 10);
        panelControles2.add(chkRecientes, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel7.add(panelControles2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelReceptor.add(jPanel7, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(panelReceptor, gridBagConstraints);

        panelPaquetes.setOpaque(false);
        panelPaquetes.setLayout(new java.awt.GridBagLayout());

        panelExtras.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Opciones de Orden", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        panelExtras.setOpaque(false);
        panelExtras.setLayout(new java.awt.GridBagLayout());

        jLabel3.setText("Fecha de Recibido:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelExtras.add(jLabel3, gridBagConstraints);

        jLabel4.setText("Salida:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelExtras.add(jLabel4, gridBagConstraints);

        cbxSalidas.setModel(cbmSalidas);
        cbxSalidas.setMinimumSize(new java.awt.Dimension(150, 30));
        cbxSalidas.setPreferredSize(new java.awt.Dimension(150, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelExtras.add(cbxSalidas, gridBagConstraints);

        txtFecha.setDate(new Date());
        txtFecha.setDateFormatString("dd-MM-yyyy");
        txtFecha.setMinimumSize(new java.awt.Dimension(150, 30));
        txtFecha.setPreferredSize(new java.awt.Dimension(150, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        panelExtras.add(txtFecha, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("ORDEN #");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelExtras.add(jLabel5, gridBagConstraints);

        lblOrden.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblOrden.setText("10");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelExtras.add(lblOrden, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        panelPaquetes.add(panelExtras, gridBagConstraints);

        panelTabla.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Paquetes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        panelTabla.setOpaque(false);
        panelTabla.setLayout(new java.awt.GridBagLayout());

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridBagLayout());

        btnAgregarPaquete.setText("AGREGAR");
        btnAgregarPaquete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarPaquete.setMaximumSize(new java.awt.Dimension(100, 30));
        btnAgregarPaquete.setMinimumSize(new java.awt.Dimension(100, 30));
        btnAgregarPaquete.setPreferredSize(new java.awt.Dimension(100, 30));
        btnAgregarPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPaqueteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        jPanel2.add(btnAgregarPaquete, gridBagConstraints);

        btnEliminarPaquete.setText("ELIMINAR");
        btnEliminarPaquete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarPaquete.setMaximumSize(new java.awt.Dimension(100, 30));
        btnEliminarPaquete.setMinimumSize(new java.awt.Dimension(100, 30));
        btnEliminarPaquete.setPreferredSize(new java.awt.Dimension(100, 30));
        btnEliminarPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPaqueteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        jPanel2.add(btnEliminarPaquete, gridBagConstraints);

        panelTabla.add(jPanel2, new java.awt.GridBagConstraints());

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
        if (tPaquetes.getColumnModel().getColumnCount() > 0) {
            tPaquetes.getColumnModel().getColumn(0).setResizable(false);
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelTabla.add(jScrollPane3, gridBagConstraints);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Peso (LB)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel3.add(jLabel1, gridBagConstraints);

        txtPeso.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));
        txtPeso.setMinimumSize(new java.awt.Dimension(29, 30));
        txtPeso.setPreferredSize(new java.awt.Dimension(29, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel3.add(txtPeso, gridBagConstraints);

        jLabel2.setText("Costo($)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel3.add(jLabel2, gridBagConstraints);

        txtCosto.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));
        txtCosto.setMinimumSize(new java.awt.Dimension(29, 30));
        txtCosto.setPreferredSize(new java.awt.Dimension(29, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel3.add(txtCosto, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        panelTabla.add(jPanel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        panelPaquetes.add(panelTabla, gridBagConstraints);

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.GridBagLayout());

        btnGuardar.setText("GUARDAR");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setMaximumSize(new java.awt.Dimension(100, 30));
        btnGuardar.setMinimumSize(new java.awt.Dimension(100, 30));
        btnGuardar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        jPanel4.add(btnGuardar, gridBagConstraints);

        btnCancelar.setText("CANCELAR");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setMaximumSize(new java.awt.Dimension(100, 30));
        btnCancelar.setMinimumSize(new java.awt.Dimension(100, 30));
        btnCancelar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        jPanel4.add(btnCancelar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        panelPaquetes.add(jPanel4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(panelPaquetes, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxFilterEmisorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxFilterEmisorItemStateChanged
        filtrarEmisor();
    }//GEN-LAST:event_cbxFilterEmisorItemStateChanged

    private void txtFilterEmisorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFilterEmisorKeyReleased
        filtrarEmisor();
    }//GEN-LAST:event_txtFilterEmisorKeyReleased

    private void btnAgregarEmisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEmisorActionPerformed
        emisorController.prepareCreate();
        com.pereira.encomiendas.view.emisor.Create dialog = new com.pereira.encomiendas.view.emisor.Create(new JFrame(), true, "NUEVO EMISOR");
        dialog.setVisible(true);
        recargarTablaEmisor();
    }//GEN-LAST:event_btnAgregarEmisorActionPerformed

    private void cbxFilterReceptorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxFilterReceptorItemStateChanged
        filtrarReceptor();
    }//GEN-LAST:event_cbxFilterReceptorItemStateChanged

    private void txtFilterReceptorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFilterReceptorKeyReleased
        filtrarReceptor();
    }//GEN-LAST:event_txtFilterReceptorKeyReleased

    private void btnVerEmisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerEmisorActionPerformed
        if (isSelectedRowEmisor()) {
            emisorController.setSeleccionado(tmEmisores.getRow(tEmisores.convertRowIndexToModel(tEmisores.getSelectedRow())));
            com.pereira.encomiendas.view.emisor.View dialog = new com.pereira.encomiendas.view.emisor.View(new JFrame(), true, "VER EMISOR");
            dialog.setVisible(true);
            recargarTablaEmisor();
        } else {
            JOptionPane.showMessageDialog(new JFrame(),
                    "Seleccione un emisor de la tabla",
                    "ENCOM",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnVerEmisorActionPerformed

    private void btnEditarEmisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEmisorActionPerformed
        if (isSelectedRowEmisor()) {
            emisorController.setSeleccionado(tmEmisores.getRow(tEmisores.convertRowIndexToModel(tEmisores.getSelectedRow())));
            com.pereira.encomiendas.view.emisor.Create dialog = new com.pereira.encomiendas.view.emisor.Create(new JFrame(), true, "EDITAR EMISOR", true);
            dialog.setVisible(true);
            recargarTablaEmisor();
        } else {
            JOptionPane.showMessageDialog(new JFrame(),
                    "Seleccione un emisor de la tabla",
                    "ENCOM",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarEmisorActionPerformed

    private void btnAgregarReceptorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarReceptorActionPerformed
        receptorController.prepareCreate();
        com.pereira.encomiendas.view.receptor.Create dialog = new com.pereira.encomiendas.view.receptor.Create(new JFrame(), true, "NUEVO RECEPTOR");
        dialog.setVisible(true);
        recargarTablaReceptor();
    }//GEN-LAST:event_btnAgregarReceptorActionPerformed

    private void btnVerReceptorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerReceptorActionPerformed
        if (isSelectedRowReceptor()) {
            receptorController.setSeleccionado(tmReceptores.getRow(tReceptores.convertRowIndexToModel(tReceptores.getSelectedRow())));
            com.pereira.encomiendas.view.receptor.View dialog = new com.pereira.encomiendas.view.receptor.View(new JFrame(), true, "VER RECEPTOR");
            dialog.setVisible(true);
            recargarTablaEmisor();
        } else {
            JOptionPane.showMessageDialog(new JFrame(),
                    "Seleccione un receptor de la tabla",
                    "ENCOM",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnVerReceptorActionPerformed

    private void btnEditarReceptorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarReceptorActionPerformed
        if (isSelectedRowReceptor()) {
            receptorController.setSeleccionado(tmReceptores.getRow(tReceptores.convertRowIndexToModel(tReceptores.getSelectedRow())));
            com.pereira.encomiendas.view.receptor.Create dialog = new com.pereira.encomiendas.view.receptor.Create(new JFrame(), true, "EDITAR RECEPTOR", true);
            dialog.setVisible(true);
            recargarTablaEmisor();
        } else {
            JOptionPane.showMessageDialog(new JFrame(),
                    "Seleccione un receptor de la tabla",
                    "ENCOM",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarReceptorActionPerformed

    private void btnAgregarPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPaqueteActionPerformed
        if (tmPaquete.getRowCount() < 10) {
            String[] row = {""};
            tmPaquete.addRow(row);
        }
    }//GEN-LAST:event_btnAgregarPaqueteActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPaqueteActionPerformed
        if (tmPaquete.getRowCount() != 0) {
            if (tPaquetes.getSelectedRow() > -1) {
                tmPaquete.removeRow(tPaquetes.getSelectedRow());
            }
        }
    }//GEN-LAST:event_btnEliminarPaqueteActionPerformed

    private void chkRecientesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkRecientesItemStateChanged
        if (chkRecientes.isSelected()) {
            cargarRecientes();
        } else {
            tmReceptores.setList(receptorController.getItems());
            tmReceptores.fireTableDataChanged();
        }

    }//GEN-LAST:event_chkRecientesItemStateChanged

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (tPaquetes.getRowCount() > 0) {
            if (tEmisores.getSelectedRow() > -1 && tReceptores.getSelectedRow() > -1) {
                generarOrden();
            } else {
                JOptionPane.showMessageDialog(new JFrame(),
                        "Hace falta seleccionar Emisor o Receptor para continuar",
                        "ENCOM",
                        JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(new JFrame(),
                    "Ingrese al menos un paquete para la orden",
                    "ENCOM",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarEmisor;
    private javax.swing.JButton btnAgregarPaquete;
    private javax.swing.JButton btnAgregarReceptor;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditarEmisor;
    private javax.swing.JButton btnEditarReceptor;
    private javax.swing.JButton btnEliminarPaquete;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVerEmisor;
    private javax.swing.JButton btnVerReceptor;
    private javax.swing.JComboBox<String> cbxFilterEmisor;
    private javax.swing.JComboBox<String> cbxFilterReceptor;
    private javax.swing.JComboBox<Salida> cbxSalidas;
    private javax.swing.JCheckBox chkRecientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblOrden;
    private javax.swing.JPanel panelControles;
    private javax.swing.JPanel panelControles2;
    private javax.swing.JPanel panelEmisor;
    private javax.swing.JPanel panelExtras;
    private javax.swing.JPanel panelFiltro;
    private javax.swing.JPanel panelFiltro1;
    private javax.swing.JPanel panelPaquetes;
    private javax.swing.JPanel panelReceptor;
    private javax.swing.JPanel panelTabla;
    private javax.swing.JTable tEmisores;
    private javax.swing.JTable tPaquetes;
    private javax.swing.JTable tReceptores;
    private javax.swing.JSpinner txtCosto;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txtFilterEmisor;
    private javax.swing.JTextField txtFilterReceptor;
    private javax.swing.JSpinner txtPeso;
    // End of variables declaration//GEN-END:variables

    private void filtrarEmisor() {
        RowFilter<TableModel, Object> rf = null;
        try {
            switch (cbxFilterEmisor.getSelectedIndex()) {
                case 1:
                    rf = RowFilter.regexFilter("(?i)" + txtFilterEmisor.getText(), 0);
                    break;
                case 2:
                    rf = RowFilter.regexFilter("(?i)" + txtFilterEmisor.getText(), 1);
                    break;
                case 3:
                    rf = RowFilter.regexFilter("(?i)" + txtFilterEmisor.getText(), 2);
                    break;
                case 4:
                    rf = RowFilter.regexFilter("(?i)" + txtFilterEmisor.getText(), 3);
                    break;
                default:
                    rf = RowFilter.regexFilter("(?i)" + txtFilterEmisor.getText());
                    break;
            }
        } catch (java.util.regex.PatternSyntaxException e) {
            return;
        }
        sorterEmisor.setRowFilter(rf);
    }

    private void recargarTablaEmisor() {
        int seleccion = tEmisores.getSelectedRow();
        tmEmisores.setList(emisorController.getItems());
        tmEmisores.fireTableDataChanged();
        filtrarEmisor();
        if (seleccion > -1) {
            tEmisores.setRowSelectionInterval(seleccion, seleccion);
        }
    }

    private boolean isSelectedRowEmisor() {
        return tEmisores.getSelectedRow() > -1;
    }

    private void filtrarReceptor() {
        RowFilter<TableModel, Object> rf = null;
        try {
            switch (cbxFilterReceptor.getSelectedIndex()) {
                case 1:
                    rf = RowFilter.regexFilter("(?i)" + txtFilterReceptor.getText(), 0);
                    break;
                case 2:
                    rf = RowFilter.regexFilter("(?i)" + txtFilterReceptor.getText(), 1);
                    break;
                case 3:
                    rf = RowFilter.regexFilter("(?i)" + txtFilterReceptor.getText(), 2);
                    break;
                case 4:
                    rf = RowFilter.regexFilter("(?i)" + txtFilterReceptor.getText(), 3);
                    break;
                default:
                    rf = RowFilter.regexFilter("(?i)" + txtFilterReceptor.getText());
                    break;
            }
        } catch (java.util.regex.PatternSyntaxException e) {
            return;
        }
        sorterReceptor.setRowFilter(rf);
    }

    private void recargarTablaReceptor() {
        if (chkRecientes.isSelected()) {
            cargarRecientes();
        } else {
            int seleccion = tReceptores.getSelectedRow();
            tmReceptores.setList(receptorController.getItems());
            tmReceptores.fireTableDataChanged();
            filtrarEmisor();
            if (seleccion > -1) {
                tReceptores.setRowSelectionInterval(seleccion, seleccion);
            }
        }
    }

    private boolean isSelectedRowReceptor() {
        return tReceptores.getSelectedRow() > -1;
    }

    private void cargarRecientes() {
        List<Receptor> receptores = new ArrayList<>();
        if (tEmisores.getSelectedRow() > -1) {
            recienteController.getByEmisor(tmEmisores.getRow(tEmisores.convertRowIndexToModel(tEmisores.getSelectedRow()))).forEach(reciente -> {
                receptores.add(reciente.getReceptor());
            });
            tmReceptores.setList(receptores);
            tmReceptores.fireTableDataChanged();
        }
    }

    private void generarOrden() {
        boolean paqueteOK = true;
        ordenController.prepareCreate();
        ordenController.getSeleccionado().setEmisor(tmEmisores.getRow(tEmisores.convertRowIndexToModel(tEmisores.getSelectedRow())));
        ordenController.getSeleccionado().setReceptor(tmReceptores.getRow(tReceptores.convertRowIndexToModel(tReceptores.getSelectedRow())));
        List<Paquete> paquetes = new ArrayList<>();
        for (int i = 0; i < tPaquetes.getRowCount(); i++) {
            String detalle = (String) tPaquetes.getValueAt(i, 0);
            if (detalle == null || detalle.isEmpty()) {
                paqueteOK = false;
            }
            Paquete paquete = new Paquete();
            paquete.setDescripcion(detalle);
            paquete.setOrden(ordenController.getSeleccionado());
            paquetes.add(paquete);
        }
        ordenController.getSeleccionado().setPaqueteList(paquetes);
        System.out.println("fecha: " + txtFecha.getDate());
        ordenController.getSeleccionado().setFrecibido(txtFecha.getDate());
        ordenController.getSeleccionado().setSalida((Salida) cbmSalidas.getSelectedItem());
        double peso = (double) txtPeso.getValue();
        double costo = (double) txtCosto.getValue();
        ordenController.getSeleccionado().setPeso(new BigDecimal(String.format("%.2f", peso)));
        ordenController.getSeleccionado().setCosto(new BigDecimal(String.format("%.2f", costo)));
        if (paqueteOK) {
            try {
                ordenController.create();
                int n = JOptionPane.showConfirmDialog(
                        new JFrame(),
                        "Desea imprimir la Orden?",
                        "ENCOM",
                        JOptionPane.YES_NO_OPTION);
                if (n == 0) {
                    ordenController.printOrden();
                }
                if (!RecienteController.getCONTROLLER().isReciente(ordenController.getSeleccionado().getEmisor(), ordenController.getSeleccionado().getReceptor())) {
                    JOptionPane.showMessageDialog(new JFrame(),
                            "Agregando a: " + ordenController.getSeleccionado().getReceptor().getNombres() + " " + ordenController.getSeleccionado().getReceptor().getApellidos()
                            + " Como RECEPTOR frecuente de: " + ordenController.getSeleccionado().getEmisor().getNombres() + " "
                            + ordenController.getSeleccionado().getEmisor().getApellidos(),
                            "ENCOM",
                            JOptionPane.INFORMATION_MESSAGE);
                    RecienteController.getCONTROLLER().prepareCreate();
                    RecienteController.getCONTROLLER().getSeleccionado().setEmisor(ordenController.getSeleccionado().getEmisor());
                    RecienteController.getCONTROLLER().getSeleccionado().setReceptor(ordenController.getSeleccionado().getReceptor());
                    RecienteController.getCONTROLLER().create();
                }
                ((Salida) cbmSalidas.getSelectedItem()).getOrdenList().add(ordenController.getSeleccionado());
                n = JOptionPane.showConfirmDialog(
                        new JFrame(),
                        "Desea generar otra Orden?",
                        "ENCOM",
                        JOptionPane.YES_NO_OPTION);
                if (n == 0) {
                    resetForm();
                } else {
                    dispose();
                }
            } catch (HeadlessException | IOException | JRException ex) {
                Logger.getLogger(Create.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                ordenController.setSeleccionado(null);
            }
        } else {
            JOptionPane.showMessageDialog(new JFrame(),
                    "Uno o varios paquetes no tienen detalle, ingrese el detalle para continuar!",
                    "ENCOM",
                    JOptionPane.WARNING_MESSAGE);
        }
    }

    private void resetForm() {
        cbxSalidas.setSelectedIndex(0);
        tEmisores.clearSelection();
        tReceptores.clearSelection();
        cbxFilterEmisor.setSelectedIndex(0);
        cbxFilterReceptor.setSelectedIndex(0);
        txtPeso.setValue(0.0);
        txtCosto.setValue(0.0);
        ((DefaultTableModel) tPaquetes.getModel()).setNumRows(0);
        cargarNumeroOrden();
    }

    private void cargarNumeroOrden() {
        lblOrden.setText("" + ordenController.generarNumero((Salida) cbmSalidas.getSelectedItem()));
    }
}
