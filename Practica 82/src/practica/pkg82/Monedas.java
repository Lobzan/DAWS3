/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg82;

import java.util.ArrayList;

/**
 *
 * @author Lobo
 */
public class Monedas {

    public double dinero;
    public double resto;
    public int two;
    public int one;
    public int half;
    public int twentyC;
    public int tenC;
    public int fiveC;
    public int twoC;
    public int oneC;

    ArrayList<Monedas> monedas = new ArrayList<>();

    
    public Monedas(){
    
    }
    
   public void doMath(double dinero){
   this.two = (int) (dinero/2);
   this.resto = dinero%2;
   this.one = (int) (dinero/2);
   
   }
    
    
    public void getArray() {

        for (int index = 0; index < monedas.size(); index++) {
            System.out.println(index + 1 + ". " + monedas.get(index));
        }
    }

    public String toString() {
        return "Monedas de 2€: " + this.two
                + ", Monedas de 1€: " + this.one
                + ", Monedas de 50cnt: " + this.half
                + ", Monedas de 20cnt: " + this.twentyC
                + ", Monedas de 10cnt: " + this.tenC
                + ", Monedas de 5cnt: " + this.fiveC
                + ", Monedas de 2cnt: " + this.twoC
                + ", Monedas de 1cnt: " + this.oneC;
    }

}
