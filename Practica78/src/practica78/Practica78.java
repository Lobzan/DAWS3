package practica78;

import java.util.*;

public class Practica78 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Areacalc t1 = new Areacalc();
        int base;
        int altura;
        System.out.print("Introduce el valor de la base del triángulo: ");
        base = teclado.nextInt();
        System.out.print("Introduce el valor de la altura del triángulo: ");
        altura = teclado.nextInt();
        t1.setArea(base, altura);
        System.out.println("El área del triángulo es = " + t1.getResultado());
    }
}
