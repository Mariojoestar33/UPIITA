public class App {
    public static void main(String[] args) throws Exception {
        
        ListaDoble lista = new ListaDoble();
        
        lista.mostrarLista();

        Dato dato1 = new Dato(1);
        Dato dato2 = new Dato(2);
        Dato dato3 = new Dato(3);
        Dato dato4 = new Dato(4);
        Dato dato5 = new Dato(5);

        Nodo nodo1 = new Nodo(dato1);
        Nodo nodo2 = new Nodo(dato2);
        Nodo nodo3 = new Nodo(dato3);
        Nodo nodo4 = new Nodo(dato4);
        Nodo nodo5 = new Nodo(dato5);

        lista.insertarNodo(nodo1);
        lista.insertarNodo(nodo2);
        lista.insertarNodo(nodo3);
        lista.insertarNodo(nodo4);
        lista.insertarNodo(nodo5);

        lista.mostrarLista();
        lista.mostrarListaR();

    }
}
