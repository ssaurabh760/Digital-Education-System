/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkAreas.AdminRole;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import Business.Course.CourseCatalog;
import Business.Course.CourseOffering;
import Business.Student.SCHistoryManager;
import Business.Student.StudentCourseHistory;
import Business.Course.Term;
import Business.User.User;
import Business.User.UserManager;
import UserInterface.MainFrame;

/**
 *
 * @author Sanskruti  <your.name at your.org>
 */
public class PerformanceJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentMenuJPanel
     */
     UserManager userManager;
     Term term;
     SCHistoryManager scHisManager ;
     User current_user;
     CourseCatalog courselist;
     ArrayList<StudentCourseHistory> gradRequest = new ArrayList<>();
    public PerformanceJPanel(UserManager userManager,  CourseCatalog courselist, SCHistoryManager scHisManager, User current_user, ArrayList<StudentCourseHistory> gradRequest) {
        initComponents();
        this.userManager = userManager;
        this.courselist = courselist;
        this.scHisManager = scHisManager;
        this.current_user=current_user;
        this.gradRequest=gradRequest;
        populateData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbltitle1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txttpr = new javax.swing.JTextField();
        txttco = new javax.swing.JTextField();
        txttcr = new javax.swing.JTextField();
        txttsr = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txttsrg = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(800, 600));

        lbltitle1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbltitle1.setText("Perfomance Dashboard");

        jLabel2.setText("Total Professors Registered:");

        jLabel3.setText("Total Students Registered:");

        jLabel4.setText("Total Courses Offered:");

        jLabel5.setText("Total Courses Registered:");

        txttpr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttprActionPerformed(evt);
            }
        });

        txttsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttsrActionPerformed(evt);
            }
        });

        jLabel6.setText("Total Students Ready to Graduate:");

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setText("<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(50, 50, 50)
                        .addComponent(lbltitle1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                            .addComponent(txttsrg, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txttpr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txttsr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txttco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txttcr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(267, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltitle1)
                    .addComponent(jButton1))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttsr, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttpr, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttco, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttcr, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(txttsrg, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txttsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttsrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttsrActionPerformed

    private void txttprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttprActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttprActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MainFrame.mfInstance.setLandingPage(current_user);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbltitle1;
    private javax.swing.JTextField txttco;
    private javax.swing.JTextField txttcr;
    private javax.swing.JTextField txttpr;
    private javax.swing.JTextField txttsr;
    private javax.swing.JTextField txttsrg;
    // End of variables declaration//GEN-END:variables

    private void populateData() {
        
        txttsr.setText(String.valueOf(userManager.getStudentList().size()));
        txttpr.setText(String.valueOf(userManager.getProfessorList().size()));
        txttco.setText(String.valueOf(courselist.getCourselist().size()));
        txttsrg.setText(String.valueOf(gradRequest.size()));
        
        HashSet uniqueCourseSet = new HashSet();
        for(Map.Entry<User, StudentCourseHistory> entry : scHisManager.getStudentCourseHisList().entrySet()) {
            ArrayList<CourseOffering> registeredCourseList= entry.getValue().getCourseWork();
            uniqueCourseSet.addAll(registeredCourseList);
        }
        txttcr.setText(String.valueOf(uniqueCourseSet.size()));
        
    }
}