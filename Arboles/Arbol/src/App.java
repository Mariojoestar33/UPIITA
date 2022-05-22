public class App {
    public static void main(String[] args) throws Exception {
        Arbol arbol = new Arbol();

        arbol.insertarNodo(new Nodo(1));
        arbol.insertarNodo(new Nodo(2));
        arbol.insertarNodo(new Nodo(3));
        arbol.insertarNodo(new Nodo(4));
        arbol.insertarNodo(new Nodo(5));
        arbol.insertarNodo(new Nodo(6));
        arbol.insertarNodo(new Nodo(7));
        arbol.insertarNodo(new Nodo(8));
        arbol.insertarNodo(new Nodo(9));
        //arbol.insertarNodo(new Nodo(10));

        System.out.println("Recorrido en Amplitud");
        arbol.amplitud();

        System.out.println("\nRecorrido en Preorden");
        arbol.preOrden();
        
        System.out.println("\nRecorrido en Inorden");
        arbol.inOrden();
        
        System.out.println("\nRecorrido en Postorden");
        arbol.postOrden();

        arbol.buscarAmplitud(3);
        arbol.buscarProfundidad(3);

    }
}
