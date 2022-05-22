public class ListaC {

    private Nodo inicio;
    private Nodo fin;
    private int numElementsos;

    public ListaC() {
        this.inicio = null;
        this.fin = null;
        this.numElementsos = 0;
    }

    public void insertar(Dato dato) {
        Nodo nuevo = new Nodo(dato);
        if (this.inicio == null) {
            this.inicio = nuevo;
            this.fin = nuevo;
        } else {
            this.fin.setSiguiente(nuevo);
            this.fin = nuevo;
        }
        this.numElementsos++;
    }

    public void mostrar() {
        Nodo aux = this.inicio;
        while (aux != null) {
            System.out.print("- " + aux.getDato().getValor());
            aux = aux.getSiguiente();
        }
        System.out.print(" -");
    }

    //Metodo para mover los elementos de la lista
    public void mover() {
        this.fin = this.inicio;
        this.inicio = this.inicio.getSiguiente();
    }

}
    

