/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_03;

/**
 *
 * @author onair
 */
public class Actividad_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String prueba = "Programación de Ing. Telemática ";
        
        String[] sep = prueba.split("");
        
        
        for(int i = 0; i < prueba.length(); i++) 
            System.out.println(sep[i]);
        
    }
    
}
