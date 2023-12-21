module com.ayaanle.somalilandweatherinfo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;
    requires kotlin.stdlib;

    opens com.ayaanle.somalilandweatherinfo to javafx.fxml;
    exports com.ayaanle.somalilandweatherinfo;
}