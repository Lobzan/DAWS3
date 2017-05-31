/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg81;

/**
 *
 * @author Lobo
 */
public class Areacalc {
    
double radius;    
    
    double Area;
    double Volume;

    
    

    public Areacalc(double radius) {

        this.radius = radius;
              
        this.Area = (4*Math.PI*Math.pow(radius, 2));
        this.Volume  = (4*Math.PI*Math.pow(radius, 3))/3;

    }
   
    public double getArea() {
        return Area;
    }
    public double getVolume() {
        return Volume;
    }

   
}