module com.monsterstrike {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.monsterstrike to javafx.fxml;
    exports com.monsterstrike;
}