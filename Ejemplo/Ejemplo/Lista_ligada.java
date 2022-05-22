package Ejemplo;

public class Lista_ligada {
    
    private Nodo nodo; //Cabeza de la lista
    
    public Lista_ligada() {
        nodo = null;
    }

    public Nodo getNodo() {
        return nodo;
    }

    public void setNodo(Nodo nodo) {
        this.nodo = nodo;
    }
 
    /**
     * Regresa el numero total de nodos que tiene la lista 
     */
    public int numeroElemntos() {
        int numElementos = 0;
        Nodo aux = nodo;
        while (aux != null) {
            numElementos++;
            aux = aux.getSiguiente();
        }
        return numElementos;
    } //Final del método numeroElementos

    /**
     * Inserta un elemento en una posición determinada
     * Si la lista está vacía, el elemento se inserta en la cabeza
     * Si la posicion es menor o igual a 0, el elemento se inserta en la cabeza
     * Si la lista no está vacía, el elemento se inserta en la posición indicada
     * Si la posición es mayor que el número de elementos de la lista, el elemento se inserta al final
     * @param alumno Nodo a insertar
     * @param pos Lugar donde se insertará el nodo
     */
    public void insertarNodo(Nodo nodo, int posicion) {
        //Lista vacia
        if(this.nodo == null) {
            this.nodo = nodo;
        } else if(posicion <= 0) {
            //La listano está vacía
            nodo.setSiguiente(this.nodo);
            this.nodo = nodo;
        } else if(posicion >= numeroElemntos()) {
            Nodo actual = this.nodo;
            while(actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nodo);
        } else {
            Nodo actual = this.nodo;
            Nodo anterior = null;
            int contador = 1;
            while(contador != posicion) {
                contador++;
                anterior = actual;
                actual = actual.getSiguiente();
            }
        }
    }

    /**
     * Inserta un nodo al final de la lista
     * @param alumno el nodo a insertar al final
     */
    public void insertarNodo(Nodo nodo) {
        if(this.nodo==null) {
            //Si la lista está vacía, el nuevo nodo será la cabeza
            this.nodo = nodo;
        } else {
            //La lista no está vacía
            Nodo actual = this.nodo;
            while(actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nodo);
        }
    } //Final del método insertarNodo

    /**
     * Imprime los datos de la lista
     * @return cadena con los datos de la lista
     */
    public void imprimeLista() {
        if(this.nodo == null) {

            System.out.println("Lista vacia");
        } else {

            Nodo actual = this.nodo;
            
            while(actual != null) {
                System.out.println("Alumno: " +actual.getAlumno().getNombre() + " Edad: " + actual.getAlumno().getEdad());
                actual = actual.getSiguiente();
            }
        }
        
    } //Final del método imprimeLista   

}
