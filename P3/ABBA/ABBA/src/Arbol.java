import java.io.FileWriter;
import java.io.IOException;

public class Arbol {

    private Nodo raiz; //Nodo raiz del arbol
    private String cadena = ""; //Cadena que se va a escribir en el archivo

    public Arbol() {
        this.raiz = null;
    }

    //Metodo para obtener la raiz del arbol
    public Nodo getRaiz() {
        return raiz;
    }

    //Metodo para buscar un nodo en el arbol
    public Nodo buscar (int dato, Nodo r) {
        if(raiz == null) {
            System.out.println("El arbol no existe...");
            return null;
        } else {
            if(r.getDato() == dato) {
                System.out.print("El numero " +dato+ " ha sido encontrado");
                return r;
            } else {
                if(dato < r.getDato() && r.getIzquierda() != null) {
                    return buscar(dato, r.getIzquierda());
                } else {
                    if(dato > r.getDato() && r.getDerecha() != null) {
                        return buscar(dato, r.getDerecha());
                    } else {
                        System.out.print("El numero no ha sido encontrado");
                        return null;
                    }
                    //return buscar(dato, r.getDerecha());
                }
            }
        }
    }

    //Metodo para obtener el factor de equilibrio
    public int obtenerFE(Nodo x) { 
        if(x == null) {
            return -1;
        } else {
            return x.getFe();
        }
    }

    //Metodo para rotar a la izquierda
    public Nodo rotarIzquierda(Nodo x) {
        Nodo aux = x.getIzquierda();
        x.setIzquierda(aux.getDerecha());
        aux.setDerecha(x);
        x.setFe(Math.max(obtenerFE(x.getIzquierda()), obtenerFE(x.getDerecha())) + 1);
        aux.setFe(Math.max(obtenerFE(aux.getIzquierda()), obtenerFE(aux.getDerecha())) + 1);
        return aux;
    }

    //Metodo para rotar a la derecha
    public Nodo rotarDerecha(Nodo x) {
        Nodo aux = x.getDerecha();
        x.setDerecha(aux.getIzquierda());
        aux.setIzquierda(x);
        x.setFe(Math.max(obtenerFE(x.getIzquierda()), obtenerFE(x.getDerecha())) + 1);
        aux.setFe(Math.max(obtenerFE(aux.getIzquierda()), obtenerFE(aux.getDerecha())) + 1);
        return aux;
    }

    //Metodo para rotacion doble a la izquierda 
    public Nodo rotarDobleIzquierda(Nodo x) {
        Nodo aux;
        x.setIzquierda(rotarDerecha(x.getIzquierda()));
        aux = rotarIzquierda(x);
        return aux;
    }

    //Metodo para rotacion doble a la derecha
    public Nodo rotarDobleDerecha(Nodo x) {
        Nodo aux;
        x.setDerecha(rotarIzquierda(x.getDerecha()));
        aux = rotarDerecha(x);
        return aux;
    }

    //Metodo para insertar un nodo en el arbol
    public Nodo insertar(Nodo nuevo, Nodo subarbol) {
        Nodo nuevoPadre = subarbol;
        if(nuevo.getDato() < subarbol.getDato()) {
            if(subarbol.getIzquierda() == null) {
                subarbol.setIzquierda(nuevo);
            } else {
                subarbol.setIzquierda(insertar(nuevo, subarbol.getIzquierda()));
                if((obtenerFE(subarbol.getIzquierda())) - obtenerFE(subarbol.getDerecha()) == 2) {
                    if(nuevo.getDato() < subarbol.getIzquierda().getDato()) {
                        nuevoPadre = rotarIzquierda(subarbol);
                    } else {
                        nuevoPadre = rotarDobleIzquierda(subarbol);
                    }
                }
            }
        } else {
            if(nuevo.getDato() > subarbol.getDato()) {
                if(subarbol.getDerecha() == null) {
                    subarbol.setDerecha(nuevo);
                } else {
                    subarbol.setDerecha(insertar(nuevo, subarbol.getDerecha()));
                    if((obtenerFE(subarbol.getDerecha())) - obtenerFE(subarbol.getIzquierda()) == 2) {
                        if(nuevo.getDato() > subarbol.getDerecha().getDato()) {
                            nuevoPadre = rotarDerecha(subarbol);
                        } else {
                            nuevoPadre = rotarDobleDerecha(subarbol);
                        }
                    }
                }
            } else {
                System.out.print("\nEl nodo ya existe...");
            }
        }
        //Actualizando la altura de el arbol
        if(subarbol.getIzquierda() == null && subarbol.getDerecha() != null) {
            subarbol.setFe(subarbol.getDerecha().getFe() + 1);
        } else {
            if(subarbol.getDerecha() == null && subarbol.getIzquierda() != null) {
                subarbol.setFe(subarbol.getIzquierda().getFe() + 1);
            } else {
                subarbol.setFe(Math.max((obtenerFE(subarbol.getIzquierda())), (obtenerFE(subarbol.getDerecha()))) + 1);
            }
        }
        return nuevoPadre;
    }

    //Metodo para insertar
    public void insertar(int dato) {
        Nodo nuevo = new Nodo(dato);
        if(raiz == null) {
            raiz = nuevo;
        } else {
            raiz = insertar(nuevo, raiz);
        }
    }

    //Metodo para recorrer el arbol en inOrden
    public String inOrden(Nodo r) {
        if(r != null) {
            inOrden(r.getIzquierda());
            //System.out.print(r.getDato() + " - ");
            cadena +=  r.getDato() + " - ";
            inOrden(r.getDerecha());
        }
        return cadena;
    }

    //Metodo para recorrer preOrden
    public void preOrden(Nodo r) {
        if(r != null) {
            System.out.print(r.getDato() + " - ");
            preOrden(r.getIzquierda());
            preOrden(r.getDerecha());
        }
    }

    //Metodo para recorrer postOrden
    public void postOrden(Nodo r) {
        if(r != null) {
            postOrden(r.getIzquierda());
            postOrden(r.getDerecha());
            System.out.print(r.getDato() + " - ");
        }
    }

    //Metodo para obtener el nodo MINIMO
    public void minimo(Nodo r) {
        if(r.getIzquierda() != null) {
            minimo(r.getIzquierda());
        } else {
            System.out.println("El dato MINIMO es: "+r.getDato());
        }
    }

    //Metodo para obtener el nodo mas a la derecha
    public void maximo(Nodo r) {
        if(r.getDerecha() != null) {
            maximo(r.getDerecha());
        } else {
            System.out.println("El dato MAXIMO es: "+r.getDato());
        }
    }

    //Metodo para imprimir en un txt el recorrido inOrden del arbol
    public void imprimirInOrden() throws IOException {
        try {
            FileWriter fichero = new FileWriter("D:\\Programas_Java\\P3\\ABBA\\inOrden.txt");
            fichero.write("InOrden: ");
            fichero.write(inOrden(raiz));
            fichero.close();
            System.out.println("El archivo se ha creado con exito...");
        } catch(Exception e) {
            System.out.println("Error al escribir el archivo" +e);
        }
    }

}
