package TicketBioskop;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Kriv
 */
public class Jadwal extends javax.swing.JInternalFrame {

    int jumlahbaris;
    private final DefaultTableModel tabelModel2;
    Connection nyambung;
    PreparedStatement pst;
    Statement st;
    ResultSet rs;

    /**
     * Creates new form Jadwal
     */
    public Jadwal() {
        initComponents();
        tabelModel2 = (DefaultTableModel) Tabel2.getModel();
        Pesan();
        UpdateTabel();
        UpdateTabel2();
        lebarKolom();
        AutoBox();
        autoid();
        Hitung();
        ((JSpinner.DefaultEditor) SPINNERNOMOR.getEditor()).getTextField().setEditable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabel = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Photo = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SIPNOSIS = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        BTNSIMPAN = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtstudio = new javax.swing.JLabel();
        txttersedia = new javax.swing.JLabel();
        txtharga = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtjadwal = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        NMP = new javax.swing.JTextField();
        CBFILM = new javax.swing.JComboBox<>();
        NAMAP = new javax.swing.JTextField();
        KLSBANGKU = new javax.swing.JLabel();
        SPINNERNOMOR = new javax.swing.JSpinner();
        jLabel20 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabel2 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CBBAYAR = new javax.swing.JComboBox<>();
        JMPS = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        BTNBAYAR = new javax.swing.JButton();
        JMBY = new javax.swing.JTextField();
        DSK = new javax.swing.JTextField();
        TOTALBAYAR = new javax.swing.JTextField();
        BTNCETAK = new javax.swing.JButton();
        CODECETAK = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        BTNCLEAR = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        AREA = new javax.swing.JTextArea();

        setClosable(true);
        setTitle("PESAN TICKET");
        setToolTipText("");

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Tabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Tabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Film", "Tanggal", "Waktu", "Studio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabel.getTableHeader().setReorderingAllowed(false);
        Tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tabel);
        if (Tabel.getColumnModel().getColumnCount() > 0) {
            Tabel.getColumnModel().getColumn(0).setResizable(false);
            Tabel.getColumnModel().getColumn(1).setResizable(false);
            Tabel.getColumnModel().getColumn(2).setResizable(false);
            Tabel.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("JADWAL TAYANG UNPAM CINEMA 21");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Photo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Photo, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Photo, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        SIPNOSIS.setEditable(false);
        SIPNOSIS.setColumns(20);
        SIPNOSIS.setRows(5);
        jScrollPane1.setViewportView(SIPNOSIS);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(5, 5, 5))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("POSTER");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SIPNOSIS");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("UNPAM CINEMA 21");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(274, 274, 274)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(194, 194, 194))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(280, 280, 280))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(22, 22, 22))
        );

        jTabbedPane1.addTab("Jadwal Tayang", jPanel4);

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BOOKING");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("NAMA PEMESAN  :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("FILM                  :");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("TERSEDIA          :");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("HARGA              :");

        BTNSIMPAN.setText("SIMPAN");
        BTNSIMPAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNSIMPANActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("STUDIO             :");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setText("PESAN BANGKU  :");

        txtharga.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("Rp.");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("NOMOR PESAN    :");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setText("JADWAL            :");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel27.setText("KELAS  :");

        NMP.setEditable(false);
        NMP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NMP.setText("PSN0");
        NMP.setEnabled(false);

        CBFILM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBFILM.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                CBFILMPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        CBFILM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBFILMActionPerformed(evt);
            }
        });

        KLSBANGKU.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        SPINNERNOMOR.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SPINNERNOMOR.setModel(new javax.swing.SpinnerNumberModel(1, 1, 375, 1));
        SPINNERNOMOR.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SPINNERNOMORStateChanged(evt);
            }
        });

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("A: 1-75     B:76-150    C:151-225    D:>300");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNSIMPAN)
                    .addGap(37, 37, 37))
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel21))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtstudio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CBFILM, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtharga))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NMP, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NAMAP)))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel24)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtjadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txttersedia))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel22)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addComponent(SPINNERNOMOR, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(KLSBANGKU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addContainerGap(38, Short.MAX_VALUE)))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(38, 38, 38))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(NMP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(NAMAP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(CBFILM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtstudio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtjadwal))
                .addGap(8, 8, 8)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txttersedia))
                .addGap(9, 9, 9)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel27)
                    .addComponent(KLSBANGKU)
                    .addComponent(SPINNERNOMOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtharga)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addComponent(BTNSIMPAN)
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Tabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Tabel2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PESAN ID", "NAMA", "FILM", "STUDIO", "JADWAL", "BANGKU", "HARGA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabel2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Tabel2);
        if (Tabel2.getColumnModel().getColumnCount() > 0) {
            Tabel2.getColumnModel().getColumn(0).setResizable(false);
            Tabel2.getColumnModel().getColumn(1).setResizable(false);
            Tabel2.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("JUMLAH BAYAR     :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("JUMLAH PESAN     :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("CARA BAYAR");

        CBBAYAR.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CBBAYAR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Metode", "CASH", "OVO", "BANKING" }));
        CBBAYAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBBAYARActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("DISKON                :");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("TOTAL                 :");

        BTNBAYAR.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BTNBAYAR.setText("BAYAR");
        BTNBAYAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBAYARActionPerformed(evt);
            }
        });

        BTNCETAK.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BTNCETAK.setText("CETAK ");
        BTNCETAK.setEnabled(false);
        BTNCETAK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCETAKActionPerformed(evt);
            }
        });

        CODECETAK.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CODECETAK.setEnabled(false);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("CETAK TIKET");

        BTNCLEAR.setText("DELETE");
        BTNCLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCLEARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JMPS, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JMBY, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DSK, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TOTALBAYAR, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(CBBAYAR, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BTNBAYAR, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(CODECETAK, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BTNCLEAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BTNCETAK, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)))))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(JMPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(JMBY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DSK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TOTALBAYAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CBBAYAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTNBAYAR))
                        .addGap(19, 19, 19)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTNCETAK)
                            .addComponent(CODECETAK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTNCLEAR)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("UNPAM CINEMA 21");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("TICKET");

        AREA.setColumns(20);
        AREA.setRows(5);
        jScrollPane4.setViewportView(AREA);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(305, 305, 305))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(433, 433, 433)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(31, 31, 31))
        );

        jTabbedPane1.addTab("Booking", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelMouseClicked
        // Table Mouse Clicked
        try {
            int row = Tabel.getSelectedRow();
            String JDL = (String) Tabel.getValueAt(row, 0);
            String[] data = new String[8];

            st = (Statement) nyambung.createStatement();
            String sql = "SELECT *FROM jadwalfilm WHERE Judul='" + JDL + "';";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Blob gambar = (Blob) rs.getBlob("Gambar");
                int ukuran = (int) (gambar.length());
                ImageIcon tampilkan = new ImageIcon(gambar.getBytes(1, ukuran));
                Photo.setIcon(tampilkan);
                data[6] = rs.getString("Sipnosis");
                SIPNOSIS.setText(data[6]);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Jadwal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TabelMouseClicked

    private void BTNSIMPANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNSIMPANActionPerformed
        /* Pesan　*/
        if (NAMAP.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Cantumkan Nama Anda", "Kurang!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                String sql = "INSERT INTO tbpesan(pesan_id,nama_pemesan,film,studio,Jadwal,bangku,harga) VALUES(?,?,?,?,?,?,?)";
                PreparedStatement stat = (PreparedStatement) nyambung.prepareStatement(sql);
                stat.setString(1, NMP.getText());
                stat.setString(2, NAMAP.getText());
                stat.setString(3, (String) CBFILM.getSelectedItem());
                stat.setString(4, txtstudio.getText());
                stat.setString(5, txtjadwal.getText());
                stat.setString(6, KLSBANGKU.getText());
                stat.setString(7, txtharga.getText());
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "UPLOAD Berhasil");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "UPLOAD Gagal", "ERORR", JOptionPane.ERROR_MESSAGE);
            }
            UpdateTabel2();
            autoid();
            Hitung();
        }

    }//GEN-LAST:event_BTNSIMPANActionPerformed

    private void CBFILMPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_CBFILMPopupMenuWillBecomeInvisible
        // Pilih Menu
        String pill = (String) CBFILM.getSelectedItem();
        String sql = "SELECT *FROM BOOK where Judul=?";
        try {
            pst = nyambung.prepareStatement(sql);
            pst.setString(1, pill);
            rs = pst.executeQuery();
            if (rs.next()) {
                JudulFilm = rs.getString("Judul");
                String add1 = rs.getString("Nama_Studio");
                txtstudio.setText(add1);
                String add2 = rs.getString("Waktu");
                String add3 = rs.getString("waktuJam");
                txtjadwal.setText(add2 + " " + add3);
                String add4 = rs.getString("Jumlah_Bangku");
                txttersedia.setText(add4);
                int Convert = Integer.parseInt(add4);
                SPINNERNOMOR.setModel(new javax.swing.SpinnerNumberModel(1, 1, Convert, 1));
            }
        } catch (SQLException e) {

        }
    }//GEN-LAST:event_CBFILMPopupMenuWillBecomeInvisible

    private void SPINNERNOMORStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SPINNERNOMORStateChanged
        // KELASS BANGKU
        SPINBOXX();
    }//GEN-LAST:event_SPINNERNOMORStateChanged

    private void CBFILMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBFILMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBFILMActionPerformed

    private void BTNBAYARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBAYARActionPerformed
        // Tombol Bayar
        if (JMBY.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "HARAP MELAKUKAN PESAN TERLEBIH DAHULU", "LENGKAPI", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "TERIMA KASIH TELAH MENGGUNAKAN LAYANAN KAMI", "SELESAI!", JOptionPane.PLAIN_MESSAGE);
            BTNCETAK.setEnabled(true);
            CODECETAK.setEnabled(true);
        }
    }//GEN-LAST:event_BTNBAYARActionPerformed

    private void BTNCLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCLEARActionPerformed
        // BTN CLEAR
        try {
            String sql = "DELETE FROM tbpesan WHERE pesan_id=?";
            PreparedStatement stat = nyambung.prepareStatement(sql);
            stat.setString(1, CODECETAK.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "HAPUS BERHASIL");
            UpdateTabel2();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "HAPUS GAGAL");
        }


    }//GEN-LAST:event_BTNCLEARActionPerformed

    private void CBBAYARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBBAYARActionPerformed
        // Box Metode Bayar
        int diskon;
        int T = Integer.parseInt(JMBY.getText());
        if (CBBAYAR.getSelectedItem() == "Metode") {
            DSK.setText("");
            total();
        }
        if (CBBAYAR.getSelectedItem() == "CASH") {

            diskon = T * 20 / 100;
            DSK.setText("" + diskon);
            total();
        }
        if (CBBAYAR.getSelectedItem() == "OVO") {

            diskon = T * 25 / 100;
            DSK.setText("" + diskon);
            total();
        }
        if (CBBAYAR.getSelectedItem() == "BANKING") {

            diskon = T * 30 / 100;
            DSK.setText("" + diskon);
            total();
        }

    }//GEN-LAST:event_CBBAYARActionPerformed

    private void BTNCETAKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCETAKActionPerformed
        // Cetak Ticket  
        try {
            Statement st = (Statement) nyambung.createStatement();
            String sql = "SELECT *FROM tbpesan WHERE pesan_id='" + CODECETAK.getText() + "'";
            rs = st.executeQuery(sql);

            String[] data = new String[8];

            while (rs.next()) {
                data[0] = rs.getString("pesan_id");
                data[1] = rs.getString("nama_pemesan");
                data[2] = rs.getString("film");
                data[3] = rs.getString("studio");
                data[4] = rs.getString("jadwal");
                data[5] = rs.getString("bangku");
                data[6] = rs.getString("harga");

                AREA.setText(
                        "TICKET :\t\t : " + data[0] + "\n"
                        + "NAMA\t\t : " + data[1] + "\n"
                        + "FILM\t\t : " + data[2] + "\n"
                        + "STUDIO\t\t : " + data[3] + "\n"
                        + "JADWAL\t\t : " + data[4] + "\n"
                        + "BANGKU \t\t : " + data[5]
                );

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_BTNCETAKActionPerformed

    private void Tabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabel2MouseClicked
        // Pilih Code
        int row = Tabel2.getSelectedRow();
        String JDL = (String) Tabel2.getValueAt(row, 0);
        CODECETAK.setText(JDL);

    }//GEN-LAST:event_Tabel2MouseClicked

    private void UpdateTabel2() {
        try {
            Statement st = (Statement) nyambung.createStatement();
            String sql = "SELECT *FROM tbpesan;";
            rs = st.executeQuery(sql);
            DefaultTableModel dtm = (DefaultTableModel) Tabel2.getModel();
            dtm.setRowCount(0);
            String[] data = new String[8];
            int i = 1;

            while (rs.next()) {
                data[0] = rs.getString("pesan_id");
                data[1] = rs.getString("nama_pemesan");
                data[2] = rs.getString("film");
                data[3] = rs.getString("studio");
                data[4] = rs.getString("jadwal");
                data[5] = rs.getString("bangku");
                data[6] = rs.getString("harga");

                dtm.addRow(data);
                i++;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void UpdateTabel() {
        try {
            Statement st = (Statement) nyambung.createStatement();
            String sql = "SELECT *FROM tbjadwal;";
            rs = st.executeQuery(sql);
            DefaultTableModel dtm = (DefaultTableModel) Tabel.getModel();
            dtm.setRowCount(0);
            String[] data = new String[8];
            int i = 1;

            while (rs.next()) {
                data[0] = rs.getString("Judul");
                data[1] = rs.getString("Waktu");
                data[2] = rs.getString("waktuJam");
                data[3] = rs.getString("Nama_Studio");

                dtm.addRow(data);
                i++;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void lebarKolom() {
        TableColumn column;
        Tabel.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        column = Tabel.getColumnModel().getColumn(0);
        column.setPreferredWidth(250);
        column = Tabel.getColumnModel().getColumn(1);
        column.setPreferredWidth(150);
        column = Tabel.getColumnModel().getColumn(2);
        column.setPreferredWidth(70);
        column = Tabel.getColumnModel().getColumn(2);
        column.setPreferredWidth(120);

    }

    private void AutoBox() {
        try {
            Statement st = (Statement) nyambung.createStatement();
            String sql = "SELECT *FROM BOOK;";
            rs = st.executeQuery(sql);
            CBFILM.removeAllItems();

            while (rs.next()) {
                CBFILM.addItem(rs.getString("Judul"));
            }
            rs.last();
            int jumlahdata = rs.getRow();
            rs.first();

        } catch (SQLException ex) {
            Logger.getLogger(Jadwal.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void Hitung() {
        jumlahbaris = Tabel2.getRowCount();
        int TTL_PESAN = 0;
        int TTL = 0;
        for (int i = 0; i < jumlahbaris; i++) {
            int Total_Terjual = Tabel2.getRowCount();
            TTL_PESAN = Total_Terjual;
            int TTL_BAYAR = Integer.parseInt((String) tabelModel2.getValueAt(i, 6).toString());
            TTL += TTL_BAYAR;
        }
        JMPS.setText("" + TTL_PESAN);
        JMBY.setText("" + TTL);
    }

    private void SPINBOXX() {
        int KLSS = (int) SPINNERNOMOR.getValue();
        String K;
        int harga;
        String value = SPINNERNOMOR.getValue().toString();

        if (SPINNERNOMOR.getValue().equals("0")) {
            JOptionPane.showMessageDialog(null, "HARAP PILIH NOMOR BANGKU ANDA", "PENTING", JOptionPane.INFORMATION_MESSAGE);
        }
        if (KLSS <= 75) {
            K = "A";
            harga = 150000;
            KLSBANGKU.setText(value + K);
            txtharga.setText("" + harga);
        }
        if (KLSS > 75) {
            K = "B";
            harga = 120000;
            KLSBANGKU.setText(value + K);
            txtharga.setText("" + harga);
        }
        if (KLSS > 150) {
            K = "C";
            harga = 75000;
            KLSBANGKU.setText(value + K);
            txtharga.setText("" + harga);
        }
        if (KLSS > 225) {
            K = "D";
            harga = 50000;
            KLSBANGKU.setText(value + K);
            txtharga.setText("" + harga);
        }
    }

    private void autoid() {
        int itung = Tabel2.getRowCount();
        itung = itung + 1;
        NMP.setText("PSN0" + itung);

    }

    private void total() {
        int a = Integer.parseInt(JMBY.getText());
        int b = Integer.parseInt(DSK.getText());

        int TOTAL = a - b;
        TOTALBAYAR.setText("" + TOTAL);
    }

    public Connection Pesan() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            nyambung = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/tugasakhir", "Qifli", "181011400811");
            System.out.println("KONEKSI BERHASIL");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "SEDANG OFFLINE " + e.getMessage());
        }
        return nyambung;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AREA;
    private javax.swing.JButton BTNBAYAR;
    private javax.swing.JButton BTNCETAK;
    private javax.swing.JButton BTNCLEAR;
    private javax.swing.JButton BTNSIMPAN;
    private javax.swing.JComboBox<String> CBBAYAR;
    private javax.swing.JComboBox<String> CBFILM;
    private javax.swing.JTextField CODECETAK;
    private javax.swing.JTextField DSK;
    private javax.swing.JTextField JMBY;
    private javax.swing.JTextField JMPS;
    private javax.swing.JLabel KLSBANGKU;
    private javax.swing.JTextField NAMAP;
    private javax.swing.JTextField NMP;
    private javax.swing.JLabel Photo;
    private javax.swing.JTextArea SIPNOSIS;
    private javax.swing.JSpinner SPINNERNOMOR;
    private javax.swing.JTextField TOTALBAYAR;
    private javax.swing.JTable Tabel;
    private javax.swing.JTable Tabel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel txtharga;
    private javax.swing.JLabel txtjadwal;
    private javax.swing.JLabel txtstudio;
    private javax.swing.JLabel txttersedia;
    // End of variables declaration//GEN-END:variables
private String JudulFilm;
}
