/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectacme.view;
import javax.swing.JButton;
import projectacme.controller.ManagerMenuController;
/**
 *
 * @author Sebastian
 */
public class InterfaceManagerMenu extends javax.swing.JFrame {

    int xMouse, yMouse;
    public InterfaceManagerMenu() {
        initComponents();
        new ManagerMenuController(this);
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
        ButtonReports = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        ButtonCreateGuard = new javax.swing.JButton();
        ButtonCreateOfficer = new javax.swing.JButton();
        Header = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ButtonRegisterReport = new javax.swing.JButton();
        ButtonActivate = new javax.swing.JButton();
        ButtonViewReports = new javax.swing.JButton();
        ButtonDownloadReports = new javax.swing.JButton();
        ButtonInactive2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(242, 240, 235));

        ButtonReports.setBackground(new java.awt.Color(240, 242, 235));
        ButtonReports.setFont(new java.awt.Font("Nimbus Sans Narrow", 0, 24)); // NOI18N
        ButtonReports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectacme/view/images/icons8-documento-compartido-48.png"))); // NOI18N
        ButtonReports.setText("Reports");
        ButtonReports.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonReports.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonReports.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonReports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonReportsMouseClicked(evt);
            }
        });
        ButtonReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonReportsActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 3, 24)); // NOI18N
        jLabel1.setText("Accsses");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        ButtonCreateGuard.setBackground(new java.awt.Color(240, 242, 235));
        ButtonCreateGuard.setFont(new java.awt.Font("Nimbus Sans Narrow", 0, 24)); // NOI18N
        ButtonCreateGuard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectacme/view/images/icons8-guardia-de-seguridad-48.png"))); // NOI18N
        ButtonCreateGuard.setText("Create Security Guard");
        ButtonCreateGuard.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonCreateGuard.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonCreateGuard.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonCreateGuard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonCreateGuardMouseClicked(evt);
            }
        });
        ButtonCreateGuard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCreateGuardActionPerformed(evt);
            }
        });

        ButtonCreateOfficer.setBackground(new java.awt.Color(240, 242, 235));
        ButtonCreateOfficer.setFont(new java.awt.Font("Nimbus Sans Narrow", 0, 24)); // NOI18N
        ButtonCreateOfficer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectacme/view/images/icons8-gerente-48.png"))); // NOI18N
        ButtonCreateOfficer.setText("Create Officer");
        ButtonCreateOfficer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonCreateOfficer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonCreateOfficer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonCreateOfficer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonCreateOfficerMouseClicked(evt);
            }
        });
        ButtonCreateOfficer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCreateOfficerActionPerformed(evt);
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
        jLabel7.setText("Manager Menu");

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
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        ButtonRegisterReport.setBackground(new java.awt.Color(240, 242, 235));
        ButtonRegisterReport.setFont(new java.awt.Font("Nimbus Sans Narrow", 0, 24)); // NOI18N
        ButtonRegisterReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectacme/view/images/icons8-punta-de-lápiz-48.png"))); // NOI18N
        ButtonRegisterReport.setText("Register Report");
        ButtonRegisterReport.setToolTipText("");
        ButtonRegisterReport.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonRegisterReport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonRegisterReport.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonRegisterReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonRegisterReportMouseClicked(evt);
            }
        });
        ButtonRegisterReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegisterReportActionPerformed(evt);
            }
        });

        ButtonActivate.setBackground(new java.awt.Color(240, 242, 235));
        ButtonActivate.setFont(new java.awt.Font("Nimbus Sans Narrow", 0, 24)); // NOI18N
        ButtonActivate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectacme/view/images/icons8-alternar-encendido-48.png"))); // NOI18N
        ButtonActivate.setText("Activate Guard");
        ButtonActivate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonActivate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonActivate.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonActivate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonActivateMouseClicked(evt);
            }
        });
        ButtonActivate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActivateActionPerformed(evt);
            }
        });

        ButtonViewReports.setBackground(new java.awt.Color(240, 242, 235));
        ButtonViewReports.setFont(new java.awt.Font("Nimbus Sans Narrow", 0, 24)); // NOI18N
        ButtonViewReports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectacme/view/images/icons8-documento-compartido-48.png"))); // NOI18N
        ButtonViewReports.setText("ViewReports");
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

        ButtonDownloadReports.setBackground(new java.awt.Color(240, 242, 235));
        ButtonDownloadReports.setFont(new java.awt.Font("Nimbus Sans Narrow", 0, 24)); // NOI18N
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

        ButtonInactive2.setBackground(new java.awt.Color(240, 242, 235));
        ButtonInactive2.setFont(new java.awt.Font("Nimbus Sans Narrow", 0, 24)); // NOI18N
        ButtonInactive2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectacme/view/images/icons8-alternar-apagado-48.png"))); // NOI18N
        ButtonInactive2.setText("Inactivate Guard");
        ButtonInactive2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonInactive2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonInactive2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonInactive2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonInactive2MouseClicked(evt);
            }
        });
        ButtonInactive2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonInactive2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ButtonCreateOfficer)
                            .addComponent(ButtonActivate, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonCreateGuard, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonInactive2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonReports, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonViewReports, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ButtonRegisterReport, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonDownloadReports, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ButtonCreateOfficer, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(ButtonCreateGuard, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ButtonActivate, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(ButtonInactive2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ButtonReports, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonRegisterReport, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ButtonViewReports, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(ButtonDownloadReports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

    private void ButtonReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonReportsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonReportsActionPerformed

    private void ButtonCreateGuardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCreateGuardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonCreateGuardActionPerformed

    private void ButtonCreateOfficerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCreateOfficerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonCreateOfficerActionPerformed

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

    private void ButtonRegisterReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegisterReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonRegisterReportActionPerformed

    private void ButtonActivateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonActivateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonActivateActionPerformed

    private void ButtonViewReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonViewReportsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonViewReportsActionPerformed

    private void ButtonCreateOfficerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonCreateOfficerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonCreateOfficerMouseClicked

    private void ButtonCreateGuardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonCreateGuardMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonCreateGuardMouseClicked

    private void ButtonReportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonReportsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonReportsMouseClicked

    private void ButtonActivateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonActivateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonActivateMouseClicked

    private void ButtonViewReportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonViewReportsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonViewReportsMouseClicked

    private void ButtonRegisterReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonRegisterReportMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonRegisterReportMouseClicked

    private void ButtonDownloadReportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonDownloadReportsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonDownloadReportsMouseClicked

    private void ButtonDownloadReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDownloadReportsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonDownloadReportsActionPerformed

    private void ButtonInactive2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonInactive2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonInactive2MouseClicked

    private void ButtonInactive2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonInactive2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonInactive2ActionPerformed

    public JButton getButtonCreateGuard(){
        return ButtonCreateGuard;
    }
    
    public JButton getButtonCreateOfficer(){
        return ButtonCreateOfficer;
    }
    
    public JButton getButtonReports(){
        return ButtonReports;
    }
    
    public JButton getButtonActivate(){
        return ButtonActivate;
    }
    
    public JButton getButtonInactive(){
        return ButtonInactive2;
    }
    
    public JButton ButtonRegisterReport(){
        return ButtonRegisterReport;
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
            java.util.logging.Logger.getLogger(InterfaceManagerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceManagerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceManagerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceManagerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceManagerMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonActivate;
    private javax.swing.JButton ButtonCreateGuard;
    private javax.swing.JButton ButtonCreateOfficer;
    private javax.swing.JButton ButtonDownloadReports;
    private javax.swing.JButton ButtonInactive2;
    private javax.swing.JButton ButtonRegisterReport;
    private javax.swing.JButton ButtonReports;
    private javax.swing.JButton ButtonViewReports;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
