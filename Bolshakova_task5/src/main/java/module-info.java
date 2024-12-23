module ru.bolshakova.bolshakova_task5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.bolshakova.bolshakova_task5 to javafx.fxml;
    exports ru.bolshakova.bolshakova_task5;
}