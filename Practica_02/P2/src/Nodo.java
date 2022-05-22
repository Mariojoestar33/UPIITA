public class Nodo {
    
    private Dato dato;
    private Nodo anterior, siguiente;

    public Nodo() {
        dato = null;
        anterior = null;
        siguiente = null;
    }

    public Nodo(Dato dato) {
        this.dato = dato;
        anterior = null;
        siguiente = null;
    }

    public void setDato(Dato dato) {
        this.dato = dato;
    }

    public Dato getDato() {
        return dato;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public Nodo getAnterior() {
        return anterior;
    }

}
