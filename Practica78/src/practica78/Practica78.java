package practica78;

import java.util.*;

public class Practica78 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        triangulo t1 = new triangulo();
        int base;
        int altura;
        System.out.print("Introduce el valor de la base del triángulo: ");
        base = teclado.nextInt();
        System.out.print("Introduce el valor de la altura del triángulo: ");
        altura = teclado.nextInt();
        t1.SetArea(base, altura);
        System.out.println("El área del triángulo es = " + t1.GetResultado());
    }
}
