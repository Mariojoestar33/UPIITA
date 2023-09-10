/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrendadora;

/**
 *
 * @author onair
 */
public class Cliente {
    
    private String nombre;
    private int numLicencia;

    public Cliente(String nombre, int numLicencia) {
        this.nombre = nombre;
        this.numLicencia = numLicencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumLicencia() {
        return numLicencia;
    }

    public void setNumLicencia(int numLicencia) {
        this.numLicencia = numLicencia;
    }
    
    
    
}
