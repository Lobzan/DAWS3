/*/
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg82;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Lobo
 */
public class Practica82 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Cambio> monedas = new ArrayList<>();

        ArrayList<Integer> values = new ArrayList<>(Arrays.asList(200, 100, 50, 20, 10, 5, 2, 1));

        double amount = 12553;

        //esto deberia ir en una funcion a la que le pasas el arrayList de ints e inicializa
        for (int i = 0; i < values.size(); i++) {
            monedas.add(new Cambio(values.get(i), 0));
        }
        
        /* For each alternativo sin indices
        for (int value : values){
              monedas.add(new Cambio(value, 0));    
        }*/
        
        
        
        double total = amount;
        double resto = total;

        for (int i = 0; i < values.size(); i++) {

           monedas.get(i).setAmount((int) (resto / values.get(i)));
            resto -= monedas.get(i).getAmount() * monedas.get(i).getValue();  
      
        }
        
    
      
        //for (int i = 0; i < monedas.size(); i++) {
       // System.out.println("\n" + monedas.get(i).toString());
        for ( Cambio moneda : monedas) {
            System.out.println("\n" + moneda.toString());
        }

    }

}
