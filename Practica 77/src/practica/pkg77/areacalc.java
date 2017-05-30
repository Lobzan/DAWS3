/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg77;

/**
 *
 * @author Luis Gordo - alu20486860r@ieselcaminas.org
 */
public class areacalc {

    double radio;
    double resultarea;
    double resultlong;


    public areacalc(double radio) {

        this.radio = radio;
        this.resultlong = (2 * Math.PI * radio);
        this.resultarea = (Math.pow(radio, 2) * Math.PI);

    }
   
    public double GetArea() {
        return resultarea;
    }

    public double GetLong() {
        return resultlong;
    }

}
