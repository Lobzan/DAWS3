package practica.pkg84;

import java.util.Scanner;

public class Practica84 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Cuenta C1 = new Cuenta("Luis", "Gordo", "Soldevila", "12345678", "Corriente", 01, 0.01, 1500);
        Cuenta C2 = new Cuenta("Lean", "Calviño", "Galli", "45612345", "Ahorros   ", 02, 0.10, 1000);
        boolean menu1 = true;
        boolean menu2;
        Menu M = new Menu();
        while (menu1 == true) {
            M.ShowM1();
            switch(M.ReadOpt()) {
                case 1:
                    System.out.println("¿Cantidad a ingresar?");
                    C1.setIngreso(M.ReadNum());
                    break;
                case 2:
                    System.out.println("¿Cantidad a retirar?");
                    C1.setReintegro(M.ReadNum());
                    break;
                case 3:
                    System.out.println("¿Cantidad a transferir?");
                    C1.setTransferencia(C2, M.ReadNum());
                    break;
                case 4:
                    System.out.println("Señor " + C1.getApellido1() + " su cuenta " + C1.getTipo() + " con numeración " + C1.getN_cuenta() + " tiene un saldo de " + C1.getSaldo() + " €");
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("¿Que información quieres modificar?");
                    menu2 = true;
                    while (menu2 = true) {
                        M.ShowM2();
                        switch(M.ReadOpt()) {
                            case 1:
                                C1.setNombre(teclado.nextLine());
                                break;
                            case 2:
                                C1.setApellido1(teclado.nextLine());
                                break;
                            case 3:
                                C1.setApellido2(teclado.nextLine());
                                break;
                            case 4:
                                C1.setDni(teclado.nextLine());
                                break;
                            case 5:
                                menu2 = false;
                                System.out.println("Volviendo al menu principal");
                                System.out.println("");
                                break;
                        }
                    }
                    break;
                case 6:
                    menu1 = false;
                    System.out.println("Saliendo del programa");
                    break;
            }
        }
    }
}
