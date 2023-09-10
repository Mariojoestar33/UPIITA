/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosexceptios;

import javax.swing.JOptionPane;

/**
 *
 * @author onair
 */
public class Ejemplosexceptios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            
            double div = 50 / 0;
            System.out.println("La division es: " +div);
            
        } catch(ArithmeticException e) {
            
            JOptionPane.showMessageDialog(null, "Se ha producido un error aritmetico!!!");
            
        }
        
    }
    
}
