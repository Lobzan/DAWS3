/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg76;

/**
 *
 * @author Luis Gordo - alu20486860r@ieselcaminas.org
 */
public class Practica76 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num1;
        int num2;
        boolean entrar = true;
        Calc Cal = new Calc();
        Menu m = new Menu();
        
        while (entrar == true) {   
            m.Menu();

            switch (m.ReadOpt()) {
                case 1:
                    m.Instructions();
                    break;
                case 2:
                    m.AskNum();
                    num1 = m.ReadNum();
                    Cal.SetNum1(num1);
                    m.AskOperator();
                    num2 = m.ReadNum();
                    Cal.SetNum2(num2);
                    
                    System.out.println("La suma es " + Cal.GetResult());
                    break;
                case 3:
                    System.out.println("Saliendo");
                    entrar = false;
                    break;
            

            }

        }

    }
}
