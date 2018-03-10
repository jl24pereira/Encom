package com.pereira.encomiendas.view;

import com.pereira.encomiendas.controller.OrdenController;
import com.pereira.encomiendas.controller.SalidaController;
import com.pereira.encomiendas.main.Main;
import com.pereira.encomiendas.view.emisor.EmisoresFrame;
import com.pereira.encomiendas.view.orden.OrdenFrame;
import com.pereira.encomiendas.view.receptor.ReceptoresFrame;
import com.pereira.encomiendas.view.salida.Create;
import com.pereira.encomiendas.view.salida.SalidasFrame;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class Principal extends javax.swing.JFrame {

    private final EmisoresFrame frameEmisores;
    private final ReceptoresFrame frameReceptores;
    private final SalidasFrame frameSalidas;
    private final OrdenFrame frameOrdenes;

    public Principal() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        frameEmisores = EmisoresFrame.getFrame();
        frameReceptores = ReceptoresFrame.getFrame();
        frameSalidas = SalidasFrame.getFrame();
        frameOrdenes = OrdenFrame.getFrame();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        itemNuevaOrden = new javax.swing.JMenuItem();
        itemNuevaSalida = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itemEmisores = new javax.swing.JMenuItem();
        itemReceptores = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        itemSalidas = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        itemLicencia = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ENCOM 2.0");
        setMinimumSize(new java.awt.Dimension(1000, 650));
        setPreferredSize(new java.awt.Dimension(1000, 650));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(desktop, gridBagConstraints);

        jMenu1.setText("Archivo");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenu3.setText("Nueva");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        itemNuevaOrden.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemNuevaOrden.setText("Nueva Orden");
        itemNuevaOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNuevaOrdenActionPerformed(evt);
            }
        });
        jMenu3.add(itemNuevaOrden);

        itemNuevaSalida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemNuevaSalida.setText("Nuevo Viaje");
        itemNuevaSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNuevaSalidaActionPerformed(evt);
            }
        });
        jMenu3.add(itemNuevaSalida);

        jMenu1.add(jMenu3);

        jMenu2.setText("Clientes");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        itemEmisores.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemEmisores.setText("Emisores");
        itemEmisores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEmisoresActionPerformed(evt);
            }
        });
        jMenu2.add(itemEmisores);

        itemReceptores.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemReceptores.setText("Receptores");
        itemReceptores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReceptoresActionPerformed(evt);
            }
        });
        jMenu2.add(itemReceptores);

        jMenu1.add(jMenu2);

        jMenuItem9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem9.setText("Salir");
        jMenu1.add(jMenuItem9);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Reportes");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        itemSalidas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemSalidas.setText("Viajes");
        itemSalidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSalidasActionPerformed(evt);
            }
        });
        jMenu4.add(itemSalidas);

        jMenuItem11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem11.setText("Ordenes");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Acerca de");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });

        itemLicencia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemLicencia.setText("Licencia");
        itemLicencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemLicenciaActionPerformed(evt);
            }
        });
        jMenu5.add(itemLicencia);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemEmisoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEmisoresActionPerformed
        if (frameEmisores != null) {
            if (frameEmisores.isIcon()) {
                restaurarFrame(frameEmisores);
            } else if (!frameEmisores.isShowing()) {
                desktop.add(frameEmisores);
                frameEmisores.setVisible(true);
            } else {
                moverAlFrente(frameEmisores);
            }
        }
    }//GEN-LAST:event_itemEmisoresActionPerformed

    private void itemReceptoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReceptoresActionPerformed
        if (frameReceptores != null) {
            if (frameReceptores.isIcon()) {
                restaurarFrame(frameReceptores);
            } else if (!frameReceptores.isShowing()) {
                desktop.add(frameReceptores);
                frameReceptores.setVisible(true);
            } else {
                moverAlFrente(frameReceptores);
            }
        }
    }//GEN-LAST:event_itemReceptoresActionPerformed

    private void itemSalidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalidasActionPerformed
        if (frameSalidas != null) {
            if (frameSalidas.isIcon()) {                
                restaurarFrame(frameSalidas);
                frameSalidas.recargarTabla();
            } else if (!frameSalidas.isShowing()) {
                desktop.add(frameSalidas);                
                frameSalidas.setVisible(true);
            } else {
                moverAlFrente(frameSalidas);
            }
        }
    }//GEN-LAST:event_itemSalidasActionPerformed

    private void itemNuevaSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNuevaSalidaActionPerformed
        SalidaController.getCONTROLLER().prepareCreate();
        com.pereira.encomiendas.view.salida.Create dialog = new com.pereira.encomiendas.view.salida.Create(new JFrame(), true, "AGREGAR SALDIA");
        dialog.setVisible(true);
    }//GEN-LAST:event_itemNuevaSalidaActionPerformed

    private void itemNuevaOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNuevaOrdenActionPerformed
        OrdenController.getCONTROLLER().prepareCreate();
        com.pereira.encomiendas.view.orden.Create dialog = new com.pereira.encomiendas.view.orden.Create(new JFrame(), true,"NUEVA ORDEN");
        dialog.setVisible(true);
    }//GEN-LAST:event_itemNuevaOrdenActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        if (frameOrdenes != null) {
            if (frameOrdenes.isIcon()) {                
                restaurarFrame(frameOrdenes);
            } else if (!frameOrdenes.isShowing()) {
                desktop.add(frameOrdenes);                
                frameOrdenes.setVisible(true);
            } else {
                moverAlFrente(frameOrdenes);
            }
        }
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void itemLicenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemLicenciaActionPerformed
        Licencia dialog = new Licencia(new JFrame(), true, "LICENCIA");
        dialog.setVisible(true);
    }//GEN-LAST:event_itemLicenciaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuItem itemEmisores;
    private javax.swing.JMenuItem itemLicencia;
    private javax.swing.JMenuItem itemNuevaOrden;
    private javax.swing.JMenuItem itemNuevaSalida;
    private javax.swing.JMenuItem itemReceptores;
    private javax.swing.JMenuItem itemSalidas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables

    private void restaurarFrame(JInternalFrame frame) {
        try {
            frame.setSelected(true);
            desktop.getDesktopManager().deiconifyFrame(frame);
            desktop.getDesktopManager().maximizeFrame(frame);
            desktop.getDesktopManager().minimizeFrame(frame);
            frame.moveToFront();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void moverAlFrente(JInternalFrame frame) {
        try {
            frame.setSelected(true);
            frame.moveToFront();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
