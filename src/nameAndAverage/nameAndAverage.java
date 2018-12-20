/*
 * Peter Horne-Deus
 * nameAndAverage.java
 * this is a program that allows the user to pull in external names from a file and input their averages 
 * December 20,2018
 */
package nameAndAverage;

/**
 *
 * @author Peter
 */

//Importing elements 
import java.io.*;


public class nameAndAverage extends javax.swing.JFrame {
        
    
    
    /**
     * Creates new form nameAndAverage
     */
    public nameAndAverage() {
        initComponents();
    
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundJPnl = new javax.swing.JPanel();
        titleLbl = new javax.swing.JLabel();
        nameBtn = new javax.swing.JButton();
        averagesLbl = new javax.swing.JLabel();
        name4Lbl = new javax.swing.JLabel();
        name1Lbl = new javax.swing.JLabel();
        name2lbl = new javax.swing.JLabel();
        name3Lbl = new javax.swing.JLabel();
        averageBtn = new javax.swing.JButton();
        totalAverageLbl = new javax.swing.JLabel();
        score1TxtField = new javax.swing.JTextField();
        score4TxtField = new javax.swing.JTextField();
        score3TxtField = new javax.swing.JTextField();
        score2TxtField = new javax.swing.JTextField();
        namesLbl = new javax.swing.JLabel();
        scoreLbl = new javax.swing.JLabel();
        average4Lbl = new javax.swing.JLabel();
        average1Lbl = new javax.swing.JLabel();
        average2Lbl = new javax.swing.JLabel();
        average3Lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgroundJPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleLbl.setText("Names And Averages");
        backgroundJPnl.add(titleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        nameBtn.setText("Get Names");
        nameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameBtnActionPerformed(evt);
            }
        });
        backgroundJPnl.add(nameBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        averagesLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        averagesLbl.setText("Averages");
        backgroundJPnl.add(averagesLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, -1));

        name4Lbl.setText("-----------");
        backgroundJPnl.add(name4Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        name1Lbl.setText("-----------");
        backgroundJPnl.add(name1Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        name2lbl.setText("-----------");
        backgroundJPnl.add(name2lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        name3Lbl.setText("-----------");
        backgroundJPnl.add(name3Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        averageBtn.setText("Calculate Average");
        averageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                averageBtnActionPerformed(evt);
            }
        });
        backgroundJPnl.add(averageBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));

        totalAverageLbl.setText("Total Average:  ");
        backgroundJPnl.add(totalAverageLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, -1));
        backgroundJPnl.add(score1TxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 70, -1));
        backgroundJPnl.add(score4TxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 70, -1));
        backgroundJPnl.add(score3TxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 70, -1));
        backgroundJPnl.add(score2TxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 70, -1));

        namesLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        namesLbl.setText("Names:");
        backgroundJPnl.add(namesLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        scoreLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        scoreLbl.setText("Score out of 100");
        backgroundJPnl.add(scoreLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        average4Lbl.setText("...");
        backgroundJPnl.add(average4Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, -1));

        average1Lbl.setText("...");
        backgroundJPnl.add(average1Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        average2Lbl.setText("...");
        backgroundJPnl.add(average2Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));

        average3Lbl.setText("...");
        backgroundJPnl.add(average3Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundJPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundJPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Brings in the names from external file
     * @param evt 
     * @return names
     */
    private void nameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameBtnActionPerformed
        //Creating file and file reader
        File dataFile = new File("scores.dat");
        FileReader in;
        BufferedReader readFile;
        
        //Creating varible
        int counter = 0; //A counter to keep track of certain elements
        
        //Creating an array
        String[] names = new String[10]; //A parralell array to hold the names
        
        //Try and catch statments retaining code
        try{
            //Setting the file reader to varaibles
            in = new FileReader(dataFile);
            readFile = new BufferedReader(in);
            
            //Gets the names from the external file and sets them to labels
            while ((names[counter] = readFile.readLine()) != null){
                
                if (counter == 0){
                    name1Lbl.setText(names[counter]);
                }
                else if (counter == 1){
                    name2lbl.setText(names[counter]);
                }
                else if (counter == 2){
                    name3Lbl.setText(names[counter]);
                }
                else{
                    name4Lbl.setText(names[counter]);
                }
                counter ++;
            }
            //Closees the file reader
            readFile.close();
            in.close();
        }
        //Catch statements 
        catch (FileNotFoundException e) {
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());
        } 
        catch (IOException e) {
			System.out.println("Problem reading file.");
                        System.err.println("IOException: " + e.getMessage());
    	}
    }//GEN-LAST:event_nameBtnActionPerformed

    /**
     * Caclualtes the user given inputs
     * @param evt 
     * @return the total average from all users
     */
    private void averageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_averageBtnActionPerformed
        //Creating Variables and arrays
        int[] average = new int[10];
        int counter = 0;
        double total = 0;
        
        //Try and catch holding code
        try{
        //A loop to set the user inputed averages to variables and get a total average
        while(counter < 5){
            
            if (counter == 0 ){
                if ((average[counter] = Integer.parseInt(score1TxtField.getText())) > 100 || average[counter] < 0){
                    throw new Exception ("The average cannot be greater than 100");
                } 
                else {
                average1Lbl.setText(String.valueOf(average[counter]) + "%");
                total = average[counter];
                }
            }
            else if (counter == 1){
                if ((average[counter] = Integer.parseInt(score2TxtField.getText())) > 100 || average[counter] < 0){ 
                    throw new Exception ("The average cannot be greater than 100");
                }
                else {
                average2Lbl.setText(String.valueOf(average[counter]) + "%");
                total = total + average[counter];
                }
                }
            else if (counter == 2){
                if ((average[counter] = Integer.parseInt(score3TxtField.getText())) > 100 || average[counter] < 0){
                    throw new Exception ("The average cannot be greater than 100");
                } 
                else {
                average3Lbl.setText(String.valueOf(average[counter]) + "%");
                total = total + average[counter];
                }
                }
            else if (counter == 3){
                if ((average[counter] = Integer.parseInt(score4TxtField.getText())) > 100 || average[counter] < 0){
                    throw new Exception ("The average cannot be greater than 100 or less than 0");
                }
                else{
                average4Lbl.setText(String.valueOf(average[counter] + "%"));
                total = total + average[counter];
                }
                } 
            else{
                total = total / 40;
                total = total * 10;
                totalAverageLbl.setText("Total Average: " + String.valueOf(total) + "%");
            }
            counter ++;
        }
        }
        
        catch (NumberFormatException nfe){
            System.err.println("You must use Ints");
            System.err.println("Exception: " + nfe); 
            }
        catch (Exception e){
            System.err.println("Must enter number under 100");
            System.err.println("Exception: " + e); 
        }
             
    }//GEN-LAST:event_averageBtnActionPerformed

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
    private javax.swing.JLabel averagesLbl;
    private javax.swing.JPanel backgroundJPnl;
    private javax.swing.JLabel name1Lbl;
    private javax.swing.JLabel name2lbl;
    private javax.swing.JLabel name3Lbl;
    private javax.swing.JLabel name4Lbl;
    private javax.swing.JButton nameBtn;
    private javax.swing.JLabel namesLbl;
    private javax.swing.JTextField score1TxtField;
    private javax.swing.JTextField score2TxtField;
    private javax.swing.JTextField score3TxtField;
    private javax.swing.JTextField score4TxtField;
    private javax.swing.JLabel scoreLbl;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JLabel totalAverageLbl;
    // End of variables declaration//GEN-END:variables
}
