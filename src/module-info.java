module JavaFX{
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.swing;

    opens JavaFX to javafx.fxml;
    exports JavaFX;
}