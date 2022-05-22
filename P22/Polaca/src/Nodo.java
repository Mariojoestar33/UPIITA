public class Nodo {

    private Expresion expresion;
    private Nodo siguiente;


    public Nodo(Expresion expresion, Nodo siguiente) {
        this.expresion = expresion;
        this.siguiente = siguiente;
    }

    public Nodo(Expresion expresion) {
        this.expresion = expresion;
        this.siguiente = null;
    }

    public Expresion getExpresion() {
        return expresion;
    }

    public void setExpresion(Expresion expresion) {
        this.expresion = expresion;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
}
