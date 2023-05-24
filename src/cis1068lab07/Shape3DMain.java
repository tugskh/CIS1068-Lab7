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
public class Shape3DMain {
    public static void main(String[] args) {
        Shape3D sphere = new Sphere(2.0);
        System.out.println(""+sphere);
        
        Shape3D cube = new Cube(5);
        System.out.println(""+cube);
        
        Shape3D rectangularPrism = new RectangularPrism(5,6,7);
        System.out.println(""+rectangularPrism);
        
        Shape3D cone = new Cone(7,5);
        System.out.println(""+cone);
    }
}
