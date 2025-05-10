package view;

import controller.TicketController;
import model.Ticket;
import model.User;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class ManageTicketsForm extends javax.swing.JFrame {
    private User user;
    private TicketController ticketController;

    public ManageTicketsForm(User user) {
        this.user = user;
        this.ticketController = new TicketController();
        initComponents();
        setTitle("IT Helpdesk - Manage Tickets");
        setLocationRelativeTo(null);
        loadTickets();
    }

    private void loadTickets() {
        List<Ticket> tickets = ticketController.getAllTickets();
        DefaultTableModel model = (DefaultTableModel) tblTickets.getModel();
        model.setRowCount(0);
        for (Ticket ticket : tickets) {
            model.addRow(new Object[]{
                ticket.getTicketId(),
                ticket.getTitle(),
                ticket.getPriority(),
                ticket.getStatus(),
                ticket.getAssignedTechnicianId(),
                ticket.getCreatedAt(),
                ticket.getUpdatedAt()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTickets = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        cmbStatus = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtTechnicianId = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 48, 135));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Tickets");
        jPanel1.add(jLabel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        tblTickets.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {"Ticket ID", "Title", "Priority", "Status", "Technician ID", "Created At", "Updated At"}
        ) {
            boolean[] canEdit = new boolean [] {false, false, false, false, false, false, false};
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTickets);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabel2.setText("Update Status:");
        cmbStatus.setFont(new java.awt.Font("Segoe UI", 0, 14));
        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "open", "in_progress", "resolved", "closed" }));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabel3.setText("Assign Technician ID:");
        txtTechnicianId.setFont(new java.awt.Font("Segoe UI", 0, 14));
        btnUpdate.setBackground(new java.awt.Color(0, 48, 135));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14));
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(evt -> btnUpdateActionPerformed(evt));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(txtTechnicianId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnUpdate)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(txtTechnicianId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUpdate))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {
        int selectedRow = tblTickets.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a ticket", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int ticketId = (int) tblTickets.getValueAt(selectedRow, 0);
        String status = cmbStatus.getSelectedItem().toString();
        String technicianIdStr = txtTechnicianId.getText();
        int technicianId;
        try {
            technicianId = Integer.parseInt(technicianIdStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid Technician ID", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        boolean success = ticketController.updateTicketStatus(ticketId, status, technicianId);
        if (success) {
            JOptionPane.showMessageDialog(this, "Ticket updated successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            loadTickets();
        } else {
            JOptionPane.showMessageDialog(this, "Failed to update ticket", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTickets;
    private javax.swing.JTextField txtTechnicianId;
}