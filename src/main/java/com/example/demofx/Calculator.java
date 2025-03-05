package com.example.demofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Calculator {
    @FXML
    private TextField firstNum;

    @FXML
    private TextField secondNum;

    double result;

    @FXML
    void addition(ActionEvent event) {
        double num1 = Double.parseDouble(firstNum.getText());
        double num2 = Double.parseDouble(secondNum.getText());

        result = num1 + num2;
    }

    @FXML
    void divid(ActionEvent event) {
        double num1 = Double.parseDouble(firstNum.getText());
        double num2 = Double.parseDouble(secondNum.getText());

        result = num1 / num2;
    }

    @FXML
    void equal(ActionEvent event) {

        System.out.println("Your Result is: "+ result);
        System.out.println("welcome to the Calculator");
        System.out.println("great!");
    }

    @FXML
    void multiply(ActionEvent event) {

        double num1 = Double.parseDouble(firstNum.getText());
        double num2 = Double.parseDouble(secondNum.getText());

        result = num1 * num2;
    }

    @FXML
    void substract(ActionEvent event) {
        double num1 = Double.parseDouble(firstNum.getText());
        double num2 = Double.parseDouble(secondNum.getText());

        result = num1 - num2;
    }

}
