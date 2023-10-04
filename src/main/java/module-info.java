module com.fyxren.die {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.fyxren.die to javafx.fxml;
    exports com.fyxren.die;
}