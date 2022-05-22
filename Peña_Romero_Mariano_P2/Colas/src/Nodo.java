public class Nodo {

    private Nodo siguiente;
    private Nodo anterior;
    private Datos dato;

    public Nodo(Datos dato) {
        this.siguiente = null;
        this.anterior = null;
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public Datos getDato() {
        return dato;
    }

    public void setDato(Datos dato) {
        this.dato = dato;
    }
    
}
