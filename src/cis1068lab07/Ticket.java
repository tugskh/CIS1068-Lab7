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
public abstract class Ticket {
    protected int number;
    protected double price;
    
    public Ticket(int n){
        number = n;
    }
    
    abstract public double getPrice();
    abstract public int getNumber();
    
    @Override
    public String toString(){
        return "Number: "+number+", Price: "+price;
    }
    
}
