public class ColaP {

    //Clase para crear una cola de prioridad
    private Nodo cabeza;
    private Nodo cola;
    private int tamaño;

    //Constructor
    public ColaP() {
        this.cabeza = null;
        this.cola = null;
        this.tamaño = 0;
    }

    //Metodo para insertar un Nodo en la cola
    public void insertar(int prioridad, int datos) {

        Nodo nuevo = new Nodo(new Datos(prioridad, datos));

        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
        } else {
            Nodo aux = cabeza;
            
            while (aux != null) {
                if (aux.getAnterior() == null && nuevo.getDato().getPrioridad() < aux.getDato().getPrioridad()) { //Si el nodo anterior es null y la prioridad del nuevo nodo es menor a la del nodo actual
                    nuevo.setSiguiente(aux);
                    aux.setAnterior(nuevo);
                    cabeza = nuevo;
                    break;
                } else if (aux.getAnterior() != null && nuevo.getDato().getPrioridad() < aux.getDato().getPrioridad()) { //Si el nodo anterior no es null y la prioridad del nuevo nodo es menor a la del nodo actual
                    nuevo.setSiguiente(aux);
                    nuevo.setAnterior(aux.getAnterior());
                    aux.getAnterior().setSiguiente(nuevo);
                    aux.setAnterior(nuevo);
                    break;
                } else if (aux.getSiguiente() == null) { //Si el nodo siguiente es null
                    aux.setSiguiente(nuevo);
                    nuevo.setAnterior(aux);
                    cola = nuevo;
                    break;
                } else {
                    aux = aux.getSiguiente();
                }
            }
        }
        tamaño++;
    }

     //Metodo para obtener el tamaño de la cola
     public int tamaño() {
        return tamaño;
    }

    //Metodo para sacar un Nodo de la cola
    public void sacar() {
        if (cabeza != null) {
            cabeza = cabeza.getSiguiente();
        }
    }

    //Metodo para imprimir la colada
    public void imprimir() {
        Nodo aux = cabeza;
        while (aux != null) {
            System.out.print(" - " + aux.getDato().getDatos());
            aux = aux.getSiguiente();
        }
        System.out.println(" -");
    }
}
