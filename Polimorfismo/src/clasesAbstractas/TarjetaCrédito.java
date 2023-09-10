/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesAbstractas;

/**
 *
 * @author belli
 */
public abstract class TarjetaCrédito {
    protected double límiteCrédito;
    protected double saldo;
    protected double tasa;
    
    public boolean autorizarCompra(double montoDeCompra){
        if(saldo+montoDeCompra <= límiteCrédito){
            saldo = saldo + montoDeCompra;
            return true;
        }
        return false;
    }
    
    public abstract boolean cobroMensual(double montoAPagar);
}
