package TicketBioskop;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Kriv
 */
public class Menu_Utama extends javax.swing.JFrame {

    Connection nyambung;
    Statement st;
    ResultSet rs;
    private boolean rootPaneCheckingDisble;

    public Menu_Utama() {
        initComponents();
        nyambung = new Koneksi().KoneksiDB();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon= new ImageIcon(getClass().getResource("/TicketBioskop/Gambar/Back.jpg"));
        Image image = icon.getImage();
        desktopPane = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image, 0, 0, getWidth(),getHeight(),this);
            }
        };
        LOGINFRAME = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        US = new javax.swing.JTextField();
        DAFTAR = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        PS = new javax.swing.JPasswordField();
        LGNBTN = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        MN = new javax.swing.JMenu();
        LGN = new javax.swing.JMenuItem();
        LGO = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        PSN = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        HELP = new javax.swing.JMenu();
        PENGELOLA = new javax.swing.JMenu();
        UPD = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UNPAM CINEMA 23");
        setIconImage(     new javax.swing.ImageIcon(getClass().getResource("/TicketBioskop/Gambar/LOGO.png")).getImage());

        LOGINFRAME.setIconifiable(true);
        LOGINFRAME.setTitle("Login");
        LOGINFRAME.setToolTipText("");
        LOGINFRAME.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LOGINFRAME.setVisible(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Username :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Password  :");

        US.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                USKeyPressed(evt);
            }
        });

        DAFTAR.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DAFTAR.setText("Daftar");
        DAFTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DAFTARActionPerformed(evt);
            }
        });

        jLabel3.setText("Belum Punya Account?");

        PS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PSKeyPressed(evt);
            }
        });

        LGNBTN.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LGNBTN.setText("Login");
        LGNBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LGNBTNActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TicketBioskop/Gambar/Locks.jpg"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("UNPAM CINEMA 23");

        javax.swing.GroupLayout LOGINFRAMELayout = new javax.swing.GroupLayout(LOGINFRAME.getContentPane());
        LOGINFRAME.getContentPane().setLayout(LOGINFRAMELayout);
        LOGINFRAMELayout.setHorizontalGroup(
            LOGINFRAMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LOGINFRAMELayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGroup(LOGINFRAMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LOGINFRAMELayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(LOGINFRAMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(LOGINFRAMELayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(DAFTAR, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LGNBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(LOGINFRAMELayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGroup(LOGINFRAMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(LOGINFRAMELayout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel3))
                                    .addGroup(LOGINFRAMELayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(PS))))
                            .addGroup(LOGINFRAMELayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(US, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(LOGINFRAMELayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel5)))
                .addGap(31, 31, 31))
        );
        LOGINFRAMELayout.setVerticalGroup(
            LOGINFRAMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LOGINFRAMELayout.createSequentialGroup()
                .addGroup(LOGINFRAMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LOGINFRAMELayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addGap(19, 19, 19)
                        .addGroup(LOGINFRAMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(US, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(LOGINFRAMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(LOGINFRAMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LGNBTN)
                            .addComponent(DAFTAR)))
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        desktopPane.add(LOGINFRAME);
        LOGINFRAME.setBounds(380, 200, 500, 200);

        menuBar.setBackground(new java.awt.Color(0, 0, 0));

        MN.setText("Account");
        MN.setToolTipText("");

        LGN.setMnemonic('l');
        LGN.setText("Login");
        LGN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LGNActionPerformed(evt);
            }
        });
        MN.add(LGN);

        LGO.setText("Logout");
        LGO.setEnabled(false);
        LGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LGOActionPerformed(evt);
            }
        });
        MN.add(LGO);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        MN.add(exitMenuItem);

        menuBar.add(MN);

        PSN.setText("Pemesanan");
        PSN.setEnabled(false);

        jMenuItem4.setText("Pesan Ticket");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        PSN.add(jMenuItem4);

        menuBar.add(PSN);

        HELP.setText("Help");
        HELP.setEnabled(false);

        PENGELOLA.setText("Pengelola");
        PENGELOLA.setEnabled(false);

        UPD.setText("Update");
        UPD.setEnabled(false);
        UPD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDActionPerformed(evt);
            }
        });
        PENGELOLA.add(UPD);

        HELP.add(PENGELOLA);

        jMenuItem2.setMnemonic('.');
        jMenuItem2.setText("About");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        HELP.add(jMenuItem2);

        jMenuItem1.setText("Kontak dan Bantuan");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        HELP.add(jMenuItem1);

        menuBar.add(HELP);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1166, Short.MAX_VALUE)
                .addGap(128, 128, 128))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        int jawab = JOptionPane.showOptionDialog(
                this, "Yakin?", "EXIT",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, null, null
        );
        if (jawab == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void LGNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LGNActionPerformed
        // LOGIN
        if (LOGINFRAME.isVisible()) {
            LOGINFRAME.setVisible(rootPaneCheckingDisble);
        } else {
            LOGINFRAME.setVisible(rootPaneCheckingEnabled);
        }
    }//GEN-LAST:event_LGNActionPerformed

    private void DAFTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DAFTARActionPerformed
        // Tombol Daftar
        Daftar DTM = new Daftar();
        desktopPane.add(DTM);
        DTM.setVisible(true);
    }//GEN-LAST:event_DAFTARActionPerformed

    private void USKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_USKeyPressed
        // KeyPressed US

    }//GEN-LAST:event_USKeyPressed

    private void LGNBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LGNBTNActionPerformed
        // Login
        if (US.getText().equals("05TPLM009") && PS.getText().equals("181011400811")) {
            JOptionPane.showMessageDialog(null, "Selamat Datang");
            LOGINFRAME.setVisible(rootPaneCheckingDisble);
            PENGELOLA.setEnabled(rootPaneCheckingEnabled);
            HELP.setEnabled(rootPaneCheckingEnabled);
            UPD.setEnabled(rootPaneCheckingEnabled);
            MN.setText("Admin");
            PSN.setEnabled(rootPaneCheckingEnabled);
            LGO.setEnabled(rootPaneCheckingEnabled);
            LGN.setEnabled(rootPaneCheckingDisble);
        } else if (US.getText().equals("") && PS.getText().equals("")) {
            
            US.setText("");
            PS.setText("");
        } else {
            try {
                Statement st = (Statement) nyambung.createStatement();
                String sql = "SELECT *FROM account WHERE Username='" + US.getText() + "' AND Password='" + PS.getText() + "'";
                rs = st.executeQuery(sql);
                if (rs.next()) {
                    if (US.getText().equals(rs.getString("username")) && PS.getText().equals(rs.getString("password"))) {
                        JOptionPane.showMessageDialog(null, "Selamat Datang");
                        LOGINFRAME.setVisible(rootPaneCheckingDisble);
                        HELP.setEnabled(rootPaneCheckingEnabled);
                        MN.setText(rs.getString("username"));
                        PSN.setEnabled(rootPaneCheckingEnabled);
                        LGO.setEnabled(rootPaneCheckingEnabled);
                        LGN.setEnabled(rootPaneCheckingDisble);
                    } else {
                        JOptionPane.showMessageDialog(null, "Username atau Password salah");
                        US.setText("");
                        PS.setText("");
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Menu_Utama.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_LGNBTNActionPerformed

    private void PSKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PSKeyPressed
        // KEyPressed PS

    }//GEN-LAST:event_PSKeyPressed

    private void LGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LGOActionPerformed
        // LGO
        int jawab = JOptionPane.showOptionDialog(
                this, "Yakin?", "LOGOUT",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, null, null
        );
        if (jawab == JOptionPane.YES_OPTION) {
            Logout();
        }
    }//GEN-LAST:event_LGOActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // About
        About DTM = new About();
        desktopPane.add(DTM);
        DTM.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        Jadwal DTM = new Jadwal();
        desktopPane.add(DTM);
        DTM.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void UPDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDActionPerformed
        // Update
        UPDATE DTM = new UPDATE();
        desktopPane.add(DTM);
        DTM.setVisible(true);
    }//GEN-LAST:event_UPDActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // Kontak Dan Bantuan
        Kontak DTM = new Kontak();
        desktopPane.add(DTM);
        DTM.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     */
    private void Logout() {
        PSN.setEnabled(rootPaneCheckingDisble);
        LGO.setEnabled(rootPaneCheckingDisble);
        LGN.setEnabled(rootPaneCheckingEnabled);
        HELP.setEnabled(rootPaneCheckingDisble);
        MN.setText("Account");
        US.setText("");
        PS.setText("");
        PENGELOLA.setEnabled(rootPaneCheckingDisble);
        LOGINFRAME.setVisible(rootPaneCheckingEnabled);

    }

    private void Buka() {

    }

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
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DAFTAR;
    private javax.swing.JMenu HELP;
    private javax.swing.JMenuItem LGN;
    private javax.swing.JButton LGNBTN;
    private javax.swing.JMenuItem LGO;
    private javax.swing.JInternalFrame LOGINFRAME;
    private javax.swing.JMenu MN;
    private javax.swing.JMenu PENGELOLA;
    private javax.swing.JPasswordField PS;
    private javax.swing.JMenu PSN;
    private javax.swing.JMenuItem UPD;
    private javax.swing.JTextField US;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
