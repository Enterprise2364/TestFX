module ch.trinat.test {
    requires javafx.controls;
    requires javafx.fxml;


    opens ch.trinat.test to javafx.fxml;
    exports ch.trinat.test;
}