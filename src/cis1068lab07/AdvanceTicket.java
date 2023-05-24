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
public class AdvanceTicket extends Ticket{
    
    public AdvanceTicket(int n, int d){
        super(n);
        if(d>10)
            price = 30;
        else
            price = 40;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getNumber() {
        return number;
    }
    
}
