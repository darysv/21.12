module ru.bolshakova.bolshakova_task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.bolshakova.bolshakova_task3 to javafx.fxml;
    exports ru.bolshakova.bolshakova_task3;
}