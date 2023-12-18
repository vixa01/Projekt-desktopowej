module com.example.aplikacja_projekt {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.aplikacja_projekt to javafx.fxml;
    exports com.example.aplikacja_projekt;
}