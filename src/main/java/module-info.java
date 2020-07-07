module org.itworks {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fasterxml.jackson.databind;
    requires com.google.common;

    opens org.itworks.clicknbuild.ui.controller to javafx.fxml;
    exports org.itworks.clicknbuild.config.stats.model to com.fasterxml.jackson.databind;
    exports org.itworks.clicknbuild.config.stats to com.fasterxml.jackson.databind;
    exports org.itworks.clicknbuild.engine.res to com.fasterxml.jackson.databind;
    exports org.itworks.clicknbuild.engine.profile to com.fasterxml.jackson.databind;
    exports org.itworks.clicknbuild.engine.building;
    exports org.itworks.clicknbuild.engine.city;
    exports org.itworks.clicknbuild;
    exports org.itworks.clicknbuild.sources;
}
