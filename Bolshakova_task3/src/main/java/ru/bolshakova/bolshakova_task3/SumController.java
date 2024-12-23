package ru.bolshakova.bolshakova_task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField aTextField;

    @FXML
    private Button calculateButton;

    @FXML
    private Label resultLabel;

    @FXML
    private TextArea resultTextArea;

    @FXML
    void calculateButtonOnAction(ActionEvent event) {
        try {
            double pricePerKg = Double.parseDouble(aTextField.getText());
            StringBuilder sb = new StringBuilder();
            for (double weight = 1.2; weight <= 2.0; weight += 0.2) {
                double cost = weight * pricePerKg;
                sb.append(String.format("Стоимость %.1f кг: %.1f рублей\n", weight, cost));
            }
            resultTextArea.setText(sb.toString());
        } catch (NumberFormatException ex){
         calculateButton.setText("Heкoppeктный ввoд");
        } finally {
            aTextField.setText("");
        }


    }

}
