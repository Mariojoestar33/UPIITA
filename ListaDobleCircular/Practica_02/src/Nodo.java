public class Nodo {

    private Dato valor;
    private Nodo siguiente;
    private Nodo anterior;

    public Nodo(Dato valor) {
        this.valor = valor;
    }

    public Dato getValor() {
        return valor;
    }

    public void setValor(Dato valor) {
        this.valor = valor;
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
    
}
