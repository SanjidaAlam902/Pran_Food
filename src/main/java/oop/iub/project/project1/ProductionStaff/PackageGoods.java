package oop.iub.project.project1.ProductionStaff;

public class PackageGoods {
    private String productType;
    private int quantity;
    private int packagingLineId;

    public PackageGoods(String productType, int quantity, int packagingLineId) {
        this.productType = productType;
        this.quantity = quantity;
        this.packagingLineId = packagingLineId;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPackagingLineId() {
        return packagingLineId;
    }

    public void setPackagingLineId(int packagingLineId) {
        this.packagingLineId = packagingLineId;
    }

    @Override
    public String toString() {
        return "PackageGoods{" +
                "productType='" + productType + '\'' +
                ", quantity=" + quantity +
                ", packagingLineId=" + packagingLineId +
                '}';
    }
}
