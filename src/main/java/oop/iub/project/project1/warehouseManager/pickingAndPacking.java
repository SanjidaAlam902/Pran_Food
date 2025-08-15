package oop.iub.project.project1.warehouseManager;

public class pickingAndPacking {
    private String itemCode;
    private String itemName;
    private String location;
    private String picked;

    public pickingAndPacking(String itemCode, String itemName, String location, String picked) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.location = location;
        this.picked = picked;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPicked() {
        return picked;
    }

    public void setPicked(String picked) {
        this.picked = picked;
    }

    @Override
    public String toString() {
        return "pickingAndPacking{" +
                "itemCode='" + itemCode + '\'' +
                ", itemName='" + itemName + '\'' +
                ", location='" + location + '\'' +
                ", picked='" + picked + '\'' +
                '}';
    }
}
