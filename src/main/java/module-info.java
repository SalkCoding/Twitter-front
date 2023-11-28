module com.salkcdoing.twitter.twitter {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;


    opens com.salkcdoing.twitter.twitter to javafx.fxml;
    exports com.salkcdoing.twitter.twitter;
}