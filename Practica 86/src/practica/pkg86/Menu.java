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
public class Menu {    
    
Scanner teclado = new Scanner(System.in);        
        
public void ShowM0() {
System.out.println("\n" + "1. Modify counter");
System.out.println("2. Get counter value");
System.out.println("3. Exit");
 

}    


public void ShowM() {
  
        System.out.println("\n" + "1. Set counter to some value");
        System.out.println("2. Increase counter");  
        System.out.println("3. Decrease counter");
        System.out.println("4. Reset counter");
        System.out.println("5. Back" + "\n");
   

    }
    
       
    public int ReadOpt() {
        
        return teclado.nextInt();

    }    
   
    public int ReadNum() {
        
        return teclado.nextInt();
    }
    
    public char ReadChar() {
        
        return teclado.next().charAt(0);
    }
    
}
