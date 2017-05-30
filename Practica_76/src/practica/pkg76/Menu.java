/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg76;

import java.util.Scanner;

/**
 *
 * @author Luis Gordo - alu20486860r@ieselcaminas.org
 */
public class Menu {
    
    
Scanner teclado = new Scanner(System.in);


public void Instructions() {

        System.out.println("Entre los numeros y las operaciones pulsa enter");
    System.out.println("+  Suma");
        System.out.println("-  Resta");
        System.out.println("x  Multi");
        System.out.println("/   Dividir");
        System.out.println("%  Resto");
        System.out.println("i  instrucciones");
        System.out.println("m  menu");
        System.out.println("l  limpiar");
         System.out.println("------------------");
    }    

public void Menu() {

        System.out.println("1. Instrucciones");
        System.out.println("2. Operar");
        System.out.println("3. Salir");
        System.out.println("------------------");
}

    public int ReadOpt() {
        
        return teclado.nextInt();

    }
    
    public void AskNum() {
        System.out.println("Ya puedes calcular");
    }
    
    public void AskOperator() {
        char operator = teclado.next().charAt(0);
        int estado;
        switch (operator)  {
            case '+': 
               
                
            break;
            case '-': 
                estado = 2;
            break;
            case '/': 
                estado = 3;
            break;
            return
            
        }
    }

    public int ReadNum() {
        
        return teclado.nextInt();
    }
    
}
