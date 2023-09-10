/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author belli
 */
public class TriánguloEquilátero implements Figura{
    private double lado;
    @Override
    public double area() {
        double altura = Math.sqrt(3*lado) / 2;
        return lado * altura / 2;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
}
