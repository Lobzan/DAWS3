/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg86;
import java.util.Scanner;

/**
 *
 * @author Luis Gordo - alu20486860r@ieselcaminas.org
 */
public class Contador {
    Scanner teclado = new Scanner(System.in);
    int count = 0;

    public Contador() {

    }

    public Contador(int n) {       
        this.count = n;

    }

    public Contador(Contador copia) {
        this.count = copia.count;

    }

    public int getCount() {
        return count;
    }

    public void setCount(int n) {
        this.count = n;
    }
    
 
    public void incCount() {
        count += 1;

    }

    public void decCount() {
        count -= 1;

    }

    public void resetCount() {
        count = 0;

    }
    
    

}
