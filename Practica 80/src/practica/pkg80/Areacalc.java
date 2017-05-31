/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg80;

/**
 *
 * @author Lobo
 */
public class Areacalc {
    
    double lado;    
    
    double resultArea;
    

    public Areacalc(double lado) {

        this.lado = lado;
              
        this.resultArea = (Math.pow(lado, 2)*6);

    }
   
    public double GetArea() {
        return resultArea;
    }

   
}


