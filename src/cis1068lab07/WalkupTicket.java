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
public class WalkupTicket extends Ticket{
    
    public WalkupTicket(int n){
        super(n);
        price = 50;
    }
    
    @Override
    public double getPrice(){
        return price;
    }
    @Override
    public int getNumber(){
        return number;
    }
}
