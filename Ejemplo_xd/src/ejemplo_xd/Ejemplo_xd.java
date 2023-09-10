/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_xd;

import java.util.Scanner;

/**
 *
 * @author onair
 */
public class Ejemplo_xd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Suma xd");
        
        Scanner sc= new Scanner(System.in);
        int primer=0, segundo=0, resultado=0;
        
        System.out.println("Pon el numero 1:");
        primer=sc.nextInt();
        
        System.out.println("Pon el numero 2:");
        segundo=sc.nextInt();
        
        resultado=primer+segundo;
        
         System.out.println("Tu resultado es: " +resultado);
        
    }
    
}
