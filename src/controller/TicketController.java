package controller;

import model.DatabaseConnection;
import model.Ticket;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TicketController {
    public boolean createTicket(int userId, String title, String description, String priority) {
        String query = "INSERT INTO tickets (user_id, title, description, priority, status) VALUES (?, ?, ?, ?, 'open')";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, userId);
            stmt.setString(2, title);
            stmt.setString(3, description);
            stmt.setString(4, priority);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Ticket> getTicketsByUser(int userId) {
        List<Ticket> tickets = new ArrayList<>();
        String query = "SELECT * FROM tickets WHERE user_id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, userId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                tickets.add(new Ticket(
                    rs.getInt("ticket_id"),
                    rs.getInt("user_id"),
                    rs.getString("title"),
                    rs.getString("description"),
                    rs.getString("priority"),
                    rs.getString("status"),
                    rs.getInt("assigned_technician_id"),
                    rs.getTimestamp("created_at"),
                    rs.getTimestamp("updated_at")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tickets;
    }

    public List<Ticket> getAllTickets() {
        List<Ticket> tickets = new ArrayList<>();
        String query = "SELECT * FROM tickets";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                tickets.add(new Ticket(
                    rs.getInt("ticket_id"),
                    rs.getInt("user_id"),
                    rs.getString("title"),
                    rs.getString("description"),
                    rs.getString("priority"),
                    rs.getString("status"),
                    rs.getInt("assigned_technician_id"),
                    rs.getTimestamp("created_at"),
                    rs.getTimestamp("updated_at")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tickets;
    }

    public boolean updateTicketStatus(int ticketId, String status, int technicianId) {
        String query = "UPDATE tickets SET status = ?, assigned_technician_id = ? WHERE ticket_id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, status);
            stmt.setInt(2, technicianId);
            stmt.setInt(3, ticketId);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public String suggestPriority(String description) {
        description = description.toLowerCase();
        if (description.contains("urgent") || description.contains("critical")) {
            return "high";
        } else if (description.contains("important")) {
            return "medium";
        } else {
            return "low";
        }
    }
}