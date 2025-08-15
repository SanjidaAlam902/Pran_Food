package oop.iub.project.project1.Suppliers;

public class ReqSupplyCls {
    private String materialType,reason,urgencyLevel;
    private int quantity;

    public ReqSupplyCls(String materialType, String reason, String urgencyLevel, int quantity) {
        this.materialType = materialType;
        this.reason = reason;
        this.urgencyLevel = urgencyLevel;
        this.quantity = quantity;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getUrgencyLevel() {
        return urgencyLevel;
    }

    public void setUrgencyLevel(String urgencyLevel) {
        this.urgencyLevel = urgencyLevel;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ReqSupplyCls{" +
                "materialType='" + materialType + '\'' +
                ", reason='" + reason + '\'' +
                ", urgencyLevel='" + urgencyLevel + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
