package oop.iub.project.project1.ProductionStaff;

import java.time.LocalDate;

public class ProductionLog {
    private LocalDate date;
    private int batchId;
    private  String outcome;

    public ProductionLog(LocalDate date, int batchId, String outcome) {
        this.date = date;
        this.batchId = batchId;
        this.outcome = outcome;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getBatchId() {
        return batchId;
    }

    public void setBatchId(int batchId) {
        this.batchId = batchId;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    @Override
    public String toString() {
        return "ProductionLog{" +
                "date=" + date +
                ", batchId=" + batchId +
                ", outcome='" + outcome + '\'' +
                '}';
    }
}
