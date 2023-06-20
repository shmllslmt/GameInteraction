module com.shamilla.gameinteraction {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.shamilla.gameinteraction to javafx.fxml;
    exports com.shamilla.gameinteraction;
}