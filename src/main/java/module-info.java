module com.example.itemtool {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.itemtool to javafx.fxml;
    exports com.example.itemtool;
}