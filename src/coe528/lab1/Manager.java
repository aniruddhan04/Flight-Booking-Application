package coe528.lab1;

import java.util.ArrayList;

public class Manager{
    protected final ArrayList<Flight> Flights;
    protected final ArrayList<Ticket> Tickets;
    boolean foundAFlight = false;

    public Manager(){
        this.Flights = new ArrayList<>();
        this.Tickets = new ArrayList<>();
        }
    
    public void createFlights(int flightNumber,String origin,String destination, String dateTime, int seats,int price){
        Flights.add(new Flight(flightNumber,origin,destination,dateTime,seats ,price));
        }
    
    public void removeFlights(){
        Flights.clear();
        }

    
    public void displayAvailableFlights(String origin, String destination){
        System.out.println(String.format("\nFlights from %s to %s:", origin, destination));
        for (Flight flight : Flights){
            if (flight.getOrigin().equals(origin) && flight.getDestination().equals(destination) && flight.getNumberOfSeatsLeft() > 0){
                System.out.println(flight);
                foundAFlight = true;
            }
        }
        if(!foundAFlight){
            System.out.println(String.format("\n No available flights from %s to %s.", origin, destination));
        }
    }
    
    public void displayAllFlights(){
        System.out.println("\nAll available flights:");
        for (Flight flight : Flights){
            if (flight.getNumberOfSeatsLeft() > 0){
                System.out.println(flight+"\n");
                }
            }
        }
    
    public Flight getFlight(int flightNumber){
        for(Flight flight : Flights){
            if(flight.getFlightNumber() == flightNumber){
                return flight;
                }
            }
        return null;
        }
    
    public void bookSeat(int flightNumber, Passenger p){
        System.out.println(String.format("\nBooking: %s\n Flight number: %d\n", p.toString(), flightNumber));
        Flight flight = this.getFlight(flightNumber);
        if (flight == null){
            return;
            }
        if (flight.bookASeat()){
            Tickets.add(new Ticket(p,flight,p.applyDiscount(flight.getOriginalPrice())));
            }
        }
    }