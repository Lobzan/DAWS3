/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg83;


/**
 *
 * @author Lobo
 */
public class Practica83 {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double a;
        double b;
        double c;
        double x;
        double x2;

        EqCuad ecuacion = new EqCuad();

        
        ecuacion.askValues();
        
        ecuacion.calcEq();
        
        //por alguna razón extraña esta comprobación no funciona para todos los casos
        System.out.println(ecuacion.check());

        if (ecuacion.check() == true) {

            System.out.println("Siendo y = 0, para a = " + ecuacion.getA() + ", b = " + ecuacion.getB()
                    + " y c " + "= " + ecuacion.getC() + " los posibles valores de x son "
                    + ecuacion.getX() + " y " + ecuacion.getX2());
        } else {
            System.out.println("Error: 4*a*c debe ser menor que b\u00B2");
        }

    }

}
