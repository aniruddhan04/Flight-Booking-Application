package coe528.lab1;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ManagerScreen{
    private Stage stage;
    private final Scene scene;
    TextField flightNumberField = new TextField();
    TextField originField = new TextField();
    TextField destinationField = new TextField();
    TextField dateTimeField = new TextField();
    TextField numberOfSeatsField = new TextField();
    TextField priceField = new TextField();
    private final Button createFlightsButton;
    private final Button removeFlightsButton;
    private final Button displayFlightsButton;
    private final Button logoutButton;
    protected static final Manager manager = new Manager();

    public ManagerScreen(){
        stage = new Stage();
        stage.setTitle("MANAGER");
        
        flightNumberField.setPromptText("Flight Number");
        originField.setPromptText("Origin");
        destinationField.setPromptText("Destination");
        dateTimeField.setPromptText("Date Time");
        numberOfSeatsField.setPromptText("Number of Seats");
        priceField.setPromptText("Price");
        
        createFlightsButton = new Button("Create Flight");
        removeFlightsButton = new Button("Remove Flights");
        displayFlightsButton = new Button("Display Flights");
        logoutButton = new Button("Logout");
        
        createFlightsButton.setOnAction(e ->{
            manager.createFlights(Integer.parseInt(flightNumberField.getText()),
                    originField.getText(),
                    destinationField.getText(),
                    dateTimeField.getText(),
                    Integer.parseInt(numberOfSeatsField.getText()),
                    Integer.parseInt(priceField.getText()));
            });
        
        displayFlightsButton.setOnAction(e -> {
            manager.displayAvailableFlights(originField.getText(),destinationField.getText());
            
            int i;
            for(i=0;i<GuestMemberScreen.guestCount;i++){
                manager.bookSeat(GuestMemberScreen.flightNumbers.get(i), GuestMemberFile.passenger.get(i));
                }
            });
        
        removeFlightsButton.setOnAction(e ->{
            manager.removeFlights();
            manager.displayAvailableFlights(originField.getText(),destinationField.getText());
            });
        
        logoutButton.setOnAction(e ->{
            stage.close();
            });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(flightNumberField,originField,destinationField,dateTimeField,numberOfSeatsField,priceField,createFlightsButton, removeFlightsButton, displayFlightsButton, logoutButton);

        scene = new Scene(layout, 500, 500);
        stage.setScene(scene);
        }
    
    public void show(){
        stage.show();
        }
    }