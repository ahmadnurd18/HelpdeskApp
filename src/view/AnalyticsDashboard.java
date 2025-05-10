package view;

import controller.AnalyticsController;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;

public class AnalyticsDashboard extends javax.swing.JFrame {
    private AnalyticsController analyticsController;

    public AnalyticsDashboard() {
        this.analyticsController = new AnalyticsController();
        initComponents();
        setTitle("IT Helpdesk - Analytics Dashboard");
        setLocationRelativeTo(null);
        loadChart();
    }

    private void loadChart() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        // Sample data (replace with real data from AnalyticsController)
        dataset.addValue(analyticsController.getTicketCountByStatus("open"), "Tickets", "Open");
        dataset.addValue(analyticsController.getTicketCountByStatus("in_progress"), "Tickets", "In Progress");
        dataset.addValue(analyticsController.getTicketCountByStatus("resolved"), "Tickets", "Resolved");
        dataset.addValue