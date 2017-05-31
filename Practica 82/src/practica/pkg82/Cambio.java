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
public class Cambio {

    int value;
    int amount;

    public Cambio() {

    }

    /*public fillValues(){
      
      for(int i=0; i<values.size(); i++){
          values.get(i);
       }
      return b;
  }    */
    public Cambio(int value, int amount) {
        this.value = value;
        this.amount = amount;
    }

    public int getValue() {
        return value;
    }

    public int getAmount() {
        return amount;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void doMath(ArrayList<Cambio> monedas) {

    }

    @Override
    public String toString() {               
        return this.amount + " monedas de " + this.value;
    }
}