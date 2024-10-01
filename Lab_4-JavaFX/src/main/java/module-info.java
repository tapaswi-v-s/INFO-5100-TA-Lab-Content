module com.tapaswi.lab_4.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;
    requires java.base;

    opens com.tapaswi.lab_4.javafx to javafx.fxml;
    exports com.tapaswi.lab_4.javafx;
}
