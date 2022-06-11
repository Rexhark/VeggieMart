module main.veggiemart {
    requires javafx.controls;
    requires javafx.fxml;


    opens main.veggiemart to javafx.fxml;
    exports main.veggiemart;
}