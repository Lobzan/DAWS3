/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg77;

import java.util.Scanner;

/**
 *
 * @author Luis Gordo - alu20486860r@ieselcaminas.org
 */
public class Practica77 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double radio = teclado.nextDouble();

        areacalc a = new areacalc(radio);

        System.out.println("Area =  " + a.GetArea());
        System.out.println("Long =  " + a.GetLong());
    }
}
