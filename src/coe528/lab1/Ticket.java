package coe528.lab1;

public class Ticket{
    private Passenger passenger;
    private Flight flight;
    private double price;
    private int ID;
    private static int totalTickets = 0;

    public Ticket(Passenger p, Flight f, double price){
        this.passenger = p;
        this.flight = f;
        this.price = price;
        this.ID = ++Ticket.totalTickets;
        }
    
    public Passenger getPassenger() {
        return passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public double getPrice() {
        return price;
    }

    public int getID() {
        return ID;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
public String toString(){
    return String.format("""
                         Passenger: %s
                         Flight Number: %d
                         Route: %s to %s
                         Departure Date and Time: %s
                         Original Price: $%.2f
                         Ticket Price: $%.2f
                         """,
    this.passenger.getName(),
    this.flight.getFlightNumber(),
    this.flight.getOrigin(),
    this.flight.getDestination(),
    this.flight.getDepartureTime(),
    this.flight.getOriginalPrice(),
    this.price
            );
    }
}