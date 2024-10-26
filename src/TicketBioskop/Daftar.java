package TicketBioskop;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Kriv
 */
public class Daftar extends javax.swing.JInternalFrame {

    int NoDaftar, NoAccount;
    Connection nyambung;
    Statement st;
    ResultSet rs;

    public Daftar() {
        initComponents();
        KoneksiDaFtar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        USTXT = new javax.swing.JTextField();
        NLTXT = new javax.swing.JTextField();
        EMTXT = new javax.swing.JTextField();
        NTTXT = new javax.swing.JTextField();
        PSTXT = new javax.swing.JPasswordField();
        UMUR = new javax.swing.JSpinner();
        DAFTARBTN = new javax.swing.JButton();
        STJ = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        Persaratan = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        KPTXT = new javax.swing.JPasswordField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Daftar");
        setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("DAFTAR ACCOUNT PEMESAN");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nama Lengkap");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Umur");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Email");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nomor Telpone");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Password");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Konfirmasi Password");

        NTTXT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NTTXTKeyTyped(evt);
            }
        });

        UMUR.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        UMUR.setModel(new javax.swing.SpinnerNumberModel(16, 16, 80, 1));

        DAFTARBTN.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DAFTARBTN.setText("DAFTAR");
        DAFTARBTN.setEnabled(false);
        DAFTARBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DAFTARBTNActionPerformed(evt);
            }
        });

        STJ.setText("Syarat Dan Ketentuan Berlaku");
        STJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STJActionPerformed(evt);
            }
        });

        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        Persaratan.setEditable(false);
        Persaratan.setColumns(20);
        Persaratan.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Persaratan.setRows(5);
        Persaratan.setText("Sarat dan ketentuan Pengguna Aplikasi\n1. Pengguna minimal berumur 16 tahun\n2. Pihak kami tidak bertanggung jawab Jika anda membagikan\n    Account atau password anda dan menyebabkan anda kehilangan akses ke aplikasi kami\n3. Kami akan bertangung jawab jika terjadi kesalaham dalam pelayanan yang ada di aplikasi in\n4. Kami bertanggung jawab atas semua data yang anda serahkan pada kami\n5. Para pengguna bersedia mengikuti semua peraturan transaksi dan penggunaan aplikasi ini secara baik dan benar\n6. Jika hal-hal tersebut anda dan kami langgar anda akan dikenakan denda atau hukum yang berlaku.\n7. Dilarang Keras Membagikan Aplikasi ini tanpa Persetujuan Pemilik/Creator Aplikasi ini\n8. Aplikasi/Program ini di buat untuk menyelesaikan Tugas Akhir Pemrograman 2 \n    Dipersembahkan Oleh Muhammad Qifli Hidayatullah (181011400811) 05TPLM009\n9. Jika Setuju harap Ceklist pilihan di bawah dan daftar selamat mencoba.");
        jScrollPane1.setViewportView(Persaratan);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("UNPAM CINEMA 23");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DAFTARBTN)
                            .addComponent(STJ)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(NTTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                        .addComponent(EMTXT)
                                        .addComponent(UMUR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(NLTXT)
                                        .addComponent(USTXT))
                                    .addComponent(PSTXT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(KPTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(102, 102, 102))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(USTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(NLTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(UMUR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(EMTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(NTTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(PSTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(KPTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(STJ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DAFTARBTN)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NTTXTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NTTXTKeyTyped
        // Nomor telpone
        filterhuruf(evt);
    }//GEN-LAST:event_NTTXTKeyTyped

    private void DAFTARBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DAFTARBTNActionPerformed
        // DAFTAR
        if (USTXT.getText().equals("") && EMTXT.getText().equals("") && NLTXT.getText().equals("")
                && NTTXT.getText().equals("") && PSTXT.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "LENGKAPI DATA TERLEBIH DAHULU", "PEMBERITAHUAN", JOptionPane.WARNING_MESSAGE);
        }
        if (!KPTXT.getText().equals(PSTXT.getText())) {
            JOptionPane.showMessageDialog(null, "PASSWORD TIDAK SAMA", "PEMBERITAHUAN", JOptionPane.WARNING_MESSAGE);
            PSTXT.setText("");
            KPTXT.setText("");
        } else {
            try {
                Statement st = (Statement) nyambung.createStatement();
                String sql = ("INSERT INTO daftar VALUES ('" + NoDaftar + "','" + USTXT.getText() + "','" + NLTXT.getText() + "','" + UMUR.getValue() + "','" + EMTXT.getText() + "','" + NTTXT.getText() + "','" + PSTXT.getText() + "')");
                st.execute(sql);

                String USRR = ("INSERT INTO account VALUES ('" + NoAccount + "','"+USTXT.getText() + "','" + PSTXT.getText() + "')"
                );
                  st.execute(USRR);
                JOptionPane.showMessageDialog(null, "Daftar Berhasil", "DAFTAR", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            } catch (SQLException e) {

                JOptionPane.showMessageDialog(null, "Daftar Gagal", "DAFTAR", JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_DAFTARBTNActionPerformed

    private void STJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STJActionPerformed
        // SETUJU
        if (STJ.isSelected()) {
            DAFTARBTN.setEnabled(true);
        } else {
            DAFTARBTN.setEnabled(false);
        }
    }//GEN-LAST:event_STJActionPerformed
    void filterhuruf(KeyEvent a) {
        if (Character.isAlphabetic(a.getKeyChar())) {
            a.consume();
            JOptionPane.showMessageDialog(null, "Hanya Angka di Perbolehkan");
        }
    }

    public Connection KoneksiDaFtar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            nyambung = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/tugasakhir", "Qifli", "181011400811");
            System.out.println("KONEKSI BERHASIL");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "SEDANG OFFLINE " + e.getMessage());
        }
        return nyambung;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DAFTARBTN;
    private javax.swing.JTextField EMTXT;
    private javax.swing.JPasswordField KPTXT;
    private javax.swing.JTextField NLTXT;
    private javax.swing.JTextField NTTXT;
    private javax.swing.JPasswordField PSTXT;
    private javax.swing.JTextArea Persaratan;
    private javax.swing.JCheckBox STJ;
    private javax.swing.JSpinner UMUR;
    private javax.swing.JTextField USTXT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
