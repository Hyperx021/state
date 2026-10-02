module com.example.state {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.testng;
    requires org.junit.jupiter.api;


    opens com.example.state to javafx.fxml;
    exports com.example.state;
}