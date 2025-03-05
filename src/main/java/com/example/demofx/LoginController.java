package com.example.demofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;



public class LoginController {
    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtPassword;

    @FXML
    void login(ActionEvent event) {
        String dbemail = "admin@gmail.com";
        String dbpassword = "123";
        String email = txtEmail.getText();
        String password = txtPassword.getText();

        if (email.isEmpty() || password.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
        }

        if (email.equals(dbemail) && password.equals(dbpassword)) {
            System.out.println("Login Successful");
        }
        else {
            System.out.println("Login Failed");
            System.out.println("try again later");
        }



    }

}
