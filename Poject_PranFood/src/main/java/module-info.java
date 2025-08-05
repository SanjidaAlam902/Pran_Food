module com.example.poject_pranfood {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.poject_pranfood to javafx.fxml;
    exports com.example.poject_pranfood;
}