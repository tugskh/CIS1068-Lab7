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
public class RectangularPrism implements Shape3D{
    private double length;
    private double height;
    private double width;
    
    public RectangularPrism(double length, double height, double width){
        this.height = height;
        this.length = length;
        this.width = width;
    }

    @Override
    public double surfaceArea() {
        return 2*(width*length+height*length+height*width);
    }

    @Override
    public double volume() {
        return width*length*height;
    }
    
    public String toString(){
        return "Volume = "+volume()+"\nSurface Area = "+surfaceArea()+"\n";
    }
}
