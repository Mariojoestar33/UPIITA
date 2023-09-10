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
public class Auto {
    
    private String placa;
    private String marca;
    private int modelo;
    private int ocupado;
    private Categoria tipo;

    public Auto(String placa, String marca, int modelo, Categoria tipo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
    }

    public Categoria getTipo() {
        return tipo;
    }

    public void setTipo(Categoria tipo) {
        this.tipo = tipo;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getOcupado() {
        return ocupado;
    }

    public void setOcupado(int ocupado) {
        this.ocupado = ocupado;
    }
    
    
    
}
