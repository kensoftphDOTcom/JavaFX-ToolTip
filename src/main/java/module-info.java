module com.kensoftph.tooltip {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kensoftph.tooltip to javafx.fxml;
    exports com.kensoftph.tooltip;
}