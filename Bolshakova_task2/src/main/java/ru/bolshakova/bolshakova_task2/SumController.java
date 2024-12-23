package ru.bolshakova.bolshakova_task2;

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

        int n = data.get(0); // Number of students

        if (n < 1 || n > 30) {
            answerTextArea.setText("Некорректное количество учеников.");
            return;
        }

        int unsatisfactoryCount = 0;
        boolean allSolved = false;


        for (int i = 1; i <= n ; i++) {
            int solvedCount = data.get(i);


            if (solvedCount < 5) {
                unsatisfactoryCount++;
            }
            if (solvedCount == 10) {
                allSolved = true;
            }
        }

        answerTextArea.setText(unsatisfactoryCount + System.lineSeparator() + (allSolved ? "YES" : "NO"));
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
