/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectacme.view;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Sebastian
 */
public class InterfaceReportsManager extends javax.swing.JFrame {

    int xMouse,yMouse;
    public InterfaceReportsManager() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
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
        CreateButton = new javax.swing.JPanel();
        TextSecurityGuards = new javax.swing.JLabel();
        ExitButton = new javax.swing.JPanel();
        TextExitButton = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        BackButton1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CreateButton2 = new javax.swing.JPanel();
        TextGuests = new javax.swing.JLabel();
        CreateButton1 = new javax.swing.JPanel();
        TextWorkers = new javax.swing.JLabel();
        CreateButton3 = new javax.swing.JPanel();
        TextAccessLogs = new javax.swing.JLabel();
        CreateButton4 = new javax.swing.JPanel();
        TextVehicles = new javax.swing.JLabel();
        CreateButton5 = new javax.swing.JPanel();
        TextOfficers = new javax.swing.JLabel();
        CreateButton6 = new javax.swing.JPanel();
        TextCompanies = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        ImageSudoInterface.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectacme/view/images/ImageInterfaceSudo.jpg"))); // NOI18N
        ImageSudoInterface.setText("jLabel1");

        Title.setFont(new java.awt.Font("MathJax_Typewriter", 0, 24)); // NOI18N
        Title.setText("Reports");

        CreateButton.setBackground(new java.awt.Color(136, 169, 195));
        CreateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateButtonMouseClicked(evt);
            }
        });

        TextSecurityGuards.setFont(new java.awt.Font("Rasa Light", 0, 24)); // NOI18N
        TextSecurityGuards.setForeground(new java.awt.Color(255, 255, 255));
        TextSecurityGuards.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextSecurityGuards.setText("Security guards");
        TextSecurityGuards.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TextSecurityGuards.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextSecurityGuardsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CreateButtonLayout = new javax.swing.GroupLayout(CreateButton);
        CreateButton.setLayout(CreateButtonLayout);
        CreateButtonLayout.setHorizontalGroup(
            CreateButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TextSecurityGuards, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        CreateButtonLayout.setVerticalGroup(
            CreateButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreateButtonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TextSecurityGuards, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        BackButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectacme/view/images/icons8-flecha-responder-24.png"))); // NOI18N
        BackButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(BackButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(690, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(136, 169, 195));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        CreateButton2.setBackground(new java.awt.Color(136, 169, 195));
        CreateButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateButton2MouseClicked(evt);
            }
        });

        TextGuests.setFont(new java.awt.Font("Rasa Light", 0, 24)); // NOI18N
        TextGuests.setForeground(new java.awt.Color(255, 255, 255));
        TextGuests.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextGuests.setText("Guests");
        TextGuests.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TextGuests.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextGuestsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CreateButton2Layout = new javax.swing.GroupLayout(CreateButton2);
        CreateButton2.setLayout(CreateButton2Layout);
        CreateButton2Layout.setHorizontalGroup(
            CreateButton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TextGuests, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
        );
        CreateButton2Layout.setVerticalGroup(
            CreateButton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreateButton2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TextGuests, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        CreateButton1.setBackground(new java.awt.Color(136, 169, 195));
        CreateButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateButton1MouseClicked(evt);
            }
        });

        TextWorkers.setFont(new java.awt.Font("Rasa Light", 0, 24)); // NOI18N
        TextWorkers.setForeground(new java.awt.Color(255, 255, 255));
        TextWorkers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextWorkers.setText("Workers");
        TextWorkers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TextWorkers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextWorkersMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CreateButton1Layout = new javax.swing.GroupLayout(CreateButton1);
        CreateButton1.setLayout(CreateButton1Layout);
        CreateButton1Layout.setHorizontalGroup(
            CreateButton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TextWorkers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        CreateButton1Layout.setVerticalGroup(
            CreateButton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreateButton1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TextWorkers, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        CreateButton3.setBackground(new java.awt.Color(136, 169, 195));
        CreateButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateButton3MouseClicked(evt);
            }
        });

        TextAccessLogs.setFont(new java.awt.Font("Rasa Light", 0, 24)); // NOI18N
        TextAccessLogs.setForeground(new java.awt.Color(255, 255, 255));
        TextAccessLogs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextAccessLogs.setText("Access logs");
        TextAccessLogs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TextAccessLogs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextAccessLogsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CreateButton3Layout = new javax.swing.GroupLayout(CreateButton3);
        CreateButton3.setLayout(CreateButton3Layout);
        CreateButton3Layout.setHorizontalGroup(
            CreateButton3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TextAccessLogs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        CreateButton3Layout.setVerticalGroup(
            CreateButton3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreateButton3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TextAccessLogs, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        CreateButton4.setBackground(new java.awt.Color(136, 169, 195));
        CreateButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateButton4MouseClicked(evt);
            }
        });

        TextVehicles.setFont(new java.awt.Font("Rasa Light", 0, 24)); // NOI18N
        TextVehicles.setForeground(new java.awt.Color(255, 255, 255));
        TextVehicles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextVehicles.setText("Vehicles");
        TextVehicles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TextVehicles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextVehiclesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CreateButton4Layout = new javax.swing.GroupLayout(CreateButton4);
        CreateButton4.setLayout(CreateButton4Layout);
        CreateButton4Layout.setHorizontalGroup(
            CreateButton4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TextVehicles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        CreateButton4Layout.setVerticalGroup(
            CreateButton4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreateButton4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TextVehicles, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        CreateButton5.setBackground(new java.awt.Color(136, 169, 195));
        CreateButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateButton5MouseClicked(evt);
            }
        });

        TextOfficers.setFont(new java.awt.Font("Rasa Light", 0, 24)); // NOI18N
        TextOfficers.setForeground(new java.awt.Color(255, 255, 255));
        TextOfficers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextOfficers.setText("Officers");
        TextOfficers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TextOfficers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextOfficersMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CreateButton5Layout = new javax.swing.GroupLayout(CreateButton5);
        CreateButton5.setLayout(CreateButton5Layout);
        CreateButton5Layout.setHorizontalGroup(
            CreateButton5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TextOfficers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        CreateButton5Layout.setVerticalGroup(
            CreateButton5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreateButton5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TextOfficers, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        CreateButton6.setBackground(new java.awt.Color(136, 169, 195));
        CreateButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateButton6MouseClicked(evt);
            }
        });

        TextCompanies.setFont(new java.awt.Font("Rasa Light", 0, 24)); // NOI18N
        TextCompanies.setForeground(new java.awt.Color(255, 255, 255));
        TextCompanies.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextCompanies.setText("Companies");
        TextCompanies.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TextCompanies.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextCompaniesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CreateButton6Layout = new javax.swing.GroupLayout(CreateButton6);
        CreateButton6.setLayout(CreateButton6Layout);
        CreateButton6Layout.setHorizontalGroup(
            CreateButton6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TextCompanies, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        CreateButton6Layout.setVerticalGroup(
            CreateButton6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreateButton6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TextCompanies, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ImageSudoInterface, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(405, 405, 405)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(CreateButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CreateButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CreateButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CreateButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CreateButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CreateButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CreateButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 557, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(CreateButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CreateButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CreateButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CreateButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CreateButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CreateButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CreateButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ImageSudoInterface, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextSecurityGuardsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextSecurityGuardsMouseClicked

    }//GEN-LAST:event_TextSecurityGuardsMouseClicked

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

    private void TextWorkersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextWorkersMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TextWorkersMouseClicked

    private void CreateButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateButton1MouseClicked

    private void TextGuestsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextGuestsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TextGuestsMouseClicked

    private void CreateButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateButton2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateButton2MouseClicked

    private void TextAccessLogsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextAccessLogsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TextAccessLogsMouseClicked

    private void CreateButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateButton3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateButton3MouseClicked

    private void TextVehiclesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextVehiclesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TextVehiclesMouseClicked

    private void CreateButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateButton4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateButton4MouseClicked

    private void TextOfficersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextOfficersMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TextOfficersMouseClicked

    private void CreateButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateButton5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateButton5MouseClicked

    private void TextCompaniesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextCompaniesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TextCompaniesMouseClicked

    private void CreateButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateButton6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateButton6MouseClicked

    private void BackButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButton1MouseClicked
        InterfaceManagerMenu nuevaVentana = new InterfaceManagerMenu();
        nuevaVentana.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_BackButton1MouseClicked

    public JLabel getTextAccessLogs() {
        return TextAccessLogs;
    }

    public JLabel getTextGuests() {
        return TextGuests;
    }

    public JLabel getTextSecurityGuards() {
        return TextSecurityGuards;
    }

    public JLabel getTextVehicles() {
        return TextVehicles;
    }

    public JLabel getTextWorkers() {
        return TextWorkers;
    }

    public JLabel getTextOfficers() {
        return TextOfficers;
    }

    public JLabel getTextCompanies() {
        return TextCompanies;
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
            java.util.logging.Logger.getLogger(InterfaceActivateManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceActivateManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceActivateManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceActivateManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceActivateManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackButton1;
    private javax.swing.JPanel CreateButton;
    private javax.swing.JPanel CreateButton1;
    private javax.swing.JPanel CreateButton2;
    private javax.swing.JPanel CreateButton3;
    private javax.swing.JPanel CreateButton4;
    private javax.swing.JPanel CreateButton5;
    private javax.swing.JPanel CreateButton6;
    private javax.swing.JPanel ExitButton;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel ImageSudoInterface;
    private javax.swing.JLabel TextAccessLogs;
    private javax.swing.JLabel TextCompanies;
    private javax.swing.JLabel TextExitButton;
    private javax.swing.JLabel TextGuests;
    private javax.swing.JLabel TextOfficers;
    private javax.swing.JLabel TextSecurityGuards;
    private javax.swing.JLabel TextVehicles;
    private javax.swing.JLabel TextWorkers;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
