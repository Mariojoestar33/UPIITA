public class ListaLigada {
    private Nodo nodo; //cabeza de la lista
    private int numElementos;

    //Constructor
    public ListaLigada() {
        nodo = null;
        numElementos = 0;
    }

    //getter
    public Nodo getNodo() {
        return nodo;
    }

    //setter
    public void setNodo(Nodo nodo) {
        this.nodo = nodo;
    }

    /**
     * Devuelve el numero de elementos de la lista
     * @return Entero que representa el numero de elementos de la lista
     */
    public int numeroElementos() {
        return numElementos;
    }

    /**
     * Inserta un elemento al final de la lista.
     * @param nodo El nodo a insertar al final
     */
    public void insertaNodo(Nodo nodo){
        if(this.nodo == null) {
            // La lista esta vacia 
            this.nodo = nodo;
        } else {
            // La lista no esta vacia
            Nodo nodoActual = this.nodo;
            while(nodoActual.getSiguiente() != null) {
                nodoActual = nodoActual.getSiguiente();
            }
            nodoActual.setSiguienteNodo(nodo);
        }
        numElementos++;
    }


    /**
     * Inserta un nodo en el lugar indicado.
     * Si la lista esta vacia, lo insertamos al inicio sin importar la posicion soliictada
     * Si la posicion es menos o igual a 0, se inserta al inicio.
     * Si la posocion es mayor al numero de elementos, se inserta al final.
     * @param nodo Nodo a insertar.
     * @param posicion Lugar donde se desea insertar.
     */
    public void insertaNodo(Nodo nodo, int posicion) {
        if(this.nodo == null) {
            // Lista vacia
            this.nodo = nodo;
        } else if(posicion <= 0) {
            // La lista no esta vacia
            nodo.setSiguienteNodo(this.nodo);
            this.nodo = nodo;
        } else if(posicion >= numElementos) {
            Nodo nodoActual = this.nodo;
            while(nodoActual.getSiguiente() != null) {
                // Busco el nodo final
                nodoActual = nodoActual.getSiguiente();
            }
            nodoActual.setSiguienteNodo(nodo);
        } else {
            Nodo nodoActual = this.nodo;
            Nodo nodoAnterior = null;
            int cont = 1;
            while(cont != posicion) {
                cont++;
                nodoAnterior = nodoActual;
                nodoActual = nodoActual.getSiguiente();
            }
            nodoAnterior.setSiguienteNodo(nodo);
            nodo.setSiguienteNodo(nodoActual);
        }
        numElementos++;
    }

    /**
     * Imprime los valores de la lista
     */
    public void imprimeLista() {
        if(this.nodo == null) {
            // Lista esta vacia
            System.out.println("La lista esta vacia\n");
        } else {
            System.out.println("\n\nLista: ");
            Nodo nodoActual = this.nodo;
            while(nodoActual != null) {
                // Imprime los demas
                System.out.println("Alumno: " + nodoActual.getAlumno().getNombre() + 
                ". Edad: " + nodoActual.getAlumno().getEdad());
                nodoActual = nodoActual.getSiguiente();
            }
        }
    }

    /*
     * Elimina el nodo de la lista
     *Si la posicion es menor o igual a 0 o mayor o igual a los elementos de la lista,
     * se imprimira un mensaje de posicion fuera del rango.
     * @param posicion Posicion del nodo a eliminar
     */ 
    public void eliminaNodo(int posicion) {
        if(this.nodo == null) {
            System.out.println("La lista esta vacia\n");
        } else if(posicion <= 0 || posicion >= numElementos) {
            System.out.println("Posicion fuera del rango\n");
        } else {
            Nodo actual = this.nodo;
            Nodo anterior = null;

            int i = 1;
            while(i != posicion) {
                i++;
                anterior = actual;
                actual = actual.getSiguiente();
            }
            anterior.setSiguienteNodo(actual.getSiguiente());
            numElementos--;
        }
    }

    /**
     * Busca un elemento en la lista
     * @param alumno Alumno a buscar
     * @return Nodo que contiene el alumno
     */
    public Nodo buscaNodo(Alumno alumno) {
        if(this.nodo == null) {
            // Lista vacia
            System.out.println("La lista esta vacia\n");
            return null;
        } else {
            Nodo nodoActual = this.nodo;
            while(nodoActual != null) {
                // Busco el nodo final
                if(nodoActual.getAlumno().equals(alumno)) {
                    return nodoActual;
                }
                nodoActual = nodoActual.getSiguiente();
            }

        }

        return null;

    }  // Fin buscaNodo 

    /**
     *Actualiza un nodo de la lista
        * @param nodo Nodo a actualizar
        * @param alumno Nuevo alumno
        */
    public void actualizaNodo(Nodo nodo, Alumno alumno) {
        if(this.nodo == null) {
            // Lista vacia
            System.out.println("La lista esta vacia\n");
        } else {
            Nodo nodoActual = this.nodo;
            while(nodoActual != null) {
                // Busco el nodo final
                if(nodoActual.equals(nodo)) {
                    nodoActual.setAlumno(alumno);
                    return;
                }
                nodoActual = nodoActual.getSiguiente();
            }

        }

    }  // Fin actualizaNodo

    /**
     * Busca un alumno en la lista que tengan la edad indicada
     * @param edad Edad a buscar
     * @return Si se encuentra el alumno, devuelve el nodo que lo contiene. Si no, devuelve null
     */
    public Nodo buscaAlumnoXEdad(int edad) {
        Alumno found = null;
        Nodo actual = this.nodo;
        if(this.nodo != null) {
            while(actual != null) {
                if(actual.getAlumno().getEdad() == edad) {
                    //Encontrado
                    found = actual.getAlumno();
                    break;
                }
                actual = actual.getSiguiente();
            }
        }

        return actual;

    }
    
}
