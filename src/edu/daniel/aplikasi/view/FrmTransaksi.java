/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.daniel.aplikasi.view;

import edu.daniel.aplikasi.fungsi.Print;
import edu.daniel.aplikasi.fungsi.Sequel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author DANIELFRANS
 */
public class FrmTransaksi extends javax.swing.JFrame {

    int userID = User.getUserID();

    private final Sequel sql = new Sequel();
    private final Print p = new Print();

    int paket, tambahan, total;
    DecimalFormat kursIndonesia;
    DecimalFormatSymbols formatRupiah;

    /**
     * Creates new form Order
     */
    public FrmTransaksi() {
        initComponents();
        sql.autoNumberTransaksi();

        kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        formatRupiah = new DecimalFormatSymbols();
        formatRupiah.setCurrencySymbol("Rp. ");
        formatRupiah.setMonetaryDecimalSeparator(',');
        formatRupiah.setGroupingSeparator('.');
        kursIndonesia.setDecimalFormatSymbols(formatRupiah);

        jTableTransaksi.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 12));
        jTableTransaksi.getTableHeader().setOpaque(false);
        jTableTransaksi.getTableHeader().setBackground(new Color(32, 136, 203));
        jTableTransaksi.getTableHeader().setForeground(new Color(255, 255, 255));
        String noTransaksi = txtNoTransaksi.getText();
        if (sql.isTransaksiExists(noTransaksi)) {
            btnSimpanTransaksi.setEnabled(false);
        } else {
            btnSimpanTransaksi.setEnabled(true);
        }

    }

    public void resetTransaksi() {
        txtNoOrder3.setText("");
        tanggalTransaksi.setDate(null);
        txtKeluhan.setText("");
        txtDiBayar.setText("");
        txtKembali.setText("");
        labelTotal.setText("");
    }

    public void filterHuruf(KeyEvent a) {
        if (Character.isDigit(a.getKeyChar())) {
            a.consume();
            JOptionPane.showMessageDialog(null, "Masukkan hanya Huruf", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void filterAngka(KeyEvent b) {
        if (Character.isAlphabetic(b.getKeyChar())) {
            b.consume();
            JOptionPane.showMessageDialog(null, "Masukkan hanya Angka", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dummyField4 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLabel6 = new javax.swing.JLabel();
        btnDaftarOder = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnUbahTransaksi = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnHapusTransaksi = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        dummyField2.setText("jTextField1");

        dummyField3.setText("jTextField1");

        dummyField4.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cucian Keluar");
        setUndecorated(true);
        setSize(new java.awt.Dimension(1022, 620));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setText("No Transaksi");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText("Tanggal Transaksi");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText("No Order");

        txtNoOrder3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtNoOrder3.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtNoOrder3CaretUpdate(evt);
            }
        });

        txtNoTransaksi.setEditable(false);
        txtNoTransaksi.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        tanggalTransaksi.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setText("Keluhan");

        txtKeluhan.setColumns(20);
        txtKeluhan.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        txtKeluhan.setRows(5);
        txtKeluhan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKeluhanKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtKeluhan);

        jScrollPane2.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N

        jTableTransaksi.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTableTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableTransaksi.setGridColor(new java.awt.Color(255, 255, 255));
        jTableTransaksi.setIntercellSpacing(new java.awt.Dimension(8, 5));
        jTableTransaksi.setRowHeight(25);
        jTableTransaksi.setSelectionBackground(new java.awt.Color(232, 57, 95));
        jTableTransaksi.setShowHorizontalLines(false);
        jTableTransaksi.setShowVerticalLines(false);
        jTableTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTransaksiMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableTransaksi);

        labelCountTransaksi.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        labelCountTransaksi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Cucian Keluar");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel6.setOpaque(true);

        btnDaftarOder.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnDaftarOder.setText("Daftar Order");
        btnDaftarOder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnDaftarOder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaftarOderActionPerformed(evt);
            }
        });

        labelTotal.setBackground(new java.awt.Color(0, 0, 0));
        labelTotal.setFont(new java.awt.Font("SansSerif", 0, 48)); // NOI18N
        labelTotal.setForeground(new java.awt.Color(255, 0, 0));
        labelTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelTotal.setText("0");
        labelTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelTotal.setOpaque(true);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnUbahTransaksi.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnUbahTransaksi.setText("Ubah");
        btnUbahTransaksi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnUbahTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahTransaksiActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setText("Kembali");

        btnCetakTransaksi.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnCetakTransaksi.setText("Cetak Nota");
        btnCetakTransaksi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCetakTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakTransaksiActionPerformed(evt);
            }
        });

        txtKembali.setEditable(false);
        txtKembali.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtKembali.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKembaliKeyTyped(evt);
            }
        });

        btnSimpanTransaksi.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnSimpanTransaksi.setText("Simpan");
        btnSimpanTransaksi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSimpanTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanTransaksiActionPerformed(evt);
            }
        });

        txtDiBayar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtDiBayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDiBayarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiBayarKeyTyped(evt);
            }
        });

        btnHapusTransaksi.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnHapusTransaksi.setText("Batal");
        btnHapusTransaksi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnHapusTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusTransaksiActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setText("Dibayar [enter]");

        btnKeluar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnKeluar.setText("Keluar");
        btnKeluar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSimpanTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnUbahTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnHapusTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnCetakTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDiBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnSimpanTransaksi, btnUbahTransaksi});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSimpanTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnUbahTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCetakTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnHapusTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDiBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCetakTransaksi, btnSimpanTransaksi, btnUbahTransaksi});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelCountTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tanggalTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNoTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNoOrder3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDaftarOder, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(labelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNoTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(txtNoOrder3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(tanggalTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btnDaftarOder, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(labelCountTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanTransaksiActionPerformed
        // TODO add your handling code here:

        if (!"".equals(txtNoOrder3.getText())
                && !"".equals(txtNoTransaksi.getText())
                && tanggalTransaksi.getDate() != null
                && !"".equals(txtDiBayar.getText())
                && !"".equals(txtKembali.getText())
                && !"".equals(labelTotal.getText())) {
            String noTransaksi = txtNoTransaksi.getText();
            String noOrder = txtNoOrder3.getText();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String tglTransaksi = sdf.format(tanggalTransaksi.getDate());
            String total = dummyField2.getText();
            int bayar = Integer.parseInt(txtDiBayar.getText());
            int kembali = Integer.parseInt(txtKembali.getText());
            String keluhan = txtKeluhan.getText();

//            if (sql.isTransaksiExists(noTransaksi)) {
//                btnSimpanTransaksi.setEnabled(false);
//            }
            if (!sql.isTransaksiExists(noTransaksi)) {
                sql.simpanTransaksi(noTransaksi, noOrder, tglTransaksi, total, bayar, kembali, keluhan);
                btnSimpanTransaksi.setEnabled(false);
//            } else {
////                btnSimpanTransaksi.setEnabled(true);
////                sql.simpanTransaksi(noTransaksi, noOrder, tglTransaksi, total, bayar, kembali, keluhan);
//            }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Anda harus mengisi data dengan lengkap", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnSimpanTransaksiActionPerformed

    private void jTableTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTransaksiMouseClicked
        // TODO add your handling code here:
        int baris = jTableTransaksi.getSelectedRow();
        txtNoTransaksi.setText(jTableTransaksi.getValueAt(baris, 0).toString());
        txtNoOrder3.setText(jTableTransaksi.getValueAt(baris, 1).toString());
        tanggalTransaksi.setDate(Date.valueOf(jTableTransaksi.getValueAt(baris, 2).toString()));
        labelTotal.setText(jTableTransaksi.getValueAt(baris, 3).toString());
        txtDiBayar.setText(jTableTransaksi.getValueAt(baris, 4).toString());
        txtKembali.setText(jTableTransaksi.getValueAt(baris, 5).toString());
        txtKeluhan.setText(jTableTransaksi.getValueAt(baris, 6).toString());

    }//GEN-LAST:event_jTableTransaksiMouseClicked

    private void btnUbahTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahTransaksiActionPerformed
        // TODO add your handling code here:

        if (!"".equals(txtNoOrder3.getText())
                && !"".equals(txtNoTransaksi.getText())
                && tanggalTransaksi.getDate() != null
                && !"".equals(txtDiBayar.getText())
                && !"".equals(txtKembali.getText())
                && !"".equals(labelTotal.getText())) {
            String noTransaksi = txtNoTransaksi.getText();
            String noOrder = txtNoOrder3.getText();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String tglTransaksi = sdf.format(tanggalTransaksi.getDate());
            String total = labelTotal.getText();
            int bayar = Integer.parseInt(txtDiBayar.getText());
            int kembali = Integer.parseInt(txtKembali.getText());
            String keluhan = txtKeluhan.getText();
            sql.ubahTransaksi(noTransaksi, noOrder, tglTransaksi, total, bayar, kembali, keluhan);

        } else {
            JOptionPane.showMessageDialog(null, "Anda harus mengisi data dengan lengkap", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnUbahTransaksiActionPerformed

    private void btnCetakTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakTransaksiActionPerformed
        // TODO add your handling code here:
        String noOrder = txtNoOrder3.getText();
        p.cetakTransaksi(noOrder);
    }//GEN-LAST:event_btnCetakTransaksiActionPerformed

    private void txtDiBayarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiBayarKeyPressed
        // TODO add your handling code here:

        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            int totalBiaya = Integer.parseInt(dummyField2.getText());
            int diBayar = Integer.parseInt(txtDiBayar.getText());
            int kembalian;
            if (diBayar < totalBiaya) {
                JOptionPane.showMessageDialog(null, "Pembayaran pelanggan anda kurang", "Peringatan", JOptionPane.INFORMATION_MESSAGE);
            } else {
                kembalian = diBayar - totalBiaya;
                txtKembali.setText(Integer.toString(kembalian));
            }
        }
    }//GEN-LAST:event_txtDiBayarKeyPressed

    private void txtDiBayarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiBayarKeyTyped
        // TODO add your handling code here:
        filterAngka(evt);
    }//GEN-LAST:event_txtDiBayarKeyTyped

    private void txtKembaliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKembaliKeyTyped
        // TODO add your handling code here:
        filterAngka(evt);
    }//GEN-LAST:event_txtKembaliKeyTyped

    private void btnDaftarOderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaftarOderActionPerformed
        // TODO add your handling code here:
        new FrmDaftarOrder().setVisible(true);
    }//GEN-LAST:event_btnDaftarOderActionPerformed

    private void btnHapusTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusTransaksiActionPerformed
        // TODO add your handling code here:
        if (!"".equals(txtNoOrder3.getText())
                && !"".equals(txtNoTransaksi.getText())
                && tanggalTransaksi.getDate() != null
                && !"".equals(txtDiBayar.getText())
                && !"".equals(txtKembali.getText())
                && !"".equals(labelTotal.getText())) {
            String noTransaksi = txtNoTransaksi.getText();
            sql.hapusTransaksi(noTransaksi);
            resetTransaksi();
            sql.autoNumberTransaksi();
        } else {
            JOptionPane.showMessageDialog(null, "Anda harus mengisi data dengan lengkap", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnHapusTransaksiActionPerformed

    private void txtNoOrder3CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtNoOrder3CaretUpdate
        // TODO add your handling code here:
        String noOrder = txtNoOrder3.getText();
        sql.totalHarga2(noOrder);
        sql.showOrder3(noOrder);
    }//GEN-LAST:event_txtNoOrder3CaretUpdate

    private void txtKeluhanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKeluhanKeyTyped
        // TODO add your handling code here:
        if (txtKeluhan.getText().length() == 60) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Maksimal yang dimasukkan hanya 60 Karakter", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtKeluhanKeyTyped

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        resetTransaksi();
        sql.autoNumberTransaksi();
    }//GEN-LAST:event_btnKeluarActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmTransaksi.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTransaksi.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTransaksi.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTransaksi.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTransaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static final javax.swing.JButton btnCetakTransaksi = new javax.swing.JButton();
    private javax.swing.JButton btnDaftarOder;
    private javax.swing.JButton btnHapusTransaksi;
    public static final javax.swing.JButton btnKeluar = new javax.swing.JButton();
    public static final javax.swing.JButton btnSimpanTransaksi = new javax.swing.JButton();
    private javax.swing.JButton btnUbahTransaksi;
    public static final javax.swing.JTextField dummyField2 = new javax.swing.JTextField();
    public static final javax.swing.JTextField dummyField3 = new javax.swing.JTextField();
    private javax.swing.JTextField dummyField4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static final javax.swing.JTable jTableTransaksi = new javax.swing.JTable();
    public static final javax.swing.JLabel labelCountTransaksi = new javax.swing.JLabel();
    public static final javax.swing.JLabel labelTotal = new javax.swing.JLabel();
    public static final com.toedter.calendar.JDateChooser tanggalTransaksi = new com.toedter.calendar.JDateChooser();
    public static final javax.swing.JTextField txtDiBayar = new javax.swing.JTextField();
    public static final javax.swing.JTextArea txtKeluhan = new javax.swing.JTextArea();
    public static final javax.swing.JTextField txtKembali = new javax.swing.JTextField();
    public static final javax.swing.JTextField txtNoOrder3 = new javax.swing.JTextField();
    public static final javax.swing.JTextField txtNoTransaksi = new javax.swing.JTextField();
    // End of variables declaration//GEN-END:variables
}
