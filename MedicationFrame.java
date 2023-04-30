/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package psychiatric;

/**
 *
 * @author alondrahernandez
 */
public class MedicationFrame extends javax.swing.JFrame {

    /**
     * Creates new form MedicationFrame
     */
    public MedicationFrame() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Return = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        PatientButtonPP = new javax.swing.JButton();
        PatientReportButtonPP = new javax.swing.JButton();
        StaffButtonPP = new javax.swing.JButton();
        LabButtonPP = new javax.swing.JButton();
        PerscriptionButtonPP = new javax.swing.JButton();
        MedicationButtonPP = new javax.swing.JButton();
        StayButtonPP = new javax.swing.JButton();
        DepartmentButtonPP = new javax.swing.JButton();
        PayrollButtonPP = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Return.setText("Return");
        Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnActionPerformed(evt);
            }
        });

        jLabel1.setText("Hospital System");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Dashboard");

        PatientButtonPP.setText("Patient");
        PatientButtonPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientButtonPPActionPerformed(evt);
            }
        });

        PatientReportButtonPP.setText("Patient Report");
        PatientReportButtonPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientReportButtonPPActionPerformed(evt);
            }
        });

        StaffButtonPP.setText("Staff");
        StaffButtonPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StaffButtonPPActionPerformed(evt);
            }
        });

        LabButtonPP.setText("Lab");
        LabButtonPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LabButtonPPActionPerformed(evt);
            }
        });

        PerscriptionButtonPP.setText("Perscription");
        PerscriptionButtonPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerscriptionButtonPPActionPerformed(evt);
            }
        });

        MedicationButtonPP.setText("Medication");
        MedicationButtonPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedicationButtonPPActionPerformed(evt);
            }
        });

        StayButtonPP.setText("Stay");
        StayButtonPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StayButtonPPActionPerformed(evt);
            }
        });

        DepartmentButtonPP.setText("Department");
        DepartmentButtonPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepartmentButtonPPActionPerformed(evt);
            }
        });

        PayrollButtonPP.setText("Payroll");
        PayrollButtonPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayrollButtonPPActionPerformed(evt);
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
                        .addComponent(LabButtonPP, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(StaffButtonPP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PerscriptionButtonPP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(DepartmentButtonPP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PayrollButtonPP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PatientButtonPP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PatientReportButtonPP, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                    .addComponent(StayButtonPP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(MedicationButtonPP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(26, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PatientButtonPP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PatientReportButtonPP)
                .addGap(3, 3, 3)
                .addComponent(StayButtonPP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MedicationButtonPP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PerscriptionButtonPP, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabButtonPP, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(StaffButtonPP, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PayrollButtonPP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DepartmentButtonPP)
                .addContainerGap(291, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Medication ID", "Medication Name", "Medication Type ", "Brand ", "Description"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 923, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(Return)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Return)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnActionPerformed
        this.setVisible(false);

        PsychMenu pM = new PsychMenu();
        pM.setVisible(true);
    }//GEN-LAST:event_ReturnActionPerformed

    private void PatientButtonPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientButtonPPActionPerformed
        this.setVisible(false);

        PatientFrame pF = new PatientFrame();
        pF.setVisible(true);
    }//GEN-LAST:event_PatientButtonPPActionPerformed

    private void DepartmentButtonPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepartmentButtonPPActionPerformed
        this.setVisible(false);

        StaffFrame sF = new StaffFrame();
        sF.setVisible(true);
    }//GEN-LAST:event_DepartmentButtonPPActionPerformed

    private void PatientReportButtonPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientReportButtonPPActionPerformed
        this.setVisible(false);

        PatientFrame pF = new PatientFrame();
        pF.setVisible(true);
    }//GEN-LAST:event_PatientReportButtonPPActionPerformed

    private void StayButtonPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StayButtonPPActionPerformed
        this.setVisible(false);

        StayFrame sF = new StayFrame();
        sF.setVisible(true);
    }//GEN-LAST:event_StayButtonPPActionPerformed

    private void MedicationButtonPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedicationButtonPPActionPerformed
        this.setVisible(false);

        MedicationFrame mF = new MedicationFrame();
        mF.setVisible(true);
    }//GEN-LAST:event_MedicationButtonPPActionPerformed

    private void PerscriptionButtonPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerscriptionButtonPPActionPerformed
        this.setVisible(false);

        PerscriptionFrame pF = new PerscriptionFrame();
        pF.setVisible(true);
    }//GEN-LAST:event_PerscriptionButtonPPActionPerformed

    private void LabButtonPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LabButtonPPActionPerformed
        this.setVisible(false);

        LabFrame lF = new LabFrame();
        lF.setVisible(true);
    }//GEN-LAST:event_LabButtonPPActionPerformed

    private void StaffButtonPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StaffButtonPPActionPerformed
        this.setVisible(false);

        StaffFrame sF = new StaffFrame();
        sF.setVisible(true);
    }//GEN-LAST:event_StaffButtonPPActionPerformed

    private void PayrollButtonPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayrollButtonPPActionPerformed
        this.setVisible(false);

        PayrollFrame pF = new PayrollFrame();
        pF.setVisible(true);
    }//GEN-LAST:event_PayrollButtonPPActionPerformed

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
            java.util.logging.Logger.getLogger(MedicationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedicationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedicationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedicationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedicationFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DepartmentButtonPP;
    private javax.swing.JButton LabButtonPP;
    private javax.swing.JButton MedicationButtonPP;
    private javax.swing.JButton PatientButtonPP;
    private javax.swing.JButton PatientReportButtonPP;
    private javax.swing.JButton PayrollButtonPP;
    private javax.swing.JButton PerscriptionButtonPP;
    private javax.swing.JButton Return;
    private javax.swing.JButton StaffButtonPP;
    private javax.swing.JButton StayButtonPP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
