/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nameAndAverage;

/**
 *
 * @author Peter
 */

import java.io.*;
public class nameAndAverage extends javax.swing.JFrame {

    /**
     * Creates new form nameAndAverage
     */
    public nameAndAverage() {
        initComponents();
    }

    File dataFile = new File("names.dat");
    FileWriter out;
    BufferedWriter writeFile;
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titleLbl = new javax.swing.JLabel();
        nameBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        name4Lbl = new javax.swing.JLabel();
        name1Lbl = new javax.swing.JLabel();
        name2lbl = new javax.swing.JLabel();
        name3Lbl = new javax.swing.JLabel();
        averageBtn = new javax.swing.JButton();
        totalAverageLbl = new javax.swing.JLabel();
        score1Lbl = new javax.swing.JTextField();
        score4Lbl = new javax.swing.JTextField();
        score3Lbl = new javax.swing.JTextField();
        score2Lbl = new javax.swing.JTextField();
        namesLbl = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        average4Lbl = new javax.swing.JLabel();
        average1Lbl = new javax.swing.JLabel();
        average2Lbl = new javax.swing.JLabel();
        average3Lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleLbl.setText("Names And Averages");
        jPanel1.add(titleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        nameBtn.setText("Get Names");
        jPanel1.add(nameBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Averages");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, -1));

        name4Lbl.setText("-----------");
        jPanel1.add(name4Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        name1Lbl.setText("-----------");
        jPanel1.add(name1Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        name2lbl.setText("-----------");
        jPanel1.add(name2lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        name3Lbl.setText("-----------");
        jPanel1.add(name3Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        averageBtn.setText("Calculate Average");
        jPanel1.add(averageBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));

        totalAverageLbl.setText("Total Average:  ");
        jPanel1.add(totalAverageLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, -1));
        jPanel1.add(score1Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 70, -1));
        jPanel1.add(score4Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 70, -1));
        jPanel1.add(score3Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 70, -1));
        jPanel1.add(score2Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 70, -1));

        namesLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        namesLbl.setText("Names:");
        jPanel1.add(namesLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Score out of 100");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        average4Lbl.setText("...");
        jPanel1.add(average4Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, -1));

        average1Lbl.setText("...");
        jPanel1.add(average1Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        average2Lbl.setText("...");
        jPanel1.add(average2Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));

        average3Lbl.setText("...");
        jPanel1.add(average3Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, -1));

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
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(nameAndAverage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nameAndAverage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nameAndAverage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nameAndAverage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nameAndAverage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel average1Lbl;
    private javax.swing.JLabel average2Lbl;
    private javax.swing.JLabel average3Lbl;
    private javax.swing.JLabel average4Lbl;
    private javax.swing.JButton averageBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name1Lbl;
    private javax.swing.JLabel name2lbl;
    private javax.swing.JLabel name3Lbl;
    private javax.swing.JLabel name4Lbl;
    private javax.swing.JButton nameBtn;
    private javax.swing.JLabel namesLbl;
    private javax.swing.JTextField score1Lbl;
    private javax.swing.JTextField score2Lbl;
    private javax.swing.JTextField score3Lbl;
    private javax.swing.JTextField score4Lbl;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JLabel totalAverageLbl;
    // End of variables declaration//GEN-END:variables
}
