public class pila {
    private Nodo cima;
    private int size;

    public pila() {
        this.cima = null;
        this.size = 0;
    }

    public void push(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.setSiguiente(cima);
        cima = nuevo;
        size++;
    }

    public int pop() {
        int dato = cima.getDato();
        cima = cima.getSiguiente();
        size--;
        return dato;
    }

    public int peek() {
        return cima.getDato();
    }

    public boolean isEmpty() {
        return cima == null;
    }

    public int size() {
        return size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Nodo aux = cima;
        while (aux != null) {
            sb.append(aux.getDato() + " ");
            aux = aux.getSiguiente();
        }
        return sb.toString();
    }
}
