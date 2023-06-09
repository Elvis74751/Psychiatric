/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package psychiatric;

/**
 *
 * @author alondrahernandez
 */
public class PsychMenu extends javax.swing.JFrame {

    /**
     * Creates new form PsychMenu
     */
    public PsychMenu() {
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

        jFrame1 = new javax.swing.JFrame();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        PatientButton = new javax.swing.JButton();
        PatientReportButton = new javax.swing.JButton();
        StaffButton = new javax.swing.JButton();
        LabButton = new javax.swing.JButton();
        PerscriptionButton = new javax.swing.JButton();
        MedicationButton = new javax.swing.JButton();
        StayButton = new javax.swing.JButton();
        DepartmentButton = new javax.swing.JButton();
        PayrollButton = new javax.swing.JButton();
        Return = new javax.swing.JButton();
        PayrollButtonHS = new javax.swing.JButton();
        StaffButtonHS = new javax.swing.JButton();
        DepartmentButtonHS = new javax.swing.JButton();
        MedicationButtonHS = new javax.swing.JButton();
        StayButtonHS = new javax.swing.JButton();
        LabButtonHS = new javax.swing.JButton();
        PatientButtonHS = new javax.swing.JButton();
        PatientReportHS = new javax.swing.JButton();
        PerscriptionButtonHS = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("Hospital System ");

        jLabel2.setText("Dashboard");

        PatientButton.setText("Patient");
        PatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientButtonActionPerformed(evt);
            }
        });

        PatientReportButton.setText("Patient Report");
        PatientReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientReportButtonActionPerformed(evt);
            }
        });

        StaffButton.setText("Staff");
        StaffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StaffButtonActionPerformed(evt);
            }
        });

        LabButton.setText("Lab");
        LabButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LabButtonActionPerformed(evt);
            }
        });

        PerscriptionButton.setText("Perscription");
        PerscriptionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerscriptionButtonActionPerformed(evt);
            }
        });

        MedicationButton.setText("Medication");
        MedicationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedicationButtonActionPerformed(evt);
            }
        });

        StayButton.setText("Stay");
        StayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StayButtonActionPerformed(evt);
            }
        });

        DepartmentButton.setText("Department");
        DepartmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepartmentButtonActionPerformed(evt);
            }
        });

        PayrollButton.setText("Payroll");
        PayrollButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayrollButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(DepartmentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PayrollButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PatientButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PatientReportButton, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                    .addComponent(StayButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(MedicationButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PerscriptionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StaffButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 21, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PatientButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PatientReportButton)
                .addGap(3, 3, 3)
                .addComponent(StayButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MedicationButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PerscriptionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StaffButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PayrollButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DepartmentButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Return.setText("Return ");
        Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnActionPerformed(evt);
            }
        });

        PayrollButtonHS.setText("Payroll");
        PayrollButtonHS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayrollButtonHSActionPerformed(evt);
            }
        });

        StaffButtonHS.setText("Staff");
        StaffButtonHS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StaffButtonHSActionPerformed(evt);
            }
        });

        DepartmentButtonHS.setText("Department");
        DepartmentButtonHS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepartmentButtonHSActionPerformed(evt);
            }
        });

        MedicationButtonHS.setText("Medication");
        MedicationButtonHS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedicationButtonHSActionPerformed(evt);
            }
        });

        StayButtonHS.setText("Stay");
        StayButtonHS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StayButtonHSActionPerformed(evt);
            }
        });

        LabButtonHS.setText("Lab");
        LabButtonHS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LabButtonHSActionPerformed(evt);
            }
        });

        PatientButtonHS.setText("Patient");
        PatientButtonHS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientButtonHSActionPerformed(evt);
            }
        });

        PatientReportHS.setText("Patient Report");
        PatientReportHS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientReportHSActionPerformed(evt);
            }
        });

        PerscriptionButtonHS.setText("Perscription");
        PerscriptionButtonHS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerscriptionButtonHSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(Return)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(PayrollButtonHS, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DepartmentButtonHS, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PatientReportHS, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PatientButtonHS, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PerscriptionButtonHS, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabButtonHS, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(StaffButtonHS, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(StayButtonHS, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MedicationButtonHS, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(50, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(Return)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PatientButtonHS, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StayButtonHS, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MedicationButtonHS, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PerscriptionButtonHS, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabButtonHS, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StaffButtonHS, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PayrollButtonHS, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DepartmentButtonHS, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PatientReportHS, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientButtonActionPerformed
        this.setVisible(false);
        
        PatientFrame pF = new PatientFrame();
        pF.setVisible(true);
    }//GEN-LAST:event_PatientButtonActionPerformed

    private void DepartmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepartmentButtonActionPerformed
        this.setVisible(false);
        
        StaffFrame sF = new StaffFrame();
        sF.setVisible(true);
    }//GEN-LAST:event_DepartmentButtonActionPerformed

    private void PayrollButtonHSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayrollButtonHSActionPerformed
        this.setVisible(false);
        
        PayrollFrame pF = new PayrollFrame();
        pF.setVisible(true);
    }//GEN-LAST:event_PayrollButtonHSActionPerformed

    private void StaffButtonHSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StaffButtonHSActionPerformed
        this.setVisible(false);
        
        StaffFrame sF = new StaffFrame();
        sF.setVisible(true);
    }//GEN-LAST:event_StaffButtonHSActionPerformed

    private void DepartmentButtonHSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepartmentButtonHSActionPerformed
        this.setVisible(false);
        
        StaffFrame sF = new StaffFrame();
        sF.setVisible(true);
    }//GEN-LAST:event_DepartmentButtonHSActionPerformed

    private void MedicationButtonHSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedicationButtonHSActionPerformed
        this.setVisible(false);
        
        MedicationFrame mF = new MedicationFrame();
        mF.setVisible(true);
    }//GEN-LAST:event_MedicationButtonHSActionPerformed

    private void StayButtonHSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StayButtonHSActionPerformed
        this.setVisible(false);
        
        StayFrame sF = new StayFrame();
        sF.setVisible(true);
    }//GEN-LAST:event_StayButtonHSActionPerformed

    private void LabButtonHSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LabButtonHSActionPerformed
        this.setVisible(false);
        
        LabFrame lF = new LabFrame();
        lF.setVisible(true);
    }//GEN-LAST:event_LabButtonHSActionPerformed

    private void PatientButtonHSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientButtonHSActionPerformed
        this.setVisible(false);
        
        PatientFrame pF = new PatientFrame();
        pF.setVisible(true);
    }//GEN-LAST:event_PatientButtonHSActionPerformed

    private void PatientReportHSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientReportHSActionPerformed
        this.setVisible(false);
        
        PatientFrame pF = new PatientFrame();
        pF.setVisible(true);
    }//GEN-LAST:event_PatientReportHSActionPerformed

    private void PerscriptionButtonHSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerscriptionButtonHSActionPerformed
        this.setVisible(false);
        
        PerscriptionFrame pF = new PerscriptionFrame();
        pF.setVisible(true);
    }//GEN-LAST:event_PerscriptionButtonHSActionPerformed

    private void ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnActionPerformed
        
        this.setVisible(false);
        
        LoginScreen ls = new LoginScreen();
        ls.setVisible(true);
    }//GEN-LAST:event_ReturnActionPerformed

    private void PatientReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientReportButtonActionPerformed
        this.setVisible(false);
        
        PatientFrame pF = new PatientFrame();
        pF.setVisible(true);
    }//GEN-LAST:event_PatientReportButtonActionPerformed

    private void StayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StayButtonActionPerformed
        this.setVisible(false);
        
        StayFrame sF = new StayFrame();
        sF.setVisible(true);
    }//GEN-LAST:event_StayButtonActionPerformed

    private void MedicationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedicationButtonActionPerformed
        this.setVisible(false);
        
        MedicationFrame mF = new MedicationFrame();
        mF.setVisible(true);
    }//GEN-LAST:event_MedicationButtonActionPerformed

    private void PerscriptionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerscriptionButtonActionPerformed
        this.setVisible(false);
        
        PerscriptionFrame pF = new PerscriptionFrame();
        pF.setVisible(true);
    }//GEN-LAST:event_PerscriptionButtonActionPerformed

    private void LabButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LabButtonActionPerformed
        this.setVisible(false);
        
        LabFrame lF = new LabFrame();
        lF.setVisible(true);
    }//GEN-LAST:event_LabButtonActionPerformed

    private void StaffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StaffButtonActionPerformed
        this.setVisible(false);
        
        StaffFrame sF = new StaffFrame();
        sF.setVisible(true);
    }//GEN-LAST:event_StaffButtonActionPerformed

    private void PayrollButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayrollButtonActionPerformed
        this.setVisible(false);
        
        PayrollFrame pF = new PayrollFrame();
        pF.setVisible(true);
    }//GEN-LAST:event_PayrollButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PsychMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PsychMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PsychMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PsychMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PsychMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DepartmentButton;
    private javax.swing.JButton DepartmentButtonHS;
    private javax.swing.JButton LabButton;
    private javax.swing.JButton LabButtonHS;
    private javax.swing.JButton MedicationButton;
    private javax.swing.JButton MedicationButtonHS;
    private javax.swing.JButton PatientButton;
    private javax.swing.JButton PatientButtonHS;
    private javax.swing.JButton PatientReportButton;
    private javax.swing.JButton PatientReportHS;
    private javax.swing.JButton PayrollButton;
    private javax.swing.JButton PayrollButtonHS;
    private javax.swing.JButton PerscriptionButton;
    private javax.swing.JButton PerscriptionButtonHS;
    private javax.swing.JButton Return;
    private javax.swing.JButton StaffButton;
    private javax.swing.JButton StaffButtonHS;
    private javax.swing.JButton StayButton;
    private javax.swing.JButton StayButtonHS;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
