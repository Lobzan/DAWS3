/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg85;

import java.util.ArrayList;

import java.util.Scanner;

/**
 *
 * @author Lobo
 */
public class Practica85 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<Account> accounts = new ArrayList<>();
        int selectedAccount = -1;

        Menu m = new Menu();
        Account C0 = new Account("Luis", "Gordo", "Soldevila", "12345678A", "Ahorros", 0, 10, 1000);
        accounts.add(C0);

        boolean menu0 = true;
        boolean menu1 = false;

        while (menu0 == true) {

            m.ShowM0();
            switch (m.ReadOpt()) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    accounts.add(new Account());
                    accounts.get(accounts.size() - 1).fillAccount();
                    accounts.get(accounts.size() - 1).setAccountNumber(accounts.size() - 1);
                    accounts.get(accounts.size() - 1).setType("Corriente");
                    accounts.get(accounts.size() - 1).setInterest(1);
                    break;
                case 2:
                    System.out.println("¿Que cuenta quieres seleccionar");
                    System.out.println(accounts.toString());
                    selectedAccount = teclado.nextInt();
                    menu1 = true;
                    break;
                default:
                    System.out.println("Elige una opcion correcta");
                    break;
            }

            while (menu1 == true) {
                m.ShowM1();
                switch (m.ReadOpt()) {
                    case 0:
                        menu1 = false;
                        break;
                    case 1:
                        System.out.println("Cantidad a ingresar");
                        accounts.get(selectedAccount).doDeposit(teclado.nextDouble());
                        break;

                    case 2:
                        System.out.println("Cantidad a retirar");
                        accounts.get(selectedAccount).doCharge(teclado.nextDouble());
                        break;

                    case 3:

                        System.out.println("¿A que cuenta quiere transferir el dinero?");
                        System.out.println(accounts.toString());
                        int transAcc = teclado.nextInt();
                        accounts.get(selectedAccount).doTransfer(accounts.get(transAcc), teclado.nextDouble());
                        System.out.println("Has hecho una transferencia a " + accounts.get(transAcc).getName());
                        break;

                    case 4:
                        System.out.println(accounts.get(selectedAccount).getAllInfo());
                        break;
                    case 5:
                        m.ShowM2();
                        //TO-DO switch para elegir la opcion y redireccionar al setter, posiblemente mejor con un metodo
                        break;
                    default:
                        System.out.println("Elige una opcion correcta");
                        break;
                }
            }

        }
    }
}
