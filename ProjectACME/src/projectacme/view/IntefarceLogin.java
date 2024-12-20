/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectacme.view;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import projectacme.controller.LoginController;

/**
 *
 * @author Sebastian
 */
public class IntefarceLogin extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    
    public IntefarceLogin() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        TextSingUp = new javax.swing.JLabel();
        TextACME = new javax.swing.JLabel();
        LoginImage = new javax.swing.JLabel();
        TextLogin = new javax.swing.JLabel();
        TextUsername = new javax.swing.JLabel();
        InputUsername = new javax.swing.JTextField();
        TextMessage = new javax.swing.JLabel();
        InputPassword = new javax.swing.JPasswordField();
        ButtonEnter = new javax.swing.JPanel();
        TextButtonEnter = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        ButtonExit = new javax.swing.JLabel();
        TextPassword = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextSingUp.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TextSingUp.setForeground(new java.awt.Color(255, 255, 255));
        TextSingUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextSingUp.setText("SING UP");
        Background.add(TextSingUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 160, 60));

        TextACME.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        TextACME.setForeground(new java.awt.Color(255, 255, 255));
        TextACME.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextACME.setText("ACME");
        Background.add(TextACME, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 140, 50));

        LoginImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectacme/view/images/LoginImage.jpg"))); // NOI18N
        LoginImage.setText("jLabel1");
        Background.add(LoginImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 500));

        TextLogin.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        TextLogin.setText("LOGIN");
        Background.add(TextLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 130, 40));

        TextUsername.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TextUsername.setForeground(new java.awt.Color(153, 153, 153));
        TextUsername.setText("IDENTIFICATION");
        Background.add(TextUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 140, 40));

        InputUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                InputUsernameMousePressed(evt);
            }
        });
        InputUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputUsernameActionPerformed(evt);
            }
        });
        Background.add(InputUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 260, 50));

        TextMessage.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TextMessage.setForeground(new java.awt.Color(153, 153, 153));
        TextMessage.setText("Message");
        Background.add(TextMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 350, 40));

        InputPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                InputPasswordMousePressed(evt);
            }
        });
        Background.add(InputPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 260, 50));

        ButtonEnter.setBackground(new java.awt.Color(136, 169, 195));

        TextButtonEnter.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TextButtonEnter.setForeground(new java.awt.Color(255, 255, 255));
        TextButtonEnter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextButtonEnter.setText("ENTER");
        TextButtonEnter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TextButtonEnter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextButtonEnterMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ButtonEnterLayout = new javax.swing.GroupLayout(ButtonEnter);
        ButtonEnter.setLayout(ButtonEnterLayout);
        ButtonEnterLayout.setHorizontalGroup(
            ButtonEnterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TextButtonEnter, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        ButtonEnterLayout.setVerticalGroup(
            ButtonEnterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TextButtonEnter, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        Background.add(ButtonEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 150, 50));

        Header.setBackground(new java.awt.Color(255, 255, 255));
        Header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeaderMouseDragged(evt);
            }
        });
        Header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeaderMousePressed(evt);
            }
        });

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        Background.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        ButtonExit.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        ButtonExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ButtonExit.setText("X");
        ButtonExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ButtonExit, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ButtonExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 50, 40));

        TextPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TextPassword.setForeground(new java.awt.Color(153, 153, 153));
        TextPassword.setText("PASSWORD");
        Background.add(TextPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 140, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InputUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputUsernameActionPerformed

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_HeaderMousePressed

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x- xMouse,y - yMouse);
    }//GEN-LAST:event_HeaderMouseDragged

    private void TextButtonEnterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextButtonEnterMouseClicked
    
    }//GEN-LAST:event_TextButtonEnterMouseClicked

    private void InputUsernameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InputUsernameMousePressed
    
    }//GEN-LAST:event_InputUsernameMousePressed

    private void InputPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InputPasswordMousePressed
    
    }//GEN-LAST:event_InputPasswordMousePressed

    private void ButtonExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ButtonExitMouseClicked
    
    public JLabel getTextButtonEnter(){
        return TextButtonEnter;
    }

    public JTextField getInputUsername(){
        return InputUsername;
    } 

    public JPasswordField getInputPassword(){
        return InputPassword;
    }

    public JLabel getTextMessage() {
        return TextMessage;
    }
    
    
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
            java.util.logging.Logger.getLogger(IntefarceLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntefarceLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntefarceLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntefarceLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntefarceLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel ButtonEnter;
    private javax.swing.JLabel ButtonExit;
    private javax.swing.JPanel Header;
    private javax.swing.JPasswordField InputPassword;
    private javax.swing.JTextField InputUsername;
    private javax.swing.JLabel LoginImage;
    private javax.swing.JLabel TextACME;
    private javax.swing.JLabel TextButtonEnter;
    private javax.swing.JLabel TextLogin;
    private javax.swing.JLabel TextMessage;
    private javax.swing.JLabel TextPassword;
    private javax.swing.JLabel TextSingUp;
    private javax.swing.JLabel TextUsername;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
