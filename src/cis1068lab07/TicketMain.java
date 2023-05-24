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
public class TicketMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ticket ticket = new WalkupTicket(1);
        System.out.println(ticket);
        ticket = new StudentAdvanceTicket(2,20);
        System.out.println(ticket);
        ticket = new AdvanceTicket(2,10);
        System.out.println(ticket);
        
        
        
    }
    
}
