/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public home() {
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

        selamatdatang = new javax.swing.JLabel();
        smp = new javax.swing.JLabel();
        selamatdatang1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        garishitam = new javax.swing.JPanel();
        background = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Penerimaan Siswa Baru");
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 495));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 515));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        selamatdatang.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        selamatdatang.setText("APLIKASI PENERIMAAN SISWA BARU");
        getContentPane().add(selamatdatang, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, -1, 70));

        smp.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        smp.setForeground(new java.awt.Color(0, 51, 255));
        smp.setText("smp pgri 1 ciputat");
        getContentPane().add(smp, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, 70));

        selamatdatang1.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        selamatdatang1.setText("SELAMAT DATANG");
        getContentPane().add(selamatdatang1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, 70));

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frame/gambar/iconKeluar (2).png"))); // NOI18N
        jButton1.setText("Logout");
        jButton1.setToolTipText("keluar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, -1, -1));

        garishitam.setBackground(new java.awt.Color(0, 0, 0));
        garishitam.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(garishitam, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 122, 800, 2));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frame/gambar/depann.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frame/gambar/iconInput (2).png"))); // NOI18N
        jMenu1.setText("Input              ");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frame/gambar/iconInput (2).png"))); // NOI18N
        jMenuItem1.setText("Data Admin");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frame/gambar/iconInput (2).png"))); // NOI18N
        jMenuItem2.setText("Data Sekolah");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frame/gambar/iconProses (2).png"))); // NOI18N
        jMenu2.setText("Proses           ");

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frame/gambar/iconProses (2).png"))); // NOI18N
        jMenuItem3.setText("Formulir Pendaftaran");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frame/gambar/iconProses (2).png"))); // NOI18N
        jMenuItem4.setText("Pembayaran");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frame/gambar/iconOutput (2).png"))); // NOI18N
        jMenu3.setText("Laporan       ");

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frame/gambar/iconOutput (2).png"))); // NOI18N
        jMenuItem6.setText("Data Siswa Baru");
        jMenu3.add(jMenuItem6);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frame/gambar/iconOutput (2).png"))); // NOI18N
        jMenuItem7.setText("Pembayaran");
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new datasekolah().setVisible(true); dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int confirm = JOptionPane.showConfirmDialog(this,
        "Anda Yakin Untuk Keluar?",
        "Konfirmasi",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE);
        if (confirm == JOptionPane.YES_OPTION) {
        new depan().setVisible(true); dispose();}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new dataadmin().setVisible(true); dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       new isiForm().setVisible(true); dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new pembayaran().setVisible(true); dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JPanel garishitam;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JLabel selamatdatang;
    private javax.swing.JLabel selamatdatang1;
    private javax.swing.JLabel smp;
    // End of variables declaration//GEN-END:variables
}
