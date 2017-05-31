/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica85;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Lobo
 */
public class MenuController {

    private ArrayList<Menu> menus = new ArrayList<>();
    int currentMenu;

    public MenuController() {
        menus.add(new Menu(new ArrayList<>(Arrays.asList(
                "Salir",
                "Seleccionar cuenta",
                "Crear cuenta"
        ))));

        menus.add(new Menu(new ArrayList<>(Arrays.asList(
                "Volver",
                "Ingreso",
                "Reintegro",
                "Transferencia",
                "Ver Info",
                "Modificar Info"
        ))));

        menus.add(new Menu(new ArrayList<>(Arrays.asList(
                "Volver",
                "Nombre",
                "Apellido1",
                "Apellido2",
                "DNI"
        ))));
    }

    public ArrayList<Menu> getMenus() {
        return menus;
    }

    public int printMenu(int number) {
        Menu selectedMenu = menus.get(number);
        System.out.println();
        for (int index = 0; index < selectedMenu.getOptions().size(); index++) {
            System.out.println(index + 1 + ". " + selectedMenu.getOptions().get(index));
        }

        this.currentMenu = number;
        
        System.out.print("Elige una opción: ");
        Scanner teclado = new Scanner(System.in);

        return teclado.nextInt();
        
        //pedir el la opción y devolverla con un return
        //y hacer que no devuelva void, sino un integer
    }
           
}
