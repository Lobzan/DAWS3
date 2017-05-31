/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg76;

import java.util.Scanner;
/** * * @author Luis Gordo - alu20486860r@ieselcaminas.org */
public class Calc {

    public int num1;
    public int num2;
    public int result;

    public void SetNum1(int num1) {

        this.num1 = num1;
    }

    public void SetNum2(int num2) {

        this.num2 = num2;
    }

    public void Add() {

        result = num1 + num2;
    }
    
        
    public void Subs() {

        result = num1 - num2;
    }
    
    public void Mult() {

        result = num1 * num2;
    }
    
     public void Div() {

        result = num1 / num2;
    }
     
       public void Mod() {

        result = num1 % num2;
    }
    
      public int GetResult() {

        return result;
    }
    

}
