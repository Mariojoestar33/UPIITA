public class Nodo {
    
    public int dato;
    public Nodo siguiente;

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public Nodo(int dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public String getSiguiente() {
        return siguiente.toString();
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
