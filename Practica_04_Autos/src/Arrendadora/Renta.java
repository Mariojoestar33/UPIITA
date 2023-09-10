/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrendadora;

import java.util.Calendar;

/**
 *
 * @author onair
 */
public class Renta {
    
    private int conSeguro;
    
    private int total;
    
    private int estado;
    
    private Auto carcacha;
    
    private Cliente victima;
    
    private Calendar fechainicial;
    
    private Calendar fechafinal;
    
    public int calcularRenta () {
        
        //int preciofinal = 0;
        
        String categor = (carcacha.getTipo()).toString();
        long finMS = fechafinal.getTimeInMillis();
        long inicioMS = fechainicial.getTimeInMillis();
        
        int dias = (int)((Math.abs(finMS-inicioMS)) / (1000 * 60 * 60 * 24));
        
        if(categor == "PEQUEÑO" || categor == "MEDIANO" || categor == "GRANDE") {
            
            total = 500 * dias;
            
        } else {
            
            total = 700 * dias;
            
        }
        
        if(conSeguro == 0 && (categor == "PEQUEÑO" || categor == "MEDIANO")) {
            
            total = total + 1000;
            
        } else if(conSeguro == 0 && (categor == "GRANDE" || categor == "SUV")) {
            
            total = total + 1500;
            
        } else if(conSeguro == 0 && categor == "MINIVAN") {
            
            total = total + 2000;
            
        } else if(conSeguro == 0 && categor == "LUJO") {
            
            total = total + 3000;
            
        }
        
        return total;
        
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getTotal() {
        return total;
    }

    public int getConSeguro() {
        return conSeguro;
    }

    public void setConSeguro(int conSeguro) {
        this.conSeguro = conSeguro;
    }

    public Auto getCarcacha() {
        return carcacha;
    }

    public void setCarcacha(Auto carcacha) {
        this.carcacha = carcacha;
    }

    public Cliente getVictima() {
        return victima;
    }

    public void setVictima(Cliente victima) {
        this.victima = victima;
    }

    public Calendar getFechainicial() {
        return fechainicial;
    }

    public void setFechainicial(Calendar fechainicial) {
        this.fechainicial = fechainicial;
    }

    public Calendar getFechafinal() {
        return fechafinal;
    }

    public void setFechafinal(Calendar fechafinal) {
        this.fechafinal = fechafinal;
    }
    
    
    
}
