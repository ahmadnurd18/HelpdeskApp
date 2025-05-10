CREATE DATABASE helpdesk_db;
USE helpdesk_db;

-- Users table
CREATE TABLE users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    role ENUM('user', 'admin', 'technician') NOT NULL,
    email VARCHAR(100),
    full_name VARCHAR(100),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Tickets table
CREATE TABLE tickets (
    ticket_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    title VARCHAR(100) NOT NULL,
    description TEXT NOT NULL,
    priority ENUM('low', 'medium', 'high') NOT NULL,
    status ENUM('open', 'in_progress', 'resolved', 'closed') NOT NULL,
    assigned_technician_id INT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES users(user_id),
    FOREIGN KEY (assigned_technician_id) REFERENCES users(user_id)
);

-- Knowledge Base table
CREATE TABLE knowledge_base (
    kb_id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    content TEXT NOT NULL,
    keywords VARCHAR(255),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Analytics table (for tracking resolution times)
CREATE TABLE analytics (
    analytics_id INT AUTO_INCREMENT PRIMARY KEY,
    ticket_id INT,
    resolution_time INT, -- in minutes
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (ticket_id) REFERENCES tickets(ticket_id)
);

-- Insert sample data
INSERT INTO users (username, password, role, email, full_name) VALUES
('user1', 'password123', 'user', 'user1@example.com', 'John Doe'),
('admin1', 'admin123', 'admin', 'admin1@example.com', 'Admin One'),
('tech1', 'tech123', 'technician', 'tech1@example.com', 'Technician One');

INSERT INTO knowledge_base (title, content, keywords) VALUES
('Printer Not Working', 'Check if the printer is powered on and connected to the network...', 'printer, error, connection'),
('Password Reset', 'To reset your password, go to the login page and click Forgot Password...', 'password, reset, login');