/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectacme.view;

import javax.swing.JButton;
import projectacme.controller.SudoMenuController;

/**
 *
 * @author Sebastian
 */
public class InterfaceSudoMenu extends javax.swing.JFrame {

    int xMouse,yMouse;
    
    public InterfaceSudoMenu() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        new SudoMenuController(this);
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
        Header = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ButtonActivateManager = new javax.swing.JButton();
        ButtonInactivateManager = new javax.swing.JButton();
        ButtonViewReports = new javax.swing.JButton();
        ButtonCreateManager = new javax.swing.JButton();
        ButtonDownloadReports = new javax.swing.JButton();
        ButtonAccessDatabase2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(242, 240, 235));

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
        jLabel7.setText("Super User");

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
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

        ButtonActivateManager.setBackground(new java.awt.Color(240, 242, 235));
        ButtonActivateManager.setFont(new java.awt.Font("Nimbus Sans Narrow", 0, 18)); // NOI18N
        ButtonActivateManager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectacme/view/images/icons8-alternar-encendido-48.png"))); // NOI18N
        ButtonActivateManager.setText("Activate Manager");
        ButtonActivateManager.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonActivateManager.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonActivateManager.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonActivateManager.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonActivateManagerMouseClicked(evt);
            }
        });
        ButtonActivateManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActivateManagerActionPerformed(evt);
            }
        });

        ButtonInactivateManager.setBackground(new java.awt.Color(240, 242, 235));
        ButtonInactivateManager.setFont(new java.awt.Font("Nimbus Sans Narrow", 0, 18)); // NOI18N
        ButtonInactivateManager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectacme/view/images/icons8-alternar-apagado-48.png"))); // NOI18N
        ButtonInactivateManager.setText("Inactivate Manager");
        ButtonInactivateManager.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonInactivateManager.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonInactivateManager.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonInactivateManager.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonInactivateManagerMouseClicked(evt);
            }
        });
        ButtonInactivateManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonInactivateManagerActionPerformed(evt);
            }
        });

        ButtonViewReports.setBackground(new java.awt.Color(240, 242, 235));
        ButtonViewReports.setFont(new java.awt.Font("Nimbus Sans Narrow", 0, 18)); // NOI18N
        ButtonViewReports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectacme/view/images/icons8-documento-compartido-48.png"))); // NOI18N
        ButtonViewReports.setText("View Reports");
        ButtonViewReports.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonViewReports.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonViewReports.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonViewReports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonViewReportsMouseClicked(evt);
            }
        });
        ButtonViewReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonViewReportsActionPerformed(evt);
            }
        });

        ButtonCreateManager.setBackground(new java.awt.Color(240, 242, 235));
        ButtonCreateManager.setFont(new java.awt.Font("Nimbus Sans Narrow", 0, 18)); // NOI18N
        ButtonCreateManager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectacme/view/images/icons8-gerente-48.png"))); // NOI18N
        ButtonCreateManager.setText("Create Manager");
        ButtonCreateManager.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonCreateManager.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonCreateManager.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonCreateManager.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonCreateManagerMouseClicked(evt);
            }
        });
        ButtonCreateManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCreateManagerActionPerformed(evt);
            }
        });

        ButtonDownloadReports.setBackground(new java.awt.Color(240, 242, 235));
        ButtonDownloadReports.setFont(new java.awt.Font("Nimbus Sans Narrow", 0, 18)); // NOI18N
        ButtonDownloadReports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectacme/view/images/icons8-descargar-48.png"))); // NOI18N
        ButtonDownloadReports.setText("Download Reports");
        ButtonDownloadReports.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonDownloadReports.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonDownloadReports.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonDownloadReports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonDownloadReportsMouseClicked(evt);
            }
        });
        ButtonDownloadReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDownloadReportsActionPerformed(evt);
            }
        });

        ButtonAccessDatabase2.setBackground(new java.awt.Color(240, 242, 235));
        ButtonAccessDatabase2.setFont(new java.awt.Font("Nimbus Sans Narrow", 0, 18)); // NOI18N
        ButtonAccessDatabase2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectacme/view/images/icons8-base-de-datos-48.png"))); // NOI18N
        ButtonAccessDatabase2.setText("Access Database");
        ButtonAccessDatabase2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonAccessDatabase2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonAccessDatabase2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonAccessDatabase2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonAccessDatabase2MouseClicked(evt);
            }
        });
        ButtonAccessDatabase2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAccessDatabase2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ButtonCreateManager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonAccessDatabase2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonViewReports, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonActivateManager, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ButtonInactivateManager, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(ButtonDownloadReports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ButtonCreateManager, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(ButtonInactivateManager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonDownloadReports, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonAccessDatabase2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ButtonActivateManager, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(ButtonViewReports, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
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

    private void ButtonActivateManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonActivateManagerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonActivateManagerActionPerformed

    private void ButtonInactivateManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonInactivateManagerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonInactivateManagerActionPerformed

    private void ButtonViewReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonViewReportsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonViewReportsActionPerformed

    private void ButtonViewReportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonViewReportsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonViewReportsMouseClicked

    private void ButtonActivateManagerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonActivateManagerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonActivateManagerMouseClicked

    private void ButtonInactivateManagerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonInactivateManagerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonInactivateManagerMouseClicked

    private void ButtonCreateManagerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonCreateManagerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonCreateManagerMouseClicked

    private void ButtonCreateManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCreateManagerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonCreateManagerActionPerformed

    private void ButtonDownloadReportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonDownloadReportsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonDownloadReportsMouseClicked

    private void ButtonDownloadReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDownloadReportsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonDownloadReportsActionPerformed

    private void ButtonAccessDatabase2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonAccessDatabase2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonAccessDatabase2MouseClicked

    private void ButtonAccessDatabase2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAccessDatabase2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonAccessDatabase2ActionPerformed
    
    public JButton getButtonCreateManager(){
        return ButtonCreateManager;
    }
    
    public JButton getButtonActivateManager(){
        return ButtonActivateManager;
    }
    
    public JButton getButtonInactivateManager(){
        return ButtonInactivateManager;
    }
    
    
    public JButton getButtonAccessDatabase(){
        return ButtonAccessDatabase2;
    }
    
    public JButton getButtonViewReports(){
        return ButtonViewReports;
    }
    
    public JButton getButtonDownloadReports(){
        return ButtonDownloadReports;
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
            java.util.logging.Logger.getLogger(InterfaceSudoMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceSudoMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceSudoMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceSudoMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceSudoMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAccessDatabase2;
    private javax.swing.JButton ButtonActivateManager;
    private javax.swing.JButton ButtonCreateManager;
    private javax.swing.JButton ButtonDownloadReports;
    private javax.swing.JButton ButtonInactivateManager;
    private javax.swing.JButton ButtonViewReports;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
