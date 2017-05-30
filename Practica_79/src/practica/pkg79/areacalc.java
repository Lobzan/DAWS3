/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg79;

/**
 *
 * @author Luis Gordo - alu20486860r@ieselcaminas.org
 */
public class areacalc {

    double base;
    double altura;
    
    double resultarea;
    


    public areacalc(double base, double altura) {

        this.base = base;
        this.altura = altura;        
        this.resultarea = (base*altura/2);

    }
   
    public double GetArea() {
        return resultarea;
    }

   
}
