package coe528.lab1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FlightTest{
    private Flight Flight;
    
    @Before
    public void setUp(){
        Flight = new Flight(100,"Toronto","Vancouver","06/30/2020 7:50 pm", 10, 1000.1);
    }
    
    @After
    public void tearDown(){
        Flight = null;
    }

    
    /*testing testConstructor()*/
    @Test
    public void testConstructor(){
        System.out.println("Constructor");
        Flight = new Flight(1,"Vancouver","Toronto","06/13/2020 7:50 pm", 7, 1010.1);
        //make sure instance variables set correctly
        assertEquals(1, Flight.getFlightNumber());
        assertEquals("Vancouver", Flight.getOrigin());
        assertEquals("Toronto", Flight.getDestination());
        assertEquals("06/13/2020 7:50 pm", Flight.getDepartureTime());
        assertEquals(7,Flight.getCapacity());
        assertEquals(7,Flight.getNumberOfSeatsLeft());
        assertEquals(1010.10,Flight.getOriginalPrice(),0.0);
    }
    
    /*testing testInvalidConstructor()*/
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidConstructor(){
        System.out.println("InvalidConstructor");
        Flight = new Flight(1,"Toronto","Toronto","06/13/2020 7:50 pm", 7, 1010.1);
    }
    
    /*testing the public methods*/
    @Test
    public void testGetFlightNumber(){
        System.out.println("getFlightNumber");
        int expResult = 100;
        int result = Flight.getFlightNumber();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetOrigin(){
        System.out.println("getOrigin");
        String expResult = "Toronto";
        String result = Flight.getOrigin();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetDestination(){
        System.out.println("getDestination");
        String expResult = "Vancouver";
        String result = Flight.getDestination();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetDepartureTime(){
        System.out.println("getDepartureTime");
        String expResult = "06/30/2020 7:50 pm";
        String result = Flight.getDepartureTime();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetCapacity(){
        System.out.println("getCapacity");
        int expResult = 10;
        int result = Flight.getCapacity();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetNumberOfSeatsLeft(){
        System.out.println("getNumberOfSeatsLeft");
        int expResult = 10;
        int result = Flight.getNumberOfSeatsLeft();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetOriginalPrice(){
        System.out.println("getOriginalPrice");
        double expResult = 1000.1;
        double result = Flight.getOriginalPrice();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testSetFlightNumber(){
        System.out.println("setFlightNumber");
        int flightNumber = 101;
        Flight.setFlightNumber(flightNumber);
        assertEquals(flightNumber, Flight.getFlightNumber());
    }

    @Test
    public void testSetOrigin(){
        System.out.println("setOrigin");
        String origin = "Calgary";
        Flight.setOrigin(origin);
        assertEquals(origin, Flight.getOrigin());
    }

    @Test
    public void testSetDestination(){
        System.out.println("setDestination");
        String destination = "Calgary";
        Flight.setDestination(destination);
        assertEquals(destination, Flight.getDestination());
    }

    @Test
    public void testSetDepartureTime(){
        System.out.println("setDepartureTime");
        String departureTime = "07/12/2020 1:20 am";
        Flight.setDepartureTime(departureTime);
        assertEquals(departureTime, Flight.getDepartureTime());
    }

    @Test
    public void testSetCapacity(){
        System.out.println("setCapacity");
        int capacity = 12;
        Flight.setCapacity(capacity);
        assertEquals(capacity,Flight.getCapacity());
    }

    @Test
    public void testSetNumberOfSeatsLeft(){
        System.out.println("setNumberOfSeatsLeft");
        int numberOfSeatsLeft = 8;
        Flight.setNumberOfSeatsLeft(numberOfSeatsLeft);
        assertEquals(numberOfSeatsLeft,Flight.getNumberOfSeatsLeft());
    }

    @Test
    public void testSetOriginalPrice(){
        System.out.println("setOriginalPrice");
        double originalPrice = 999.9;
        Flight.setOriginalPrice(originalPrice);
        assertEquals(originalPrice,Flight.getOriginalPrice(),0.0);
    }
    
    @Test
    public void testBookASeat(){
        System.out.println("bookASeat");
        Flight.setNumberOfSeatsLeft(1);
        assertTrue(Flight.bookASeat());
        assertFalse(Flight.bookASeat());
    }

    @Test
    public void testToString(){
        System.out.println("toString");
        String expResult = "Flight 100, Toronto to Vancouver, 06/30/2020 7:50 pm, original price: $1000.10";
        String result = Flight.toString();
        assertEquals(expResult, result);
    }
}