module ru.bolshakova.bolshakova_task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.bolshakova.bolshakova_task2 to javafx.fxml;
    exports ru.bolshakova.bolshakova_task2;
}