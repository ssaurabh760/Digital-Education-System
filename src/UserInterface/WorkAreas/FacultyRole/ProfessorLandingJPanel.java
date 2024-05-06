/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkAreas.FacultyRole;

import Business.Course.CourseCatalog;
import Business.Student.SCHistoryManager;
import Business.Course.Term;
import Business.User.User;
import Business.User.UserManager;
import UserInterface.MainFrame;
import UserInterface.WorkAreas.AdminRole.PerformanceJPanel;

/**
 *
 * @author Sanskruti  <your.name at your.org>
 */
public class ProfessorLandingJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentMenuJPanel
     */
    UserManager userManager;
    User current_user;
    Term term;
    SCHistoryManager scHistoryManager;
    CourseCatalog courselist;
     Term spring2023;
    public ProfessorLandingJPanel(UserManager userManager, User current_user,CourseCatalog courselist, Term term, SCHistoryManager scHistoryManager, Term spring2023) {
        initComponents();
        this.userManager = userManager;
        this.current_user = current_user;
        this.term = term;
        this.spring2023 = spring2023;
        this.courselist = courselist;
        this.scHistoryManager = scHistoryManager;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnStudentDirectory = new javax.swing.JButton();
        btnRanking = new javax.swing.JButton();
        btnEmployeeEngage = new javax.swing.JButton();
        lbltitle1 = new javax.swing.JLabel();
        btnmanagecourse = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1000, 900));

        btnStudentDirectory.setBackground(new java.awt.Color(153, 204, 255));
        btnStudentDirectory.setText("Student Directory");
        btnStudentDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentDirectoryActionPerformed(evt);
            }
        });

        btnRanking.setBackground(new java.awt.Color(153, 204, 255));
        btnRanking.setText("Student Ranking");
        btnRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRankingActionPerformed(evt);
            }
        });

        btnEmployeeEngage.setBackground(new java.awt.Color(153, 204, 255));
        btnEmployeeEngage.setText("Term History");
        btnEmployeeEngage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeEngageActionPerformed(evt);
            }
        });

        lbltitle1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbltitle1.setText("Professor Landing Page");

        btnmanagecourse.setBackground(new java.awt.Color(153, 204, 255));
        btnmanagecourse.setText("Manage Course");
        btnmanagecourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanagecourseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnmanagecourse, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEmployeeEngage, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnStudentDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(lbltitle1)))
                .addContainerGap(195, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnEmployeeEngage, btnRanking, btnStudentDirectory});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(lbltitle1)
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnmanagecourse, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStudentDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEmployeeEngage, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnEmployeeEngage, btnRanking, btnStudentDirectory});

    }// </editor-fold>//GEN-END:initComponents

    private void btnStudentDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentDirectoryActionPerformed
        // TODO add your handling code here:
        StudentdirectoryJPanel studdirec = new StudentdirectoryJPanel(term, userManager, current_user,scHistoryManager);
        MainFrame.mfInstance.setMainframeSplitFrame(studdirec);
        
    }//GEN-LAST:event_btnStudentDirectoryActionPerformed

    private void btnRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRankingActionPerformed
        // TODO add your handling code here:
        StudentRankingJPanel studrank = new StudentRankingJPanel(scHistoryManager, current_user);
        MainFrame.mfInstance.setMainframeSplitFrame(studrank);
    }//GEN-LAST:event_btnRankingActionPerformed

    private void btnEmployeeEngageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeEngageActionPerformed
        // TODO add your handling code here:
        TermHistoryJPanel termhis = new TermHistoryJPanel(spring2023, current_user);
        MainFrame.mfInstance.setMainframeSplitFrame(termhis);
        
        
        
    }//GEN-LAST:event_btnEmployeeEngageActionPerformed

    private void btnmanagecourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanagecourseActionPerformed
        // TODO add your handling code here:
        CreateCourseJPanel createCoursePanel = new CreateCourseJPanel(courselist, term, current_user);
        MainFrame.mfInstance.setMainframeSplitFrame(createCoursePanel);
        
        
    }//GEN-LAST:event_btnmanagecourseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmployeeEngage;
    private javax.swing.JButton btnRanking;
    private javax.swing.JButton btnStudentDirectory;
    private javax.swing.JButton btnmanagecourse;
    private javax.swing.JLabel lbltitle1;
    // End of variables declaration//GEN-END:variables
}