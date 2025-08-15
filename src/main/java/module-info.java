module oop.iub.project.project1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens oop.iub.project.project1 to javafx.fxml;
    opens oop.iub.project.project1.marketingOfficer to javafx.fxml ,java.base;
    opens oop.iub.project.project1.warehouseManager to javafx.fxml ,java.base;

    exports oop.iub.project.project1.marketingOfficer;
    exports oop.iub.project.project1.warehouseManager;

    exports oop.iub.project.project1;
}