package model;

import java.sql.Timestamp;

public class KnowledgeBase {
    private int kbId;
    private String title;
    private String content;
    private String keywords;
    private Timestamp createdAt;

    // Constructor
    public KnowledgeBase(int kbId, String title, String content, String keywords, Timestamp createdAt) {
        this.kbId = kbId;
        this.title = title;
        this.content = content;
        this.keywords = keywords;
        this.createdAt = createdAt;
    }

    // Getters and Setters
    public int getKbId() { return kbId; }
    public void setKbId(int kbId) { this.kbId = kbId; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
    public String getKeywords() { return keywords; }
    public void setKeywords(String keywords) { this.keywords = keywords; }
    public Timestamp getCreatedAt() { return createdAt; }
    public void setCreatedAt(Timestamp createdAt) { this.createdAt = createdAt; }
}