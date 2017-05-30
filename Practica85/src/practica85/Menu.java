/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica85;

import java.util.ArrayList;

import java.util.Scanner;

public class Menu {
    
    Scanner teclado = new Scanner(System.in);
    
    private ArrayList<String> options = new ArrayList<>();

    public Menu(ArrayList<String> options) {
        this.options = options;
    }

    public ArrayList<String> getOptions() {
        return options;
    }
        
    public int ReadOpt() {
        return teclado.nextInt();
    }

    public int ReadNum() {
        return teclado.nextInt();
    }

}
