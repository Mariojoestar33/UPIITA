public class ListaDoble {

    private Nodo nodo; //Nodo inicial de la lista
    private Nodo anterior; //Nodo anterior al actual;
    private int numElementos; // Numero de elementos de la lista

    // Constructor
    public ListaDoble() {
        nodo = null;
        anterior = null;
        numElementos = 0;
    } // Fin del constructor

    //Getters y setters
    public Nodo getNodo() {
        return nodo;
    }

    public void setNodo(Nodo nodo) {
        this.nodo = nodo;
    } 
    //Fin de getters y setters



    //METODOS

    //Devuelve el numero de elemntos de la lista de la lista
    public int getNumElementos() {
        return numElementos;
    }

    //Agrega un Nodo al final de la lista de la lista
    public void agregarNodo(Nodo nodo) {
        if (this.nodo == null) { //Si la lista esta vacia
            this.nodo = nodo;
            this.anterior = nodo;
        } else { //Si la lista no esta vacia
            this.anterior.setSiguiente(nodo);
            nodo.setAnterior(this.anterior);
            this.anterior = nodo;
        }
        numElementos++;
    }    

    //Inserta un Nodo en la posicion deseada
    public void insertarNodo(Nodo nodo, int posicion) {
        if (posicion == 0) {
            nodo.setSiguiente(this.nodo);
            this.nodo.setAnterior(nodo);
            this.nodo = nodo;
        } else {
            Nodo aux = this.nodo;
            for (int i = 0; i < posicion - 1; i++) {
                aux = aux.getSiguiente();
            }
            nodo.setSiguiente(aux.getSiguiente());
            aux.getSiguiente().setAnterior(nodo);
            nodo.setAnterior(aux);
            aux.setSiguiente(nodo);
        }
        numElementos++;
    }
    
}
