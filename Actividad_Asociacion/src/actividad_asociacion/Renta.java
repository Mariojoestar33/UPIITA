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
public class Renta {
   
    public double costoMensual;
    
    public double duracionMeses;
    
    public Persona arrendatario;
    
    public Inmueble bienInmuebleEnRenta;
    
    public void mostrar() {
        
        System.out.println("El inmueble ubicado en la calle " +bienInmuebleEnRenta.calle+ " num. "
                + "" +bienInmuebleEnRenta.numero+ ", es propiedad de " +arrendatario.nombre+ " y tiene un costo de renta"
                        + " mensual de: $" +costoMensual+ ", el contrato dura " +duracionMeses+ " meses" );
        
    }
    
}
