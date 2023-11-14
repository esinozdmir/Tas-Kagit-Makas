

import java.util.ArrayList;

public class NewJFrame4 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame4
     */
    
    
           


				
            
    public NewJFrame4() {
    
        initComponents();
        oyuncu_adi.setText(NewJFrame2.adAl()+": ");
        skorTablosu.setVisible(false);
        sonuclar.setVisible(false);
        button_resim_oyuncu.setIcon(new javax.swing.ImageIcon(getClass().getResource("taskagitmakas_resimler/newpackage/tas-kagit-makas.png")))  ;
button_resim_bilgisayar.setIcon(new javax.swing.ImageIcon(getClass().getResource("taskagitmakas_resimler/newpackage/tas-kagit-makas.png")))  ;    // TODO add your handling code here:
    }
    int oyuncuSkor=0,bilgisayarSkor=0,oyuncu=0,bilgisayar=0,oyuncuDay=0,bilgisayarDay=0,countOyna=0;
    Nesne[] nesneList = new Nesne[]{
				new Tas(),
				new Tas(),
				new Kagit(),
				new Makas(),
				new Makas(),
            };
    //combobox_oyuncu.setEditable(true);
    //combobox_oyuncu.addActionListener(this);
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        OyunAlani = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        combobox_oyuncu = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        combobox_bilgisayar = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        button_resim_oyuncu = new javax.swing.JButton();
        button_resim_bilgisayar = new javax.swing.JButton();
        button_oyna = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        label_durum = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        secimAdiOyuncu = new javax.swing.JLabel();
        secimAdiBilgisayar = new javax.swing.JLabel();
        secimDayOyuncu = new javax.swing.JLabel();
        SecimDayBilgisayar = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        sonuclar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        skorTablosu = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        oyuncu_adi = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        oyuncu_skor = new javax.swing.JLabel();
        bilgisayar_skor = new javax.swing.JLabel();
        durum_bildirimi = new javax.swing.JLabel();
        durum_bildirimi1 = new javax.swing.JLabel();
        durum_bildirimi2 = new javax.swing.JLabel();
        durum_bildirimi3 = new javax.swing.JLabel();
        durum_bildirimi4 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        OyunAlani.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("KULLANICI SECİMİ");

        combobox_oyuncu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1.tas", "2.tas", "kagit", "1.makas", "2.makas" }));
        combobox_oyuncu.setSelectedIndex(-1);
        combobox_oyuncu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combobox_oyuncuİtemStateChanged(evt);
            }
        });
        combobox_oyuncu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox_oyuncuActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("BILGISAYARIN SECİMİ");

        combobox_bilgisayar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1.tas", "2.tas", "kagit", "1.makas", "2.makas", " " }));
        combobox_bilgisayar.setSelectedIndex(-1);

        jButton1.setBackground(new java.awt.Color(153, 102, 0));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("YENİ OYUN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 102, 0));
        jButton2.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("CIKIS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        button_resim_oyuncu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_resim_oyuncuActionPerformed(evt);
            }
        });

        button_oyna.setBackground(new java.awt.Color(0, 204, 204));
        button_oyna.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        button_oyna.setForeground(new java.awt.Color(255, 255, 255));
        button_oyna.setText("OYNA");
        button_oyna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_oynaActionPerformed(evt);
            }
        });

        label_durum.setBackground(new java.awt.Color(255, 255, 255));
        label_durum.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        label_durum.setForeground(new java.awt.Color(255, 51, 51));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Dayanıklılık:");

        secimAdiOyuncu.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        secimAdiOyuncu.setForeground(new java.awt.Color(204, 255, 204));
        secimAdiOyuncu.setText("Secim Oyuncu");
        secimAdiOyuncu.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                secimAdiOyuncuAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        secimAdiBilgisayar.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        secimAdiBilgisayar.setForeground(new java.awt.Color(204, 255, 204));
        secimAdiBilgisayar.setText("Secim Bilgisayar");

        secimDayOyuncu.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        secimDayOyuncu.setForeground(new java.awt.Color(255, 255, 255));
        secimDayOyuncu.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                secimDayOyuncuAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        SecimDayBilgisayar.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        SecimDayBilgisayar.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Dayanıklılık:");

        javax.swing.GroupLayout OyunAlaniLayout = new javax.swing.GroupLayout(OyunAlani);
        OyunAlani.setLayout(OyunAlaniLayout);
        OyunAlaniLayout.setHorizontalGroup(
            OyunAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OyunAlaniLayout.createSequentialGroup()
                .addGroup(OyunAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OyunAlaniLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(label_durum, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(OyunAlaniLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(secimDayOyuncu, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(OyunAlaniLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(secimAdiOyuncu, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(OyunAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OyunAlaniLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))
                    .addGroup(OyunAlaniLayout.createSequentialGroup()
                        .addGroup(OyunAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(OyunAlaniLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(OyunAlaniLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SecimDayBilgisayar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(OyunAlaniLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(secimAdiBilgisayar, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)))
                        .addGap(0, 63, Short.MAX_VALUE))))
            .addGroup(OyunAlaniLayout.createSequentialGroup()
                .addGroup(OyunAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OyunAlaniLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(OyunAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(OyunAlaniLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(289, 289, 289)
                                .addComponent(jLabel2))
                            .addGroup(OyunAlaniLayout.createSequentialGroup()
                                .addGroup(OyunAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(button_resim_oyuncu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(combobox_oyuncu, 0, 155, Short.MAX_VALUE))
                                .addGap(56, 56, 56)
                                .addComponent(button_oyna)
                                .addGap(63, 63, 63)
                                .addGroup(OyunAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(combobox_bilgisayar, 0, 160, Short.MAX_VALUE)
                                    .addComponent(button_resim_bilgisayar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(OyunAlaniLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        OyunAlaniLayout.setVerticalGroup(
            OyunAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OyunAlaniLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(OyunAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(OyunAlaniLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(combobox_bilgisayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(OyunAlaniLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(combobox_oyuncu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(OyunAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OyunAlaniLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(button_oyna))
                    .addGroup(OyunAlaniLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(button_resim_oyuncu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OyunAlaniLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(button_resim_bilgisayar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(OyunAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(OyunAlaniLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel7)
                        .addGap(142, 142, 142))
                    .addGroup(OyunAlaniLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(OyunAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(secimAdiOyuncu)
                            .addComponent(secimAdiBilgisayar))
                        .addGroup(OyunAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(OyunAlaniLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(OyunAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(secimDayOyuncu, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addGroup(OyunAlaniLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(OyunAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SecimDayBilgisayar, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(OyunAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(OyunAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1)
                                .addComponent(jButton2))
                            .addComponent(label_durum, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))))
        );

        sonuclar.setBackground(new java.awt.Color(102, 0, 0));
        sonuclar.setForeground(new java.awt.Color(102, 0, 0));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SONUCLAR");

        skorTablosu.setBackground(new java.awt.Color(51, 0, 0));
        skorTablosu.setForeground(new java.awt.Color(0, 0, 51));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("SKOR TABLOSU");

        oyuncu_adi.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        oyuncu_adi.setForeground(new java.awt.Color(255, 204, 204));
        oyuncu_adi.setText("Oyuncu:");
        oyuncu_adi.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                oyuncu_adiAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 204));
        jLabel6.setText("Bilgisayar:");

        oyuncu_skor.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        oyuncu_skor.setForeground(new java.awt.Color(255, 255, 255));
        oyuncu_skor.setText("0");

        bilgisayar_skor.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        bilgisayar_skor.setForeground(new java.awt.Color(255, 255, 255));
        bilgisayar_skor.setText("0");

        javax.swing.GroupLayout skorTablosuLayout = new javax.swing.GroupLayout(skorTablosu);
        skorTablosu.setLayout(skorTablosuLayout);
        skorTablosuLayout.setHorizontalGroup(
            skorTablosuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(skorTablosuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(skorTablosuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(skorTablosuLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(bilgisayar_skor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(skorTablosuLayout.createSequentialGroup()
                        .addComponent(oyuncu_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(oyuncu_skor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        skorTablosuLayout.setVerticalGroup(
            skorTablosuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(skorTablosuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(35, 35, 35)
                .addGroup(skorTablosuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oyuncu_adi)
                    .addComponent(oyuncu_skor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(skorTablosuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bilgisayar_skor)
                    .addComponent(jLabel6))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        durum_bildirimi.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        durum_bildirimi.setForeground(new java.awt.Color(255, 204, 204));
        durum_bildirimi.setText("Durum");

        durum_bildirimi1.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        durum_bildirimi1.setForeground(new java.awt.Color(255, 204, 204));
        durum_bildirimi1.setText("Durum");

        durum_bildirimi2.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        durum_bildirimi2.setForeground(new java.awt.Color(255, 204, 204));
        durum_bildirimi2.setText("Durum");

        durum_bildirimi3.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        durum_bildirimi3.setForeground(new java.awt.Color(255, 204, 204));
        durum_bildirimi3.setText("Durum");

        durum_bildirimi4.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        durum_bildirimi4.setForeground(new java.awt.Color(255, 204, 204));
        durum_bildirimi4.setText("Durum");

        javax.swing.GroupLayout sonuclarLayout = new javax.swing.GroupLayout(sonuclar);
        sonuclar.setLayout(sonuclarLayout);
        sonuclarLayout.setHorizontalGroup(
            sonuclarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(skorTablosu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sonuclarLayout.createSequentialGroup()
                .addContainerGap(186, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(167, 167, 167))
            .addGroup(sonuclarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(sonuclarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(durum_bildirimi1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(durum_bildirimi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(durum_bildirimi2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(sonuclarLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(sonuclarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(durum_bildirimi3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(durum_bildirimi4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        sonuclarLayout.setVerticalGroup(
            sonuclarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sonuclarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(durum_bildirimi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(durum_bildirimi1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(durum_bildirimi2)
                .addGap(7, 7, 7)
                .addComponent(durum_bildirimi3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(durum_bildirimi4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(skorTablosu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OyunAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sonuclar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OyunAlani, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sonuclar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0); 
    }//GEN-LAST:event_jButton2ActionPerformed
int i;
    private void combobox_oyuncuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox_oyuncuActionPerformed
             String kullanici_secim;
              kullanici_secim=combobox_oyuncu.getActionCommand();
              
              /*for(int i=0;i<5;i++){
                  if(combobox_oyuncu.getSelectedIndex()==i){
                      combobox_oyuncu.removeItemAt(i);
                  }
                  
                  
              }*/
                  
       
        
    }//GEN-LAST:event_combobox_oyuncuActionPerformed

    private void button_oynaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_oynaActionPerformed
countOyna++;
        skorTablosu.setVisible(true);
        sonuclar.setVisible(true);
        if("1.tas".equals(String.valueOf(combobox_oyuncu.getSelectedItem()))) 
button_resim_oyuncu.setIcon(new javax.swing.ImageIcon(getClass().getResource("taskagitmakas_resimler/newpackage/taş1.png")))  ;// TODO add your handling code here:
else if("2.tas".equals(String.valueOf(combobox_oyuncu.getSelectedItem()))) 
button_resim_oyuncu.setIcon(new javax.swing.ImageIcon(getClass().getResource("taskagitmakas_resimler/newpackage/tas2.png")))  ;
else if("kagit".equals(String.valueOf(combobox_oyuncu.getSelectedItem()))) 
button_resim_oyuncu.setIcon(new javax.swing.ImageIcon(getClass().getResource("taskagitmakas_resimler/newpackage/kagit.png")))  ;
else if("1.makas".equals(String.valueOf(combobox_oyuncu.getSelectedItem()))) 
button_resim_oyuncu.setIcon(new javax.swing.ImageIcon(getClass().getResource("taskagitmakas_resimler/newpackage/indir.png")))  ;
else if("2.makas".equals(String.valueOf(combobox_oyuncu.getSelectedItem()))) 
button_resim_oyuncu.setIcon(new javax.swing.ImageIcon(getClass().getResource("taskagitmakas_resimler/newpackage/makas2.png")))  ;
       
        bilgisayar= (int)(Math.random()*5);
        combobox_bilgisayar.setSelectedIndex(bilgisayar);
        if(bilgisayar==0)
            button_resim_bilgisayar.setIcon(new javax.swing.ImageIcon(getClass().getResource("taskagitmakas_resimler/newpackage/taş1.png")))  ;
        else if(bilgisayar==1)
            button_resim_bilgisayar.setIcon(new javax.swing.ImageIcon(getClass().getResource("taskagitmakas_resimler/newpackage/tas2.png")))  ;
         else if(bilgisayar==2)
            button_resim_bilgisayar.setIcon(new javax.swing.ImageIcon(getClass().getResource("taskagitmakas_resimler/newpackage/kagit.png")))  ;
         else if(bilgisayar==3)
            button_resim_bilgisayar.setIcon(new javax.swing.ImageIcon(getClass().getResource("taskagitmakas_resimler/newpackage/indir.png")))  ;
         else if(bilgisayar==4)
            button_resim_bilgisayar.setIcon(new javax.swing.ImageIcon(getClass().getResource("taskagitmakas_resimler/newpackage/makas2.png")))  ;
       if(combobox_oyuncu.getItemCount()==1){
                  combobox_oyuncu.addItem("1.tas");
                  combobox_oyuncu.addItem("2.tas");
                  combobox_oyuncu.addItem("kagit");
                  combobox_oyuncu.addItem("1.makas");
                  combobox_oyuncu.addItem("2.makas");
                  
        
       }
      
       secimAdiOyuncu.setText(NewJFrame2.adAl()+"'un secimi:"+combobox_oyuncu.getSelectedItem());
        secimAdiBilgisayar.setText("Bilgisayarın seçimi:"+combobox_bilgisayar.getSelectedItem());
        if(combobox_oyuncu.getSelectedIndex()==2)
        secimDayOyuncu.setText(""+Kagit.kagit_etkisi);
        
        kontrol();
        
         for(int i=0;i<5;i++){
                  if(combobox_oyuncu.getSelectedIndex()==i){
                      combobox_oyuncu.removeItemAt(i);
                  }
                  
                  
              }
    }//GEN-LAST:event_button_oynaActionPerformed
    
    public int kontrol(){
       for(i=0;i<5;i++){
    if(combobox_oyuncu.getSelectedIndex()==i)
        oyuncu=i;
    if(i==0) Nesne.nesneSec(0);
    if(i==1) Nesne.nesneSec(1);
    if(i==2) Nesne.nesneSec(2);
    if(i==3) Nesne.nesneSec(3);
    if(i==4) Nesne.nesneSec(4);


//combobox_oyuncu.getActionCommand(i);
       }
       
    if((bilgisayar==1 & oyuncu==1)||(oyuncu==2 & bilgisayar==2)||(oyuncu==3 && bilgisayar==3)||(oyuncu==4 & bilgisayar==4)||(oyuncu==0 & bilgisayar==0)||(oyuncu==0 & bilgisayar==1)||(oyuncu==1 & bilgisayar==0)||(oyuncu==4 & bilgisayar==3)||(oyuncu==3 & bilgisayar==4)){
    label_durum.setText("Karsılasma Berabere!");
    
    }
     if((oyuncu==0 & bilgisayar==4)||(oyuncu==0 & bilgisayar==3)||(oyuncu==1 & bilgisayar==4)||(oyuncu==1 & bilgisayar==3)||(oyuncu==2 & bilgisayar==0)||(oyuncu==2 & bilgisayar==1)||(oyuncu==3 & bilgisayar==2)||(oyuncu==4 & bilgisayar==2)){
    //oyuncu kazandı
         label_durum.setText(NewJFrame2.adAl()+" kazandı!");
    oyuncuSkor=oyuncuSkor+20;
    if(bilgisayar==2 || oyuncu==2 ){
        Kagit.kagitSeviye=Kagit.kagitSeviye+20;
        if(Kagit.kagitSeviye>30)
            durum_bildirimi.setText("Kağıt nesnesi seviye atladı.Artık Özel kağıt!!!");
        
            
    }
    if(bilgisayar==3 ||oyuncu==3||bilgisayar==4||oyuncu==4){//makas olma durumları
        if(bilgisayar==3 ||oyuncu==3){
            secimDayOyuncu.setText(""+Makas.makasEtkisi);
                Makas.makasSeviye=Makas.makasSeviye+20;
        if(Makas.makasSeviye>30){
            durum_bildirimi1.setText("1.Makas nesnesi seviye atladı.Artık Usta Makas!!!");
        }}
        else if(bilgisayar==4 ||oyuncu==4){
            secimDayOyuncu.setText(""+Makas.makasEtkisi);
            Makas.makasSeviye2=Makas.makasSeviye2+20;
        if(Makas.makasSeviye2>30){
            durum_bildirimi2.setText("2.Makas nesnesi seviye atladı.Artık Usta Makas!!!");
        }
        }
            
    }       
         if(bilgisayar==0|| oyuncu==0||bilgisayar==1||oyuncu==1){
        secimDayOyuncu.setText(""+Tas.tasEtkisi);
        if(bilgisayar==0|| oyuncu==0){
            Tas.tasSeviye=Tas.tasSeviye+20;
            if(Tas.tasSeviye>30)
                durum_bildirimi3.setText("1.Tas nesnesi seviye atladı.Artık Agir Tas!!!");
            
        }
        else if(bilgisayar==1|| oyuncu==1){
            Tas.tasSeviye2=Tas.tasSeviye2+20;
            if(Tas.tasSeviye2>30)
                durum_bildirimi4.setText("2.Tas nesnesi seviye atladı.Artık Agir Tas!!!");
            
        }

    }
    }
     if((bilgisayar==0 & oyuncu==4)||(bilgisayar==0 & oyuncu==3)||(bilgisayar==1 & oyuncu==4)||(bilgisayar==1 & oyuncu==3)||(bilgisayar==2 & oyuncu==0)||(bilgisayar==2 & oyuncu==1)||(bilgisayar==3 & oyuncu==2)||(bilgisayar==4 & oyuncu==2)){
           //bilgisayar kazandı
           
         if(bilgisayar==2 || oyuncu==2){//Kagit olma durumu
        Kagit.kagitSeviye=Kagit.kagitSeviye+20;
        if(Kagit.kagitSeviye>30)
            durum_bildirimi.setText("Kağıt nesnesi seviye atladı.Artık Özel kağıt!!!");}
         
            if(bilgisayar==3 ||oyuncu==3||bilgisayar==4||oyuncu==4){//makas olma durumları
        if(bilgisayar==3 ||oyuncu==3){
            secimDayOyuncu.setText(""+Makas.makasEtkisi);
                Makas.makasSeviye=Makas.makasSeviye+20;
        if(Makas.makasSeviye>30){
            durum_bildirimi1.setText("1.Makas nesnesi seviye atladı.Artık Usta Makas!!!");
        }}
        else if(bilgisayar==4 ||oyuncu==4){
            secimDayOyuncu.setText(""+Makas.makasEtkisi);
            Makas.makasSeviye2=Makas.makasSeviye2+20;
        if(Makas.makasSeviye2>30){
            durum_bildirimi2.setText("2.Makas nesnesi seviye atladı.Artık Usta Makas!!!");
        }
        }
            
    }       
         if(bilgisayar==0|| oyuncu==0||bilgisayar==1||oyuncu==1){
        secimDayOyuncu.setText(""+Tas.tasEtkisi);
        if(bilgisayar==0|| oyuncu==0){
            Tas.tasSeviye=Tas.tasSeviye+20;
            if(Tas.tasSeviye>30)
                durum_bildirimi3.setText("1.Tas nesnesi seviye atladı.Artık Agir Tas!!!");
            
        }
        else if(bilgisayar==1|| oyuncu==1){
            Tas.tasSeviye2=Tas.tasSeviye2+20;
            if(Tas.tasSeviye2>30)
                durum_bildirimi4.setText("2.Tas nesnesi seviye atladı.Artık Agir Tas!!!");
            
        }

    }
        label_durum.setText("bilgisayar kazandı!");
    bilgisayarSkor=bilgisayarSkor+20;}
     oyuncu_skor.setText(""+oyuncuSkor);
     bilgisayar_skor.setText(""+bilgisayarSkor);
     if(countOyna==10){
         if(oyuncuSkor>bilgisayarSkor){
             label_durum.setText("Oyun bitti "+NewJFrame2.adAl()+" kazandı!!!");
           
              combobox_bilgisayar.setSelectedIndex(-1);
        combobox_oyuncu.setSelectedIndex(-1);
        oyuncuSkor=0;
        bilgisayarSkor=0;
        button_resim_oyuncu.setIcon(new javax.swing.ImageIcon(getClass().getResource("taskagitmakas_resimler/newpackage/tas-kagit-makas.png")))  ;
        button_resim_bilgisayar.setIcon(new javax.swing.ImageIcon(getClass().getResource("taskagitmakas_resimler/newpackage/tas-kagit-makas.png")))  ;
            

                          
         }
         if(bilgisayarSkor>oyuncuSkor){
             label_durum.setText("Oyun bitti bilgisayar kazandı!!!");
             combobox_bilgisayar.setSelectedIndex(-1);
        combobox_oyuncu.setSelectedIndex(-1);
        oyuncuSkor=0;
        bilgisayarSkor=0;
        button_resim_oyuncu.setIcon(new javax.swing.ImageIcon(getClass().getResource("taskagitmakas_resimler/newpackage/tas-kagit-makas.png")))  ;
        button_resim_bilgisayar.setIcon(new javax.swing.ImageIcon(getClass().getResource("taskagitmakas_resimler/newpackage/tas-kagit-makas.png")))  ;
         }
     }
     return 0;
}
    private void button_resim_oyuncuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_resim_oyuncuActionPerformed

        
     
    }//GEN-LAST:event_button_resim_oyuncuActionPerformed

    private void combobox_oyuncuİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combobox_oyuncuİtemStateChanged

    }//GEN-LAST:event_combobox_oyuncuİtemStateChanged

    private void oyuncu_adiAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_oyuncu_adiAncestorAdded
        
    }//GEN-LAST:event_oyuncu_adiAncestorAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        combobox_bilgisayar.setSelectedIndex(-1);
        combobox_oyuncu.setSelectedIndex(-1);
        oyuncuSkor=0;
        bilgisayarSkor=0;
        button_resim_oyuncu.setIcon(new javax.swing.ImageIcon(getClass().getResource("taskagitmakas_resimler/newpackage/tas-kagit-makas.png")))  ;
        button_resim_bilgisayar.setIcon(new javax.swing.ImageIcon(getClass().getResource("taskagitmakas_resimler/newpackage/tas-kagit-makas.png")))  ;
               label_durum.setText("");

/* new NewJFrame1().setVisible(true);
        new NewJFrame4().setVisible(false);*/
    }//GEN-LAST:event_jButton1ActionPerformed

    private void secimAdiOyuncuAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_secimAdiOyuncuAncestorAdded
      

    }//GEN-LAST:event_secimAdiOyuncuAncestorAdded

    private void secimDayOyuncuAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_secimDayOyuncuAncestorAdded
        
    }//GEN-LAST:event_secimDayOyuncuAncestorAdded

    /**
     * @param args the command line arguments
     * 
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
            java.util.logging.Logger.getLogger(NewJFrame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel OyunAlani;
    private javax.swing.JLabel SecimDayBilgisayar;
    private javax.swing.JLabel bilgisayar_skor;
    private javax.swing.JButton button_oyna;
    private javax.swing.JButton button_resim_bilgisayar;
    private javax.swing.JButton button_resim_oyuncu;
    private javax.swing.JComboBox<String> combobox_bilgisayar;
    private javax.swing.JComboBox<String> combobox_oyuncu;
    private javax.swing.JLabel durum_bildirimi;
    private javax.swing.JLabel durum_bildirimi1;
    private javax.swing.JLabel durum_bildirimi2;
    private javax.swing.JLabel durum_bildirimi3;
    private javax.swing.JLabel durum_bildirimi4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel label_durum;
    private javax.swing.JLabel oyuncu_adi;
    private javax.swing.JLabel oyuncu_skor;
    private javax.swing.JLabel secimAdiBilgisayar;
    private javax.swing.JLabel secimAdiOyuncu;
    private javax.swing.JLabel secimDayOyuncu;
    private javax.swing.JPanel skorTablosu;
    private javax.swing.JPanel sonuclar;
    // End of variables declaration//GEN-END:variables
}
