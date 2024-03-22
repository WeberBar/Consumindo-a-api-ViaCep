module org.example.consultarcep {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires com.google.gson;
    requires java.desktop;


    opens org.example.consultarcep to javafx.fxml;
    exports org.example.consultarcep;
    exports org.example.consultarcep.classes;
    opens org.example.consultarcep.classes to javafx.fxml;
    exports org.example.consultarcep.exceptions;
    opens org.example.consultarcep.exceptions to javafx.fxml;
}