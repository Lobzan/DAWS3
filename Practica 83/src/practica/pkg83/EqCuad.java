/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg83;

import java.util.Scanner;

/**
 *
 * @author Lobo
 */
public class EqCuad {

    private double a;
    private double b;
    private double c;
    private double x;
    private double x2;
    final double y = 0;

    public EqCuad() {

    }

    public EqCuad(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public void calcEq() {

        this.x = (-b + Math.sqrt((Math.pow(b, 2)) - (4 * a * c))) / (2 * a);
        this.x2 = (-b - Math.sqrt((Math.pow(b, 2)) - (4 * a * c))) / (2 * a);

    }

    public void askValues() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dame el valor de a");
        this.setA(teclado.nextDouble());
        System.out.println("Dame el valor de b");
        this.setB(teclado.nextDouble());
        System.out.println("Dame el valor de c");
        this.setC(teclado.nextDouble());

    }

    public boolean check() {       

        return (a * Math.pow(x, 2) + b * x + c == y) && ((a * Math.pow(x2, 2) + b * x2 + c == y));

        
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getX() {
        return x;
    }

    public double getX2() {
        return x2;
    }

}
