module com.example.progetto_software {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;
    //requires mysql.connector.java;

    opens com.example.progetto_software to javafx.fxml;
    exports com.example.progetto_software;





}