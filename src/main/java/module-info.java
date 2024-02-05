module com.ayaanle.somalilandweatherinfo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;
    requires org.json;
    requires kotlin.stdlib;
    //requires auto.value.annotations;
    opens com.ayaanle.somalilandweatherinfo to javafx.fxml;
    exports com.ayaanle.somalilandweatherinfo;
    exports com.ayaanle.somalilandweatherinfo.intrfc;
    opens com.ayaanle.somalilandweatherinfo.intrfc to javafx.fxml;
    exports com.ayaanle.somalilandweatherinfo.controller;
    opens com.ayaanle.somalilandweatherinfo.controller to javafx.fxml;
    exports com.ayaanle.somalilandweatherinfo.model;
    opens com.ayaanle.somalilandweatherinfo.model to javafx.fxml;
    exports com.ayaanle.somalilandweatherinfo.util;
    opens com.ayaanle.somalilandweatherinfo.util to javafx.fxml;

    //exports com.ayaanle.somalilandweatherinfo.util;
//   opens com.ayaanle.somalilandweatherinfo to javafx.fxml;
//   exports com.ayaanle.somalilandweatherinfo.intrfc;
//   opens com.ayaanle.somalilandweatherinfo.intrfc to javafx.fxml;
}