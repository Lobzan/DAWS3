/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg86;

import java.util.Scanner;

/**
 *
 * @author Luis Gordo - alu20486860r@ieselcaminas.org
 */
public class Practica86 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Menu M = new Menu();
        boolean menu1;
        boolean menu0 = true;
        Contador i = new Contador();

        while (menu0 == true) {
            menu1 = true;
            M.ShowM0();
            switch (M.ReadOpt()) {
                case 1:
                    while (menu1 == true) {
                        M.ShowM();
                        switch (M.ReadOpt()) {
                            case 1:
                                System.out.println("Set value");
                                i.setCount(M.ReadNum());
                                System.out.println("Counter seted to " + i.getCount());
                                break;
                            case 2:
                                i.incCount();
                                System.out.println("Counter increased to " + i.getCount());
                                break;
                            case 3:
                                i.decCount();
                                System.out.println("Counter decreased to " + i.getCount());
                                break;
                            case 4:
                                i.resetCount();
                                System.out.println("Counter reseted to " + i.getCount());
                                break;
                            case 5:
                                menu1 = false;
                                System.out.println("Going Back");
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Counter value is " + i.getCount());
                    break;
                case 3:
                    menu0 = false;
                    System.out.println("Exiting");
                    

            }
        }
    }
}
