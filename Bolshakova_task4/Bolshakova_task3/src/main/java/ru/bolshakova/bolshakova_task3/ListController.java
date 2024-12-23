package ru.bolshakova.bolshakova_task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ListController {

    @FXML
    private TextField NTextField;

    @FXML
    private TextField XTextField;

    @FXML
    private Button calculateButton;

    @FXML
    private Label resultLabel;

    @FXML
    void calculateButtonOnAction(ActionEvent event) {
        double x = Double.parseDouble(NTextField.getText());
        int n = Integer.parseInt(XTextField.getText());
        double result = 1.0;

        for (int i = 1; i <= n; i++) {
            double term = Math.pow(-1, i) * Math.pow(x, 2 * i) / factorial(2 * i);
            result += term;
        }

        resultLabel.setText(String.valueOf(result));
    }

    private double factorial(int num) {
        double fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }


}


