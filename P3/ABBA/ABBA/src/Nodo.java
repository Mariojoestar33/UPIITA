public class Nodo {

    private int dato;
    private Nodo izquierda;
    private Nodo derecha;
    private Nodo padre;
    private int fe;

    public Nodo(int dato) {
        this.dato = dato;
        this.fe = 0;
        this.izquierda = null;
        this.derecha = null;
        this.padre = null;

    }
    
    public Nodo() {
        this.dato = 0;
        this.fe = 0;
        this.izquierda = null;
        this.derecha = null;
        this.padre = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
    public int getFe() {
        return fe;
    }

    public void setFe(int fe) {
        this.fe = fe;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public Nodo getPadre() {
        return padre;
    }

    public void setPadre(Nodo padre) {
        this.padre = padre;
    }
    
}
