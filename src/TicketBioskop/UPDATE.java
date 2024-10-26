package TicketBioskop;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kriv
 */
public class UPDATE extends javax.swing.JInternalFrame {

    String Pill;
    Connection nyambung;
    Statement st;
    ResultSet rs;

    /**
     * Creates new form UPDATE
     */
    public UPDATE() {
        initComponents();
        ADMIN();
        UpdateTabel();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UPLOAD = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JUDUL = new javax.swing.JTextField();
        WAKTU = new javax.swing.JTextField();
        CARIFILE = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabel = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        DELETE = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        FILM_ID = new javax.swing.JTextField();
        UBAH = new javax.swing.JButton();
        CLEAR = new javax.swing.JButton();
        Del = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        SIPNOSIS = new javax.swing.JTextArea();
        TANGGAL = new org.netbeans.modules.form.InvalidComponent();
        POSTER = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        STD = new javax.swing.JComboBox<>();

        setClosable(true);
        setTitle("UPDATE (Administrator Only)");

        UPLOAD.setText("UPLOAD");
        UPLOAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPLOADActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FILM");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Judul       :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Tanggal   :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Waktu     :");

        JUDUL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        WAKTU.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        CARIFILE.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CARIFILE.setText("CARI GAMBAR");
        CARIFILE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CARIFILEActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("POSTER");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("SIPNOSIS");

        Tabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Tabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FILM ID", "Judul", "Tanggal", "Jam", "Studio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tabel);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("DATA TERSIMPAN");

        DELETE.setText("DELETE");
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("FILM ID   :");

        FILM_ID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        FILM_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FILM_IDActionPerformed(evt);
            }
        });

        UBAH.setText("UBAH");
        UBAH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UBAHActionPerformed(evt);
            }
        });

        CLEAR.setText("CLEAR");
        CLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLEARActionPerformed(evt);
            }
        });

        jLabel8.setText("FILM ID");

        SIPNOSIS.setColumns(20);
        SIPNOSIS.setRows(5);
        SIPNOSIS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane3.setViewportView(SIPNOSIS);

        POSTER.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        POSTER.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        POSTER.setText("IMAGE");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Studio      :");

        STD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "STUDIO?", "STD1", "STD2", "STD3" }));
        STD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(CLEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(UBAH, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(UPLOAD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jScrollPane3)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel1))
                                    .addGap(15, 15, 15)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(FILM_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(JUDUL, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(TANGGAL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(WAKTU, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))))
                                .addComponent(jLabel6))
                            .addGap(35, 35, 35)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(STD, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(203, 203, 203)
                        .addComponent(jLabel7)
                        .addGap(116, 116, 116))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(CARIFILE, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(POSTER, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 8, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(26, 26, 26)
                                .addComponent(Del, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(DELETE, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(FILM_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(JUDUL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(WAKTU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(TANGGAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(STD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                            .addComponent(POSTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UPLOAD)
                            .addComponent(UBAH)
                            .addComponent(CLEAR)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DELETE)
                        .addComponent(Del, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addComponent(CARIFILE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CARIFILEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CARIFILEActionPerformed
        // Cari File
        JFileChooser j = new JFileChooser("C:\\Users\\Kriv\\Documents\\NetBeansProjects\\Tugas Akhir\\src\\TicketBioskop\\Gambar");
        j.showOpenDialog(null);
        f = j.getSelectedFile();
        String lokasi = f.getAbsolutePath();
        ImageIcon Icon = new ImageIcon(lokasi);
        POSTER.setText("");
        POSTER.setIcon(Icon);
    }//GEN-LAST:event_CARIFILEActionPerformed

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
        // Delete
        try {
            String sql = "DELETE FROM jadwalfilm WHERE film_id=?";
            PreparedStatement stat = nyambung.prepareStatement(sql);
            stat.setString(1, Del.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Hapus Berhasil");
            UpdateTabel();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Hapus Gagal");
        }

    }//GEN-LAST:event_DELETEActionPerformed

    private void UPLOADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPLOADActionPerformed
        // Upload 
        if (FILM_ID.getText().equals("") || JUDUL.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Lengkapi Terlebih Dahulu", "ERORR!", JOptionPane.ERROR_MESSAGE);
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String TGL = sdf.format(TANGGAL.getDate());
            try {

                String sql = "INSERT INTO jadwalfilm(film_id,Judul,Waktu,waktuJam,Kode_Studio,Sipnosis,Gambar) VALUES(?,?,?,?,?,?,?)";
                PreparedStatement stat = (PreparedStatement) nyambung.prepareStatement(sql);
                stat.setString(1, FILM_ID.getText());
                stat.setString(2, JUDUL.getText());
                stat.setString(3, TGL);
                stat.setString(4, WAKTU.getText());
                stat.setString(5, Pill);
                stat.setString(6, SIPNOSIS.getText());
                fis = new FileInputStream(f);
                stat.setBinaryStream(7, fis, (int) f.length());
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "UPLOAD Berhasil");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "UPLOAD Gagal", "ERORR", JOptionPane.ERROR_MESSAGE);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(UPDATE.class.getName()).log(Level.SEVERE, null, ex);
            }
            UpdateTabel();
        }

    }//GEN-LAST:event_UPLOADActionPerformed

    private void UBAHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UBAHActionPerformed
        // Ubah Data
        if (FILM_ID.getText().equals("") || JUDUL.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Lengkapi Terlebih Dahulu", "ERORR!", JOptionPane.ERROR_MESSAGE);
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String TGL = sdf.format(TANGGAL.getDate());
            try {
                String sql = "UPDATE jadwalfilm set film_id=?,Judul=?,Waktu=?,waktuJam=?,Kode_Studio=?,Sipnosis=?,Gambar=? where film_id='" + Del.getText() + "';";
                PreparedStatement stat = nyambung.prepareStatement(sql);
                stat.setString(1, FILM_ID.getText());
                stat.setString(2, JUDUL.getText());
                stat.setString(3, TGL);
                stat.setString(4, WAKTU.getText());
                stat.setString(5, Pill);
                stat.setString(6, SIPNOSIS.getText());
                fis = new FileInputStream(f);
                stat.setBinaryStream(7, fis, (int) f.length());
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "UPDATE Berhasil");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "UPDATE Gagal");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(UPDATE.class.getName()).log(Level.SEVERE, null, ex);
            }
            UpdateTabel();
        }
    }//GEN-LAST:event_UBAHActionPerformed

    private void CLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLEARActionPerformed
        // Clear
        FILM_ID.setText("");
        JUDUL.setText("");
        SIPNOSIS.setText("");
        TANGGAL.setDate(null);
        WAKTU.setText("");
        STD.setSelectedItem("STD1");
        POSTER.setText("IMAGE");
        POSTER.setIcon(null);
        Del.setText("");

    }//GEN-LAST:event_CLEARActionPerformed

    private void TabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelMouseClicked
        // Mouse Clicked Tabel
        try {
            int row = Tabel.getSelectedRow();
            String ID = (String) Tabel.getValueAt(row, 0);
            String[] data = new String[8];

            st = (Statement) nyambung.createStatement();
            String sql = "SELECT *FROM jadwalfilm WHERE film_id='" + ID + "';";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                data[0] = rs.getString("film_id");
                FILM_ID.setText(data[0]);
                Del.setText(data[0]);
                data[1] = rs.getString("Judul");
                JUDUL.setText(data[1]);
                data[2] = rs.getString("waktuJam");
                WAKTU.setText(data[2]);
                data[3] = rs.getString("Kode_Studio");
                STD.setSelectedItem(data[3]);
                data[4] = rs.getString("Sipnosis");
                SIPNOSIS.setText(data[4]);
                Blob gambar = (Blob) rs.getBlob("Gambar");
                int ukuran = (int) (gambar.length());
                ImageIcon tampilkan = new ImageIcon(gambar.getBytes(1, ukuran));
                POSTER.setIcon(tampilkan);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Jadwal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TabelMouseClicked

    private void STDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STDActionPerformed
        // pilih Studio
        if (STD.getSelectedItem() == "STD1") {
            Pill = null;
        }
        if (STD.getSelectedItem() == "STD1") {
            Pill = "STD1";
        }
        if (STD.getSelectedItem() == "STD2") {
            Pill = "STD2";
        }
        if (STD.getSelectedItem() == "STD3") {
            Pill = "STD3";
        }
    }//GEN-LAST:event_STDActionPerformed

    private void FILM_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FILM_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FILM_IDActionPerformed

    private void UpdateTabel() {
        try {
            Statement st = (Statement) nyambung.createStatement();
            String sql = "SELECT *FROM jadwalfilm;";
            rs = st.executeQuery(sql);
            DefaultTableModel dtm = (DefaultTableModel) Tabel.getModel();
            dtm.setRowCount(0);
            String[] data = new String[8];
            int i = 1;

            while (rs.next()) {
                data[0] = rs.getString("film_id");
                data[1] = rs.getString("Judul");
                data[2] = rs.getString("Waktu");
                data[3] = rs.getString("waktuJam");
                data[4] = rs.getString("Kode_Studio");
                dtm.addRow(data);
                i++;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public Connection ADMIN() {
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
    private javax.swing.JButton CARIFILE;
    private javax.swing.JButton CLEAR;
    private javax.swing.JButton DELETE;
    private javax.swing.JTextField Del;
    private javax.swing.JTextField FILM_ID;
    private javax.swing.JTextField JUDUL;
    private javax.swing.JLabel POSTER;
    private javax.swing.JTextArea SIPNOSIS;
    private javax.swing.JComboBox<String> STD;
    private org.netbeans.modules.form.InvalidComponent TANGGAL;
    private javax.swing.JTable Tabel;
    private javax.swing.JButton UBAH;
    private javax.swing.JButton UPLOAD;
    private javax.swing.JTextField WAKTU;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
    private FileInputStream fis;
    private File f;
}
