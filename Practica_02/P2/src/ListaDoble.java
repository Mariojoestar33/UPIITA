public class ListaDoble {

    private Nodo nodo; //Cabeza de la lista
    //private Nodo ultimo; //Ultimo nodo de la lista
    private int numElementos;

    public ListaDoble() {
        nodo = null;
        numElementos = 0;
    }

    //Agrega un elemento al final de la lista
    public void insertarNodo(Nodo nodo) {
        if (this.nodo == null) {
            this.nodo = nodo;
        } else {
            Nodo aux = this.nodo;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nodo);
            nodo.setAnterior(aux);
        }
        numElementos++;
    }//Fin insertar

    //Agrega un elemento en el lugar indicado
    public void insertarNodo(Nodo nodo, int posicion) {
        this.nodo = nodo;
        if(posicion == 0){
            nodo.setSiguiente(this.nodo);
            this.nodo.setAnterior(nodo);
            this.nodo = nodo;
    } else if(posicion <= 0) {
        nodo.setSiguiente(this.nodo);
        this.nodo.setAnterior(nodo);
        this.nodo = nodo;
    } else if(posicion >= numElementos) {
        Nodo aux = this.nodo;
        while (aux.getSiguiente() != null) {
            aux = aux.getSiguiente();
        }
        aux.setSiguiente(nodo);
        nodo.setAnterior(aux);
    } else {
            Nodo aux = this.nodo;
            int contador = 0;
            while (contador < posicion) {
                aux = aux.getSiguiente();
                contador++;
            }
            nodo.setSiguiente(aux);
            nodo.setAnterior(aux.getAnterior());
            aux.getAnterior().setSiguiente(nodo);
            aux.setAnterior(nodo);
        }
      numElementos++;
    } //Fin insertar en posicion especifica

    //Busca un elemento en la lista
    public Nodo buscarNodo(int valor) {
       Dato found = null;
       Nodo aux = this.nodo;
       if(this.nodo != null) {
           while(aux != null) {
               if(aux.getDato().getValor() == valor) {
                   found = aux.getDato();
                   break;
               }
               aux = aux.getSiguiente();
           }
       }
       return aux;
    } //Fin buscar

    //Buscar un elemento en la lista y regresar su posicion
    public int buscarNodoPosicion(int valor) {
        Nodo aux = this.nodo;
        int contador = 0;
        while (aux != null) {
            if (aux.getDato().getValor() == valor) {
                return contador;
            }
            aux = aux.getSiguiente();
            contador++;
        }
        return -1;
    } //Fin buscarPosicion

    //Mostrar la lista
    public void mostrarLista() {
        if(this.nodo == null) {
            System.out.println("La lista esta vacia...\n");
        } else {
            Nodo aux = this.nodo;
            while (aux != null) {
                System.out.println(aux.getDato().getValor());
                aux = aux.getSiguiente();
            }
        }
    } //Fin mostrar

    //Mostrar la lista en reversa
   public void mostrarListaR() {
       
   }

}//Fin ListaDoble
