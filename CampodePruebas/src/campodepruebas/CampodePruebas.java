/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campodepruebas;

import java.util.Scanner;

/**
 *
 * @author onair
 */
public class CampodePruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        String fecha;
        
        System.out.println("Ingrese la fecha separada por diagonales de la forma dd/mm/aaaa");
        
        fecha = sc.next();
        
        String[] separaciones = fecha.split("/");
        
        for(int i = 0; i < separaciones.length; i++) {
            
            System.out.println(separaciones[i]);
            
        }
        
    }
    
}
