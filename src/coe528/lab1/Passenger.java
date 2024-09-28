package coe528.lab1;

public abstract class Passenger{
    public String name;
    public int age;

    public Passenger(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
    
    public abstract double getDiscount();

    
    public abstract double applyDiscount(double p);
    
    @Override
    public abstract String toString();
}