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

        Calc Cal = new Calc();
        Menu m = new Menu();

        boolean entrar = true;

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
                    switch (m.getEstado()) {
                        case 1:
                            Cal.Add();
                            System.out.println("La suma es " + Cal.GetResult());
                            break;
                        case 2:
                            Cal.Subs();
                            System.out.println("La resta es " + Cal.GetResult());
                            break;
                        case 3:
                            Cal.Mult();
                            System.out.println("La multiplicacion es " + Cal.GetResult());
                            break;
                        case 4:
                            Cal.Div();
                            System.out.println("La diviison es " + Cal.GetResult());
                            break;
                        case 5:
                            Cal.Mod();
                            System.out.println("El modulo es " + Cal.GetResult());
                            break;
                    }
                    break;

                case 3:
                    System.out.println("Saliendo");
                    entrar = false;
                    break;

            }

        }

    }
}
