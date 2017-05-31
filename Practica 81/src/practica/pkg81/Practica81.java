/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg81;

import java.util.Scanner;

/**
 *
 * @author Lobo
 */
public class Practica81 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       boolean exit = false;
        double radius;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Vamos a calcular el area y volumen de una esfera");

        while (exit == false) {
            System.out.println("------------------");
            System.out.println("Introduce el valor del radio de la esfera");
            radius = teclado.nextDouble();
            Areacalc a = new Areacalc(radius);
            System.out.println("------------------");
            System.out.println("Area =  " + a.getArea() + " unidades\u00B2");
             System.out.println("Volumen =  " + a.getVolume() + " unidades\u00B3");
            System.out.println("------------------");
            System.out.println("Pulsa 'r' para repetir con otro valor");
            exit = teclado.next().charAt(0) != 'r';
        }

    }
}