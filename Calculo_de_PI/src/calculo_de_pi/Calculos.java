/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo_de_pi;

/**
 *
 * @author onair
 */
public class Calculos {
    
    public int numero;
    public double resultado;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getResultado() {
        return resultado;
    }
    
    public double CalcularPI(int numero) {
        
        int i;
        
        for(i=1;i<=numero;i++) {
            
            resultado = resultado + ((Math.pow(-1, i + 1 ))/( 2 * i - 1 ));
 
        }
        
        resultado = resultado * 4;
        
        return resultado;
        
    }
    
}
