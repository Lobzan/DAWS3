package practica.pkg84;

import java.util.Scanner;

public class Menu {

    Scanner teclado = new Scanner(System.in);

    public void ShowM1() {
        System.out.println("1. Ingreso");
        System.out.println("2. Reintegro");
        System.out.println("3. Transferencia");
        System.out.println("4. Ver Info");
        System.out.println("5. Modificar Info");
        System.out.println("6. Salir");
    }

    public void ShowM2() {
        System.out.println("1. Nombre");
        System.out.println("2. Apellido1");
        System.out.println("3. Apellido2");
        System.out.println("4. DNI");
        System.out.println("5. Volver");
    }

    public int ReadOpt() {
        return teclado.nextInt();
    }

    public int ReadNum() {
        return teclado.nextInt();
    }
}
