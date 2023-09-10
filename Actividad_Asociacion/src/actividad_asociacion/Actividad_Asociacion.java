/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_asociacion;

/**
 *
 * @author onair
 */
public class Actividad_Asociacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona dueño = new Persona(); 
        dueño.nombre = "Señor Barriga";
        Inmueble vecindad = new Inmueble();
        vecindad.calle = "Amatitlan";
        vecindad.numero = 320;
        Renta rent = new Renta();
        rent.costoMensual = 3500;
        rent.duracionMeses = 12;
        rent.arrendatario = dueño; //Implementacion de la asociacion por parte de la clase Persona con Renta.
        rent.bienInmuebleEnRenta = vecindad; //Implemetacion de la asociacion por parte de la clase Inmueble con Renta.
        
        rent.mostrar(); //Metodo encargado de mostrar los datos y la asociacion antes puesta.
        
    }
    
}
