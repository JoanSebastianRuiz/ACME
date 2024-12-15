/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectacme.view;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author camper
 */
public class InterfaceCreateManager extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    
    public InterfaceCreateManager() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textPhone = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ImageSudoInterface = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        textID = new javax.swing.JLabel();
        inputID = new javax.swing.JTextField();
        textPhone1 = new javax.swing.JLabel();
        inputPhone = new javax.swing.JTextField();
        textName = new javax.swing.JLabel();
        inputName = new javax.swing.JTextField();
        textPassword = new javax.swing.JLabel();
        inputPassword = new javax.swing.JPasswordField();
        textEmailAddress = new javax.swing.JLabel();
        inputEmailAddress = new javax.swing.JTextField();
        CreateButton = new javax.swing.JPanel();
        TextButtonCreate = new javax.swing.JLabel();
        ExitButton = new javax.swing.JPanel();
        TextExitButton = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();

        textPhone.setFont(new java.awt.Font("Rasa Light", 0, 18)); // NOI18N
        textPhone.setText("Phone");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ImageSudoInterface.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectacme/view/images/ImageInterfaceSudo.jpg"))); // NOI18N
        ImageSudoInterface.setText("jLabel1");
        jPanel1.add(ImageSudoInterface, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, -1));

        Title.setFont(new java.awt.Font("MathJax_Typewriter", 0, 24)); // NOI18N
        Title.setText("Create new Manager");
        jPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 93, 248, 37));

        textID.setFont(new java.awt.Font("Rasa Light", 0, 18)); // NOI18N
        textID.setText("ID");
        jPanel1.add(textID, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 180, -1, -1));

        inputID.setForeground(new java.awt.Color(102, 102, 102));
        inputID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inputIDMousePressed(evt);
            }
        });
        inputID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIDActionPerformed(evt);
            }
        });
        jPanel1.add(inputID, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 166, 36));

        textPhone1.setFont(new java.awt.Font("Rasa Light", 0, 18)); // NOI18N
        textPhone1.setText("Phone");
        jPanel1.add(textPhone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, -1, -1));

        inputPhone.setForeground(new java.awt.Color(102, 102, 102));
        inputPhone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inputPhoneMousePressed(evt);
            }
        });
        inputPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPhoneActionPerformed(evt);
            }
        });
        jPanel1.add(inputPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 175, 36));

        textName.setFont(new java.awt.Font("Rasa Light", 0, 18)); // NOI18N
        textName.setText("Name");
        jPanel1.add(textName, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 278, -1, -1));

        inputName.setForeground(new java.awt.Color(102, 102, 102));
        inputName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inputNameMousePressed(evt);
            }
        });
        inputName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNameActionPerformed(evt);
            }
        });
        jPanel1.add(inputName, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 314, 166, 36));

        textPassword.setFont(new java.awt.Font("Rasa Light", 0, 18)); // NOI18N
        textPassword.setText("Password ");
        jPanel1.add(textPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 278, -1, -1));

        inputPassword.setForeground(new java.awt.Color(102, 102, 102));
        inputPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inputPasswordMousePressed(evt);
            }
        });
        inputPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(inputPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 314, 175, 36));

        textEmailAddress.setFont(new java.awt.Font("Rasa Light", 0, 18)); // NOI18N
        textEmailAddress.setText("Email");
        jPanel1.add(textEmailAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 384, 166, -1));

        inputEmailAddress.setForeground(new java.awt.Color(102, 102, 102));
        inputEmailAddress.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inputEmailAddressMousePressed(evt);
            }
        });
        inputEmailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEmailAddressActionPerformed(evt);
            }
        });
        jPanel1.add(inputEmailAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 166, 36));

        CreateButton.setBackground(new java.awt.Color(136, 169, 195));
        CreateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateButtonMouseClicked(evt);
            }
        });

        TextButtonCreate.setFont(new java.awt.Font("Rasa Light", 0, 24)); // NOI18N
        TextButtonCreate.setForeground(new java.awt.Color(255, 255, 255));
        TextButtonCreate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextButtonCreate.setText("Create");
        TextButtonCreate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TextButtonCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextButtonCreateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CreateButtonLayout = new javax.swing.GroupLayout(CreateButton);
        CreateButton.setLayout(CreateButtonLayout);
        CreateButtonLayout.setHorizontalGroup(
            CreateButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TextButtonCreate, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        CreateButtonLayout.setVerticalGroup(
            CreateButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreateButtonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TextButtonCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(CreateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 511, -1, -1));

        ExitButton.setBackground(new java.awt.Color(136, 169, 195));

        TextExitButton.setBackground(new java.awt.Color(136, 169, 195));
        TextExitButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TextExitButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextExitButton.setText("X");
        TextExitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TextExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextExitButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ExitButtonLayout = new javax.swing.GroupLayout(ExitButton);
        ExitButton.setLayout(ExitButtonLayout);
        ExitButtonLayout.setHorizontalGroup(
            ExitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExitButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );
        ExitButtonLayout.setVerticalGroup(
            ExitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TextExitButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 50, 50));

        Header.setBackground(new java.awt.Color(136, 169, 195));
        Header.setForeground(new java.awt.Color(136, 169, 195));
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
            .addGap(0, 880, Short.MAX_VALUE)
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 881, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputIDActionPerformed

    private void inputPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPhoneActionPerformed

    private void inputNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNameActionPerformed

    private void inputPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPasswordActionPerformed

    private void inputEmailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEmailAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEmailAddressActionPerformed

    private void CreateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateButtonMouseClicked

    private void TextButtonCreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextButtonCreateMouseClicked
        
    }//GEN-LAST:event_TextButtonCreateMouseClicked

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_HeaderMousePressed

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x- xMouse,y - yMouse);
    }//GEN-LAST:event_HeaderMouseDragged

    private void inputIDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputIDMousePressed

    }//GEN-LAST:event_inputIDMousePressed

    private void inputPhoneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputPhoneMousePressed
        
    }//GEN-LAST:event_inputPhoneMousePressed

    private void inputNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputNameMousePressed
       
    }//GEN-LAST:event_inputNameMousePressed

    private void inputPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputPasswordMousePressed
      
    }//GEN-LAST:event_inputPasswordMousePressed

    private void inputEmailAddressMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputEmailAddressMousePressed
      
    }//GEN-LAST:event_inputEmailAddressMousePressed

    private void TextExitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextExitButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_TextExitButtonMouseClicked
    
    public JTextField getInputID(){
        return inputID;
    }
    
    public JTextField getInputPhone(){
        return inputPhone;
    }
    public JTextField getInputName(){
        return inputName;
    }

    public JPasswordField getInputPassword(){
        return inputPassword;
    }
    
    public JTextField getInputEmailAddress(){
        return inputEmailAddress;
    }
    public JLabel getTextButtonCreate(){
        return TextButtonCreate;
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
            java.util.logging.Logger.getLogger(InterfaceCreateManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceCreateManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceCreateManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceCreateManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceCreateManager().setVisible(true);
            }
        });
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CreateButton;
    private javax.swing.JPanel ExitButton;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel ImageSudoInterface;
    private javax.swing.JLabel TextButtonCreate;
    private javax.swing.JLabel TextExitButton;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField inputEmailAddress;
    private javax.swing.JTextField inputID;
    private javax.swing.JTextField inputName;
    private javax.swing.JPasswordField inputPassword;
    private javax.swing.JTextField inputPhone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel textEmailAddress;
    private javax.swing.JLabel textID;
    private javax.swing.JLabel textName;
    private javax.swing.JLabel textPassword;
    private javax.swing.JLabel textPhone;
    private javax.swing.JLabel textPhone1;
    // End of variables declaration//GEN-END:variables
}
