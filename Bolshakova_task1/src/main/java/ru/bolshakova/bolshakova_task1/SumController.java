package ru.bolshakova.bolshakova_task1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.List;

public class SumController {

    @FXML
    private Button OkButton;

    @FXML
    private Button addButton;

    @FXML
    private TextArea answerTextArea;

    @FXML
    private Button cancelButton;

    @FXML
    private ListView<Integer> dataListView;

    @FXML
    private TextField numberTextField;

    @FXML
    void OkButtonOnAction(ActionEvent event) {
        List<Integer> data = dataListView.getItems();
        int sum = 0;
        int count = 0;

        for (Integer num : data) {  // Iterate through all items
            if (num >= 10 && num <= 99) {  // Check for two-digit numbers
                sum += num;
                count++;
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            answerTextArea.setText(String.valueOf(average));
        } else {
            answerTextArea.setText("NO");
        }
    }

    @FXML
    void addButtonOnAction(ActionEvent event) {
        if (numberTextField.getText().isEmpty()) {
            return;
        }
        try {
            int x = Integer.parseInt(numberTextField.getText().toString());

            dataListView.getItems().add(x);
        } catch (NumberFormatException ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);

            alert.setContentText("Введены некорректные данные");
            alert.showAndWait();
        } finally {
            numberTextField.setText("");
        }
    }


    @FXML
    void cancelButtonOnAction(ActionEvent event) {
        Platform.exit();
    }

}
