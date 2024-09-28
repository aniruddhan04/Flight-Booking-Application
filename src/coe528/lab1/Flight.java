package coe528.lab1;

public class Flight{
    private int flightNumber, capacity, numberOfSeatsLeft;
    private double originalPrice;
    private String origin, destination, departureTime;
    
    public Flight(int flightNumber, String origin, String destination, String departureTime, int capacity, double originalPrice){
        if(origin.equals(destination)){
            throw new IllegalArgumentException("Origin same as Destination");
            }
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.capacity = capacity;
        this.numberOfSeatsLeft = capacity;
        this.originalPrice = originalPrice;
        }
    
    public int getFlightNumber(){
        return this.flightNumber;
    }
    
    public String getOrigin(){
        return this.origin;
    }
    
    public String getDestination(){
        return this.destination;
    }
    
    public String getDepartureTime(){
        return this.departureTime;
    }
    
    public int getCapacity(){
        return this.capacity;
    }
    
    public int getNumberOfSeatsLeft(){
        return this.numberOfSeatsLeft;
    }
    
    public double getOriginalPrice(){
        return this.originalPrice;
    }
    
    public void setFlightNumber(int flightNumber){
        this.flightNumber = flightNumber;
    }
    
    public void setOrigin(String origin){
        this.origin = origin;
    }
    
    public void setDestination(String destination){
        this.destination = destination;
    }
    
    public void setDepartureTime(String departureTime){
        this.departureTime = departureTime;
    }
    
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    
    public void setNumberOfSeatsLeft(int numberOfSeatsLeft){
        this.numberOfSeatsLeft = numberOfSeatsLeft;
    }
    
    public void setOriginalPrice(double originalPrice){
        this.originalPrice = originalPrice;
    }
    
    public boolean bookASeat(){
        if(this.numberOfSeatsLeft > 0){
            this.numberOfSeatsLeft--;
            return true;
        }
        return false;
    }
    
    @Override
    public String toString(){
        return String.format(" Flight number: %d\n Route: %s to %s\n Date and time: %s\n Price before discount: $%.2f\n Tickets Available: %d", this.flightNumber, this.origin, this.destination, this.departureTime, this.originalPrice,this.numberOfSeatsLeft);
        }
    }