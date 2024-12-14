/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectacme.view;

import javax.swing.JButton;
import projectacme.controller.OfficerMenuController;

/**
 *
 * @author Sebastian
 */
public class InterfaceOfficerMenu extends javax.swing.JFrame {

    int xMouse, yMouse;
    public InterfaceOfficerMenu() {
        initComponents();
        new OfficerMenuController(this);

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
        ButtonActivateIndividual = new javax.swing.JButton();
        ButtonInactivateIndividual = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        ButtonRegisterGuest = new javax.swing.JButton();
        ButtonRegisterWorker = new javax.swing.JButton();
        Header = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(242, 240, 235));

        ButtonActivateIndividual.setBackground(new java.awt.Color(240, 242, 235));
        ButtonActivateIndividual.setFont(new java.awt.Font("Nimbus Sans Narrow", 0, 24)); // NOI18N
        ButtonActivateIndividual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectacme/view/images/icons8-alternar-encendido-48.png"))); // NOI18N
        ButtonActivateIndividual.setText("Activate Individual");
        ButtonActivateIndividual.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonActivateIndividual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonActivateIndividual.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonActivateIndividual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonActivateIndividualMouseClicked(evt);
            }
        });
        ButtonActivateIndividual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActivateIndividualActionPerformed(evt);
            }
        });

        ButtonInactivateIndividual.setBackground(new java.awt.Color(240, 242, 235));
        ButtonInactivateIndividual.setFont(new java.awt.Font("Nimbus Sans Narrow", 0, 24)); // NOI18N
        ButtonInactivateIndividual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectacme/view/images/icons8-alternar-apagado-48.png"))); // NOI18N
        ButtonInactivateIndividual.setText("Inactivate Individual");
        ButtonInactivateIndividual.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonInactivateIndividual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonInactivateIndividual.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonInactivateIndividual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonInactivateIndividualMouseClicked(evt);
            }
        });
        ButtonInactivateIndividual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonInactivateIndividualActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 3, 24)); // NOI18N
        jLabel1.setText("Accsses");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        ButtonRegisterGuest.setBackground(new java.awt.Color(240, 242, 235));
        ButtonRegisterGuest.setFont(new java.awt.Font("Nimbus Sans Narrow", 0, 24)); // NOI18N
        ButtonRegisterGuest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectacme/view/images/icons8-invitado-masculino-48.png"))); // NOI18N
        ButtonRegisterGuest.setText("Register Guest");
        ButtonRegisterGuest.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonRegisterGuest.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonRegisterGuest.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonRegisterGuest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonRegisterGuestMouseClicked(evt);
            }
        });
        ButtonRegisterGuest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegisterGuestActionPerformed(evt);
            }
        });

        ButtonRegisterWorker.setBackground(new java.awt.Color(240, 242, 235));
        ButtonRegisterWorker.setFont(new java.awt.Font("Nimbus Sans Narrow", 0, 24)); // NOI18N
        ButtonRegisterWorker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectacme/view/images/icons8-trabajador-de-caminos-48.png"))); // NOI18N
        ButtonRegisterWorker.setText("Register Worker");
        ButtonRegisterWorker.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonRegisterWorker.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonRegisterWorker.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonRegisterWorker.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonRegisterWorkerMouseClicked(evt);
            }
        });
        ButtonRegisterWorker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegisterWorkerActionPerformed(evt);
            }
        });

        Header.setBackground(new java.awt.Color(61, 119, 195));
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

        jLabel6.setFont(new java.awt.Font("FreeSerif", 2, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ZONA -  ACME");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Officer Menu");

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addGap(95, 95, 95)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(ButtonRegisterWorker, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(ButtonRegisterGuest, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonActivateIndividual)
                .addGap(35, 35, 35))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(ButtonInactivateIndividual)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(ButtonRegisterWorker, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ButtonRegisterGuest, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonActivateIndividual, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(ButtonInactivateIndividual, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

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

    private void ButtonActivateIndividualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonActivateIndividualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonActivateIndividualActionPerformed

    private void ButtonInactivateIndividualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonInactivateIndividualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonInactivateIndividualActionPerformed

    private void ButtonRegisterGuestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegisterGuestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonRegisterGuestActionPerformed

    private void ButtonRegisterWorkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegisterWorkerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonRegisterWorkerActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x- xMouse,y - yMouse);
    }//GEN-LAST:event_HeaderMouseDragged

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_HeaderMousePressed

    private void ButtonRegisterWorkerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonRegisterWorkerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonRegisterWorkerMouseClicked

    private void ButtonRegisterGuestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonRegisterGuestMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonRegisterGuestMouseClicked

    private void ButtonActivateIndividualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonActivateIndividualMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonActivateIndividualMouseClicked

    private void ButtonInactivateIndividualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonInactivateIndividualMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonInactivateIndividualMouseClicked
    
    public JButton getButtonRegisterWorker(){
        return ButtonRegisterWorker;
    }
    
    public JButton getButtonRegisterGuest(){
        return ButtonRegisterGuest;
    }
    
    public JButton getButtonActivateIndividual(){
        return ButtonActivateIndividual;
    }
    public JButton getButtonInactivateIndividual(){
        return ButtonInactivateIndividual;
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
            java.util.logging.Logger.getLogger(InterfaceOfficerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceOfficerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceOfficerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceOfficerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceOfficerMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonActivateIndividual;
    private javax.swing.JButton ButtonInactivateIndividual;
    private javax.swing.JButton ButtonRegisterGuest;
    private javax.swing.JButton ButtonRegisterWorker;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
