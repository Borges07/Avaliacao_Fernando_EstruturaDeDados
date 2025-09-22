module org.example.provan1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.provan1 to javafx.fxml;
    exports org.example.provan1;
}