module com.ayaanle.somalilandweatherinfo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;
    requires org.json;
    requires kotlin.stdlib;
    opens com.ayaanle.somalilandweatherinfo to javafx.fxml;
    exports com.ayaanle.somalilandweatherinfo;
    exports com.ayaanle.somalilandweatherinfo.intrfc;
    opens com.ayaanle.somalilandweatherinfo.intrfc to javafx.fxml;

    //exports com.ayaanle.somalilandweatherinfo.util;
//   opens com.ayaanle.somalilandweatherinfo to javafx.fxml;
//   exports com.ayaanle.somalilandweatherinfo.intrfc;
//   opens com.ayaanle.somalilandweatherinfo.intrfc to javafx.fxml;
}