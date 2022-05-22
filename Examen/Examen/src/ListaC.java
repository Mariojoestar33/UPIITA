public class ListaC {

    Nodo inicio; //puntero al inicio de la lista
    Nodo fin; //puntero al final de la lista
    
    public ListaC(){ //Constructor
        inicio = null;
        fin = null;
    }
    
    //Metodo para ingresar un nodo al final de la lista
    public void ingresarNodo(int num){
        Nodo nuevo = new Nodo();
        nuevo.dato = num;
        
        if(inicio == null){
            inicio = nuevo;
            fin = inicio;
            inicio.siguiente = fin;
        }else{
            fin.siguiente= nuevo;
            nuevo.siguiente = inicio;
            fin = nuevo;
        }
    }

    //Metodo para mostrar los datos de la lista
    public void mostrarLista(){
        Nodo actual = new Nodo();
        actual = inicio;
        
        if(inicio == null){
            System.out.println("La lista no tiene valores...\n");
        }else{
            do{
                System.out.print(" - " + actual.dato);
                actual = actual.siguiente;
            }while(actual != inicio);
            System.out.print(" -");
        }
    }
    
    //Metodo para mover los Nodos
    public void rotar(){
        inicio = inicio.siguiente;
        fin = inicio;
    }

}
