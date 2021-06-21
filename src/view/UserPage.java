/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import connector.Connector;
import controller.ControllerMasuk;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class UserPage extends javax.swing.JFrame {

    /**
     * Creates new form UserPage
     */
    public DefaultTableModel tabModel;
    public UserPage() {
        initComponents();
        this.judul();
        
        try {
        Connector konek = new Connector();
        String query = ("SELECT * FROM `cerita` " );
        konek.statement = konek.koneksi.createStatement();
        konek.resultSet = konek.statement.executeQuery(query);
        tabModel.getDataVector().removeAllElements();
        tabModel.fireTableDataChanged();
        

        while (konek.resultSet.next()) {
            Object[] data = {
                konek.resultSet.getString("judul"),
                konek.resultSet.getString("cerita")
            };

            tabModel.addRow(data);
        }
  } catch(Exception e) {
    e.printStackTrace();
  }
    }

    public void tampildata(){
        try {
        Connector konek = new Connector();
        String query = ("SELECT * FROM `cerita` " );
        konek.statement = konek.koneksi.createStatement();
        konek.resultSet = konek.statement.executeQuery(query);
        tabModel.getDataVector().removeAllElements();
        tabModel.fireTableDataChanged();
        

        while (konek.resultSet.next()) {
            Object[] data = {
                konek.resultSet.getString("judul"),
                konek.resultSet.getString("cerita")
            };

            tabModel.addRow(data);
        }
  } catch(Exception e) {
    e.printStackTrace();
  }   
    }
    
    public void judul() {
        Object[] judul = {
          "Judul","Cerita"
        };
        tabModel = new DefaultTableModel(null, judul);
        TabelCerita.setModel(tabModel);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelCerita = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        edit_judul = new javax.swing.JTextField();
        edit_isi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        updatecerita = new javax.swing.JButton();
        deletecerita = new javax.swing.JButton();
        deletecerita1 = new javax.swing.JButton();
        deletecerita2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Halaman User");

        TabelCerita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Judul", "Isi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TabelCerita);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Judul");

        edit_judul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_judulActionPerformed(evt);
            }
        });

        edit_isi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_isiActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Isi");

        updatecerita.setText("Update");
        updatecerita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateceritaActionPerformed(evt);
            }
        });

        deletecerita.setText("Delete");
        deletecerita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteceritaActionPerformed(evt);
            }
        });

        deletecerita1.setText("Simpan");
        deletecerita1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletecerita1ActionPerformed(evt);
            }
        });

        deletecerita2.setText("Logout");
        deletecerita2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletecerita2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edit_judul)
                            .addComponent(edit_isi)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(updatecerita)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deletecerita, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deletecerita1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deletecerita2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edit_judul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edit_isi)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updatecerita)
                    .addComponent(deletecerita)
                    .addComponent(deletecerita1)
                    .addComponent(deletecerita2))
                .addGap(225, 225, 225))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edit_judulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_judulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edit_judulActionPerformed

    private void edit_isiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_isiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edit_isiActionPerformed

    private void updateceritaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateceritaActionPerformed
        // TODO add your handling code here:
        Connector konek = new Connector();
         try {
            konek.statement = konek.koneksi.createStatement();
            konek.statement.executeUpdate("UPDATE cerita set " 
                + "judul='"       + edit_judul.getText() + "', "
                + "cerita='"      + edit_isi.getText() + "'");
            tampildata();
            JOptionPane.showMessageDialog(null, "Update Berhasil");
           
          } catch (Exception e) {
            e.printStackTrace();
          }
    }//GEN-LAST:event_updateceritaActionPerformed

    private void deleteceritaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteceritaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteceritaActionPerformed

    private void deletecerita1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletecerita1ActionPerformed
        // TODO add your handling code here:
        String judul=edit_judul.getText();
        String isi=edit_isi.getText();
        try {
            Connector konek = new Connector();
            konek.statement = konek.koneksi.createStatement();
            konek.resultSet = konek.statement.executeUpdate("INSERT INTO cerita (`id`,`judul`,`isi`)VALUES('" +judul+ "','" +isi+"'");
            tampildata();
    JOptionPane.showMessageDialog(null, "Simpan Berhasil");
    edit_judul.setText("");
    edit_judul.setText("");
  } catch (Exception e) {
    e.printStackTrace();
  }
    }//GEN-LAST:event_deletecerita1ActionPerformed

    private void deletecerita2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletecerita2ActionPerformed
        // TODO add your handling code here:
        ControllerMasuk logout = new ControllerMasuk();
        logout.kembali();
        this.dispose();
    }//GEN-LAST:event_deletecerita2ActionPerformed

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
            java.util.logging.Logger.getLogger(UserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelCerita;
    private javax.swing.JButton deletecerita;
    private javax.swing.JButton deletecerita1;
    private javax.swing.JButton deletecerita2;
    private javax.swing.JTextField edit_isi;
    private javax.swing.JTextField edit_judul;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton updatecerita;
    // End of variables declaration//GEN-END:variables
}
