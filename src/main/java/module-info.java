module org.jjd {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.jjd.clicknbuild.ui.controller to javafx.fxml;
    /*opens org.jjd.clicknbuild.ui.service to javafx.fxml;*/
    exports org.jjd.clicknbuild;
}
