public class Nodo {

    private Cadena cadena;
    private Nodo siguiente;

    public Nodo(Cadena cadena) {
        this.cadena = cadena;
        this.siguiente = null;
    }

    public Cadena getCadena() {
        return cadena;
    }

    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
}
