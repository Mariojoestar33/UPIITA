public class ArbolBB {

    private Nodo raiz;

    public ArbolBB() {
        this.raiz = null;
    }

    //Metodo para insertar un Nodo en el Arbol
    public void insertar(int nuevoValor) {
        if(raiz == null) {
            raiz = new Nodo(nuevoValor);
        } else {
            insertarNodo(raiz, nuevoValor);
        }
    }

    /**
     * Insertar un Nodo de manera recursiva
     * @param nodo El nodo a evaluar
     * @param nuevoValor El nuevo valor del nodo a insertar
     */
    private void insertarNodo(Nodo nodo, int nuevoValor) {
        if(nodo.getValor() == nuevoValor) {
            //Incrementa el contador
            nodo.incrementaContador();
        } else if(nuevoValor < nodo.getValor()) {
            // Va a la izquierda
            if(nodo.getIzquierdo() == null) {
                nodo.setIzquierdo(new Nodo(nuevoValor));
                nodo.getIzquierdo().setPadre(nodo);
            } else {
                insertarNodo(nodo.getIzquierdo(), nuevoValor);
            }
        } else {
            // Va a la derecha
            if(nodo.getDerecho() == null) {
                nodo.setDerecho(new Nodo(nuevoValor));
                nodo.getDerecho().setPadre(nodo);
            } else {
                insertarNodo(nodo.getDerecho(), nuevoValor);
            }
        }
    }

    //Metodo para buscar un Nodo en el Arbol
    public Nodo buscar(int valor) {
        if(raiz == null) {
            //El arbol esta vacio
            return null;
        } else {
            return buscar(raiz, valor);
        }
    }

    private Nodo buscar(Nodo nodo, int valor) {
        if(nodo.getValor() == valor) {
            //El nodo fue encontrado
            return nodo;
        } else if(valor < nodo.getValor()) {
            //Va a la izquierda
            if(nodo.getIzquierdo() == null) {
                //No se encontro el nodo
                return null;
            } else {
                return buscar(nodo.getIzquierdo(), valor);
            }
        } else {
            //Va a la derecha
            if(nodo.getDerecho() == null) {
                //No se encontro el nodo
                return null;
            } else {
                return buscar(nodo.getDerecho(), valor);
            }
        }
    }

    //Metodo para recorrer el arbol en postOrden

   //Metodo para recorrer el arbol inOrden
    public void recorrerInOrden() {
        if(raiz != null) {
            System.out.print("\nRecorrido InOrden:\n");
            recorrerInOrden(raiz);
            System.out.print(" -");
        }
    }

   
    // eliminar nodos
    public Nodo eliminar(int valor) {
        if(raiz == null) {
            return null;
        } else {
            // buscamos el nodo
            Nodo encontrado = buscar(valor);

            if(encontrado == null) {
                return null;
            } else {
                // Caso 1: Nodo hoja
                if(encontrado.getIzquierdo() == null && encontrado.getDerecho() == null) {
                    Nodo padre = encontrado.getPadre();
                    if(padre.getIzquierdo() != null) {
                        if(padre.getIzquierdo() == encontrado) {
                            padre.setIzquierdo(null);
                            return encontrado;
                        }
                    }
                    if(padre.getDerecho() != null) {
                        if(padre.getDerecho() == encontrado) {
                            padre.setDerecho(null);
                            return encontrado;
                        }
                    }
                }
                // Caso 2: Nodo con un solo hijo
                else if(encontrado.getIzquierdo() == null || encontrado.getDerecho() == null) {
                    Nodo padre = encontrado.getPadre();
                    if(padre.getIzquierdo() != null) {
                        if(padre.getIzquierdo() == encontrado) {
                            if(encontrado.getIzquierdo() != null) {
                                padre.setIzquierdo(encontrado.getIzquierdo());
                                encontrado.getIzquierdo().setPadre(padre);
                            } else {
                                padre.setIzquierdo(encontrado.getDerecho());
                                encontrado.getDerecho().setPadre(padre);
                            }
                            return encontrado;
                        }
                    }
                    if(padre.getDerecho() != null) {
                        if(padre.getDerecho() == encontrado) {
                            if(encontrado.getIzquierdo() != null) {
                                padre.setDerecho(encontrado.getIzquierdo());
                                encontrado.getIzquierdo().setPadre(padre);
                            } else {
                                padre.setDerecho(encontrado.getDerecho());
                                encontrado.getDerecho().setPadre(padre);
                            }
                            return encontrado;
                        }
                    }
                }
            }
        }
        return raiz;
    } 

    // Nodo minimo
    public Nodo minimo() {
        if(raiz == null) {
            return null;
        } else {
            Nodo actual = raiz;
            while(actual.getIzquierdo() != null) {
                actual = actual.getIzquierdo();
            }
            return actual;
        }
    }

    // Nodo maximo
    public Nodo maximo() {
        if(raiz == null) {
            return null;
        } else {
            Nodo actual = raiz;
            while(actual.getDerecho() != null) {
                actual = actual.getDerecho();
            }
            return actual;
        }
    }

    /**
     * Metodo para recorrer el arbol InOrden, este debera desplegar la lista del arbol de forma creciente
     * @param nodo El nodo raiz del cual tomara la referencia para recorrer el arbol
     */
    private void recorrerInOrden(Nodo nodo) {
        if(nodo.getIzquierdo() != null) {
            recorrerInOrden(nodo.getIzquierdo());
        }
        System.out.print("- " +nodo.getValor());
        if(nodo.getDerecho() != null) {
            recorrerInOrden(nodo.getDerecho());
        }
    }

    //Metodo para recorrer el arbol preOrden
    public void recorrerPreOrden() {
        if(raiz != null) {
            System.out.print("\nRecorrido PreOrden:\n");
            recorrerPreOrden(raiz);
            System.out.print(" -");
        }
    }

    private void recorrerPreOrden(Nodo nodo) {
        System.out.print("- " +nodo.getValor());
        if(nodo.getIzquierdo() != null) {
            recorrerPreOrden(nodo.getIzquierdo());
        }
        if(nodo.getDerecho() != null) {
            recorrerPreOrden(nodo.getDerecho());
        }
    }

    //Metodo para recorrer el arbol postOrden
    public void recorrerPostOrden() {
        if(raiz != null) {
            System.out.print("\nRecorrido PostOrden:\n");
            recorrerPostOrden(raiz);
            System.out.print(" -");
        }
    }

    private void recorrerPostOrden(Nodo nodo) {
        if(nodo.getIzquierdo() != null) {
            recorrerPostOrden(nodo.getIzquierdo());
        }
        if(nodo.getDerecho() != null) {
            recorrerPostOrden(nodo.getDerecho());
        }
        System.out.print("- " +nodo.getValor());
    }

    //Metodo para recorrer el arbol en profundidad
    
}
