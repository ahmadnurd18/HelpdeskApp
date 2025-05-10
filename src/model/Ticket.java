package model;

import java.sql.Timestamp;

public class Ticket {
    private int ticketId;
    private int userId;
    private String title;
    private String description;
    private String priority;
    private String status;
    private int assignedTechnicianId;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    // Constructor
    public Ticket(int ticketId, int userId, String title, String description, String priority, String status, int assignedTechnicianId, Timestamp createdAt, Timestamp updatedAt) {
        this.ticketId = ticketId;
        this.userId = userId;
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.status = status;
        this.assignedTechnicianId = assignedTechnicianId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    // Getters and Setters
    public int getTicketId() { return ticketId; }
    public void setTicketId(int ticketId) { this.ticketId = ticketId; }
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getPriority() { return priority; }
    public void setPriority(String priority) { this.priority = priority; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public int getAssignedTechnicianId() { return assignedTechnicianId; }
    public void setAssignedTechnicianId(int assignedTechnicianId) { this.assignedTechnicianId = assignedTechnicianId; }
    public Timestamp getCreatedAt() { return createdAt; }
    public void setCreatedAt(Timestamp createdAt) { this.createdAt = createdAt; }
    public Timestamp getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(Timestamp updatedAt) { this.updatedAt = updatedAt; }
}