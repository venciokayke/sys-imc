module org.sysimc {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.sysimc to javafx.fxml;
    exports org.sysimc;
}