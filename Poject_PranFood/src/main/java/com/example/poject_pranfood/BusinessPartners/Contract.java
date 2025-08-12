package com.example.poject_pranfood.BusinessPartners;

import java.time.LocalDate;

public class Contract {
    private String id;
    private String title;
    private String status;
    private LocalDate startDate;
    private LocalDate endDate;

    public Contract(String id, String title, String status, LocalDate startDate, LocalDate endDate) {
        this.id = id;
        this.title = title;
        this.status = status;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getStatus() { return status; }
    public LocalDate getStartDate() { return startDate; }
    public LocalDate getEndDate() { return endDate; }
}
