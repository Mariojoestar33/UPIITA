public class Nodo {

    private Dato dato;
    private Nodo siguiente;

    public Nodo(Dato dato) {
        this.dato = dato;
        this.siguiente = null;
    }
    
    public Nodo() {
        this.dato = null;
        this.siguiente = null;
    }

    public Dato getDato() {
        return dato;
    }

    public void setDato(Dato dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
}
