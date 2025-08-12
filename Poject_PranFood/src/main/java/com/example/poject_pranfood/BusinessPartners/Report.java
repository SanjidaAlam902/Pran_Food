package com.example.poject_pranfood.BusinessPartners;

public class Report {
    private String type;
    private String fileName;

    public Report(String type, String fileName) {
        this.type = type;
        this.fileName = fileName;
    }

    public String getType() { return type; }
    public String getFileName() { return fileName; }
}
