/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.edu.udec.s2.Main.ventanas;

/**
 *
 * @author JESUS DAVID
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        barraMenu = new javax.swing.JMenuBar();
        menuUsuarios = new javax.swing.JMenu();
        iteminiciarSesionUsuarios = new javax.swing.JMenuItem();
        itemAgregarUsuario = new javax.swing.JMenuItem();
        itemConsultarUsuarios = new javax.swing.JMenuItem();
        itemEditarUsuarios = new javax.swing.JMenuItem();
        itemEliminarUsuarios = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        subMenuReportesUsuarios = new javax.swing.JMenu();
        itemBuscarUsuariosXNombre = new javax.swing.JMenuItem();
        itemBuscarUsuariosXCorreo = new javax.swing.JMenuItem();
        itemBuscarUsuariosXtelefono = new javax.swing.JMenuItem();
        MenuSmartPhone = new javax.swing.JMenu();
        ItemAgregarSmartPhone = new javax.swing.JMenuItem();
        itemConsultarSmartPhone = new javax.swing.JMenuItem();
        itemEditarSmartPhone = new javax.swing.JMenuItem();
        itemEliminarSmartPhone = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        subMenuReporteSmartPhone = new javax.swing.JMenu();
        itemBuscarSmartPhoneXMarca = new javax.swing.JMenuItem();
        itemBuscarSmartPhoneXModelo = new javax.swing.JMenuItem();
        itemBuscarSmartPhoneXSistemaOperativo = new javax.swing.JMenuItem();
        MenuAplicaciones = new javax.swing.JMenu();
        itemAgregarAplicaciones = new javax.swing.JMenuItem();
        itemConsultarAplicaciones = new javax.swing.JMenuItem();
        itemEditarAplicaciones = new javax.swing.JMenuItem();
        itemEliminarAplicaciones = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        subMenuReporteAplicaciones = new javax.swing.JMenu();
        itemBuscarAplicacionesXNombre = new javax.swing.JMenuItem();
        itemBuscarAplicacionesXTipo = new javax.swing.JMenuItem();
        itemBuscarAplicacionesXDesarrollador = new javax.swing.JMenuItem();
        MenuAyuda = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(".:: GESTION DE USUARIOS ::.");

        menuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/s2/Main/ventanas/iconos/USUARIOS24PX.png"))); // NOI18N
        menuUsuarios.setText("USUARIOS");

        iteminiciarSesionUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/s2/Main/ventanas/iconos/Login24px.png"))); // NOI18N
        iteminiciarSesionUsuarios.setText("Iniciar Sesion...");
        iteminiciarSesionUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iteminiciarSesionUsuariosActionPerformed(evt);
            }
        });
        menuUsuarios.add(iteminiciarSesionUsuarios);

        itemAgregarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/s2/Main/ventanas/iconos/Add24px.png"))); // NOI18N
        itemAgregarUsuario.setText("Agregar Usuario...");
        menuUsuarios.add(itemAgregarUsuario);

        itemConsultarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/s2/Main/ventanas/iconos/Buscar24px.png"))); // NOI18N
        itemConsultarUsuarios.setText("Consultar mis Datos...");
        itemConsultarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultarUsuariosActionPerformed(evt);
            }
        });
        menuUsuarios.add(itemConsultarUsuarios);

        itemEditarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/s2/Main/ventanas/iconos/Edit24px.png"))); // NOI18N
        itemEditarUsuarios.setText("Editar mis Datos...");
        menuUsuarios.add(itemEditarUsuarios);

        itemEliminarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/s2/Main/ventanas/iconos/Delete24px.png"))); // NOI18N
        itemEliminarUsuarios.setText("Eliminar mis cuentas...");
        itemEliminarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarUsuariosActionPerformed(evt);
            }
        });
        menuUsuarios.add(itemEliminarUsuarios);
        menuUsuarios.add(jSeparator1);

        subMenuReportesUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/s2/Main/ventanas/iconos/Register24px.png"))); // NOI18N
        subMenuReportesUsuarios.setText("Registros...");

        itemBuscarUsuariosXNombre.setText("Por nombre...");
        subMenuReportesUsuarios.add(itemBuscarUsuariosXNombre);

        itemBuscarUsuariosXCorreo.setText("Por correo...");
        subMenuReportesUsuarios.add(itemBuscarUsuariosXCorreo);

        itemBuscarUsuariosXtelefono.setText("Por telefono...");
        itemBuscarUsuariosXtelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBuscarUsuariosXtelefonoActionPerformed(evt);
            }
        });
        subMenuReportesUsuarios.add(itemBuscarUsuariosXtelefono);

        menuUsuarios.add(subMenuReportesUsuarios);

        barraMenu.add(menuUsuarios);

        MenuSmartPhone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/s2/Main/ventanas/iconos/SmartPhone24px.png"))); // NOI18N
        MenuSmartPhone.setText("SMARTPHONE");

        ItemAgregarSmartPhone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/s2/Main/ventanas/iconos/Add24px.png"))); // NOI18N
        ItemAgregarSmartPhone.setText("Agregar SmartPhone...");
        MenuSmartPhone.add(ItemAgregarSmartPhone);

        itemConsultarSmartPhone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/s2/Main/ventanas/iconos/Buscar24px.png"))); // NOI18N
        itemConsultarSmartPhone.setText("Consultar mi SmartPhone...");
        itemConsultarSmartPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultarSmartPhoneActionPerformed(evt);
            }
        });
        MenuSmartPhone.add(itemConsultarSmartPhone);

        itemEditarSmartPhone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/s2/Main/ventanas/iconos/Edit24px.png"))); // NOI18N
        itemEditarSmartPhone.setText("Editar mis Datos...");
        MenuSmartPhone.add(itemEditarSmartPhone);

        itemEliminarSmartPhone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/s2/Main/ventanas/iconos/Delete24px.png"))); // NOI18N
        itemEliminarSmartPhone.setText("Eliminar mi SmartPhone...");
        MenuSmartPhone.add(itemEliminarSmartPhone);
        MenuSmartPhone.add(jSeparator2);

        subMenuReporteSmartPhone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/s2/Main/ventanas/iconos/Register24px.png"))); // NOI18N
        subMenuReporteSmartPhone.setText("Registros...");

        itemBuscarSmartPhoneXMarca.setText("Por Marca...");
        itemBuscarSmartPhoneXMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBuscarSmartPhoneXMarcaActionPerformed(evt);
            }
        });
        subMenuReporteSmartPhone.add(itemBuscarSmartPhoneXMarca);

        itemBuscarSmartPhoneXModelo.setText("Por modelo...");
        subMenuReporteSmartPhone.add(itemBuscarSmartPhoneXModelo);

        itemBuscarSmartPhoneXSistemaOperativo.setText("Por Sistema Operativo...");
        subMenuReporteSmartPhone.add(itemBuscarSmartPhoneXSistemaOperativo);

        MenuSmartPhone.add(subMenuReporteSmartPhone);

        barraMenu.add(MenuSmartPhone);

        MenuAplicaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/s2/Main/ventanas/iconos/Apps24px.png"))); // NOI18N
        MenuAplicaciones.setText("APLICACIONES");

        itemAgregarAplicaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/s2/Main/ventanas/iconos/Add24px.png"))); // NOI18N
        itemAgregarAplicaciones.setText("Agregar Aplicacion...");
        MenuAplicaciones.add(itemAgregarAplicaciones);

        itemConsultarAplicaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/s2/Main/ventanas/iconos/Buscar24px.png"))); // NOI18N
        itemConsultarAplicaciones.setText("Consultar mis Aplicaciones...");
        itemConsultarAplicaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultarAplicacionesActionPerformed(evt);
            }
        });
        MenuAplicaciones.add(itemConsultarAplicaciones);

        itemEditarAplicaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/s2/Main/ventanas/iconos/Edit24px.png"))); // NOI18N
        itemEditarAplicaciones.setText("Editar mis Aplicaciones...");
        MenuAplicaciones.add(itemEditarAplicaciones);

        itemEliminarAplicaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/s2/Main/ventanas/iconos/Delete24px.png"))); // NOI18N
        itemEliminarAplicaciones.setText("Eliminar mis Aplicaciones...");
        MenuAplicaciones.add(itemEliminarAplicaciones);
        MenuAplicaciones.add(jSeparator3);

        subMenuReporteAplicaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/s2/Main/ventanas/iconos/Register24px.png"))); // NOI18N
        subMenuReporteAplicaciones.setText("Registros...");

        itemBuscarAplicacionesXNombre.setText("Por nombre...");
        subMenuReporteAplicaciones.add(itemBuscarAplicacionesXNombre);

        itemBuscarAplicacionesXTipo.setText("Por Tipo...");
        itemBuscarAplicacionesXTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBuscarAplicacionesXTipoActionPerformed(evt);
            }
        });
        subMenuReporteAplicaciones.add(itemBuscarAplicacionesXTipo);

        itemBuscarAplicacionesXDesarrollador.setText("Por Desarrollador...");
        itemBuscarAplicacionesXDesarrollador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBuscarAplicacionesXDesarrolladorActionPerformed(evt);
            }
        });
        subMenuReporteAplicaciones.add(itemBuscarAplicacionesXDesarrollador);

        MenuAplicaciones.add(subMenuReporteAplicaciones);

        barraMenu.add(MenuAplicaciones);

        MenuAyuda.setText("AYUDA");

        jMenuItem16.setText("Acerca de...");
        MenuAyuda.add(jMenuItem16);

        barraMenu.add(MenuAyuda);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 824, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iteminiciarSesionUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iteminiciarSesionUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iteminiciarSesionUsuariosActionPerformed

    private void itemConsultarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultarUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemConsultarUsuariosActionPerformed

    private void itemConsultarSmartPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultarSmartPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemConsultarSmartPhoneActionPerformed

    private void itemBuscarSmartPhoneXMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBuscarSmartPhoneXMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemBuscarSmartPhoneXMarcaActionPerformed

    private void itemBuscarUsuariosXtelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBuscarUsuariosXtelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemBuscarUsuariosXtelefonoActionPerformed

    private void itemConsultarAplicacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultarAplicacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemConsultarAplicacionesActionPerformed

    private void itemBuscarAplicacionesXDesarrolladorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBuscarAplicacionesXDesarrolladorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemBuscarAplicacionesXDesarrolladorActionPerformed

    private void itemBuscarAplicacionesXTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBuscarAplicacionesXTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemBuscarAplicacionesXTipoActionPerformed

    private void itemEliminarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemEliminarUsuariosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItemAgregarSmartPhone;
    private javax.swing.JMenu MenuAplicaciones;
    private javax.swing.JMenu MenuAyuda;
    private javax.swing.JMenu MenuSmartPhone;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenuItem itemAgregarAplicaciones;
    private javax.swing.JMenuItem itemAgregarUsuario;
    private javax.swing.JMenuItem itemBuscarAplicacionesXDesarrollador;
    private javax.swing.JMenuItem itemBuscarAplicacionesXNombre;
    private javax.swing.JMenuItem itemBuscarAplicacionesXTipo;
    private javax.swing.JMenuItem itemBuscarSmartPhoneXMarca;
    private javax.swing.JMenuItem itemBuscarSmartPhoneXModelo;
    private javax.swing.JMenuItem itemBuscarSmartPhoneXSistemaOperativo;
    private javax.swing.JMenuItem itemBuscarUsuariosXCorreo;
    private javax.swing.JMenuItem itemBuscarUsuariosXNombre;
    private javax.swing.JMenuItem itemBuscarUsuariosXtelefono;
    private javax.swing.JMenuItem itemConsultarAplicaciones;
    private javax.swing.JMenuItem itemConsultarSmartPhone;
    private javax.swing.JMenuItem itemConsultarUsuarios;
    private javax.swing.JMenuItem itemEditarAplicaciones;
    private javax.swing.JMenuItem itemEditarSmartPhone;
    private javax.swing.JMenuItem itemEditarUsuarios;
    private javax.swing.JMenuItem itemEliminarAplicaciones;
    private javax.swing.JMenuItem itemEliminarSmartPhone;
    private javax.swing.JMenuItem itemEliminarUsuarios;
    private javax.swing.JMenuItem iteminiciarSesionUsuarios;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenu menuUsuarios;
    private javax.swing.JMenu subMenuReporteAplicaciones;
    private javax.swing.JMenu subMenuReporteSmartPhone;
    private javax.swing.JMenu subMenuReportesUsuarios;
    // End of variables declaration//GEN-END:variables
}
