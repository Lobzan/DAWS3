/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg90;

import java.util.Scanner;

/**
 *
 * @author Lobo
 */
public class Practica90 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce un DNI"); 
        
        DNI dni = new DNI(teclado.nextLine()); 
        
        System.out.println(dni.getLetter());
    }
}