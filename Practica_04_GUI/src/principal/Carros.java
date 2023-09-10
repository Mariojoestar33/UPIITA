/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author onair
 */
public enum Carros {
    
    FIGO_2020(296000),
    LOBO_2020(1520700),
    MUSTANG_2020(927700),
    ECOSPORT_2020(425400),
    EDGE_2020(863700),
    RANGER_2020(434600);
    
    public double costo;
    public double costofinal;
    
    private Carros(double costo) {
        
        this.costo = costo;
        
    }
    
    public double calcularCostofinal(int tipodePago) {
        
        if (tipodePago == 0) {
            
            costofinal = costo * 1.16;
            
        }
        else {
            
            costofinal = (costo * 1.16) + (costo * 0.02);
            
        }
        
        return costofinal;
        
    }
    
}
