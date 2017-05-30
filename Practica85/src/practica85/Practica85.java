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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Cuenta> Cuentas = new ArrayList<Cuenta>();
        
        Scanner teclado = new Scanner(System.in);
        Cuenta Cuenta0 = new Cuenta();
        
        Cuenta CuentaYo = new Cuenta("Luis", "Gordo", "Soldevila", "12345678", "Corriente", 01, 0.01, 1500);
    
        Cuentas.add(CuentaYo);
        Cuentas.add(Cuenta0);
        System.out.println(Cuentas.get(0).getNombre());
    
    }
    
}
