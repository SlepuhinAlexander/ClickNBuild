module org.jjd {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.jjd.ui.controller to javafx.fxml;
    /*opens org.jjd.ui.service to javafx.fxml;*/
    exports org.jjd;
}