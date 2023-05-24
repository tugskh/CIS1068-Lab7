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
public class Sphere implements Shape3D{
    
    private double radius;
    
    public Sphere(double radius){
        this.radius = radius;
    }

    @Override
    public double surfaceArea() {
        return (4*Math.PI*Math.pow(radius, 2));
    }
    

    @Override
    public double volume() {
        return (4*Math.PI*Math.pow(radius, 3))/3;
    }
    
    public String toString(){
        return "Volume = "+volume()+"\nSurface Area = "+surfaceArea()+"\n";
    }
    
}
