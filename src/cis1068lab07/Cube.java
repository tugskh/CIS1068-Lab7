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
public class Cube implements Shape3D{
    private double side;
    
    public Cube(double side){
        this.side = side;
    }

    @Override
    public double surfaceArea() {
        return (6*Math.pow(side, 2));
    }

    @Override
    public double volume() {
        return (Math.pow(side, 3));
    }
    
    public String toString(){
        return "Volume = "+volume()+"\nSurface Area = "+surfaceArea()+"\n";
    }
    
}
