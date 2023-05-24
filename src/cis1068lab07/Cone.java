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
public class Cone implements Shape3D{
    private double height;
    private double radius;
    
    public Cone(double height, double radius){
        this.height=height;
        this.radius=radius;
    }
    
    public double surfaceArea(){
        return Math.PI*radius*(radius+Math.sqrt(height*height+radius*radius));
    }
    public double volume(){
        return (Math.PI*Math.pow(radius, 2)*height)/3;
    }
    public String toString(){
        return "Volume = "+volume()+"\nSurface Area = "+surfaceArea()+"\n";
    }
}
