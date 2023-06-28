module com.hometask.hometask {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.hometask.hometask to javafx.fxml;
    exports com.hometask.hometask;
}