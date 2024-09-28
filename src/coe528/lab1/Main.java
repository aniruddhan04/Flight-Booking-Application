package coe528.lab1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage){
        TextField usernameField = new TextField();
        usernameField.setPromptText("Username");

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Password");

        Button loginManagerButton = new Button("Login as Manager");
        Button loginGuestMemberButton = new Button("Login as Guest/Member");
  
        loginManagerButton.setOnAction(e -> {
            String username = usernameField.getText();
            String password = passwordField.getText();

            if ("manager".equals(username) && "admin".equals(password)){
                ManagerScreen managerScreen = new ManagerScreen();
                managerScreen.show();
                }
            });
        
        loginGuestMemberButton.setOnAction(e -> {
            String username = usernameField.getText();
            String password = passwordField.getText();
            GuestMemberScreen guestMemberScreen = new GuestMemberScreen();
            guestMemberScreen.show();                
            });

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(usernameField, passwordField, loginManagerButton,loginGuestMemberButton);

        Scene scene = new Scene(layout, 300, 200);

        primaryStage.setTitle("Login");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}