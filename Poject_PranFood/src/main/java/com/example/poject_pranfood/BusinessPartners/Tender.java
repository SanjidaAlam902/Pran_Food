package com.example.poject_pranfood.BusinessPartners;

import java.time.LocalDate;

public class Tender {
    private String id;
    private String title;
    private String category;
    private LocalDate deadline;
    private String status;

    public Tender(String id, String title, String category, LocalDate deadline, String status) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.deadline = deadline;
        this.status = status;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getCategory() { return category; }
    public LocalDate getDeadline() { return deadline; }
    public String getStatus() { return status; }
}
