package coe528.lab1;

import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GuestMemberScreen{
    private final Stage stage;
    private final Scene scene;
    private TextField nameField;
    private TextField ageField;
    private TextField membershipYearsField;
    private TextField originField;
    private TextField destinationField;
    private TextField flightNumber;
    private final Button viewFlightsButton;
    private final Button bookFlightButton;
    private final Button logoutButton;
    protected static int guestCount;
    protected static ArrayList<Integer> flightNumbers = new ArrayList<>();

    public GuestMemberScreen(){
        stage = new Stage();
        nameField = new TextField();
        ageField = new TextField();
        membershipYearsField = new TextField();
        originField = new TextField();
        destinationField = new TextField();
        flightNumber=new TextField();
        nameField.setPromptText("Name");
        ageField.setPromptText("Age");
        membershipYearsField.setPromptText("Years of Membership");
        originField.setPromptText("Origin");
        destinationField.setPromptText("Destination");
        flightNumber.setPromptText("Flight Number");
        viewFlightsButton = new Button("View Flights");
        bookFlightButton = new Button("Book Flight");
        logoutButton = new Button("Logout");
        
        viewFlightsButton.setOnAction(e ->{
            ManagerScreen.manager.displayAllFlights();
            });
        
        bookFlightButton.setOnAction((ActionEvent e) -> {
            if (!ManagerScreen.manager.foundAFlight){
                Stage noFlightStage = new Stage();

                Label noFlightLabel = new Label(String.format("NO FLIGHTS CREATED YET!"));

                Scene noFlightScene = new Scene(noFlightLabel, 200, 200);

                noFlightStage.setScene(noFlightScene);

                noFlightStage.show();
                }
            else{
                guestCount++;
                GuestMemberFile guestMemberFile = new GuestMemberFile(
                        nameField.getText(),
                        Integer.parseInt(ageField.getText()),
                        Integer.parseInt(membershipYearsField.getText()),
                        originField.getText(),
                        destinationField.getText());

                guestMemberFile.createPassenger();

                ManagerScreen.manager.bookSeat(Integer.parseInt(flightNumber.getText()), guestMemberFile.getPassenger());
                flightNumbers.add(Integer.parseInt(flightNumber.getText()));

                Stage confirmationStage = new Stage();
                confirmationStage.setTitle("Confirmation Window"); 

                Label confirmationLabel = new Label(String.format("Booked a ticket with a %.0f%% discount on Flight %d!\nDetails:\n%s",
                        guestMemberFile.getDiscount(),
                        Integer.parseInt(flightNumber.getText()),
                        ManagerScreen.manager.Tickets.get(guestCount-1).toString()));

                Scene confirmationScene = new Scene(confirmationLabel, 300, 200);

                confirmationStage.setScene(confirmationScene);

                confirmationStage.show();

                ManagerScreen.manager.displayAllFlights();
                }
            });
        
        logoutButton.setOnAction(e -> {
            stage.close();
            });
        
        VBox layout = new VBox(10);
        layout.getChildren().addAll(nameField, ageField, membershipYearsField,originField,destinationField,flightNumber,viewFlightsButton, bookFlightButton, logoutButton);


        scene = new Scene(layout, 300, 400);
        stage.setScene(scene);
        }
    
    public void show(){
        stage.show();
    }
}
