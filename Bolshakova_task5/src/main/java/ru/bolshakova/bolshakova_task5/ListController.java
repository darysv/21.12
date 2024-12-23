package ru.bolshakova.bolshakova_task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ListController {

    @FXML
    private Button calculateButton;

    @FXML
    private TextField ninput;

    @FXML
    private Label vnOutput;

    @FXML
    void calculateButtonOnAction(ActionEvent event) {
        int n = Integer.parseInt(ninput.getText());
        if (n < 4) {
            vnOutput.setText("N должно быть больше или равно 4.");
            return;
        }

        double vn = calculateRecurrence(n);
        vnOutput.setText("v" + n + " = " + String.format("%.6f", vn));

    }

    private double calculateRecurrence(int n) {
        double v1 = 0;
        double v2 = 0;
        double v3 = 1.5;

        double vn = 0;


        if (n == 1) {
            return v1;
        } else if (n == 2) {
            return v2;
        } else if (n == 3) {
            return v3;
        }
        double vMinus3 = v1;
        double vMinus2 = v2;
        double vMinus1 = v3;


        for (int i = 4; i <= n; i++) {
            vn = ((double) (i + 1) / (i * i + 1)) * vMinus1 - vMinus2 - 2 * vMinus3;
            vMinus3 = vMinus2;
            vMinus2 = vMinus1;
            vMinus1 = vn;


        }

        return vn;
    }
    private void showError(String message) {
        vnOutput.setText(message);
    }
}



