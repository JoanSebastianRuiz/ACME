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
public class InterfaceCreateGuest extends javax.swing.JFrame {

    int xMouse,yMouse;
    
    public InterfaceCreateGuest() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ImageSudoInterface = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        textID = new javax.swing.JLabel();
        inputID = new javax.swing.JTextField();
        textPhone1 = new javax.swing.JLabel();
        inputPhone = new javax.swing.JTextField();
        textName = new javax.swing.JLabel();
        inputName = new javax.swing.JTextField();
        textEmailAddress = new javax.swing.JLabel();
        inputEmailAddress = new javax.swing.JTextField();
        CreateButton = new javax.swing.JPanel();
        TextButtonCreate = new javax.swing.JLabel();
        ExitButton = new javax.swing.JPanel();
        TextExitButton = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        ImageSudoInterface.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectacme/view/images/ImageInterfaceSudo.jpg"))); // NOI18N
        ImageSudoInterface.setText("jLabel1");

        Title.setFont(new java.awt.Font("MathJax_Typewriter", 0, 24)); // NOI18N
        Title.setText("Create new Guest");

        textID.setFont(new java.awt.Font("Rasa Light", 0, 18)); // NOI18N
        textID.setText("ID");

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

        textPhone1.setFont(new java.awt.Font("Rasa Light", 0, 18)); // NOI18N
        textPhone1.setText("Phone");

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

        textName.setFont(new java.awt.Font("Rasa Light", 0, 18)); // NOI18N
        textName.setText("Name");

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

        textEmailAddress.setFont(new java.awt.Font("Rasa Light", 0, 18)); // NOI18N
        textEmailAddress.setText("Email");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(595, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(textEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(inputEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(116, 116, 116))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(830, 830, 830)
                            .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(423, 423, 423)
                            .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(393, 393, 393)
                            .addComponent(textID)
                            .addGap(181, 181, 181)
                            .addComponent(textPhone1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(390, 390, 390)
                            .addComponent(inputID, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addComponent(inputPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(393, 393, 393)
                            .addComponent(textName))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(393, 393, 393)
                            .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(527, 527, 527)
                            .addComponent(CreateButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(ImageSudoInterface, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(272, Short.MAX_VALUE)
                .addComponent(textEmailAddress)
                .addGap(13, 13, 13)
                .addComponent(inputEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(255, 255, 255))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(43, 43, 43)
                            .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textID)
                                .addComponent(textPhone1))
                            .addGap(7, 7, 7)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(inputID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(32, 32, 32)
                            .addComponent(textName)
                            .addGap(13, 13, 13)
                            .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(162, 162, 162)
                            .addComponent(CreateButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(ImageSudoInterface))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputIDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputIDMousePressed
        
    }//GEN-LAST:event_inputIDMousePressed

    private void inputIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputIDActionPerformed

    private void inputPhoneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputPhoneMousePressed
        
    }//GEN-LAST:event_inputPhoneMousePressed

    private void inputPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPhoneActionPerformed

    private void inputNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputNameMousePressed
        
    }//GEN-LAST:event_inputNameMousePressed

    private void inputNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNameActionPerformed

    private void inputEmailAddressMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputEmailAddressMousePressed
        
    }//GEN-LAST:event_inputEmailAddressMousePressed

    private void inputEmailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEmailAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEmailAddressActionPerformed

    private void TextButtonCreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextButtonCreateMouseClicked

    }//GEN-LAST:event_TextButtonCreateMouseClicked

    private void CreateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateButtonMouseClicked

    private void TextExitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextExitButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_TextExitButtonMouseClicked

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x- xMouse,y - yMouse);
    }//GEN-LAST:event_HeaderMouseDragged

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_HeaderMousePressed

    

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
            java.util.logging.Logger.getLogger(InterfaceCreateGuest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceCreateGuest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceCreateGuest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceCreateGuest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceCreateGuest().setVisible(true);
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
    private javax.swing.JTextField inputPhone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel textEmailAddress;
    private javax.swing.JLabel textID;
    private javax.swing.JLabel textName;
    private javax.swing.JLabel textPhone1;
    // End of variables declaration//GEN-END:variables
}
