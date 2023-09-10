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
public class PruebaDeInterfaz {
    public static void main (String args[]){
        Figura miFigura;
        //miFigura = new Cuadrado();
        miFigura = new Círculo();
        miFigura.area();
        
        Figura figuras [] = new Figura[5];
        figuras[0] = new TriánguloEquilátero();
        figuras[1] = new TriánguloEquilátero();
        figuras[2] = new Círculo();
        figuras[3] = new Círculo();
        figuras[4] = new TriánguloEquilátero();
        for(Figura x : figuras){
            x.area();
        }
        
        int x;
//        nueva_figura = new Cuadrado ();
//        Cuadrado nuevoCuadrado;
//        nuevoCuadrado = new Cuadrado ();
//        
//        nueva_figura.area();
//        nuevoCuadrado.area();int x;
    }
}
