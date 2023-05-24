/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis1068lab07;

/**
 *
 * @author tugsbilegkhaliunbat
 */
public class StudentAdvanceTicket extends AdvanceTicket{
    public StudentAdvanceTicket(int n, int d){
        super(n,d);
        if(d>10)
            price = 15;
        else
            price = 20;
    }
    
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getNumber() {
        return number;
    }
    
     @Override
    public String toString(){
        return "Number: "+number+", Price: "+price+" (ID required)";
    }
}
