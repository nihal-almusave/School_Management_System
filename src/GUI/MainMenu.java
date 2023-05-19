
package GUI;

import java.awt.Component;


public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu1
     */
    public MainMenu() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        split2 = new javax.swing.JSplitPane();
        jPanel4 = new javax.swing.JPanel();
        addStudentButton2 = new javax.swing.JButton();
        addTeacherButton2 = new javax.swing.JButton();
        addStaffButton2 = new javax.swing.JButton();
        teacherListButton2 = new javax.swing.JButton();
        staffListButton2 = new javax.swing.JButton();
        studentListButton2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        addUserButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");
        setMinimumSize(new java.awt.Dimension(740, 450));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setLayout(null);

        split2.setDividerLocation(250);
        split2.setToolTipText("");
        split2.setMinimumSize(new java.awt.Dimension(1366, 710));
        split2.setPreferredSize(new java.awt.Dimension(1366, 710));
        split2.setVerifyInputWhenFocusTarget(false);

        addStudentButton2.setBackground(new java.awt.Color(255, 255, 255));
        addStudentButton2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        addStudentButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/Add.png"))); // NOI18N
        addStudentButton2.setText("Admission Form");
        addStudentButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentButtonActionPerformed(evt);
            }
        });

        addTeacherButton2.setBackground(new java.awt.Color(255, 255, 255));
        addTeacherButton2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        addTeacherButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/Add.png"))); // NOI18N
        addTeacherButton2.setText("Teacher Form");
        addTeacherButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTeacherButtonActionPerformed(evt);
            }
        });

        addStaffButton2.setBackground(new java.awt.Color(255, 255, 255));
        addStaffButton2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        addStaffButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/Add.png"))); // NOI18N
        addStaffButton2.setText("Staff Form");
        addStaffButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStaffButtonActionPerformed(evt);
            }
        });

        teacherListButton2.setBackground(new java.awt.Color(255, 255, 255));
        teacherListButton2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        teacherListButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/Search.png"))); // NOI18N
        teacherListButton2.setText("Teacher Data");
        teacherListButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherListButtonActionPerformed(evt);
            }
        });

        staffListButton2.setBackground(new java.awt.Color(255, 255, 255));
        staffListButton2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        staffListButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/Search.png"))); // NOI18N
        staffListButton2.setText("Staff Data");
        staffListButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffListButtonActionPerformed(evt);
            }
        });

        studentListButton2.setBackground(new java.awt.Color(255, 255, 255));
        studentListButton2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        studentListButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/Search.png"))); // NOI18N
        studentListButton2.setText("Student Data");
        studentListButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentListButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addStudentButton2)
                    .addComponent(addTeacherButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addStaffButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherListButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(staffListButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentListButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(addStudentButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addTeacherButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addStaffButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(teacherListButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(staffListButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(studentListButton2)
                .addGap(228, 228, 228))
        );

        split2.setLeftComponent(jPanel4);

        jPanel6.setMinimumSize(new java.awt.Dimension(1366, 710));
        jPanel6.setPreferredSize(new java.awt.Dimension(1366, 710));

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("School Management System");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 102), 3));

        addUserButton.setBackground(new java.awt.Color(255, 255, 255));
        addUserButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        addUserButton.setText("+Add User");
        addUserButton.setToolTipText("click here to add new user");
        addUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserButtonActionPerformed(evt);
            }
        });

        logoutButton.setBackground(new java.awt.Color(255, 255, 255));
        logoutButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/logout.png"))); // NOI18N
        logoutButton.setText("Logout");
        logoutButton.setToolTipText("click here to logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addUserButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logoutButton)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 614, Short.MAX_VALUE))
        );

        split2.setRightComponent(jPanel6);

        jPanel1.add(split2);
        split2.setBounds(0, 0, 1310, 680);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1310, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        Login login=new Login();
        this.setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void addUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserButtonActionPerformed
        UserRegisteration user=new UserRegisteration();
        this.hide();
        user.setVisible(true);
    }//GEN-LAST:event_addUserButtonActionPerformed

    private void studentListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentListButtonActionPerformed
        StudentRecord record=new StudentRecord();
        this.hide();
        record.setVisible(true);
    }//GEN-LAST:event_studentListButtonActionPerformed

    private void staffListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffListButtonActionPerformed
         StaffRecord record=new  StaffRecord();
        this.hide();
        record.setVisible(true);
    }//GEN-LAST:event_staffListButtonActionPerformed

    private void teacherListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherListButtonActionPerformed
        TeacherRecord record=new TeacherRecord();
        this.hide();
        record.setVisible(true);
    }//GEN-LAST:event_teacherListButtonActionPerformed

    private void addStaffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStaffButtonActionPerformed
        StaffForm record=new  StaffForm();
        this.hide();
        record.setVisible(true);
    }//GEN-LAST:event_addStaffButtonActionPerformed

    private void addTeacherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTeacherButtonActionPerformed
         TeacherForm record=new TeacherForm();
        this.hide();
        record.setVisible(true);
    }//GEN-LAST:event_addTeacherButtonActionPerformed

    private void addStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentButtonActionPerformed
       StudentForm record=new StudentForm();
        this.hide();
        record.setVisible(true);
    }//GEN-LAST:event_addStudentButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }
    
    private javax.swing.JButton addStaffButton2;
    private javax.swing.JButton addStudentButton2;
    private javax.swing.JButton addTeacherButton2;
    private javax.swing.JButton addUserButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton logoutButton;
    private javax.swing.JSplitPane split2;
    private javax.swing.JButton staffListButton2;
    private javax.swing.JButton studentListButton2;
    private javax.swing.JButton teacherListButton2;


    private static class stud extends Component {

        public stud() {
        }
    }
}
