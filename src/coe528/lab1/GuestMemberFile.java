package coe528.lab1;

import java.util.*;

public class GuestMemberFile{
    protected String name,origin,destination;
    protected int yearsMembership,age;
    protected static ArrayList<Passenger> passenger=new ArrayList<>();

    public GuestMemberFile(String name, int age, int yearsMembership,String origin,String destination){
        this.name = name;
        this.age = age;
        this.yearsMembership = yearsMembership;
        this.origin = origin;
        this.destination=destination;
        }
    
    public void createPassenger(){            
        if (this.yearsMembership==0){
            passenger.add(new NonMember(name,age));
            }
        else{
            passenger.add(new Member(name,age,yearsMembership));
            }
        }
    
    public Passenger getPassenger(){
        return passenger.get(passenger.size()-1);
        }
    
    public double getDiscount(){
        return passenger.get(passenger.size()-1).getDiscount();
        }
    
     public String getName(){
        return name;
        }
    
    public int getAge(){
        return age;
        }
    
    public int getMembershipYears(){
        return yearsMembership;
        }
    
    public String getOrigin(){
        return origin;
        }
    
    public String getDestination(){
        return destination;
        }
    }