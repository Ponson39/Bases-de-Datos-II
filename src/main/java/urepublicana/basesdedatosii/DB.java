/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urepublicana.basesdedatosii;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alex-arch
 */
public class DB extends javax.swing.JDialog {

    /**
     * Creates new form Usuarios
     */
    private class BotonPulsadoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            accion = e.getActionCommand();

            System.out.println("Has pulsado el botón -" + e.getActionCommand() + "-");
        }

    }

    public DB(java.awt.Frame parent, boolean modal, Connection conection) {
        super(parent, modal);
        con = conection;
        initComponents();

        setLocationRelativeTo(null);

        jButtonCrear.addActionListener(new BotonPulsadoListener());
        jButtonBorrar.addActionListener(new BotonPulsadoListener());
        jButtonVer.addActionListener(new BotonPulsadoListener());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonCrear = new javax.swing.JButton();
        jButtonBorrar = new javax.swing.JButton();
        jButtonVer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDB = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jTextName_DB = new javax.swing.JTextField();
        jLabeldb = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonAtras = new javax.swing.JButton();
        jLabelDB = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(721, 418));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BASES DE DATOS");

        jButtonCrear.setText("Crear DB");
        jButtonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearActionPerformed(evt);
            }
        });

        jButtonBorrar.setText("Borrar DB");
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        jButtonVer.setText("Ver DB");
        jButtonVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerActionPerformed(evt);
            }
        });

        jTableDB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Fecha de Creación", "Tipo", "Autenticación"
            }
        ));
        jScrollPane1.setViewportView(jTableDB);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jPanel1.setMinimumSize(new java.awt.Dimension(403, 105));

        jTextName_DB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextName_DBActionPerformed(evt);
            }
        });

        jLabeldb.setText("Nombre DB:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabeldb, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextName_DB, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabeldb)
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextName_DB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabeldb, jTextName_DB});

        jTextName_DB.setVisible(false);
        jLabeldb.setVisible(false);

        jButtonGuardar.setText("GUARDAR");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("CANCELAR");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonAtras.setText("Atrás");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });

        jLabelDB.setFont(new java.awt.Font("Dialog", 2, 20)); // NOI18N
        jLabelDB.setText("NONE");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel2.setText("Base de Datos Actual: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelDB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jButtonBorrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonCrear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonVer, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(50, 50, 50))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDB)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCrear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBorrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonVer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAtras)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jButtonGuardar.setVisible(false);
        jButtonCancelar.setVisible(false);
        jLabelDB.setText(ver_name_DB());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearActionPerformed
        jTextName_DB.setVisible(true);
        jLabeldb.setVisible(true);

        jButtonBorrar.setEnabled(false);
        jButtonVer.setEnabled(false);
        jButtonCrear.setEnabled(false);

        jButtonGuardar.setVisible(true);
        jButtonCancelar.setVisible(true);
    }//GEN-LAST:event_jButtonCrearActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        System.out.println(accion);

        if (accion == "Borrar DB") {
            System.out.println("Borrado");
            BorrarUsuario();
        }
        if (accion == "Crear DB") {
            System.out.println("Creado");
            CrearDB();
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        // TODO add your handling code here:
        jTextName_DB.setVisible(true);
        jLabeldb.setVisible(true);

        jButtonBorrar.setEnabled(false);
        jButtonVer.setEnabled(false);
        jButtonCrear.setEnabled(false);

        jButtonGuardar.setVisible(true);
        jButtonCancelar.setVisible(true);

    }//GEN-LAST:event_jButtonBorrarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        jTextName_DB.setVisible(false);
        jLabeldb.setVisible(false);

        jButtonBorrar.setEnabled(true);
        jButtonVer.setEnabled(true);
        jButtonCrear.setEnabled(true);

        jButtonGuardar.setVisible(false);
        jButtonCancelar.setVisible(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerActionPerformed
        ver_DB();
    }//GEN-LAST:event_jButtonVerActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jTextName_DBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextName_DBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextName_DBActionPerformed

    private void CrearDB() {
        try {
            // TODO add your handling code here:
            System.out.println(con.isClosed());

            String db_actual, nueva_db;

            db_actual = jLabelDB.getText();
            nueva_db = jTextName_DB.getText();

            PreparedStatement add_user = con.prepareStatement("USE " + db_actual + "\n"
                    + "IF NOT EXISTS (\n"
                    + "   SELECT name\n"
                    + "   FROM sys.databases\n"
                    + "   WHERE name = N'" + nueva_db + "'\n"
                    + ")\n"
                    + "CREATE DATABASE [" + nueva_db + "]");

            boolean añadir = add_user.execute();

            if (añadir == false) {

                JOptionPane.showMessageDialog(null, "Se ha registrado la base de datos correctamente");
                ver_DB();

                jTextName_DB.setVisible(false);
                jLabeldb.setVisible(false);

                jButtonBorrar.setEnabled(true);
                jButtonVer.setEnabled(true);
                jButtonCrear.setEnabled(true);

                jButtonGuardar.setVisible(false);
                jButtonCancelar.setVisible(false);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void BorrarUsuario() {
        try {
            String db_actual, nueva_db;

            db_actual = jLabelDB.getText();
            nueva_db = jTextName_DB.getText();
            
            PreparedStatement drop_user = con.prepareStatement("USE " + db_actual + "\n"
                    + "DROP DATABASE [" + nueva_db + "]");

            int status = JOptionPane.showConfirmDialog(null, "¿Está seguro de que quiere borrar la base de datos?", "Alerta", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

            System.out.println("Status: " + status);

            if (status == 0) {
                //drop_user.setString(1, jTextName_DB.getText());

                boolean borrar = drop_user.execute();

                if (borrar == false) {

                    JOptionPane.showMessageDialog(null, "Se ha borrado la base de datos correctamente");
                    
                    ver_DB();

                    jTextName_DB.setVisible(false);
                    jLabeldb.setVisible(false);

                    jButtonBorrar.setEnabled(true);
                    jButtonVer.setEnabled(true);
                    jButtonCrear.setEnabled(true);

                    jButtonGuardar.setVisible(false);
                    jButtonCancelar.setVisible(false);
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String ver_name_DB() {
        String ob = null;
        try {
            PreparedStatement view_db = con.prepareStatement("select DB_NAME() GO");

            ResultSet rs = view_db.executeQuery();

            while (rs.next()) {
                ob = rs.getString(1);
            }

            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(Ver_DB.class.getName()).log(Level.SEVERE, null, ex);
        }

        String texto = ob;
        return texto;
    }

    private void ver_DB() {
        try {

            System.out.println(con.isClosed());
            PreparedStatement view_db = con.prepareStatement("select name, create_date, state_desc from sys.databases go");

            DefaultTableModel modelo = (DefaultTableModel) jTableDB.getModel();

            modelo.setRowCount(0);

            ResultSet rs = view_db.executeQuery();
            String valor;

            while (rs.next()) {
                Object[] ob = new Object[3];
                ob[0] = rs.getString(1);
                ob[1] = rs.getDate(2);
                ob[2] = rs.getString(3);

                modelo.addRow(ob);
                //System.out.println("valor: " + valor);
            }
            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonCrear;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonVer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelDB;
    private javax.swing.JLabel jLabeldb;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTableDB;
    private javax.swing.JTextField jTextName_DB;
    // End of variables declaration//GEN-END:variables
    private Connection con;
    private String accion;

}