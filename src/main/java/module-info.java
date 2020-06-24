module org.itworks {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fasterxml.jackson.databind;

    opens org.itworks.clicknbuild.ui.controller to javafx.fxml;
    exports org.itworks.clicknbuild.config.stats.model to com.fasterxml.jackson.databind;
    exports org.itworks.clicknbuild.engine.model to com.fasterxml.jackson.databind;
    exports org.itworks.clicknbuild;
    exports org.itworks.clicknbuild.sources;
}
