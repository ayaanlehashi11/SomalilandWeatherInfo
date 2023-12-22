module com.ayaanle.somalilandweatherinfo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;
    requires kotlin.stdlib;
    requires org.jsoup;

    opens com.ayaanle.somalilandweatherinfo to javafx.fxml;
    exports com.ayaanle.somalilandweatherinfo;
    exports com.ayaanle.somalilandweatherinfo.interfaces;
    opens com.ayaanle.somalilandweatherinfo.interfaces to javafx.fxml;
    exports com.ayaanle.somalilandweatherinfo.util;
    opens com.ayaanle.somalilandweatherinfo.util to javafx.fxml;
    exports com.ayaanle.somalilandweatherinfo.view;
    opens com.ayaanle.somalilandweatherinfo.view to javafx.fxml;
}