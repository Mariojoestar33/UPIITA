/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_arreglos_multi_peña_romero_mariano_1tv4;

/**
 *
 * @author onair
 */
public class Actividad_Arreglos_Multi_Peña_Romero_Mariano_1TV4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [][] arreglo = {{4,7,2,6,1},{3,1},{9,6,2,8},{4,1,0,1,5,3,2},{8,6,4},{2,1,9,0,3,2}};
        
        System.out.println("  ARREGLOS MULTIDIMENCIONALES\n");
            
        for(int x []: arreglo) {
            
            for(int y: x) {
                
                System.out.print("  " +y+ " ");
                
            }
            
            System.out.println("");
            
        }
        
        
        
    }
    
}
