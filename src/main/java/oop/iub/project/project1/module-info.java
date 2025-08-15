module com.example.oopproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.oopproject to javafx.fxml;
    opens com.example.oopproject.ProductionStaff to javafx.fxml, java.base ;
    opens com.example.oopproject.Suppliers to javafx.fxml, java.base ;

    exports com.example.oopproject.ProductionStaff;
    exports com.example.oopproject.Suppliers;

    exports com.example.oopproject;
}