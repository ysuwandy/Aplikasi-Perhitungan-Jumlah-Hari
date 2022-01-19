import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class NewJFrame extends javax.swing.JFrame {


    public NewJFrame() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbJumlah = new javax.swing.JLabel();
        btHapus = new javax.swing.JButton();
        btHitung = new javax.swing.JButton();
        btSimpan = new javax.swing.JButton();
        btKeluar = new javax.swing.JButton();
        fldTahun = new javax.swing.JTextField();
        cmbBulan = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("PENGHITUNG JUMLAH HARI");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Tahun");
        jLabel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jLabel2KeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Bulan");

        lbJumlah.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbJumlah.setText("Jumlah Haari Adalah :");

        btHapus.setText("HAPUS");
        btHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHapusActionPerformed(evt);
            }
        });

        btHitung.setText("HITUNG");
        btHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHitungActionPerformed(evt);
            }
        });

        btSimpan.setText("SIMPAN");
        btSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSimpanActionPerformed(evt);
            }
        });

        btKeluar.setText("KELUAR");
        btKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKeluarActionPerformed(evt);
            }
        });

        cmbBulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3))
                    .addComponent(lbJumlah)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btHitung)
                        .addGap(18, 18, 18)
                        .addComponent(btSimpan)
                        .addGap(18, 18, 18)
                        .addComponent(btHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btKeluar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fldTahun)
                    .addComponent(cmbBulan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(240, 240, 240))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fldTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbBulan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(lbJumlah)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btHitung)
                    .addComponent(btSimpan)
                    .addComponent(btHapus)
                    .addComponent(btKeluar))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusActionPerformed
        lbJumlah.setText("Jumlah Hari Adalah");
        fldTahun.setText("");
        cmbBulan.setSelectedItem("Januari");
    }//GEN-LAST:event_btHapusActionPerformed

    private void btHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHitungActionPerformed
            if(fldTahun.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Error : isian tahun kososng!",
                    "Error:isian tahun kosong!",JOptionPane.WARNING_MESSAGE);
        }
            else{
            int tahun = Integer.parseInt(fldTahun.getText());
            int jumlahHari;
            if(cmbBulan.getSelectedItem().equals("Februari")){
                if (((tahun % 4== 0)&&!(tahun % 100 == 0))||(tahun % 400 == 0))
                    jumlahHari=29;
                else jumlahHari=28;
            }else if(cmbBulan.getSelectedItem().equals("April")||
                     cmbBulan.getSelectedItem().equals("Juni")||
                     cmbBulan.getSelectedItem().equals("September")||
                    cmbBulan.getSelectedItem().equals("November")){
                     jumlahHari=30;
        }
            else{
    jumlahHari=31;
        }
         lbJumlah.setText("Jumlah Hari Pada Bulan "+
                cmbBulan.getSelectedItem()+
                 " Tahun "+tahun+" adalah "+jumlahHari);
         }
    }//GEN-LAST:event_btHitungActionPerformed

    private void btSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSimpanActionPerformed
        // TODO add your handling code here
        try{
            try (BufferedWriter out = new BufferedWriter(new FileWriter("jumlah hari.txt"))) {
                out.write(lbJumlah.getText());
                JOptionPane.showMessageDialog(null,"Berhasil disimpan dalam file");
            }
        }catch(IOException | HeadlessException e){
            System.err.println("Error :"+e.getMessage());
        }
    }//GEN-LAST:event_btSimpanActionPerformed

    private void btKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKeluarActionPerformed
        // TODO add your handling code here:
 System.exit(0);
    }//GEN-LAST:event_btKeluarActionPerformed

    private void jLabel2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel2KeyTyped
        // TODO add your handling code here:har 
        char c =evt.getKeyChar();
        if (!((Character.isDigit(c)||(c== KeyEvent.VK_BACK_SPACE)||(c == KeyEvent.VK_DELETE))
                )){
            getToolkit().beep();
            JOptionPane.showMessageDialog(null,"Masukan hanya bilangan angka !");
         
            evt.consume();
        }
    }//GEN-LAST:event_jLabel2KeyTyped

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btHapus;
    private javax.swing.JButton btHitung;
    private javax.swing.JButton btKeluar;
    private javax.swing.JButton btSimpan;
    private javax.swing.JComboBox<String> cmbBulan;
    private javax.swing.JTextField fldTahun;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbJumlah;
    // End of variables declaration//GEN-END:variables
}
