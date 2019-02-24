/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Acer
 */
public final class datasekolah extends javax.swing.JFrame {

    /**
     * Creates new form datasekolah
     */
    public datasekolah() {
        initComponents();
        buka(); tblUbah.setEnabled(false); tblSelesai.setEnabled(false); tblhapus.setEnabled(false);
        data();
    }
    public void data(){
        try {
           Statement stat = (Statement) Db_Koneksi2.getKoneksi( ).createStatement( );
           String sql        = "Select * from datasekolah";
           ResultSet res   = stat.executeQuery(sql);
            while (res.next())  {                
                namasek.setText(res.getString("Nama_Sekolah"));
                npsn.setText(res.getString("NPSN"));
                alamat.setText(res.getString("Alamat"));
                kodepos.setText(res.getString("Kode_Pos"));
                kel.setText(res.getString("Kelurahan"));
                kec.setText(res.getString("Kecamatan"));
                kota.setText(res.getString("Kota"));
                prov.setText(res.getString("Provinsi"));
                notel.setText(res.getString("No_telepon"));
                web.setText(res.getString("Website"));
                email.setText(res.getString("Email"));
                kepsek.setText(res.getString("Nama_Kepsek"));
                nip.setText(res.getString("NIP"));
                kunci(); tblSimpan1.setEnabled(false); tblBatal.setEnabled(false); 
                tblUbah.setEnabled(true); tblSelesai.setEnabled(false); tblhapus.setEnabled(true);
            }
        } catch (SQLException e) {
        }
    }
    private void kunci() {
    namasek.setEnabled(false);
       npsn.setEnabled(false);
       alamat.setEnabled(false);
       notel.setEnabled(false);
       kodepos.setEnabled(false);
       kel.setEnabled(false);
       kec.setEnabled(false);
       kota.setEnabled(false);
       prov.setEnabled(false);
       web.setEnabled(false);
       email.setEnabled(false);
       kepsek.setEnabled(false);
       nip.setEnabled(false);
    }
    private void buka() {
       namasek.setEnabled(true);
       npsn.setEnabled(true);
       alamat.setEnabled(true);
       notel.setEnabled(true);
       kodepos.setEnabled(true);
       kel.setEnabled(true);
       kec.setEnabled(true);
       kota.setEnabled(true);
       prov.setEnabled(true);
       web.setEnabled(true);
       email.setEnabled(true);
       kepsek.setEnabled(true);
       nip.setEnabled(true); 
    }
    private void bersih() {
       namasek.setText("");
       npsn.setText("");
       alamat.setText("");
       notel.setText("");
       kodepos.setText("");
       kel.setText("");
       kec.setText("");
       kota.setText("");
       prov.setText("");
       web.setText("");
       email.setText("");
       kepsek.setText("");
       nip.setText("");
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
        jLabel2 = new javax.swing.JLabel();
        namasek = new javax.swing.JTextField();
        prov = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        npsn = new javax.swing.JTextField();
        notel = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        web = new javax.swing.JTextField();
        kodepos = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        kel = new javax.swing.JTextField();
        kepsek = new javax.swing.JTextField();
        kec = new javax.swing.JTextField();
        nip = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        kota = new javax.swing.JTextField();
        tblBatal = new javax.swing.JButton();
        tblhapus = new javax.swing.JButton();
        tblKeluar = new javax.swing.JButton();
        tblUbah = new javax.swing.JButton();
        tblSelesai = new javax.swing.JButton();
        tblSimpan1 = new javax.swing.JButton();
        minimaze = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        alert = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(680, 500));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("DATA SEKOLAH");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nama Sekolah");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 112, -1, -1));
        getContentPane().add(namasek, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 150, -1));
        getContentPane().add(prov, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 150, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Provinsi");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 112, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("NPSN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 150, -1, 20));
        getContentPane().add(npsn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 150, -1));
        getContentPane().add(notel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 150, -1));
        getContentPane().add(alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 150, -1));
        getContentPane().add(web, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 150, -1));
        getContentPane().add(kodepos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 150, -1));
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 150, -1));
        getContentPane().add(kel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 150, -1));
        getContentPane().add(kepsek, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 150, -1));
        getContentPane().add(kec, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 150, -1));
        getContentPane().add(nip, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 150, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("No. Telepon");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 150, -1, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Website");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 188, -1, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Email");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Nama Kepala Sekolah");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("NIP.");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, -1, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Alamat");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 184, -1, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Kode Pos");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Kelurahan");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Kecamatan");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Kab / Kota");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 354, -1, 20));
        getContentPane().add(kota, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 150, -1));

        tblBatal.setBackground(new java.awt.Color(0, 51, 255));
        tblBatal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tblBatal.setForeground(new java.awt.Color(255, 255, 255));
        tblBatal.setText("  Batal");
        tblBatal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblBatalActionPerformed(evt);
            }
        });
        getContentPane().add(tblBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 110, 30));

        tblhapus.setBackground(new java.awt.Color(0, 51, 255));
        tblhapus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tblhapus.setForeground(new java.awt.Color(255, 255, 255));
        tblhapus.setText("Hapus");
        tblhapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblhapusActionPerformed(evt);
            }
        });
        getContentPane().add(tblhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 120, 30));

        tblKeluar.setBackground(new java.awt.Color(0, 51, 255));
        tblKeluar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tblKeluar.setForeground(new java.awt.Color(255, 255, 255));
        tblKeluar.setText("   HOME");
        tblKeluar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(tblKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 110, 30));

        tblUbah.setBackground(new java.awt.Color(0, 51, 255));
        tblUbah.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tblUbah.setForeground(new java.awt.Color(255, 255, 255));
        tblUbah.setText("Ubah");
        tblUbah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblUbahActionPerformed(evt);
            }
        });
        getContentPane().add(tblUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 110, 30));

        tblSelesai.setBackground(new java.awt.Color(0, 51, 255));
        tblSelesai.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tblSelesai.setForeground(new java.awt.Color(255, 255, 255));
        tblSelesai.setText("Selesai");
        tblSelesai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblSelesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblSelesaiActionPerformed(evt);
            }
        });
        getContentPane().add(tblSelesai, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, 120, 30));

        tblSimpan1.setBackground(new java.awt.Color(0, 51, 255));
        tblSimpan1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tblSimpan1.setForeground(new java.awt.Color(255, 255, 255));
        tblSimpan1.setText("Simpan");
        tblSimpan1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblSimpan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblSimpan1ActionPerformed(evt);
            }
        });
        getContentPane().add(tblSimpan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 110, 30));

        minimaze.setToolTipText("Minimaze");
        minimaze.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimazeMouseClicked(evt);
            }
        });
        getContentPane().add(minimaze, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 3, 30, 20));

        close.setToolTipText("Close");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 3, 30, 20));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Input Data Sekolah");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, -1, 20));

        alert.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        alert.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(alert, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 280, 10));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frame/gambar/bg.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(680, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblBatalActionPerformed
        bersih();
    }//GEN-LAST:event_tblBatalActionPerformed

    private void tblhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblhapusActionPerformed
int confirm2 = JOptionPane.showConfirmDialog(this,
        "Anda Yakin Untuk Menghapus Data?",
        "Konfirmasi",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE);

        if (confirm2 == JOptionPane.YES_OPTION) {
     
        try {
            Statement statement = (Statement) Db_Koneksi2.getKoneksi().createStatement();
            statement.executeUpdate("delete from datasekolah where NPSN= ('"+npsn.getText()+"');");
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
       bersih(); buka(); 
       tblBatal.setEnabled(true); tblSimpan1.setEnabled(true); tblUbah.setEnabled(false); tblhapus.setEnabled(false);
        }catch (SQLException t) {
            JOptionPane.showMessageDialog(null, "Data gagal dihapus");
        } 
        }       
    }//GEN-LAST:event_tblhapusActionPerformed

    private void tblKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblKeluarActionPerformed

        new home().setVisible(true); dispose();
    }//GEN-LAST:event_tblKeluarActionPerformed

    private void tblUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblUbahActionPerformed
buka(); tblSelesai.setEnabled(true); tblUbah.setEnabled(false);
        npsn.setEnabled(false);
        tblhapus.setEnabled(false);       
    }//GEN-LAST:event_tblUbahActionPerformed

    private void tblSelesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblSelesaiActionPerformed
        String nm2 = namasek.getText();
            String NPSN2 = npsn.getText();
            String Alamat2 = alamat.getText();
            String kd_pos2 = kodepos.getText();
            String kel22 = kel.getText();
            String kec22 = kec.getText();
            String kota22 = kota.getText();
            String prov22 = prov.getText();
            String notel22 = notel.getText();
            String web22 = web.getText();
            String email22 = email.getText();
            String kepsek22 = kepsek.getText();
            String NIP2 = nip.getText();
            try {
                try (Statement statement = (Statement) Db_Koneksi2.getKoneksi().createStatement()) {
                    statement.executeUpdate("update datasekolah set Nama_Sekolah='"+nm2+"',Alamat='"+Alamat2+"',Kode_Pos='"+kd_pos2+"',Kelurahan='"+kel22+"',Kecamatan='"+kec22+"',Kota='"+kota22+"',Provinsi='"+prov22+"',No_telepon='"+notel22+"',Website='"+web22+"',Email='"+email22+"',Nama_Kepsek='"+kepsek22+"',NIP='"+NIP2+"' where NPSN='"+NPSN2+"';");
                }
                JOptionPane.showMessageDialog(null, "Data berhasil rubah");
                data();
                kunci(); tblSimpan1.setEnabled(false); tblBatal.setEnabled(false); 
                tblUbah.setEnabled(true); tblSelesai.setEnabled(false); tblhapus.setEnabled(true);
        
            } catch (SQLException t){
                JOptionPane.showMessageDialog(null, "Data gagal disimpan");
            }
    }//GEN-LAST:event_tblSelesaiActionPerformed

    private void tblSimpan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblSimpan1ActionPerformed
        if (namasek.getText().trim().equals("") || npsn.getText().trim().equals("") || alamat.getText().trim().equals("") 
            || notel.getText().trim().equals("") || kodepos.getText().trim().equals("") || kel.getText().trim().equals("") 
            || kec.getText().trim().equals("") || kota.getText().trim().equals("") || prov.getText().trim().equals("") 
            || web.getText().trim().equals("") || email.getText().trim().equals("") || kepsek.getText().trim().equals("")
            || nip.getText().trim().equals("")) { alert.setText("Harap Masukkan Data Dengan Benar");
        } else {
            alert.setText("");
        String nm = namasek.getText();
        String NPSN = npsn.getText();
        String Alamat = alamat.getText();
        String kd_pos = kodepos.getText();
        String kel2 = kel.getText();
        String kec2 = kec.getText();
        String kota2 = kota.getText();
        String prov2 = prov.getText();
        String No_Telepon = notel.getText();
        String web2 = web.getText();
        String email2 = email.getText();
        String kepsek2 = kepsek.getText();
        String NIP = nip.getText();
        try {
                try (Statement statement = (Statement)Db_Koneksi2.getKoneksi().createStatement()) {
                    statement.executeUpdate("insert into datasekolah values ('"+nm+"','"+NPSN+"','"+Alamat+"','"+kd_pos+"','"+kel2+"','"+kec2+"','"+kota2+"','"+prov2+"','"+No_Telepon+"','"+web2+"','"+email2+"','"+kepsek2+"','"+NIP+"');");
                }
                JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
                    kunci(); tblSimpan1.setEnabled(false); tblBatal.setEnabled(false); tblhapus.setEnabled(true); tblUbah.setEnabled(true);
        }catch (SQLException t){
                JOptionPane.showMessageDialog(null, "Data gagal disimpan");
            }
       }
    }//GEN-LAST:event_tblSimpan1ActionPerformed

    private void minimazeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimazeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minimazeMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        int confirm = JOptionPane.showConfirmDialog(this,
            "Anda Yakin Untuk Menutup Program?",
            "Konfirmasi",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);
        if (confirm == JOptionPane.YES_OPTION) { System.exit(0); }
    }//GEN-LAST:event_closeMouseClicked

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
            java.util.logging.Logger.getLogger(datasekolah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(datasekolah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(datasekolah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(datasekolah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new datasekolah().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JLabel alert;
    private javax.swing.JLabel background;
    private javax.swing.JLabel close;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField kec;
    private javax.swing.JTextField kel;
    private javax.swing.JTextField kepsek;
    private javax.swing.JTextField kodepos;
    private javax.swing.JTextField kota;
    private javax.swing.JLabel minimaze;
    private javax.swing.JTextField namasek;
    private javax.swing.JTextField nip;
    private javax.swing.JTextField notel;
    private javax.swing.JTextField npsn;
    private javax.swing.JTextField prov;
    private javax.swing.JButton tblBatal;
    private javax.swing.JButton tblKeluar;
    private javax.swing.JButton tblSelesai;
    private javax.swing.JButton tblSimpan1;
    private javax.swing.JButton tblUbah;
    private javax.swing.JButton tblhapus;
    private javax.swing.JTextField web;
    // End of variables declaration//GEN-END:variables
}
