package com.example.poject_pranfood.BusinessPartners;

public class Proposal {
    private String tenderId;
    private String title;
    private String terms;
    private String fileName;

    public Proposal(String tenderId, String title, String terms, String fileName) {
        this.tenderId = tenderId;
        this.title = title;
        this.terms = terms;
        this.fileName = fileName;
    }

    public String getTenderId() { return tenderId; }
    public String getTitle() { return title; }
    public String getTerms() { return terms; }
    public String getFileName() { return fileName; }
}
