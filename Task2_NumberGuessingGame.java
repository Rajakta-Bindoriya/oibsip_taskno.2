
package OIBSIP;

import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Rajakta Bindoriya:)
 */

public class Task2_NumberGuessingGame extends javax.swing.JFrame 
{
    private int randomNumber;
    
    int score=0;
    int attempts=0;

    /**
     * Creates new form NumberGuessingGame
     */
    public Task2_NumberGuessingGame() 
    {
        
        initComponents();
        
        Random random = new Random();
        randomNumber = random.nextInt(100)+1;
        System.out.println(randomNumber);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        guessField = new javax.swing.JTextField();
        guessButtonListener = new javax.swing.JButton();
        resultField = new javax.swing.JLabel();
        hintField = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        totalAttempts = new javax.swing.JLabel();
        scoreCount = new javax.swing.JLabel();
        playAgain = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("Guess the Number between(1-100)");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 430, 70));

        guessField.setBackground(new java.awt.Color(204, 204, 204));
        guessField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        guessField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(guessField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 70, 50));

        guessButtonListener.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        guessButtonListener.setText("Guess");
        guessButtonListener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessButtonListenerActionPerformed(evt);
            }
        });
        jPanel2.add(guessButtonListener, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 130, 50));

        resultField.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        resultField.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultField.setText("       Take a Guess");
        jPanel2.add(resultField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 610, 40));

        hintField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        hintField.setForeground(new java.awt.Color(204, 204, 204));
        hintField.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(hintField, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 180, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 153, 255));
        jLabel2.setText("Enter no. here");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 90, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Score:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 80, 50));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Total Attempts :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        totalAttempts.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        totalAttempts.setForeground(new java.awt.Color(255, 255, 255));
        totalAttempts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalAttempts.setText("0");
        jPanel2.add(totalAttempts, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 40, 40));

        scoreCount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        scoreCount.setForeground(new java.awt.Color(255, 255, 255));
        scoreCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreCount.setText("0000");
        jPanel2.add(scoreCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 60, 30));

        playAgain.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        playAgain.setText("Play Again");
        playAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playAgainActionPerformed(evt);
            }
        });
        jPanel2.add(playAgain, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 460, 160, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OIBSIP/'.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 960, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void guessButtonListenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessButtonListenerActionPerformed
    
    
        try
        {   
            int guess = Integer.parseInt(guessField.getText());

            attempts++;
            
            if(guess==randomNumber)
            {
                resultField.setText("Congratulations!You guessed it Right :)");
                hintField.setText("");
                guessButtonListener.setVisible(false);
                score++;
                
            }
            else if(guess<randomNumber)
            {
                resultField.setText("Try a higher number.");
                showHint(guess,randomNumber);
                guessField.requestFocus();
            }
            else if(guess>randomNumber)
            {
                resultField.setText("Try a lower number.");
                showHint(guess,randomNumber);
                guessField.requestFocus();

            }

            //To clear the text field after each guess. 
            guessField.setText("");

            //To set focus back to the text field.

            scoreCount.setText(String.valueOf(score));

            totalAttempts.setText(String.valueOf(attempts));
            
        }
        catch(NumberFormatException e)
        {
            resultField.setText("Invalid input. Please enter a valid input.");
            hintField.setText("");
            
        }
    
        
    
    }//GEN-LAST:event_guessButtonListenerActionPerformed

    private void playAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playAgainActionPerformed
            
        guessButtonListener.setVisible(true);
        resultField.setText("Take Guess");
        initComponents();
        
        guessField.setText("");
        hintField.setText("");
        guessField.requestFocus();
        
      

        Random random = new Random();
        randomNumber = random.nextInt(100)+1;
        System.out.println(randomNumber);

    }//GEN-LAST:event_playAgainActionPerformed

        //code for hintField
        private void showHint(int guess, int target)
        {
            int difference = Math.abs(target-guess);
            if(difference>=50)
            {
                hintField.setText("You are very far away");
            }
            else if(difference >=20)
            {
                hintField.setText("You are far away");
            }
            else if(difference>=10)
            {
                hintField.setText("You are getting closer");
            }
            else
            {
                hintField.setText("You are very close");
            }
            
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
            java.util.logging.Logger.getLogger(Task2_NumberGuessingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Task2_NumberGuessingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Task2_NumberGuessingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Task2_NumberGuessingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Task2_NumberGuessingGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton guessButtonListener;
    private javax.swing.JTextField guessField;
    private javax.swing.JLabel hintField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton playAgain;
    private javax.swing.JLabel resultField;
    private javax.swing.JLabel scoreCount;
    private javax.swing.JLabel totalAttempts;
    // End of variables declaration//GEN-END:variables
}
