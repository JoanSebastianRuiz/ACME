/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectacme.view;

import javax.swing.JButton;
import projectacme.controller.SecurityGuardMenuController;

/**
 *
 * @author Sebastian
 */
public class InterfaceSecurityGuardMenu extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    public InterfaceSecurityGuardMenu() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        new SecurityGuardMenuController(this);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ButtonVehicle = new javax.swing.JButton();
        ButtonLiveAccessLog = new javax.swing.JButton();
        ButtonRegisterExit = new javax.swing.JButton();
        ButtonDownloadReports = new javax.swing.JButton();
        ButtonViewReports1 = new javax.swing.JButton();
        ButtonRegisterEntrty = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Background.setBackground(new java.awt.Color(242, 240, 235));

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
        jLabel7.setText("Security Guard");

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

        ButtonVehicle.setBackground(new java.awt.Color(240, 242, 235));
        ButtonVehicle.setFont(new java.awt.Font("Nimbus Sans Narrow", 0, 18)); // NOI18N
        ButtonVehicle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectacme/view/images/icons8-auto-48.png"))); // NOI18N
        ButtonVehicle.setText("Vehicle");
        ButtonVehicle.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonVehicle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonVehicle.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonVehicle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonVehicleMouseClicked(evt);
            }
        });
        ButtonVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVehicleActionPerformed(evt);
            }
        });

        ButtonLiveAccessLog.setBackground(new java.awt.Color(240, 242, 235));
        ButtonLiveAccessLog.setFont(new java.awt.Font("Nimbus Sans Narrow", 0, 18)); // NOI18N
        ButtonLiveAccessLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectacme/view/images/icons8-documento-compartido-48.png"))); // NOI18N
        ButtonLiveAccessLog.setText("Live Access Log");
        ButtonLiveAccessLog.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonLiveAccessLog.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonLiveAccessLog.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonLiveAccessLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonLiveAccessLogMouseClicked(evt);
            }
        });
        ButtonLiveAccessLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLiveAccessLogActionPerformed(evt);
            }
        });

        ButtonRegisterExit.setBackground(new java.awt.Color(240, 242, 235));
        ButtonRegisterExit.setFont(new java.awt.Font("Nimbus Sans Narrow", 0, 18)); // NOI18N
        ButtonRegisterExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectacme/view/images/exit.-con.png"))); // NOI18N
        ButtonRegisterExit.setText("Register Exit");
        ButtonRegisterExit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonRegisterExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonRegisterExit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonRegisterExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonRegisterExitMouseClicked(evt);
            }
        });
        ButtonRegisterExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegisterExitActionPerformed(evt);
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

        ButtonViewReports1.setBackground(new java.awt.Color(240, 242, 235));
        ButtonViewReports1.setFont(new java.awt.Font("Nimbus Sans Narrow", 0, 18)); // NOI18N
        ButtonViewReports1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectacme/view/images/icons8-documento-compartido-48.png"))); // NOI18N
        ButtonViewReports1.setText("View Reports");
        ButtonViewReports1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonViewReports1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonViewReports1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonViewReports1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonViewReports1MouseClicked(evt);
            }
        });
        ButtonViewReports1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonViewReports1ActionPerformed(evt);
            }
        });

        ButtonRegisterEntrty.setBackground(new java.awt.Color(240, 242, 235));
        ButtonRegisterEntrty.setFont(new java.awt.Font("Nimbus Sans Narrow", 0, 18)); // NOI18N
        ButtonRegisterEntrty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectacme/view/images/entry-icon (1).jpg"))); // NOI18N
        ButtonRegisterEntrty.setText("Register Entrty");
        ButtonRegisterEntrty.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonRegisterEntrty.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonRegisterEntrty.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonRegisterEntrty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonRegisterEntrtyMouseClicked(evt);
            }
        });
        ButtonRegisterEntrty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegisterEntrtyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ButtonLiveAccessLog, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonRegisterExit, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ButtonVehicle, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(ButtonViewReports1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ButtonDownloadReports, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(ButtonRegisterEntrty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ButtonDownloadReports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonVehicle, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                    .addComponent(ButtonRegisterExit, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ButtonLiveAccessLog, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(BackgroundLayout.createSequentialGroup()
                            .addComponent(ButtonRegisterEntrty, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(9, 9, 9)))
                    .addComponent(ButtonViewReports1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 560));

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

    private void ButtonVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVehicleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonVehicleActionPerformed

    private void ButtonVehicleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonVehicleMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonVehicleMouseClicked

    private void ButtonLiveAccessLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonLiveAccessLogMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonLiveAccessLogMouseClicked

    private void ButtonLiveAccessLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLiveAccessLogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonLiveAccessLogActionPerformed

    private void ButtonDownloadReportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonDownloadReportsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonDownloadReportsMouseClicked

    private void ButtonDownloadReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDownloadReportsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonDownloadReportsActionPerformed

    private void ButtonRegisterExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonRegisterExitMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonRegisterExitMouseClicked

    private void ButtonRegisterExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegisterExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonRegisterExitActionPerformed

    private void ButtonViewReports1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonViewReports1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonViewReports1MouseClicked

    private void ButtonViewReports1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonViewReports1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonViewReports1ActionPerformed

    private void ButtonRegisterEntrtyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonRegisterEntrtyMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonRegisterEntrtyMouseClicked

    private void ButtonRegisterEntrtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegisterEntrtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonRegisterEntrtyActionPerformed

    
    public JButton getButtonVehicle(){
        return ButtonVehicle;
    }

    public JButton getButtonLiveAccessLog() {
        return ButtonLiveAccessLog;
    }
    
    
    public JButton getButtonViewReports(){
        return ButtonViewReports1;
    }
    
    public JButton getButtonDownloadReports(){
        return ButtonDownloadReports;
    }

    public JButton getButtonRegisterEntrty() {
        return ButtonRegisterEntrty;
    }

    public JButton getButtonRegisterExit() {
        return ButtonRegisterExit;
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
            java.util.logging.Logger.getLogger(InterfaceSecurityGuardMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceSecurityGuardMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceSecurityGuardMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceSecurityGuardMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceSecurityGuardMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton ButtonDownloadReports;
    private javax.swing.JButton ButtonLiveAccessLog;
    private javax.swing.JButton ButtonRegisterEntrty;
    private javax.swing.JButton ButtonRegisterExit;
    private javax.swing.JButton ButtonVehicle;
    private javax.swing.JButton ButtonViewReports1;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
