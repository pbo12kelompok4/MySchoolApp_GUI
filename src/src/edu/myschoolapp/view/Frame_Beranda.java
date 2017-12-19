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
public class Frame_Beranda extends javax.swing.JFrame {

    /**
     * Creates new form Frame_Beranda
     */
    
    
    public Frame_Beranda() {
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
        btnSetting = new javax.swing.JLabel();
        btnWeb = new javax.swing.JLabel();
        btnHelp = new javax.swing.JLabel();
        btnExit = new javax.swing.JLabel();
        btnMinimz = new javax.swing.JLabel();
        frameBeranda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        containerUtama.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBeranda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/myschoolapp/asset/Beranda_menu_hover.png"))); // NOI18N
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

        btnKeuangan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/myschoolapp/asset/keuangan_menu.png"))); // NOI18N
        btnKeuangan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKeuangan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKeuanganMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnKeuanganMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnKeuanganMouseExited(evt);
            }
        });

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

        btnSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/myschoolapp/asset/setting_default.png"))); // NOI18N
        btnSetting.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSetting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSettingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSettingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSettingMouseExited(evt);
            }
        });

        btnWeb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/myschoolapp/asset/web_default.png"))); // NOI18N
        btnWeb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnWeb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnWebMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnWebMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnWebMouseExited(evt);
            }
        });

        btnHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/myschoolapp/asset/help_default.png"))); // NOI18N
        btnHelp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHelpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHelpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHelpMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHelpMousePressed(evt);
            }
        });

        MainPane.setLayer(btnSetting, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MainPane.setLayer(btnWeb, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MainPane.setLayer(btnHelp, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout MainPaneLayout = new javax.swing.GroupLayout(MainPane);
        MainPane.setLayout(MainPaneLayout);
        MainPaneLayout.setHorizontalGroup(
            MainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPaneLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(btnSetting)
                .addGap(101, 101, 101)
                .addComponent(btnWeb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(btnHelp)
                .addGap(80, 80, 80))
        );
        MainPaneLayout.setVerticalGroup(
            MainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPaneLayout.createSequentialGroup()
                .addContainerGap(531, Short.MAX_VALUE)
                .addGroup(MainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnHelp)
                    .addComponent(btnWeb)
                    .addComponent(btnSetting))
                .addGap(69, 69, 69))
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

        frameBeranda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/myschoolapp/asset/Frame_Utama.png"))); // NOI18N
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

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        ImageIcon img = new ImageIcon(getClass().getResource("/edu/myschoolapp/asset/exit_hover.png"));btnExit.setIcon(img);
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        ImageIcon img = new ImageIcon(getClass().getResource("/edu/myschoolapp/asset/exit_default.png"));btnExit.setIcon(img);
    }//GEN-LAST:event_btnExitMouseExited

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnMinimzMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimzMouseEntered
        ImageIcon img = new ImageIcon(getClass().getResource("/edu/myschoolapp/asset/minimz_hover.png"));btnMinimz.setIcon(img);
    }//GEN-LAST:event_btnMinimzMouseEntered

    private void btnMinimzMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimzMouseExited
        ImageIcon img = new ImageIcon(getClass().getResource("/edu/myschoolapp/asset/minimz_default.png"));btnMinimz.setIcon(img);
    }//GEN-LAST:event_btnMinimzMouseExited

    private void btnMinimzMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimzMouseClicked
        this.setState(Frame_Beranda.ICONIFIED);
    }//GEN-LAST:event_btnMinimzMouseClicked

    private void btnBerandaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBerandaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBerandaMouseEntered

    private void btnBerandaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBerandaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBerandaMouseExited

    private void btnBerandaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBerandaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBerandaMouseClicked

    private void btnKeuanganMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKeuanganMouseEntered
        ImageIcon img = new ImageIcon(getClass().getResource("/edu/myschoolapp/asset/keuangan_menu_hover.png"));btnKeuangan.setIcon(img);
    }//GEN-LAST:event_btnKeuanganMouseEntered

    private void btnKeuanganMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKeuanganMouseExited
        // TODO add your handling code here:
        ImageIcon img = new ImageIcon(getClass().getResource("/edu/myschoolapp/asset/keuangan_menu.png"));btnKeuangan.setIcon(img);
    }//GEN-LAST:event_btnKeuanganMouseExited

    private void btnKeuanganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKeuanganMouseClicked
        this.setVisible(false);
        Frame_Keuangan fr = new Frame_Keuangan();
       
        fr.setVisible(true);fr.setLocation(this.getX(), this.getY());
        
    }//GEN-LAST:event_btnKeuanganMouseClicked

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

    private void btnSettingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSettingMouseEntered
        ImageIcon img = new ImageIcon(getClass().getResource("/edu/myschoolapp/asset/setting_hover.png"));btnSetting.setIcon(img);
    }//GEN-LAST:event_btnSettingMouseEntered

    private void btnSettingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSettingMouseExited
        ImageIcon img = new ImageIcon(getClass().getResource("/edu/myschoolapp/asset/setting_default.png"));btnSetting.setIcon(img);
    }//GEN-LAST:event_btnSettingMouseExited

    private void btnSettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSettingMouseClicked
        JOptionPane.showMessageDialog(this, "Maaf, menu belum tersedia");
    }//GEN-LAST:event_btnSettingMouseClicked

    private void btnWebMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWebMouseEntered
        ImageIcon img = new ImageIcon(getClass().getResource("/edu/myschoolapp/asset/web_hover.png"));btnWeb.setIcon(img);
    }//GEN-LAST:event_btnWebMouseEntered

    private void btnWebMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWebMouseExited
        ImageIcon img = new ImageIcon(getClass().getResource("/edu/myschoolapp/asset/web_default.png"));btnWeb.setIcon(img);
    }//GEN-LAST:event_btnWebMouseExited

    private void btnWebMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWebMouseClicked
        JOptionPane.showMessageDialog(this, "Maaf, menu belum tersedia");
    }//GEN-LAST:event_btnWebMouseClicked

    private void btnHelpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHelpMouseEntered
        ImageIcon img = new ImageIcon(getClass().getResource("/edu/myschoolapp/asset/help_hover.png"));btnHelp.setIcon(img);
    }//GEN-LAST:event_btnHelpMouseEntered

    private void btnHelpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHelpMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHelpMousePressed

    private void btnHelpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHelpMouseExited
        ImageIcon img = new ImageIcon(getClass().getResource("/edu/myschoolapp/asset/help_default.png"));btnHelp.setIcon(img);
    }//GEN-LAST:event_btnHelpMouseExited

    private void btnHelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHelpMouseClicked
         JOptionPane.showMessageDialog(this, "Maaf, menu belum tersedia");
    }//GEN-LAST:event_btnHelpMouseClicked

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
            java.util.logging.Logger.getLogger(Frame_Beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_Beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_Beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_Beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_Beranda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane MainPane;
    private javax.swing.JLabel btnBeranda;
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnHelp;
    private javax.swing.JLabel btnKeuangan;
    private javax.swing.JLabel btnMinimz;
    private javax.swing.JLabel btnPembayaran;
    private javax.swing.JLabel btnRekap;
    private javax.swing.JLabel btnSetting;
    private javax.swing.JLabel btnSiswa;
    private javax.swing.JLabel btnWeb;
    private javax.swing.JLayeredPane containerUtama;
    private javax.swing.JLabel frameBeranda;
    private javax.swing.JLayeredPane sideBar;
    // End of variables declaration//GEN-END:variables
}
