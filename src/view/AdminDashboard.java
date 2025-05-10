package view;

import model.User;

import javax.swing.*;
import java.awt.*;

public class AdminDashboard extends javax.swing.JFrame {
    private User user;

    public AdminDashboard(User user) {
        this.user = user;
        initComponents();
        setTitle("IT Helpdesk - Admin Dashboard");
        setLocationRelativeTo(null);
        lblWelcome.setText("Welcome, " + user.getFullName());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblUserInfo = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnManageTickets = new javax.swing.JButton();
        btnAnalytics = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 48, 135));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("IT Helpdesk");
        lblUserInfo.setFont(new java.awt.Font("Segoe UI", 0, 14));
        lblUserInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblUserInfo.setText(user.getFullName() + " (" + user.getRole() + ")");
        btnLogout.setBackground(new java.awt.Color(230, 243, 250));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 12));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(evt -> btnLogoutActionPerformed(evt));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUserInfo)
                    .addGap(18, 18, 18)
                    .addComponent(btnLogout)
                    .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(lblUserInfo)
                        .addComponent(btnLogout))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(230, 243, 250));
        btnManageTickets.setBackground(new java.awt.Color(0, 48, 135));
        btnManageTickets.setFont(new java.awt.Font("Segoe UI", 1, 14));
        btnManageTickets.setForeground(new java.awt.Color(255, 255, 255));
        btnManageTickets.setText("Manage Tickets");
        btnManageTickets.addActionListener(evt -> btnManageTicketsActionPerformed(evt));
        btnAnalytics.setBackground(new java.awt.Color(0, 48, 135));
        btnAnalytics.setFont(new java.awt.Font("Segoe UI", 1, 14));
        btnAnalytics.setForeground(new java.awt.Color(255, 255, 255));
        btnAnalytics.setText("Analytics Dashboard");
        btnAnalytics.addActionListener(evt -> btnAnalyticsActionPerformed(evt));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnManageTickets, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                        .addComponent(btnAnalytics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(btnManageTickets)
                    .addGap(18, 18, 18)
                    .addComponent(btnAnalytics)
                    .addContainerGap(343, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        lblWelcome.setFont(new java.awt.Font("Segoe UI", 1, 18));
        lblWelcome.setText("Welcome");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblWelcome)
                    .addContainerGap(573, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblWelcome)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>

    private void btnManageTicketsActionPerformed(java.awt.event.ActionEvent evt) {
        new ManageTicketsForm(user).setVisible(true);
    }

    private void btnAnalyticsActionPerformed(java.awt.event.ActionEvent evt) {
        new AnalyticsDashboard().setVisible(true);
    }

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {
        new LoginForm().setVisible(true);
        dispose();
    }

    // Variables declaration
    private javax.swing.JButton btnAnalytics;
    private javax.swing.JButton btnManageTickets;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblUserInfo;
    private javax.swing.JLabel lblWelcome;
}