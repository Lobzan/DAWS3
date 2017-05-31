/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg90;

/**
 *
 * @author Lobo
 */
public class DNI {
    private final String DNI;
    private final String controlDigit = "TRWAGMYFPDXBNJZSQVHLCKE";
    private char letter;

    public DNI(String DNI) {
        this.DNI = DNI;
        
        this.check();
    }

    private void check() {
        int DNINumber = Integer.parseInt(this.DNI.substring(0, 8));
        int module = DNINumber % 23;
        
        this.letter = this.controlDigit.charAt(module);
    }

    public char getLetter() {
        
        return letter;
    }
     

}
