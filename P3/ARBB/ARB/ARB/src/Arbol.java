public class Arbol  
{  
    private static Nodo nodoVacio;   
    private Nodo actual;   
    private Nodo padre;    
    private Nodo cabeza;     
    private Nodo grand;   
    private Nodo great;
    static final int RED   = 0;  
    static final int BLACK = 1;      
  
    static   
    {  
        nodoVacio = new Nodo(0);  
        nodoVacio.Izquierdo = nodoVacio;  
        nodoVacio.Derecho = nodoVacio;  
    }  
  
    public Arbol(int cabeza)  
    {  
        this.cabeza = new Nodo(cabeza);  
        this.cabeza.Izquierdo = nodoVacio;  
        this.cabeza.Derecho = nodoVacio;  
    }  
  
    //Metodo para verificar que el arbol no este vacio
    public boolean vacio()  
    {  
        return cabeza.Derecho == nodoVacio;  
    }  
  
    //Metodo para insertar Nodos en el Arbol
    public void insertarNodo(int dato )  {  
        actual = padre = grand = cabeza;     
        nodoVacio.dato = dato;         
        while (actual.dato != dato)  
        {              
            great = grand;   
            grand = padre;   
            padre = actual;  
            actual = dato < actual.dato ? actual.Izquierdo : actual.Derecho;   

            if (actual.Izquierdo.color == RED && actual.Derecho.color == RED)  
                cambioColor( dato );  
        }  
        if (actual != nodoVacio)  
            return;  
        actual = new Nodo(dato, nodoVacio, nodoVacio);  
        if (dato < padre.dato)  
            padre.Izquierdo = actual;  
        else  
            padre.Derecho = actual;          
        cambioColor( dato );  
    }  
  
    //Metodo para la asignacion de los colores de los Nodos en el Arbol
    private void cambioColor(int dato)  
    {  
        actual.color = RED;    
        actual.Izquierdo.color = BLACK;   
        actual.Derecho.color = BLACK;   
        if (padre.color == RED)     
        {  
            grand.color = RED;  
            if (dato < grand.dato && grand.dato != dato && dato < padre.dato)  
                padre = rotacion( dato, grand );  
            actual = rotacion(dato, great );  
            actual.color = BLACK;  
        }  
        cabeza.Derecho.color = BLACK;   
    }  
  
    //Metodo para rotar
    private Nodo rotacion(int dato, Nodo padre)  
    {  
        if(dato < padre.dato)  {
            return padre.Izquierdo = dato < padre.Izquierdo.dato ? rotacionIzquierda(padre.Izquierdo) : rotacionDerecha(padre.Izquierdo) ;    
        } else {
            return padre.Derecho = dato < padre.Derecho.dato ? rotacionIzquierda(padre.Derecho) : rotacionDerecha(padre.Derecho);  
        }  
    }  
  
    //Metodo para rotar a la izquierda 
    private Nodo rotacionIzquierda(Nodo aux)  
    {  
        Nodo n = aux.Izquierdo;  
        aux.Izquierdo = n.Derecho;  
        n.Derecho = aux;  
        return n;  
    }  
  
    //Metodo para rotar a la derecha
    private Nodo rotacionDerecha(Nodo aux)  
    {  
        Nodo n = aux.Derecho;  
        aux.Derecho = n.Izquierdo;  
        n.Izquierdo = aux.Izquierdo;  
        return n;  
    }  
  
    //Metodo para obtener el numero de Nodo totales del Arbol
    public int nodosTotales()  
    {  
        return nodosTotales(cabeza.Derecho);  
    }  
    private int nodosTotales(Nodo n)  
    {  
        if (n == nodoVacio)  
            return 0;  
        else  
        {  
            int tamanio = 1;  
            tamanio = tamanio + nodosTotales(n.Izquierdo);  
            tamanio = tamanio + nodosTotales(n.Derecho);  
            return tamanio;  
        }  
    }  
    
    //Metodo para buscar un elemento en el arbol
    public boolean buscar(int dato)  
    {  
        return buscar(cabeza.Derecho, dato);  
    }  
    private boolean buscar(Nodo n, int dato)  
    {  
        boolean tf = false;  
        while ((n != nodoVacio) && tf != true)  
        {  
            int valor = n.dato;  
            if (dato < valor)  
                n = n.Izquierdo;  
            else if (dato > valor)  
                n = n.Derecho;  
            else  
            {  
                tf = true;  
                break;  
            }  
            tf = buscar(n, dato);  
        }  
        return tf;  
    }    
  
    //Metodo para recorrer el arbol en inOrden
    public void inOrder()  
    {  
        inOrder(cabeza.Derecho);  
    }  
    private void inOrder(Nodo n)  
    {  
        if (n != nodoVacio)  
        {  
            inOrder(n.Izquierdo);  
            char c = 'R';  
            if (n.color == 1)  
                c = 'B';  
            System.out.print(n.dato +""+c+" ");  
            inOrder(n.Derecho);  
        }  
    }  
   
}  
  