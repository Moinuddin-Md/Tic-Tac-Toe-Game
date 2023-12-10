
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author MD MOINUDDIN
 */
public class TIC_TAC_TOE_GAME extends javax.swing.JFrame {
    
    
    private String startGame = "x";
    private int xCount = 0;
    private int oCount = 0;
    
    /**
     * Creates new form TIC_TAC_TOE_GAME
     */
    public TIC_TAC_TOE_GAME() {
        initComponents();
    }
    
    private void gameScore()
    {
        playerxxx.setText(String.valueOf(xCount));
        playerooo.setText(String.valueOf(oCount));
    }
    
    private void choose_a_Player()
    {
        if(startGame.equalsIgnoreCase("x"))
        {
            startGame = "o";
        }
        else
        {
            startGame = "x";
        }
    }
    
    private void winningGame()
    {
        String b1 = txtbtn1.getText();
        String b2 = txtbtn2.getText();
        String b3 = txtbtn3.getText();
        String b4 = txtbtn4.getText();
        String b5 = txtbtn5.getText();
        String b6 = txtbtn6.getText();
        String b7 = txtbtn7.getText();
        String b8 = txtbtn8.getText();
        String b9 = txtbtn9.getText();
        
        
        // PLAYER X CODING
        
        if(b1 == ("x") && b2 == ("x") && b3 == ("x"))
        {
            JOptionPane.showMessageDialog(this, "Player x win", "Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            txtbtn1.setBackground(Color.GREEN);
            txtbtn2.setBackground(Color.GREEN);
            txtbtn3.setBackground(Color.GREEN);           
            
        }
        else if(b1 == ("o") && b2 == ("o") && b3 == ("o"))
        {
            JOptionPane.showMessageDialog(this, "Player o win", "Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            txtbtn1.setBackground(Color.GREEN);
            txtbtn2.setBackground(Color.GREEN);
            txtbtn3.setBackground(Color.GREEN);           
            
        }
        if(b4 == ("x") && b5 == ("x") && b6 == ("x"))
        {
            JOptionPane.showMessageDialog(this, "Player x win", "Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            txtbtn4.setBackground(Color.GREEN);
            txtbtn5.setBackground(Color.GREEN);
            txtbtn6.setBackground(Color.GREEN);           
            
        }
        else if(b4 == ("o") && b5 == ("o") && b6 == ("o"))
        {
            JOptionPane.showMessageDialog(this, "Player o win", "Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            txtbtn4.setBackground(Color.GREEN);
            txtbtn5.setBackground(Color.GREEN);
            txtbtn6.setBackground(Color.GREEN);           
            
        }
         if(b7 == ("x") && b8 == ("x") && b9 == ("x"))
        {
            JOptionPane.showMessageDialog(this, "Player x win", "Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            txtbtn7.setBackground(Color.GREEN);
            txtbtn8.setBackground(Color.GREEN);
            txtbtn9.setBackground(Color.GREEN);           
            
        }
         else if(b7 == ("o") && b8 == ("o") && b9 == ("o"))
        {
            JOptionPane.showMessageDialog(this, "Player o win", "Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            txtbtn7.setBackground(Color.GREEN);
            txtbtn8.setBackground(Color.GREEN);
            txtbtn9.setBackground(Color.GREEN);           
            
        }
          if(b1 == ("x") && b4 == ("x") && b7 == ("x"))
        {
            JOptionPane.showMessageDialog(this, "Player x win", "Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            txtbtn1.setBackground(Color.GREEN);
            txtbtn4.setBackground(Color.GREEN);
            txtbtn7.setBackground(Color.GREEN);           
            
        }
          else if(b1 == ("o") && b4 == ("o") && b7 == ("o"))
        {
            JOptionPane.showMessageDialog(this, "Player o win", "Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            txtbtn1.setBackground(Color.GREEN);
            txtbtn4.setBackground(Color.GREEN);
            txtbtn7.setBackground(Color.GREEN);           
            
        }
           if(b2 == ("x") && b5 == ("x") && b8 == ("x"))
        {
            JOptionPane.showMessageDialog(this, "Player x win", "Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            txtbtn2.setBackground(Color.GREEN);
            txtbtn5.setBackground(Color.GREEN);
            txtbtn8.setBackground(Color.GREEN);           
            
        }
           else if(b2 == ("o") && b5 == ("o") && b8 == ("o"))
        {
            JOptionPane.showMessageDialog(this, "Player o win", "Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            txtbtn2.setBackground(Color.GREEN);
            txtbtn5.setBackground(Color.GREEN);
            txtbtn8.setBackground(Color.GREEN);           
            
        }
        if(b3 == ("x") && b6 == ("x") && b9 == ("x"))
        {
            JOptionPane.showMessageDialog(this, "Player x win", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            txtbtn3.setBackground(Color.GREEN);
            txtbtn6.setBackground(Color.GREEN);
            txtbtn9.setBackground(Color.GREEN);           
            
        }
        else if(b3 == ("o") && b6 == ("o") && b9 == ("o"))
        {
            JOptionPane.showMessageDialog(this, "Player o win", "Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            txtbtn3.setBackground(Color.GREEN);
            txtbtn6.setBackground(Color.GREEN);
            txtbtn9.setBackground(Color.GREEN);           
            
        }
        
        if(b1 == ("x") && b5 == ("x") && b9 == ("x"))
        {
            JOptionPane.showMessageDialog(this, "Player x win", "Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            txtbtn1.setBackground(Color.GREEN);
            txtbtn5.setBackground(Color.GREEN);
            txtbtn9.setBackground(Color.GREEN);           
            
        }
        else if(b1 == ("o") && b5 == ("o") && b9 == ("o"))
        {
            JOptionPane.showMessageDialog(this, "Player o win", "Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            txtbtn1.setBackground(Color.GREEN);
            txtbtn5.setBackground(Color.GREEN);
            txtbtn9.setBackground(Color.GREEN);           
            
        }
        if(b3 == ("x") && b5 == ("x") && b7 == ("x"))
        {
            JOptionPane.showMessageDialog(this, "Player x win", "Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            txtbtn3.setBackground(Color.GREEN);
            txtbtn5.setBackground(Color.GREEN);
            txtbtn7.setBackground(Color.GREEN);           
            
        }
        else if(b3 == ("o") && b5 == ("o") && b7 == ("o"))
        {
            JOptionPane.showMessageDialog(this, "Player o win", "Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            txtbtn3.setBackground(Color.GREEN);
            txtbtn5.setBackground(Color.GREEN);
            txtbtn7.setBackground(Color.GREEN);           
            
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtbtn6 = new javax.swing.JButton();
        txtbtn5 = new javax.swing.JButton();
        txtbtn4 = new javax.swing.JButton();
        txtbtn9 = new javax.swing.JButton();
        txtbtn8 = new javax.swing.JButton();
        txtbtn7 = new javax.swing.JButton();
        txtbtnreset = new javax.swing.JButton();
        txtbtnexit = new javax.swing.JButton();
        txtbtn3 = new javax.swing.JButton();
        txtbtn2 = new javax.swing.JButton();
        txtbtn1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        playerxxx = new javax.swing.JLabel();
        playero = new javax.swing.JLabel();
        playerx = new javax.swing.JLabel();
        playerooo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE GAME");
        setBackground(new java.awt.Color(0, 0, 204));
        setForeground(java.awt.Color.white);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 0, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TIC TAC TOE ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        txtbtn6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn6ActionPerformed(evt);
            }
        });

        txtbtn5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn5ActionPerformed(evt);
            }
        });

        txtbtn4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn4ActionPerformed(evt);
            }
        });

        txtbtn9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn9ActionPerformed(evt);
            }
        });

        txtbtn8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn8ActionPerformed(evt);
            }
        });

        txtbtn7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn7ActionPerformed(evt);
            }
        });

        txtbtnreset.setBackground(new java.awt.Color(0, 204, 0));
        txtbtnreset.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtbtnreset.setText("RESET");
        txtbtnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtnresetActionPerformed(evt);
            }
        });

        txtbtnexit.setBackground(new java.awt.Color(204, 0, 0));
        txtbtnexit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtbtnexit.setText("EXIT");
        txtbtnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtnexitActionPerformed(evt);
            }
        });

        txtbtn3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn3ActionPerformed(evt);
            }
        });

        txtbtn2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn2ActionPerformed(evt);
            }
        });

        txtbtn1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.darkGray));

        playerxxx.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        playerxxx.setForeground(new java.awt.Color(0, 0, 255));
        playerxxx.setText("xxxxxxxxxxxx");

        playero.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        playero.setText("Player O :");

        playerx.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        playerx.setText("Player X :");

        playerooo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        playerooo.setForeground(new java.awt.Color(0, 0, 255));
        playerooo.setText("xxxxxxxxxxxx");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playero, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerx, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerooo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerxxx, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerxxx, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerx))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playero)
                    .addComponent(playerooo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(txtbtnreset)
                                .addGap(38, 38, 38)
                                .addComponent(txtbtnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtbtnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("TIC TAC TOE ");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtbtnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtnexitActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame, "confirm if you want to exit",
                "Tic Tac Toe", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
        
    }//GEN-LAST:event_txtbtnexitActionPerformed

    private void txtbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn1ActionPerformed
        // TODO add your handling code here:
        
        txtbtn1.setText(startGame);
        if(startGame.equalsIgnoreCase("x"))
        {
            txtbtn1.setForeground(Color.RED);
        }
        else
        {
            txtbtn1.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        winningGame();
       
        
        
    }//GEN-LAST:event_txtbtn1ActionPerformed

    private void txtbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn2ActionPerformed
        // TODO add your handling code here:
        txtbtn2.setText(startGame);
        if(startGame.equalsIgnoreCase("x"))
        {
            txtbtn2.setForeground(Color.RED);
        }
        else
        {
            txtbtn2.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_txtbtn2ActionPerformed

    private void txtbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn3ActionPerformed
        // TODO add your handling code here:
         txtbtn3.setText(startGame);
        if(startGame.equalsIgnoreCase("x"))
        {
            txtbtn3.setForeground(Color.RED);
        }
        else
        {
            txtbtn3.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_txtbtn3ActionPerformed

    private void txtbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn4ActionPerformed
     txtbtn4.setText(startGame);
        if(startGame.equalsIgnoreCase("x"))
        {
            txtbtn4.setForeground(Color.RED);
        }
        else
        {
            txtbtn4.setForeground(Color.MAGENTA);
        }
        choose_a_Player();  
        winningGame();
// TODO add your handling code here:
    }//GEN-LAST:event_txtbtn4ActionPerformed

    private void txtbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn5ActionPerformed
 txtbtn5.setText(startGame);
        if(startGame.equalsIgnoreCase("x"))
        {
            txtbtn5.setForeground(Color.RED);
        }
        else
        {
            txtbtn5.setForeground(Color.MAGENTA);
        }
        choose_a_Player(); 
        winningGame();
// TODO add your handling code here:
    }//GEN-LAST:event_txtbtn5ActionPerformed

    private void txtbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn6ActionPerformed
 txtbtn6.setText(startGame);
        if(startGame.equalsIgnoreCase("x"))
        {
            txtbtn6.setForeground(Color.RED);
        }
        else
        {
            txtbtn6.setForeground(Color.MAGENTA);
        }
        choose_a_Player(); 
        winningGame();
// TODO add your handling code here:
    }//GEN-LAST:event_txtbtn6ActionPerformed

    private void txtbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn7ActionPerformed
 txtbtn7.setText(startGame);
        if(startGame.equalsIgnoreCase("x"))
        {
            txtbtn7.setForeground(Color.RED);
        }
        else
        {
            txtbtn7.setForeground(Color.MAGENTA);
        }
        choose_a_Player(); 
        winningGame();
// TODO add your handling code here:
    }//GEN-LAST:event_txtbtn7ActionPerformed

    private void txtbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn8ActionPerformed
 txtbtn8.setText(startGame);
        if(startGame.equalsIgnoreCase("x"))
        {
            txtbtn8.setForeground(Color.RED);
        }
        else
        {
            txtbtn8.setForeground(Color.MAGENTA);
        }
        choose_a_Player(); 
        winningGame();
// TODO add your handling code here:
    }//GEN-LAST:event_txtbtn8ActionPerformed

    private void txtbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn9ActionPerformed
 txtbtn9.setText(startGame);
        if(startGame.equalsIgnoreCase("x"))
        {
            txtbtn9.setForeground(Color.RED);
        }
        else
        {
            txtbtn9.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
winningGame();
// TODO add your handling code here:
    }//GEN-LAST:event_txtbtn9ActionPerformed

    private void txtbtnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtnresetActionPerformed
        // TODO add your handling code here:
        txtbtn1.setText(null);
        txtbtn2.setText(null);
        txtbtn3.setText(null);
        txtbtn4.setText(null);
        txtbtn5.setText(null);
        txtbtn6.setText(null);
        txtbtn7.setText(null);
        txtbtn8.setText(null);
        txtbtn9.setText(null);
        
        txtbtn1.setBackground(Color.LIGHT_GRAY);
        txtbtn2.setBackground(Color.LIGHT_GRAY);
        txtbtn3.setBackground(Color.LIGHT_GRAY);
        txtbtn4.setBackground(Color.LIGHT_GRAY);
        txtbtn5.setBackground(Color.LIGHT_GRAY);
        txtbtn6.setBackground(Color.LIGHT_GRAY);
        txtbtn7.setBackground(Color.LIGHT_GRAY);
        txtbtn8.setBackground(Color.LIGHT_GRAY);
        txtbtn9.setBackground(Color.LIGHT_GRAY);
        
    }//GEN-LAST:event_txtbtnresetActionPerformed

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
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TIC_TAC_TOE_GAME().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel playero;
    private javax.swing.JLabel playerooo;
    private javax.swing.JLabel playerx;
    private javax.swing.JLabel playerxxx;
    private javax.swing.JButton txtbtn1;
    private javax.swing.JButton txtbtn2;
    private javax.swing.JButton txtbtn3;
    private javax.swing.JButton txtbtn4;
    private javax.swing.JButton txtbtn5;
    private javax.swing.JButton txtbtn6;
    private javax.swing.JButton txtbtn7;
    private javax.swing.JButton txtbtn8;
    private javax.swing.JButton txtbtn9;
    private javax.swing.JButton txtbtnexit;
    private javax.swing.JButton txtbtnreset;
    // End of variables declaration//GEN-END:variables
}
