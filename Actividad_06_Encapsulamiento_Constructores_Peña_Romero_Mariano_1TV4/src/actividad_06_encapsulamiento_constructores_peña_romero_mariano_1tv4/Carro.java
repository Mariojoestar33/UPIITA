/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_06_encapsulamiento_constructores_peña_romero_mariano_1tv4;

/**
 * Una clase para la "creacion" de automoviles de marca con distintos accesos a atributos
 * @author Peña Romero Mariano 1Tv4
 */
public class Carro {
    
    private String marca; //Atributo de marca que solo puede ser visible por la clase actual.
    private String color; //Atributo de color asignado al auto solo visible en esta clase.
    private int numLlantas; //Atributo de numero de llantas visible para esta clase.
    
    /**
     * Constructor de objeto que necesita la marca para poder ser creado.
     * @param marca 
     */
    public Carro(String marca) {
        
        marca = this.marca;
        
    }

    /**
     * get para poder observar desde otra clase el atributo Marca.
     * @return marca 
     */
    public String getMarca() {
        return marca;
    }

    /**
     * set privado para asignar el valor de Marca. PD: podemos ver que este seria un
     * set "inutil" a priori ya que al crear los objetos requieren que se añada la marca.
     * @param marca 
     */
    private void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * get para poder observar el color desde otra clase distinta.
     * @return color 
     */
    public String getColor() {
        return color;
    }

    /**
     * set protegido visible para esta clase y si se crea una subclase tambien para ella,
     * permite añadir el color.
     * @param color 
     */
    protected void setColor(String color) {
        this.color = color;
    }

    /**
     * get publico para poder observar el atributo de numero de llantas.
     * @return numLlantas
     */
    public int getNumLlantas() {
        return numLlantas;
    }

    /**
     * set para poder indicar el numero de llantas del automovil.
     * @param numLlantas 
     */
    public void setNumLlantas(int numLlantas) {
        this.numLlantas = numLlantas;
    }
    
    
    
}
