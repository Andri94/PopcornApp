package main;

import DataBase.DataBase;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Program extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        HBox mainLayout = new HBox();

        VBox layout1 = new VBox();
        TextField txtUser = new TextField();
        txtUser.setMaxWidth(200);
        Label lblUser = new Label("Username:");
        PasswordField txtPassword = new PasswordField();
        txtPassword.setMaxWidth(200);
        Label lblPassword = new Label("Password");
        Button btnLogin = new Button("Login");
        layout1.setSpacing(5);
        layout1.setAlignment(Pos.CENTER);

        layout1.getChildren().addAll(lblUser, txtUser, lblPassword, txtPassword, btnLogin);
        Scene scena1 = new Scene(layout1, 500, 300);
        Scene scene = new Scene(mainLayout, 1200, 800);

        btnLogin.setOnAction(e -> {
            if (txtUser.getText().equals("Nemanja.Jovicic")
                    && txtPassword.getText().equals("nemke")) {
                stage.setScene(scene);
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText("Incorrect data");
                alert.setContentText("The data you entered are incorrect");
                alert.show();
                txtUser.clear();
                txtPassword.clear();
            }
        });

        RightPanel hLayout = new RightPanel();
        hLayout.getBtnLogout().setOnAction(e -> {
            stage.setScene(scena1);
            txtUser.clear();
            txtPassword.clear();
        });
        mainLayout.setStyle("-fx-border-color:black; -fx-background-color: "
                + "linear-gradient(#9ec8e8, #0d7a75, #000000); ");

        DataBase.get();

        mainLayout.getChildren().addAll(hLayout);

        stage.setScene(scena1);
        stage.setTitle("Popcorn app");
        stage.show();
    }

}
