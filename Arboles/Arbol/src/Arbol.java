import java.util.LinkedList;

public class Arbol {
    
    private Nodo raiz; //Nodo raiz del arbol
    private LinkedList<Nodo> lista; //Lista de nodos

    public Arbol() {
        this.raiz = null;
        this.lista = new LinkedList<Nodo>();
    }

    public void insertarNodo(Nodo nodo) {
        if(this.raiz == null) {
            lista.add(nodo);
            raiz=nodo;
        } else {
            Nodo encontrado = null;
            for(int i = 0; i < lista.size(); i++) {
                if(lista.get(i).getIzquierdo() == null || lista.get(i).getDerecho() == null) {
                    encontrado = lista.get(i);
                    break;
                }
            }
            lista.add(nodo);
            if(encontrado.getIzquierdo() == null) {
                encontrado.setIzquierdo(nodo);
            } else if(encontrado.getDerecho() == null) {
                encontrado.setDerecho(nodo);
            }
        }
    }

    //Metodo para imprimir el arbol en amplitud
    public void amplitud() {
        for (Nodo nodo : lista) {
            System.out.print(nodo.getDato() + " ");
        }
    }

    public void preOrden() {
        preOrden(raiz);
    }

    //Metodo para imprimir el arbol en preorden
    private void preOrden(Nodo nodo) {
        // R, I, D
        System.out.print(nodo.getDato() + " "); // Raiz

        if(nodo.getIzquierdo() != null) {  // Subarbol izquierdo
            preOrden(nodo.getIzquierdo());
        }

        if(nodo.getDerecho() != null) {  // Subarbol derecho
            preOrden(nodo.getDerecho());
        }
    }

    public void inOrden() {
        inOrden(raiz);
    }

    //Metodo para imprimir el arbol en inorden
    private void inOrden(Nodo nodo) {
        // I, R, D
        
        if(nodo.getIzquierdo() != null) {  // Subarbol izquierdo
            inOrden(nodo.getIzquierdo());
        }

        System.out.print(nodo.getDato() + " "); // Raiz

        if(nodo.getDerecho() != null) {  // Subarbol derecho
            inOrden(nodo.getDerecho());
        }
    }

    public void postOrden() {
        postOrden(raiz);
    }

    //Metodo para imprimir el arbol en postorden
    private void postOrden(Nodo nodo) {
        // I, D, R
        
        if(nodo.getIzquierdo() != null) {  // Subarbol izquierdo
            postOrden(nodo.getIzquierdo());
        }

        if(nodo.getDerecho() != null) {  // Subarbol derecho
            postOrden(nodo.getDerecho());
        }

        System.out.print(nodo.getDato() + " "); // Raiz
    }

    //Metodo para eliminar un nodo
    public boolean eliminarNodo(int dato) {
        if(raiz == null) {
            //El arbol esta vacio, no hay naodos para eliminar
            return false;
        } if(raiz.getDerecho() == null && raiz.getDerecho() == null) {
            if(raiz.getDato() == dato) {
                //El nodo a eliminar es la raiz
                raiz = null;
                lista.clear();
                return true;
            } else {
                //El nodo a eliminar no existe
                return false;
            }
        } 
        Nodo encontrado = null;
        //Buscar el nodo a eliminar
        for(int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getDato() == dato) {
                encontrado = lista.get(i);
                break;
            }
        }
        if(encontrado == null) {
            //El nodo a eliminar no existe
             return false;
        }   else {
                int valorAux = lista.get(lista.size() - 1).getDato();
                //Buscamos al Nodo padre del nodo a eliminar
                Nodo actual = null;
                for(int i = 0; i < lista.size(); i++) {
                    actual = lista.get(i);
                    if(actual.getIzquierdo() != null) {
                        if(actual.getIzquierdo().getDato() == valorAux) {
                            actual.setIzquierdo(null);
                            break;
                        }
                    }   if(actual.getDerecho() != null) {
                            if(actual.getDerecho().getDato() == valorAux) {
                                actual.setDerecho(null);
                                break;
                            }
                        }
                }
                //Eliminamos el nodo hoja mas a la derecha
                lista.remove(lista.size() - 1);
                //Intercamos el valor del nodo hoja por el nodo encontrado
                encontrado.setDato(valorAux);
                return true;
            }
    }

    /**
     * Busca un valor haciendo un recorrido en amplitud
     * @param valor El valor a buscar
     * @return True si el valor se encuentra en el arbol, false en caso contrario
     */
    public Boolean buscarAmplitud(int valor) {
        Boolean encontrado = false;
        int i = 0;
        for(i = 0; i < lista.size(); i++) {
            if(lista.get(i).getDato() == valor) {
                encontrado = true;
                break;
            }
        }
        if(encontrado) {
            System.out.println("\nEncontrado, se recorrieron: " +(i+1)+ " Nodos");
        } else {
            System.out.println("\nNo se encontro el valor, se recorrieron: " +i+ " Nodos");
        }
        return encontrado;
    }

    /**
     * Busca un valor en el orden haciendo un recorrido en profundidad
     * @param valor Valor a buscar
     * @return True si el valor se encuentra en el arbol, false en caso contrario
     */
    public Boolean buscarProfundidad(int valor) {
        Boolean encontrado = false;
        Integer[] contador = {1};
        encontrado = buscarNodoRecursivo(raiz, valor, contador);

        if(encontrado) {
            System.out.println("\nEncontrado, se recorrieron: " +contador[0]+ " Nodos");
        } else {
            System.out.println("\nNo se encontro el valor, se recorrieron: " +contador[0]+ " Nodos");
        }
        return encontrado;
    }

    //Metodo privado encargado de ser invocado para realizar la busqueda del Nodo
    private Boolean buscarNodoRecursivo(Nodo nodo, int valor, Integer[] contador) {
        Boolean encontrado = false;
        //Exploramos el nodo Raiz
        if(nodo == null) {
            //Valor no encontrado
            return false;
        } else {
            if(nodo.getDato() == valor) {
                return true;
            }
        }
        //Exploramos el subArbol izquierdo
        if(!encontrado) {
            if(nodo.getIzquierdo() != null) {
                contador[0] += 1;
                encontrado = buscarNodoRecursivo(nodo.getIzquierdo(), valor, contador);
            } else {
                //Valor no encontrado
                return false;
            }
        }
        //Exploramos el subArbol derecho
        if(!encontrado) {
            if(nodo.getDerecho() != null) {
                contador[0] += 1;
                encontrado = buscarNodoRecursivo(nodo.getDerecho(), valor, contador);
            } else {
                //Valor no encontrado
                return false;
            }
        }
        return encontrado;
    }

}
    


