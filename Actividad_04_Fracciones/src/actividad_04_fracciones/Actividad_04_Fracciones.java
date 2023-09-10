/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_04_fracciones;

/**
 *
 * @author onair
 */
public class Actividad_04_Fracciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Fraccion frac = new Fraccion();
        
        frac.numerador = 1;
        
        frac.denominador = 5;
        
        Fraccion frac1 = new Fraccion();
        
        frac1.numerador = 9;
        
        frac1.denominador = 5;
        
        Fraccion frac3 = frac.sumar(frac1);
        
        System.out.println("El resultado es: " +frac3.numerador+ "/" +frac3.denominador);
        
    }
    
}
