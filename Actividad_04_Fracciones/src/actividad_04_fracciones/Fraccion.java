/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_04_fracciones;

/**
 * Una clase para poder sumar fracciones tanto homogeneas como heterogeneas.
 * y que se reduzcan al minimo posible en terminos de fraccion.
 * @version 1.2, 18/03/21
 * @author Peña Romero Mariano 1TV4
 */
public class Fraccion {
    
    public int numerador; //Numerador de las fracciones.
    public int denominador; //Denominador de las fraaciones.
    
    /**
     * Cálculo de la suma de 2 fracciones.
     * @param fracSumar Una fraccion diferente para que se sume.
     * @return El resultado reducido de la suma de 2 diferentes fracciones. 
     */
    public Fraccion sumar(Fraccion fracSumar) {
        
       Fraccion resultado = new Fraccion(); //Declaramos una Fraccion la cual va a ser la que almacene el resultado.
        
       /*Se calcula el numerador del resultado mediante la suma de los productos cruzados de las fracciones.*/
       resultado.numerador = (this.numerador*fracSumar.denominador)+(this.denominador*fracSumar.numerador);
        
       /*Calculamos el denominador mediante el producto de los denominadores de las 2 fracciones*/
       resultado.denominador = (this.denominador*fracSumar.denominador);
       
       /**
        * Se plantea la reduccion de la fraccion resultado mediante
        * un ciclo el cual ira de 1 hasta 10 revisando si la division tanto del numerador
        * como del denominador es compatible con ese numero*/
       for(int i = 1; i <=10; i++) {
           
           /*Se condiciona a que los residuos del numerador como del denominador sean numeros enteros*/
           if(resultado.numerador % i == 0 && resultado.denominador % i == 0) {
               
               /*En caso de cumplirse la condicion, se procedera a la division del numerador y
               denominador con el numero "i" que cumplio.*/
                resultado.numerador = resultado.numerador/i;
                resultado.denominador = resultado.denominador/i;
               
           }
           
       }
      
        return resultado; 
        
    }
    
}
