package susatisproject;


import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author turan
 */
public class AnaEkran extends javax.swing.JFrame {

    /**
     * Creates new form AnaEkran
     */
    public AnaEkran() {
        initComponents();

        MusteriListele ml = new MusteriListele();
        tblMusteri.setModel(ml.listeleme());
        SiparisGetir sg = new SiparisGetir();
        tblSiparisler.setModel(sg.siparisListele());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtAdi = new javax.swing.JTextField();
        txtSoyadi = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        buttonTumunuSil = new javax.swing.JButton();
        buttonGununSiparisleri = new javax.swing.JButton();
        buttonSeciliSil = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMusteri = new javax.swing.JTable();
        buttonMusteriDuzenle = new javax.swing.JButton();
        buttonMusteriSil = new javax.swing.JButton();
        buttonYeniMusteri = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSiparisler = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        buttonYolaCikti = new javax.swing.JButton();
        buttonTeslimEdildi = new javax.swing.JButton();
        buttonYeniSiparis = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Arama"));

        jLabel10.setText(" Müşteri Adı");

        jLabel11.setText(" Müşteri Soyadı");

        txtAdi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAdiKeyReleased(evt);
            }
        });

        txtSoyadi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSoyadiKeyReleased(evt);
            }
        });

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/search.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAdi)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(6, 6, 6)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoyadi))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tablo İşlemleri"));

        buttonTumunuSil.setText("Tümünü Sil");
        buttonTumunuSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTumunuSilActionPerformed(evt);
            }
        });

        buttonGununSiparisleri.setText("Bugünün Siparişleri");
        buttonGununSiparisleri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGununSiparisleriActionPerformed(evt);
            }
        });

        buttonSeciliSil.setText("Şecili Olanları Sil");
        buttonSeciliSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeciliSilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonSeciliSil)
                .addGap(22, 22, 22)
                .addComponent(buttonTumunuSil, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(buttonGununSiparisleri, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonTumunuSil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonGununSiparisleri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonSeciliSil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Müşteriler"));

        tblMusteri.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblMusteri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMusteriMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMusteri);

        buttonMusteriDuzenle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/edit.png"))); // NOI18N
        buttonMusteriDuzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMusteriDuzenleActionPerformed(evt);
            }
        });

        buttonMusteriSil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/delete.png"))); // NOI18N
        buttonMusteriSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMusteriSilActionPerformed(evt);
            }
        });

        buttonYeniMusteri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/add.png"))); // NOI18N
        buttonYeniMusteri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonYeniMusteriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonYeniMusteri, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(buttonMusteriDuzenle, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(buttonMusteriSil, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonMusteriDuzenle, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonMusteriSil)
                    .addComponent(buttonYeniMusteri, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Siparişler"));

        tblSiparisler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblSiparisler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSiparislerMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSiparisler);

        jLabel3.setText("Yeni Sipariş");

        buttonYolaCikti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/yolacikti.png"))); // NOI18N
        buttonYolaCikti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonYolaCiktiActionPerformed(evt);
            }
        });

        buttonTeslimEdildi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/teslimedildi.png"))); // NOI18N
        buttonTeslimEdildi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTeslimEdildiActionPerformed(evt);
            }
        });

        buttonYeniSiparis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/yenisiparis.png"))); // NOI18N
        buttonYeniSiparis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonYeniSiparisActionPerformed(evt);
            }
        });

        jLabel4.setText("Yola Çıktı");

        jLabel5.setText("Teslim Edildi");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(72, 72, 72)
                        .addComponent(jLabel4)
                        .addGap(67, 67, 67)
                        .addComponent(jLabel5))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(buttonYeniSiparis, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonYolaCikti, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonTeslimEdildi, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(4, 4, 4)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonYeniSiparis, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonYolaCikti, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTeslimEdildi, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    static String id = "";
    private void buttonMusteriDuzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMusteriDuzenleActionPerformed
        if (!id.equals("")) {
            MusteriDuzenleFrame mdf = new MusteriDuzenleFrame();
            mdf.setVisible(true);
            

        } else {
            JOptionPane.showMessageDialog(this, "Lütfen bir satır seçiniz.");
        }
    }//GEN-LAST:event_buttonMusteriDuzenleActionPerformed

    private void tblMusteriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMusteriMouseClicked
        id = (String) tblMusteri.getValueAt(tblMusteri.getSelectedRow(), 0);
        if (evt.getClickCount() == 2) {
            SiparisFrame sf = new SiparisFrame();
            sf.setVisible(true);
        }
    }//GEN-LAST:event_tblMusteriMouseClicked

    private void buttonMusteriSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMusteriSilActionPerformed
        int confirmed = JOptionPane.showConfirmDialog(this,
                "Silmek istediğinizden emin misiniz?", "Silme İşlemi",
                JOptionPane.YES_NO_OPTION);

        if (confirmed == JOptionPane.YES_OPTION) {
            MusteriSil ms = new MusteriSil();
            ms.sil(id);
            MusteriListele ml = new MusteriListele();
            tblMusteri.setModel(ml.listeleme());

            id = "";

        }
    }//GEN-LAST:event_buttonMusteriSilActionPerformed
    String sid = "";
    private void tblSiparislerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSiparislerMouseClicked
        sid = "" + tblSiparisler.getValueAt(tblSiparisler.getSelectedRow(), 0);
    }//GEN-LAST:event_tblSiparislerMouseClicked

    private void buttonYeniSiparisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonYeniSiparisActionPerformed
        if (!id.equals("")) {
            SiparisFrame sf = new SiparisFrame();
            sf.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Lütfen bir müşteri seçiniz!");
        }
    }//GEN-LAST:event_buttonYeniSiparisActionPerformed

    private void buttonYolaCiktiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonYolaCiktiActionPerformed
        if (!sid.equals("")) {
            System.out.println("id:" + sid);
            String query = "UPDATE siparisler SET sdurum = 1 WHERE sid = '" + sid + "'";
            DB db = new DB();
            try {
                db.baglan().executeUpdate(query);
            } catch (Exception e) {
            } finally {
                db.close();
            }
            SiparisGetir sg = new SiparisGetir();
            tblSiparisler.setModel(sg.siparisListele());
        }
    }//GEN-LAST:event_buttonYolaCiktiActionPerformed

    private void buttonTeslimEdildiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTeslimEdildiActionPerformed
        String query = "update siparisler set sdurum=2 where sid ='" + sid + "'";
        DB db = new DB();
        if (!sid.equals("")) {
            try {
                db.baglan().executeUpdate(query);
            } catch (Exception e) {
            } finally {
                db.close();
            }
        }
        SiparisGetir sg = new SiparisGetir();
        tblSiparisler.setModel(sg.siparisListele());
    }//GEN-LAST:event_buttonTeslimEdildiActionPerformed
    static String aId = "";
    ArrayList<Siparis> alst = new ArrayList<>();

    ArrayList<Musteri> mls = new ArrayList<>();


    private void buttonYeniMusteriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonYeniMusteriActionPerformed
        MusteriFrame mf = new MusteriFrame();
        mf.setVisible(true);
    }//GEN-LAST:event_buttonYeniMusteriActionPerformed

    private void txtAdiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAdiKeyReleased
        mls.clear();
        String ad = txtAdi.getText();
        String soyAd = txtSoyadi.getText();

        String query = "select * from musteriler where  madi like '" + ad + "%' and msoyadi like '" + soyAd + "%'  ";
        DB db = new DB();

        try {
            ResultSet rs = db.baglan().executeQuery(query);

            while (rs.next()) {
                Musteri m = new Musteri();
                m.setAd(rs.getString("" + MEnum.madi));
                m.setAdres(rs.getString("" + MEnum.madres));
                m.setId(rs.getString("" + MEnum.mid));
                m.setSoyad(rs.getString("" + MEnum.msoyadi));
                m.setTel(rs.getString("" + MEnum.mtelefon));
                mls.add(m);
            }

        } catch (Exception e) {
            System.err.println("Arama id cekme hatasi: " + e);
        } finally {
            db.close();
        }

        DefaultTableModel tabel = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {

                return false;
            }
        };

        tabel.addColumn("id");
        tabel.addColumn("İsim");
        tabel.addColumn("Soyisim");
        tabel.addColumn("Telefon");
        tabel.addColumn("Adres");

        for (Musteri l : mls) {

            tabel.addRow(new String[]{l.getId(), l.getAd(), l.getSoyad(), l.getTel(), l.getAdres()});

        }

        tblMusteri.setModel(tabel);
    }//GEN-LAST:event_txtAdiKeyReleased

    private void txtSoyadiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSoyadiKeyReleased
        mls.clear();
        String ad = txtAdi.getText();
        String soyAd = txtSoyadi.getText();

        String query = "select * from musteriler where  madi like '" + ad + "%' and msoyadi like '" + soyAd + "%'  ";
        DB db = new DB();

        try {
            ResultSet rs = db.baglan().executeQuery(query);

            while (rs.next()) {
                Musteri m = new Musteri();
                m.setAd(rs.getString("" + MEnum.madi));
                m.setAdres(rs.getString("" + MEnum.madres));
                m.setId(rs.getString("" + MEnum.mid));
                m.setSoyad(rs.getString("" + MEnum.msoyadi));
                m.setTel(rs.getString("" + MEnum.mtelefon));
                mls.add(m);
            }

        } catch (Exception e) {
            System.err.println("Arama id cekme hatasi: " + e);
        } finally {
            db.close();
        }

        DefaultTableModel tabel = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };

        tabel.addColumn("id");
        tabel.addColumn("İsim");
        tabel.addColumn("Soyisim");
        tabel.addColumn("Telefon");
        tabel.addColumn("Adres");

        mls.forEach((l) -> {
            tabel.addRow(new String[]{l.getId(), l.getAd(), l.getSoyad(), l.getTel(), l.getAdres()});
        });

        tblMusteri.setModel(tabel);
    }//GEN-LAST:event_txtSoyadiKeyReleased

    private void buttonGununSiparisleriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGununSiparisleriActionPerformed
        GununSiparisleri gs = new GununSiparisleri();
        tblSiparisler.setModel(gs.listele());
    }//GEN-LAST:event_buttonGununSiparisleriActionPerformed

    private void buttonTumunuSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTumunuSilActionPerformed
        int confirmed = JOptionPane.showConfirmDialog(this,
                "Silmek istediğinizden emin misiniz?", "Silme İşlemi",
                JOptionPane.YES_NO_OPTION);

        if (confirmed == JOptionPane.YES_OPTION) {
            String query = "delete from siparisler";
            DB db = new DB();
            try {
                db.baglan().executeUpdate(query);
            } catch (Exception e) {
            } finally {
                db.close();
            }

            SiparisGetir sg = new SiparisGetir();
            tblSiparisler.setModel(sg.siparisListele());

        }
    }//GEN-LAST:event_buttonTumunuSilActionPerformed

    private void buttonSeciliSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeciliSilActionPerformed
        int confirmed = JOptionPane.showConfirmDialog(this,
                "Silmek istediğinizden emin misiniz?", "Silme İşlemi",
                JOptionPane.YES_NO_OPTION);

        if (confirmed == JOptionPane.YES_OPTION) {
            SiparisSil ss = new SiparisSil();
            ss.sil(sid);
            SiparisGetir sg = new SiparisGetir();
            tblSiparisler.setModel(sg.siparisListele());
            sid = "";

        }
    }//GEN-LAST:event_buttonSeciliSilActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int confirmed = JOptionPane.showConfirmDialog(this,
                "Çıkmak istediğinizden emin misiniz?", "Exit Program",
                JOptionPane.YES_NO_OPTION);

        if (confirmed == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_formWindowClosing

    public String getir() {
        return id;
    }

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
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnaEkran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonGununSiparisleri;
    private javax.swing.JButton buttonMusteriDuzenle;
    private javax.swing.JButton buttonMusteriSil;
    private javax.swing.JButton buttonSeciliSil;
    private javax.swing.JButton buttonTeslimEdildi;
    private javax.swing.JButton buttonTumunuSil;
    private javax.swing.JButton buttonYeniMusteri;
    private javax.swing.JButton buttonYeniSiparis;
    private javax.swing.JButton buttonYolaCikti;
    private javax.swing.JButton jButton13;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable tblMusteri;
    public static javax.swing.JTable tblSiparisler;
    private javax.swing.JTextField txtAdi;
    private javax.swing.JTextField txtSoyadi;
    // End of variables declaration//GEN-END:variables
}
