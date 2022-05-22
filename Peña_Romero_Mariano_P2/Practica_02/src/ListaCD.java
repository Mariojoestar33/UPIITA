public class ListaCD {

    private Nodo nodo;
    private Nodo ultimo; 

    public ListaCD() {
        nodo = null;
        ultimo = null;
    }

   //Metodo para ingresar un Nodo
   public void ingresarNodo(Dato dato) {
       if(this.nodo == null) {
           this.nodo = new Nodo(dato);
           this.ultimo = this.nodo;
       } else {
           Nodo nuevo = new Nodo(dato);
           this.ultimo.setSiguiente(nuevo);
           nuevo.setAnterior(this.ultimo);
           this.ultimo = nuevo;
       }
   }

   //Metodo para ingresa un Nodo en la posicion deseada
    public void ingresarNodo(Dato dato, int posicion) {
         if(this.nodo == null) {
              this.nodo = new Nodo(dato);
              this.ultimo = this.nodo;
         } else {
              Nodo nuevo = new Nodo(dato);
              Nodo aux = this.nodo;
              int contador = 0;
              while(contador < posicion) {
                aux = aux.getSiguiente();
                contador++;
              }
              nuevo.setSiguiente(aux);
              nuevo.setAnterior(aux.getAnterior());
              aux.getAnterior().setSiguiente(nuevo);
              aux.setAnterior(nuevo);
         }
    }

   //Metodo de las princiapales funciones de la lista amor no se que hace
    public void imprimirLista() {
         Nodo aux = this.nodo;
         if(this.nodo == null){
            System.out.println("No hay valores en la lista...\n");
        } else {
         while(aux != null) {
              System.out.print(" - " + aux.getValor().getValor());
              aux = aux.getSiguiente();
            }
         System.out.print(" -");
        }
    }

    //Metodo de mostrar la lista invertida
    public void imprimirListaInvertida() {
        Nodo aux = this.ultimo;
        if(this.nodo == null) {
            System.out.println("No hay valores en la lista...\n");
        } else {
        while(aux != null) {
            System.out.print(" - " + aux.getValor().getValor());
            aux = aux.getAnterior();
            }
        System.out.print(" -");
        }
    }

    public void imprimir(int sentido) {
        if(sentido == 1) {
            this.imprimirLista();
        } else {
            this.imprimirListaInvertida();
        }
    }

    //Metodo para ordenar la lista de manera ascendente
    public void ordenarLista() {
        Nodo aux = this.nodo;
        while(aux != null) {
            Nodo aux2 = aux.getSiguiente();
            while(aux2 != null) {
                if(aux.getValor().getValor() > aux2.getValor().getValor()) {
                    Dato aux3 = aux.getValor();
                    aux.setValor(aux2.getValor());
                    aux2.setValor(aux3);
                }
                aux2 = aux2.getSiguiente();
            }
            aux = aux.getSiguiente();
        }
    }

    //Metodo de buscar un dato en la lista y retornar su posicion
    public int buscarDato(int dato) {
        int posicion = 0;
        Nodo aux = this.nodo;
        while(aux != null) {
            if(aux.getValor().getValor() == dato) {
                return posicion + 1;
            }
            posicion++;
            aux = aux.getSiguiente();
        }
        return -1;
    }


}
