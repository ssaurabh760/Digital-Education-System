/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkAreas.FacultyRole;

/**
 *
 * @author Sanskruti  <your.name at your.org>
 */
public class TermCourseActiveJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ActiveCourseJPanel
     */
    public TermCourseActiveJPanel() {
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

        lbltitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCourses = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnSearchCourse = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lbltitle1 = new javax.swing.JLabel();
        txtSearchCourse = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(800, 600));

        lbltitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbltitle.setText("Search courses by Name :");

        tblCourses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Course Name", "Course ranking", "Professor Name", "Term"
            }
        ));
        jScrollPane1.setViewportView(tblCourses);

        btnView.setBackground(new java.awt.Color(153, 204, 255));
        btnView.setText("View Details");

        btnSearchCourse.setBackground(new java.awt.Color(153, 204, 255));
        btnSearchCourse.setText("Search");
        btnSearchCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchCourseActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(153, 153, 153));
        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lbltitle1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbltitle1.setText("Active Courses");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSearchCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSearchCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnView, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(lbltitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnSearchCourse, btnView});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(lbltitle1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltitle)
                    .addComponent(txtSearchCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBack, btnSearchCourse, btnView});

    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchCourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchCourseActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearchCourse;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JLabel lbltitle1;
    private javax.swing.JTable tblCourses;
    private javax.swing.JTextField txtSearchCourse;
    // End of variables declaration//GEN-END:variables
}
