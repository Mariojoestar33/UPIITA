/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_02_museo_peña_romero_mariano_programacion_1tv4;

import javax.swing.JOptionPane;

/**
 * Clase para poder calcular el costo con diferentes tipos de descuento aplicables.
 * @version 1.1, 21/03/21
 * @author Peña Romero Mariano 1TV4
 */
public class Boleto {
    
    public double costoRegular; //Es el costo principal del boleto.
    public double costoPorCobrar; //Sera el costo final despues de los descuentos aplicables.
    public int edad; //Atributo que decidira el tipo de descuento.
    public boolean profesorEstudiante; //Atributo que decidira el tipo de descuento.

    /**
     * Constructor de objeto el cual necesitara conocer el precio principal del boleto.
     * @param costoRegular 
     */
    public Boleto(double costoRegular) {
        this.costoRegular = costoRegular;
    }
    
    /**
     * Calculo de el precio final de un boleto 
     */
    public void calcularCostoPorCobrar() {
        
        double precio1 = 0, precio2 = 0;
      
        /*Condiciones para distintos tipos de descuento dependiendo de la edad*/
        if(edad < 2) 
             precio1 = 0;
            else 
                if(edad >= 2 && edad <= 13) 
                     precio1 = costoRegular * 0.50;
                    else 
                        if(edad > 60) 
                            precio1 = costoRegular * 0.20;
                           else 
                                precio1 = costoRegular;
        
        /*Condicion para checar el precio especial de ESTUDIANTES Y MAESTROS*/            
        if(profesorEstudiante == true) 
             precio2 = costoRegular * 0.75;
           else
                precio2 = costoRegular;
        
        /*Se verifica cual es el mayor descuento aplicable para aplicar el de mayor porcentaje en caso de tener 2*/
        if(precio1 < precio2) 
            costoPorCobrar = precio1;
           else 
            costoPorCobrar = precio2;
        
         /*Impresion del costo final del boleto*/
         JOptionPane.showMessageDialog(null, "Tu total a pagar es de: $" +costoPorCobrar+ " ya con el descuento de mayor porcentaje aplicado segun tus datos :))", "Museo de Antropologia", 0);          
                   
    }
    
}
