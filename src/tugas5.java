/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JOptionPane;
import kelas.ClassTaskFive;
public class tugas5 extends javax.swing.JFrame {

    /**
     * Creates new form tugas5
     */
    ClassTaskFive var = new ClassTaskFive();
    int jari1,tinggi1;
    public tugas5() {
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

        hitung = new javax.swing.JButton();
        jkbltugas4 = new javax.swing.JButton();
        jmenut4 = new javax.swing.JButton();
        jnext5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jari = new javax.swing.JTextField();
        tinggi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        hitung.setText("hitung");
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });

        jkbltugas4.setText("Kembali");
        jkbltugas4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jkbltugas4ActionPerformed(evt);
            }
        });

        jmenut4.setText("Menu");
        jmenut4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenut4ActionPerformed(evt);
            }
        });

        jnext5.setText("Selanjutnya");
        jnext5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnext5ActionPerformed(evt);
            }
        });

        jLabel2.setText("Jari - jari ");

        jLabel3.setText("Tinggi");

        jari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jariActionPerformed(evt);
            }
        });

        tinggi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tinggiActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Volume, Alas, Tutup, Selimut dan Luas Tabung");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jkbltugas4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jmenut4)
                .addGap(51, 51, 51)
                .addComponent(jnext5))
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(jari, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(hitung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tinggi, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tinggi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(hitung)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jmenut4)
                    .addComponent(jnext5)
                    .addComponent(jkbltugas4))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungActionPerformed
        // TODO add your handling code here:
        jari1 = Integer.parseInt(jari.getText());
        tinggi1 = Integer.parseInt(tinggi.getText());
        JOptionPane.showMessageDialog(null, var.tampil(tinggi1,jari1));
        
        
    }//GEN-LAST:event_hitungActionPerformed

    private void jkbltugas4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jkbltugas4ActionPerformed
        // TODO add your handling code here:
        new tugas4().show();
        new tugas5().hide();
    }//GEN-LAST:event_jkbltugas4ActionPerformed

    private void jmenut4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenut4ActionPerformed
        // TODO add your handling code here:
        new tugas5().hide();
        new menuawal().show();
    }//GEN-LAST:event_jmenut4ActionPerformed

    private void jnext5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnext5ActionPerformed
        // TODO add your handling code here:
        new tugas6().show();
        new tugas5().hide();
    }//GEN-LAST:event_jnext5ActionPerformed

    private void jariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jariActionPerformed

    private void tinggiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tinggiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tinggiActionPerformed

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
            java.util.logging.Logger.getLogger(tugas5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tugas5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tugas5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tugas5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tugas5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hitung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jari;
    private javax.swing.JButton jkbltugas4;
    private javax.swing.JButton jmenut4;
    private javax.swing.JButton jnext5;
    private javax.swing.JTextField tinggi;
    // End of variables declaration//GEN-END:variables
}
