/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg80;

import java.util.Scanner;

/**
 *
 * @author Lobo
 */
public class Practica80 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean exit = false;
        double lado;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Vamos a calcular el area de un cubo");

        while (exit == false) {
            System.out.println("------------------");
            System.out.println("Introduce el valor del lado");
            lado = teclado.nextDouble();
            Areacalc a = new Areacalc(lado);
            System.out.println("------------------");
            System.out.println("Area =  " + a.GetArea() + " unidades\u00B2");
            System.out.println("------------------");
            System.out.println("Pulsa 'r' para repetir con otro valor");
            exit = teclado.next().charAt(0) != 'r';
        }

    }
}
