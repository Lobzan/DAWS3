/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg79;

import java.util.Scanner;

/**
 *
 * @author Luis Gordo - alu20486860r@ieselcaminas.org
 */
public class Practica79 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean exit = false;
        double base;
        double altura;
        
        System.out.println("Vamos a calcular el area de un triangulo dadas su base y altura");

        while (exit == false) {
            System.out.println("------------------");
            System.out.println("Introduce el valor de la base");
            base = teclado.nextDouble();
            System.out.println("Introduce el valor de la altura");
            altura = teclado.nextDouble();
            areacalc a = new areacalc(base, altura);
            System.out.println("------------------");
            System.out.println("Area =  " + a.GetArea());
            System.out.println("------------------");
            
            System.out.println("Pulsa 'r' para repetir con otro valor");
            exit = teclado.next().charAt(0) != 'r';

        }
    }
}
