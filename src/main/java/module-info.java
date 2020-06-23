module org.jjd {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.itworks.clicknbuild.ui.controller to javafx.fxml;
    exports org.itworks.clicknbuild;
}
