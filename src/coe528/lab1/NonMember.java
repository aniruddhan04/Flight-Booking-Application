package coe528.lab1;

public class NonMember extends Passenger{
    
    public NonMember(String name, int age){
        super(name, age);
    }
    
    @Override
    public double applyDiscount(double p){
        if(this.age > 65){
            return p*0.9;
        }
        else{
            return p;
        }
    }
    
    @Override
    public double getDiscount(){
        if(this.age > 65){
            return 10;
            }
        return 0;
        }
    
    @Override
    public String toString(){
        return String.format("Non-Member\nDetails:\n Name: %s\n Age: %d", this.getName(), this.getAge());
    }
}