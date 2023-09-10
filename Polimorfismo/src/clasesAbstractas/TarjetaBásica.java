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
public class TarjetaBásica extends TarjetaCrédito{
    @Override
    public boolean cobroMensual(double montoAPagar) {
        
        if (montoAPagar == saldo){
            saldo = 0;
            return true;
        }
        if(montoAPagar < saldo){
            saldo = saldo - montoAPagar;
            saldo *= 1.15 ; //15% de interés
        }
        return false;
    } 
}
