/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica85;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Luis Gordo - alu20486860r@ieselcaminas.org
 */
public class Practica85 {

    private static int selectedOption;
    private static ArrayList<Account> accounts = new ArrayList<Account>();
    private static MenuController menuController = new MenuController();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        manageMainMenu(0);
    }

    private static void manageMainMenu(int number) {
        Scanner teclado = new Scanner(System.in);

        int selectedOption = menuController.printMenu(number);

        switch (menuController.currentMenu) {
            case 0:
                manageMenuOne();
                break;
            case 1:
                manageMenuTwo();
                break;
            case 2:
                manageMenuThree();
                break;
            default:
                System.out.println("Elige bien la opcion");
        }
    }

    private static void manageMenuOne() {
        switch (selectedOption) {
            case 1:
                System.exit(0);
                break;
            case 2:
                System.out.println("\nSelecciona una cuenta");
                
                for (int index = 0; index < accounts.size(); index++) {
                    System.out.println(index + 1 + ". " + accounts.get(index).getName());
                }
                
                //preguntar qué cuenta quieres elegir
                
                /* ir a una función (manage) en el objeto account.get(n) n = la que el usuario ha pedido
                  
                */
                manageMainMenu(1); //llamar a esta funcion en account.manage(menuController)
                break;
            case 3:
                Account accountToCreate = new Account();
                accountToCreate.fillAccount();
                accounts.add(accountToCreate);
                manageMainMenu(0);
                break;
        }
    }

    private static void manageMenuTwo() {

    }

    private static void manageMenuThree() {

    }

}
