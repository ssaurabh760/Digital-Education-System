/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkAreas.AdminRole;

import UserInterface.WorkAreas.FacultyRole.*;
import Business.Course.CourseCatalog;
import Business.Student.SCHistoryManager;
import Business.Course.Term;
import Business.Student.StudentCourseHistory;
import Business.User.User;
import Business.User.UserManager;
import UserInterface.MainFrame;
import UserInterface.WorkAreas.AdminRole.PerformanceJPanel;
import java.util.ArrayList;

/**
 *
 * @author Sanskruti  <your.name at your.org>
 */
public class AdminLandingJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentMenuJPanel
     */
    UserManager userManager;
    User current_user;
    Term term;
    SCHistoryManager scHistoryManager;
    CourseCatalog courselist;
    ArrayList<StudentCourseHistory> gradRequest = new ArrayList<>();
   
    public AdminLandingJPanel(UserManager userManager, User current_user,CourseCatalog courselist, Term term, SCHistoryManager scHistoryManager,ArrayList<StudentCourseHistory> gradRequest) {
        initComponents();
        this.userManager = userManager;
        this.current_user = current_user;
        this.term = term;
        this.courselist = courselist;
        this.scHistoryManager = scHistoryManager;
        this.gradRequest = gradRequest;
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
        btnUserManagement = new javax.swing.JButton();
        btnPerformanceDashboard = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1000, 900));

        lbltitle1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbltitle1.setText("Admin Landing Page");

        btnUserManagement.setBackground(new java.awt.Color(153, 204, 255));
        btnUserManagement.setText("User Management");
        btnUserManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserManagementActionPerformed(evt);
            }
        });

        btnPerformanceDashboard.setBackground(new java.awt.Color(153, 204, 255));
        btnPerformanceDashboard.setText("Performance Dashboard");
        btnPerformanceDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerformanceDashboardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(btnUserManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                .addComponent(btnPerformanceDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
            .addGroup(layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(lbltitle1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(lbltitle1)
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUserManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPerformanceDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(332, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUserManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserManagementActionPerformed
        // TODO add your handling code here:
        UserManagementJPanel umPanel = new UserManagementJPanel(userManager, current_user);
        MainFrame.mfInstance.setMainframeSplitFrame(umPanel);
        

    }//GEN-LAST:event_btnUserManagementActionPerformed

    private void btnPerformanceDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerformanceDashboardActionPerformed
        // TODO add your handling code here:
        PerformanceJPanel pfPanel = new PerformanceJPanel(userManager,courselist,scHistoryManager,current_user,gradRequest);
        MainFrame.mfInstance.setMainframeSplitFrame(pfPanel);
    }//GEN-LAST:event_btnPerformanceDashboardActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPerformanceDashboard;
    private javax.swing.JButton btnUserManagement;
    private javax.swing.JLabel lbltitle1;
    // End of variables declaration//GEN-END:variables
}