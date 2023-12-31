
/**
 *
 * @author aslinurtopcu
 */
public class NewJFrame3 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame3
     */
    public NewJFrame3() {
        initComponents();
        button_resim_bilgisayar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("taskagitmakas_resimler/newpackage/tas-kagit-makas.png")))  ;
        button_resim_bilgisayar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("taskagitmakas_resimler/newpackage/tas-kagit-makas.png")))  ;   
// TODO add your handling code here:
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OyunAlani = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        combobox_bilgisayar1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        combobox_bilgisayar2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        button_resim_bilgisayar1 = new javax.swing.JButton();
        button_resim_bilgisayar2 = new javax.swing.JButton();
        button_oyna = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        label_durum = new javax.swing.JLabel();
        uyari_label = new javax.swing.JLabel();
        sonuclar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        skorTablosu = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        oyuncu_adi = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bilgisayar1_skor = new javax.swing.JLabel();
        bilgisayar2_skor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        OyunAlani.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("1. BİLGİSAYARIN SEÇİMİ");

        combobox_bilgisayar1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1.tas", "2.tas", "kagit", "1.makas", "2.makas" }));
        combobox_bilgisayar1.setSelectedIndex(-1);
        combobox_bilgisayar1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combobox_bilgisayar1İtemStateChanged(evt);
            }
        });
        combobox_bilgisayar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox_bilgisayar1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("2. BILGISAYARIN SECİMİ");

        combobox_bilgisayar2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1.tas", "2.tas", "kagit", "1.makas", "2.makas", " " }));
        combobox_bilgisayar2.setSelectedIndex(-1);
        combobox_bilgisayar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox_bilgisayar2ActionPerformed(evt);
            }
        });

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

        button_resim_bilgisayar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_resim_bilgisayar1ActionPerformed(evt);
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

        uyari_label.setText("Bilgisayarların seçim yapması için oyna butonuna basınız!");

        javax.swing.GroupLayout OyunAlaniLayout = new javax.swing.GroupLayout(OyunAlani);
        OyunAlani.setLayout(OyunAlaniLayout);
        OyunAlaniLayout.setHorizontalGroup(
            OyunAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OyunAlaniLayout.createSequentialGroup()
                .addGroup(OyunAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OyunAlaniLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(label_durum, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(OyunAlaniLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)))
                .addGroup(OyunAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(OyunAlaniLayout.createSequentialGroup()
                .addGroup(OyunAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OyunAlaniLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(OyunAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(OyunAlaniLayout.createSequentialGroup()
                                .addGroup(OyunAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(button_resim_bilgisayar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(combobox_bilgisayar1, 0, 155, Short.MAX_VALUE))
                                .addGap(49, 49, 49)
                                .addComponent(button_oyna))
                            .addComponent(jLabel1))
                        .addGap(70, 70, 70)
                        .addGroup(OyunAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(OyunAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(combobox_bilgisayar2, 0, 160, Short.MAX_VALUE)
                                .addComponent(button_resim_bilgisayar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(OyunAlaniLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(uyari_label)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        OyunAlaniLayout.setVerticalGroup(
            OyunAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OyunAlaniLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(OyunAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(OyunAlaniLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combobox_bilgisayar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(OyunAlaniLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combobox_bilgisayar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(OyunAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OyunAlaniLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(button_resim_bilgisayar2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(OyunAlaniLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(button_resim_bilgisayar1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(OyunAlaniLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(button_oyna)))
                .addGroup(OyunAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OyunAlaniLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel7))
                    .addGroup(OyunAlaniLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label_durum, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addComponent(uyari_label)
                .addGap(36, 36, 36)
                .addGroup(OyunAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(20, 20, 20))
        );

        sonuclar.setBackground(new java.awt.Color(102, 0, 0));
        sonuclar.setForeground(new java.awt.Color(102, 0, 0));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SONUCLAR");

        skorTablosu.setBackground(new java.awt.Color(51, 0, 0));
        skorTablosu.setForeground(new java.awt.Color(0, 0, 51));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("SKOR TABLOSU");

        oyuncu_adi.setForeground(new java.awt.Color(255, 204, 204));
        oyuncu_adi.setText("Bilgisayar 1:");
        oyuncu_adi.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                oyuncu_adiAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 204, 204));
        jLabel6.setText("Bilgisayar 2:");

        bilgisayar1_skor.setForeground(new java.awt.Color(255, 255, 255));
        bilgisayar1_skor.setText("0");

        bilgisayar2_skor.setForeground(new java.awt.Color(255, 255, 255));
        bilgisayar2_skor.setText("0");

        javax.swing.GroupLayout skorTablosuLayout = new javax.swing.GroupLayout(skorTablosu);
        skorTablosu.setLayout(skorTablosuLayout);
        skorTablosuLayout.setHorizontalGroup(
            skorTablosuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(skorTablosuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(skorTablosuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(skorTablosuLayout.createSequentialGroup()
                        .addGroup(skorTablosuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(oyuncu_adi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(skorTablosuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bilgisayar2_skor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bilgisayar1_skor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        skorTablosuLayout.setVerticalGroup(
            skorTablosuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(skorTablosuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(skorTablosuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oyuncu_adi)
                    .addComponent(bilgisayar1_skor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(skorTablosuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(bilgisayar2_skor))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout sonuclarLayout = new javax.swing.GroupLayout(sonuclar);
        sonuclar.setLayout(sonuclarLayout);
        sonuclarLayout.setHorizontalGroup(
            sonuclarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(skorTablosu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sonuclarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sonuclarLayout.setVerticalGroup(
            sonuclarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sonuclarLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(18, 18, 18)
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
    int bilgisayar1Skor=0,bilgisayar2Skor=0,bilgisayar1=0,bilgisayar2=0,oyuncuDay=0,bilgisayarDay=0;

    private void combobox_bilgisayar1İtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combobox_bilgisayar1İtemStateChanged
        if("1.tas".equals(String.valueOf(combobox_bilgisayar1.getSelectedItem())))
        button_resim_bilgisayar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("taskagitmakas_resimler/newpackage/taş1.png")))  ;// TODO add your handling code here:
        else if("2.tas".equals(String.valueOf(combobox_bilgisayar1.getSelectedItem())))
        button_resim_bilgisayar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("taskagitmakas_resimler/newpackage/tas2.png")))  ;
        else if("kagit".equals(String.valueOf(combobox_bilgisayar1.getSelectedItem())))
        button_resim_bilgisayar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("taskagitmakas_resimler/newpackage/kagit.png")))  ;
        else if("1.makas".equals(String.valueOf(combobox_bilgisayar1.getSelectedItem())))
        button_resim_bilgisayar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("taskagitmakas_resimler/newpackage/indir.png")))  ;
        else if("2.makas".equals(String.valueOf(combobox_bilgisayar1.getSelectedItem())))
        button_resim_bilgisayar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("taskagitmakas_resimler/newpackage/makas2.png")))  ;
    }//GEN-LAST:event_combobox_bilgisayar1İtemStateChanged

    private void combobox_bilgisayar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox_bilgisayar1ActionPerformed
       

    }//GEN-LAST:event_combobox_bilgisayar1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        combobox_bilgisayar2.setSelectedIndex(-1);
        combobox_bilgisayar1.setSelectedIndex(-1);
        bilgisayar1Skor=0;
        bilgisayar2Skor=0;
        /* new NewJFrame1().setVisible(true);
        new NewJFrame4().setVisible(false);*/
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void button_resim_bilgisayar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_resim_bilgisayar1ActionPerformed

    }//GEN-LAST:event_button_resim_bilgisayar1ActionPerformed

    private void button_oynaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_oynaActionPerformed
        skorTablosu.setVisible(true);
        sonuclar.setVisible(true);
        bilgisayar1= (int)(Math.random()*5);
        combobox_bilgisayar2.setSelectedIndex(bilgisayar1);
        if(bilgisayar1==0)
        button_resim_bilgisayar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("taskagitmakas_resimler/newpackage/taş1.png")))  ;
        else if(bilgisayar1==1)
        button_resim_bilgisayar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("taskagitmakas_resimler/newpackage/tas2.png")))  ;
        else if(bilgisayar1==2)
        button_resim_bilgisayar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("taskagitmakas_resimler/newpackage/kagit.png")))  ;
        else if(bilgisayar1==3)
        button_resim_bilgisayar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("taskagitmakas_resimler/newpackage/indir.png")))  ;
        else if(bilgisayar1==4)
        button_resim_bilgisayar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("taskagitmakas_resimler/newpackage/makas2.png")))  ;
        bilgisayar2= (int)(Math.random()*5);
        combobox_bilgisayar1.setSelectedIndex(bilgisayar2);
        if(bilgisayar2==0)
        button_resim_bilgisayar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("taskagitmakas_resimler/newpackage/taş1.png")))  ;
        else if(bilgisayar2==1)
        button_resim_bilgisayar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("taskagitmakas_resimler/newpackage/tas2.png")))  ;
        else if(bilgisayar2==2)
        button_resim_bilgisayar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("taskagitmakas_resimler/newpackage/kagit.png")))  ;
        else if(bilgisayar2==3)
        button_resim_bilgisayar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("taskagitmakas_resimler/newpackage/indir.png")))  ;
        else if(bilgisayar2==4)
        button_resim_bilgisayar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("taskagitmakas_resimler/newpackage/makas2.png")))  ;

        kontrol();
    }//GEN-LAST:event_button_oynaActionPerformed
public int kontrol(){
       
       
    if((bilgisayar1==1 & bilgisayar2==1)||(bilgisayar1==2 & bilgisayar2==2)||(bilgisayar1==3 && bilgisayar2==3)||(bilgisayar1==4 & bilgisayar2==4)||(bilgisayar1==0 & bilgisayar2==0)||(bilgisayar1==0 & bilgisayar2==1)||(bilgisayar1==1 & bilgisayar2==0)||(bilgisayar1==4 & bilgisayar2==3)||(bilgisayar1==3 & bilgisayar2==4))
    label_durum.setText("Karsılasma Berabere!");
    else if((bilgisayar1==0 & bilgisayar2==4)||(bilgisayar1==0 & bilgisayar2==3)||(bilgisayar1==1 & bilgisayar2==4)||(bilgisayar1==1 & bilgisayar2==3)||(bilgisayar1==2 & bilgisayar2==0)||(bilgisayar1==2 & bilgisayar2==1)||(bilgisayar1==3 & bilgisayar2==2)||(bilgisayar1==4 & bilgisayar2==2)){
    label_durum.setText("1. bilgisayar kazandı!");
    bilgisayar1Skor=bilgisayar1Skor+20;
    }
    else if((bilgisayar2==0 & bilgisayar1==4)||(bilgisayar2==0 & bilgisayar1==3)||(bilgisayar2==1 & bilgisayar1==4)||(bilgisayar2==1 & bilgisayar1==3)||(bilgisayar2==2 & bilgisayar1==0)||(bilgisayar2==2 & bilgisayar1==1)||(bilgisayar2==3 & bilgisayar1==2)||(bilgisayar2==4 & bilgisayar1==2)){
    label_durum.setText("2. bilgisayar kazandı!");
    bilgisayar2Skor=bilgisayar2Skor+20;}
    else if((bilgisayar1==0 & bilgisayar2==1)||(bilgisayar1==3 & bilgisayar2==4)||(bilgisayar1==4 & bilgisayar2==3)||(bilgisayar1==1 & bilgisayar2==0))
    label_durum.setText("Karşılaşma Berabere!");
     bilgisayar1_skor.setText(""+bilgisayar1Skor);
     bilgisayar2_skor.setText(""+bilgisayar2Skor);
     return 0;
}
    private void oyuncu_adiAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_oyuncu_adiAncestorAdded

    }//GEN-LAST:event_oyuncu_adiAncestorAdded

    private void combobox_bilgisayar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox_bilgisayar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combobox_bilgisayar2ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel OyunAlani;
    private javax.swing.JLabel bilgisayar1_skor;
    private javax.swing.JLabel bilgisayar2_skor;
    private javax.swing.JButton button_oyna;
    private javax.swing.JButton button_resim_bilgisayar1;
    private javax.swing.JButton button_resim_bilgisayar2;
    private javax.swing.JComboBox<String> combobox_bilgisayar1;
    private javax.swing.JComboBox<String> combobox_bilgisayar2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel label_durum;
    private javax.swing.JLabel oyuncu_adi;
    private javax.swing.JPanel skorTablosu;
    private javax.swing.JPanel sonuclar;
    private javax.swing.JLabel uyari_label;
    // End of variables declaration//GEN-END:variables
}
