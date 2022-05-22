public class Nodo  {    
      
    Nodo Izquierdo, Derecho;  
    int dato;  
    int color;  
  
    public Nodo(int dato)  
    {  
        this( dato, null, null );  
    }   
  
    public Nodo(int dato, Nodo Izquierdo, Nodo Derecho)  
    {  
        this.dato = dato;  
        this.Izquierdo = Izquierdo;  
        this.Derecho = Derecho;  
        color = 1;  
    }      
}  