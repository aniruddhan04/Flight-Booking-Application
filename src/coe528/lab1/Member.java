package coe528.lab1;

public class Member extends Passenger{
    private int yearsOfMembership;
    
    public Member(String name, int age, int yearsOfMembership){
        super(name, age);
        this.yearsOfMembership = yearsOfMembership;
    }
    
    public int getYearsOfMembership() {
        return yearsOfMembership;
    }

    public void setYearsOfMembership(int yearsOfMembership) {
        this.yearsOfMembership = yearsOfMembership;
    }
    
    @Override
    public double applyDiscount(double p){
        if(this.yearsOfMembership > 5){
            return p*0.5;
        }
        else if(this.yearsOfMembership>1&&this.yearsOfMembership<=5){
            return p*0.9;
        }
        else{
            return p;
        }
    }
    
    @Override
    public double getDiscount(){
        if(this.yearsOfMembership > 5){
            return 50;
            }
        else if(this.yearsOfMembership>1&&this.yearsOfMembership<=5){
            return 10;
            }
        else{
            return 0;
            }
        }
    
    @Override
    public String toString(){
        return String.format("Member\nDetails:\n Name: %s\n Age: %d\n Years of Membership: %d", this.getName(), this.getAge(), this.yearsOfMembership);
        }
    }