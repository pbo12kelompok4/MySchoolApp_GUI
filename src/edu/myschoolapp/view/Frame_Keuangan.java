/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.myschoolapp.view;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author RFR
 */
public class Frame_Keuangan extends javax.swing.JFrame {

    /**
     * Creates new form Frame_Beranda
     */
    public Frame_Keuangan() {
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

        containerUtama = new javax.swing.JLayeredPane();
        sideBar = new javax.swing.JLayeredPane();
        btnBeranda = new javax.swing.JLabel();
        btnKeuangan = new javax.swing.JLabel();
        btnSiswa = new javax.swing.JLabel();
        btnPembayaran = new javax.swing.JLabel();
        btnRekap = new javax.swing.JLabel();
        MainPane = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKeuangan = new javax.swing.JTable();
        btnTambah = new javax.swing.JLabel();
        btnEdit = new javax.swing.JLabel();
        btnHapus = new javax.swing.JLabel();
        btnExit = new javax.swing.JLabel();
        btnMinimz = new javax.swing.JLabel();
        frameBeranda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        containerUtama.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBeranda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/myschoolapp/asset/Beranda_menu.png"))); // NOI18N
        btnBeranda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBeranda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBerandaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBerandaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBerandaMouseExited(evt);
            }
        });

        btnKeuangan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/myschoolapp/asset/keuangan_menu_hover.png"))); // NOI18N
        btnKeuangan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnSiswa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/myschoolapp/asset/siswa_menu.png"))); // NOI18N
        btnSiswa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSiswaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSiswaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSiswaMouseExited(evt);
            }
        });

        btnPembayaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/myschoolapp/asset/pemb_menu.png"))); // NOI18N
        btnPembayaran.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPembayaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPembayaranMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPembayaranMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPembayaranMouseExited(evt);
            }
        });

        btnRekap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/myschoolapp/asset/rekap_menu.png"))); // NOI18N
        btnRekap.setText("jLabel5");
        btnRekap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRekap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRekapMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRekapMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRekapMouseExited(evt);
            }
        });

        sideBar.setLayer(btnBeranda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        sideBar.setLayer(btnKeuangan, javax.swing.JLayeredPane.DEFAULT_LAYER);
        sideBar.setLayer(btnSiswa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        sideBar.setLayer(btnPembayaran, javax.swing.JLayeredPane.DEFAULT_LAYER);
        sideBar.setLayer(btnRekap, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout sideBarLayout = new javax.swing.GroupLayout(sideBar);
        sideBar.setLayout(sideBarLayout);
        sideBarLayout.setHorizontalGroup(
            sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBeranda, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKeuangan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRekap, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        sideBarLayout.setVerticalGroup(
            sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(btnBeranda)
                .addGap(30, 30, 30)
                .addComponent(btnKeuangan)
                .addGap(30, 30, 30)
                .addComponent(btnSiswa)
                .addGap(30, 30, 30)
                .addComponent(btnPembayaran)
                .addGap(30, 30, 30)
                .addComponent(btnRekap)
                .addContainerGap(358, Short.MAX_VALUE))
        );

        containerUtama.add(sideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 200, 640));

        tblKeuangan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tanggal", "Judul", "Tipe", "Jumlah"
            }
        ));
        tblKeuangan.setGridColor(new java.awt.Color(0, 67, 83));
        tblKeuangan.setRowHeight(25);
        tblKeuangan.setSelectionBackground(new java.awt.Color(0, 204, 204));
        jScrollPane1.setViewportView(tblKeuangan);

        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/myschoolapp/asset/btn_tambah.png"))); // NOI18N
        btnTambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTambahMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTambahMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTambahMouseExited(evt);
            }
        });

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/myschoolapp/asset/btn_edit.png"))); // NOI18N
        btnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditMouseExited(evt);
            }
        });

        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/myschoolapp/asset/btn_hapus.png"))); // NOI18N
        btnHapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHapusMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHapusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHapusMouseExited(evt);
            }
        });

        MainPane.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MainPane.setLayer(btnTambah, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MainPane.setLayer(btnEdit, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MainPane.setLayer(btnHapus, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout MainPaneLayout = new javax.swing.GroupLayout(MainPane);
        MainPane.setLayout(MainPaneLayout);
        MainPaneLayout.setHorizontalGroup(
            MainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPaneLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(MainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTambah)
                    .addComponent(btnEdit)
                    .addComponent(btnHapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        MainPaneLayout.setVerticalGroup(
            MainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPaneLayout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(MainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPaneLayout.createSequentialGroup()
                        .addComponent(btnTambah)
                        .addGap(18, 18, 18)
                        .addComponent(btnEdit)
                        .addGap(18, 18, 18)
                        .addComponent(btnHapus)
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPaneLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );

        containerUtama.add(MainPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 1000, 640));

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/myschoolapp/asset/exit_default.png"))); // NOI18N
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });
        containerUtama.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 0, -1, 40));

        btnMinimz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/myschoolapp/asset/minimz_default.png"))); // NOI18N
        btnMinimz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimzMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinimzMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinimzMouseExited(evt);
            }
        });
        containerUtama.add(btnMinimz, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 0, -1, 40));

        frameBeranda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/myschoolapp/asset/Frame_Keuangan.png"))); // NOI18N
        containerUtama.add(frameBeranda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerUtama)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerUtama)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMouseEntered
        ImageIcon img = new ImageIcon(getClass().getResource("/edu/myschoolapp/asset/btn_tambah_hover.png"));btnTambah.setIcon(img);
    }//GEN-LAST:event_btnTambahMouseEntered

    private void btnTambahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMouseExited
        ImageIcon img = new ImageIcon(getClass().getResource("/edu/myschoolapp/asset/btn_tambah.png"));btnTambah.setIcon(img);
    }//GEN-LAST:event_btnTambahMouseExited

    private void btnTambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMouseClicked
        JOptionPane.showMessageDialog(this, "Maaf, menu belum tersedia");
    }//GEN-LAST:event_btnTambahMouseClicked

    private void btnEditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseEntered
        ImageIcon img = new ImageIcon(getClass().getResource("/edu/myschoolapp/asset/btn_edit_hover.png"));btnEdit.setIcon(img);
    }//GEN-LAST:event_btnEditMouseEntered

    private void btnEditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseExited
        ImageIcon img = new ImageIcon(getClass().getResource("/edu/myschoolapp/asset/btn_edit.png"));btnEdit.setIcon(img);
    }//GEN-LAST:event_btnEditMouseExited

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
        JOptionPane.showMessageDialog(this, "Maaf, menu belum tersedia");
    }//GEN-LAST:event_btnEditMouseClicked

    private void btnHapusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseEntered
        ImageIcon img = new ImageIcon(getClass().getResource("/edu/myschoolapp/asset/btn_hapus_hover.png"));btnHapus.setIcon(img);
    }//GEN-LAST:event_btnHapusMouseEntered

    private void btnHapusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseExited
        ImageIcon img = new ImageIcon(getClass().getResource("/edu/myschoolapp/asset/btn_hapus.png"));btnHapus.setIcon(img);
    }//GEN-LAST:event_btnHapusMouseExited

    private void btnHapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseClicked
        JOptionPane.showMessageDialog(this, "Maaf, menu belum tersedia");
    }//GEN-LAST:event_btnHapusMouseClicked

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        ImageIcon img = new ImageIcon(getClass().getResource("/edu/myschoolapp/asset/exit_hover.png"));btnExit.setIcon(img);
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        ImageIcon img = new ImageIcon(getClass().getResource("/edu/myschoolapp/asset/exit_default.png"));btnExit.setIcon(img);
    }//GEN-LAST:event_btnExitMouseExited

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnBerandaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBerandaMouseEntered
        ImageIcon img = new ImageIcon(getClass().getResource("/edu/myschoolapp/asset/Beranda_menu_hover.png"));btnBeranda.setIcon(img);
    }//GEN-LAST:event_btnBerandaMouseEntered

    private void btnBerandaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBerandaMouseExited
        ImageIcon img = new ImageIcon(getClass().getResource("/edu/myschoolapp/asset/Beranda_menu.png"));btnBeranda.setIcon(img);
    }//GEN-LAST:event_btnBerandaMouseExited

    private void btnBerandaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBerandaMouseClicked
        this.dispose();
        Frame_Beranda fr0 = new Frame_Beranda();
        
        fr0.setVisible(true);fr0.setLocation(this.getX(), this.getY());
        
    }//GEN-LAST:event_btnBerandaMouseClicked

    private void btnSiswaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiswaMouseEntered
        ImageIcon img = new ImageIcon(getClass().getResource("/edu/myschoolapp/asset/siswa_menu_hover.png"));btnSiswa.setIcon(img);
    }//GEN-LAST:event_btnSiswaMouseEntered

    private void btnSiswaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiswaMouseExited
        ImageIcon img = new ImageIcon(getClass().getResource("/edu/myschoolapp/asset/siswa_menu.png"));btnSiswa.setIcon(img);
    }//GEN-LAST:event_btnSiswaMouseExited

    private void btnSiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiswaMouseClicked
        Frame_Siswa frDua = new Frame_Siswa();
        frDua.setVisible(true);frDua.setLocation(this.getX(), this.getY());
        this.dispose();
    }//GEN-LAST:event_btnSiswaMouseClicked

    private void btnPembayaranMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPembayaranMouseEntered
        ImageIcon img = new ImageIcon(getClass().getResource("/edu/myschoolapp/asset/pay_menu_hover.png"));btnPembayaran.setIcon(img);
    }//GEN-LAST:event_btnPembayaranMouseEntered

    private void btnPembayaranMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPembayaranMouseExited
        ImageIcon img = new ImageIcon(getClass().getResource("/edu/myschoolapp/asset/pemb_menu.png"));btnPembayaran.setIcon(img);
    }//GEN-LAST:event_btnPembayaranMouseExited

    private void btnPembayaranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPembayaranMouseClicked
        Frame_Pembayaran frTiga = new Frame_Pembayaran();
        frTiga.setVisible(true);frTiga.setLocation(this.getX(), this.getY());
        this.dispose();
    }//GEN-LAST:event_btnPembayaranMouseClicked

    private void btnRekapMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRekapMouseEntered
        ImageIcon img = new ImageIcon(getClass().getResource("/edu/myschoolapp/asset/rekap_menu_hover.png"));btnRekap.setIcon(img);
    }//GEN-LAST:event_btnRekapMouseEntered

    private void btnRekapMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRekapMouseExited
        ImageIcon img = new ImageIcon(getClass().getResource("/edu/myschoolapp/asset/rekap_menu.png"));btnRekap.setIcon(img);
    }//GEN-LAST:event_btnRekapMouseExited

    private void btnRekapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRekapMouseClicked
        Frame_Rekap frEmpat = new Frame_Rekap();
        frEmpat.setVisible(true);frEmpat.setLocation(this.getX(), this.getY());
        this.dispose();
    }//GEN-LAST:event_btnRekapMouseClicked

    private void btnMinimzMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimzMouseEntered
        ImageIcon img = new ImageIcon(getClass().getResource("/edu/myschoolapp/asset/minimz_hover.png"));btnMinimz.setIcon(img);
    }//GEN-LAST:event_btnMinimzMouseEntered

    private void btnMinimzMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimzMouseExited
        ImageIcon img = new ImageIcon(getClass().getResource("/edu/myschoolapp/asset/minimz_default.png"));btnMinimz.setIcon(img);
    }//GEN-LAST:event_btnMinimzMouseExited

    private void btnMinimzMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimzMouseClicked
        this.setState(Frame_Keuangan.ICONIFIED);
    }//GEN-LAST:event_btnMinimzMouseClicked
    
   
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
            java.util.logging.Logger.getLogger(Frame_Keuangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_Keuangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_Keuangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_Keuangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_Keuangan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane MainPane;
    private javax.swing.JLabel btnBeranda;
    private javax.swing.JLabel btnEdit;
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnHapus;
    private javax.swing.JLabel btnKeuangan;
    private javax.swing.JLabel btnMinimz;
    private javax.swing.JLabel btnPembayaran;
    private javax.swing.JLabel btnRekap;
    private javax.swing.JLabel btnSiswa;
    private javax.swing.JLabel btnTambah;
    private javax.swing.JLayeredPane containerUtama;
    private javax.swing.JLabel frameBeranda;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLayeredPane sideBar;
    private javax.swing.JTable tblKeuangan;
    // End of variables declaration//GEN-END:variables
}
