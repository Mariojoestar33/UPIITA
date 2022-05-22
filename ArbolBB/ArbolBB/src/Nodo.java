public class Nodo {

    private int valor;
    private int contador;
    private Nodo padre;
    private Nodo izquierdo;
    private Nodo derecho;

    public Nodo(int valor) {
        this.valor = valor;
        this.contador = 1;
        this.izquierdo = null;
        this.derecho = null;
        this.padre = null;
    }

    public Nodo() {
        this.valor = 0;
        this.contador = 1;
        this.izquierdo = null;
        this.derecho = null;
        this.padre = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public Nodo getPadre() {
        return padre;
    }

    public void setPadre(Nodo padre) {
        this.padre = padre;
    }

    public Nodo getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public Nodo getDerecho() {
        return derecho;
    }

    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }
    public void incrementaContador(){
        this.contador++;
    }

    public void decrementaContador(){
        this.contador--;
    }

    public void  modificaContador(boolean incrementa) {
        if(incrementa) contador++;
        else contador--;
    }

}