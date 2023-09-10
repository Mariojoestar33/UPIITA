/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo_de_pi;

import java.util.Scanner;

/**
 *
 * @author onair
 */
public class Calculo_de_PI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int numero;
        double resultado;
        Calculos calculos=new Calculos();
        
        System.out.println("***VALOR APROXIMADO DE PI***");
        
        System.out.println("Ingrese el numero de digitos aproximados:");
        
        numero = sc.nextInt();
        
        resultado = calculos.CalcularPI(numero);
        
        System.out.println("El valor aproximado de pi con: " + numero + " numeros es de:\n" + resultado);
        
    }
    
}
