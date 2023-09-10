/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_02_museo_peña_romero_mariano_programacion_1tv4;

import javax.swing.JOptionPane;

/**
 *
 * @author Mariano
 */
public class Practica_02_Museo_Peña_Romero_Mariano_Programacion_1TV4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int opcion;
         
        opcion = JOptionPane.showConfirmDialog(null, "Bienevenido al Sistema de cobro del Museo de Antropologia, desea verificar si es acredor a algun descuento?", "Museo de Antropologia", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        switch(opcion) {
            
            case 1: {
                
                 Boleto bole = new Boleto(80);
            
                 JOptionPane.showMessageDialog(null, "Tt toal a pagar es: " +bole.costoRegular+ " :)))", "Museo de Antropologia", JOptionPane.PLAIN_MESSAGE);
            
                 break;
                
            }
            
            case 0: {
                
                  Boleto bole = new Boleto(80);
                  String[] tipo = {"Estudiante", "Docente", "Ninguno"}; 
                  int bol;
             
                  bole.edad = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca su edad: ", "Museo de Antropologia", 2));
             
                  bol = JOptionPane.showOptionDialog(null, "Eres alumno o profesor?", "Museo de Antropologia", 0, JOptionPane.QUESTION_MESSAGE, null, tipo, "Estudiante");
            
                  if(bol == 0 || bol == 1)
                    bole.profesorEstudiante = true;
                  else
                    bole.profesorEstudiante = false;
            
                  bole.calcularCostoPorCobrar();
                
            }
            
        }
      
    }
    
}
