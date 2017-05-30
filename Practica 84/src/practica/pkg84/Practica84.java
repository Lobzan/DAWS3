package practica.pkg84;

import java.util.Scanner;

public class Practica84 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Account C1 = new Account("Luis", "Gordo", "Soldevila", "12345678", "Corriente", 01, 0.01, 1500);
        System.out.println(C1.toString()); 
        Account x = new Account(C1);
        x.setName("pol");
        System.out.println(x.toString());
        
        Account C2 = new Account("Lean", "Calviño", "Galli", "45612345", "Ahorros   ", 02, 0.10, 1000);
        boolean menu1 = true;
        boolean menu2;
        Menu M = new Menu();
        while (menu1 == true) {
            M.ShowM1();
            switch(M.ReadOpt()) {
                case 1:
                    System.out.println("¿Cantidad a ingresar?");
                    C1.setDeposit(M.ReadNum());
                    break;
                case 2:
                    System.out.println("¿Cantidad a retirar?");
                    C1.setCharge(M.ReadNum());
                    break;
                case 3:
                    System.out.println("¿Cantidad a transferir?");
                    C1.doTransfer(C2, M.ReadNum());
                    break;
                case 4:
                    System.out.println("Señor " + C1.getFirstSurname() + " su cuenta " + C1.getType() + " con numeración " + C1.getAccountNumber() + " tiene un saldo de " + C1.getCredit() + " €");
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("¿Que información quieres modificar?");
                    menu2 = true;
                    while (menu2 = true) {
                        M.ShowM2();
                        switch(M.ReadOpt()) {
                            case 1:
                                C1.setName(teclado.nextLine());
                                break;
                            case 2:
                                C1.setFirstSurname(teclado.nextLine());
                                break;
                            case 3:
                                C1.setSecondSurname(teclado.nextLine());
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
