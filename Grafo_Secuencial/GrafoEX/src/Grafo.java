import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Grafo {
    // G = (V, A)
    private List<String> vertices;
    private int [][] mAdyacencia;

    public void addVertice(String nombre) {
        if(vertices == null) {
            vertices = new ArrayList<String>();
        }   
        vertices.add(nombre);
    }

    public void addArista(String origen, String destino, int peso) {
        if(mAdyacencia == null) {
            mAdyacencia = new int[vertices.size()][vertices.size()];
        }
        int fila = vertices.indexOf(origen);
        int columna = vertices.indexOf(destino);
        if(fila < 0 || columna < 0) {
            System.out.println("No se encuentran los Nodos solicitados...");
            return;
        } else {
            mAdyacencia[fila][columna] = peso;
        }
    }

    public void addArista(String origen, String destino) {
        addArista(origen, destino, 1);
    }

    public void recorrerAnchura(String nodo) {
        List<Integer> marcados = new ArrayList<Integer>(); //Necesita un objeto para poder ser creado, no un tipo de dato primitivo
        Queue<Integer> cola = new LinkedList<Integer>();
        int indice = vertices.indexOf(nodo);
        if(indice < 0) {
            System.out.println("No se encuentra el nodo solicitado...");
            return;
        }
        marcados.add(indice);
        cola.add(indice);
        System.out.println();
        while(!cola.isEmpty()) {
            int w = cola.poll();
            System.out.print(vertices.get(w) + " ");
            
            for(int i = 0; i < vertices.size(); i++) {
                if(mAdyacencia[w][i] != 0 ) {
                    if(marcados.indexOf(i) < 0) {
                        cola.add(i);
                        marcados.add(i);
                    }
                }
            }
        }
    }

    public void recorrerProfundidad(String nodo) {
        List<Integer> marcados = new ArrayList<Integer>(); //Necesita un objeto para poder ser creado, no un tipo de dato primitivo
        Stack<Integer> pila = new Stack<Integer>();
        int idx = vertices.indexOf(nodo);
        if(idx < 0) {
            System.out.println("No se encuentra el nodo solicitado...");
            return;
        }
        marcados.add(idx);
        pila.add(idx);
        System.out.println();
        while(!pila.isEmpty()) {
            int w = pila.pop();
            System.out.print(vertices.get(w) + " ");
            
            for(int i = 0; i < vertices.size(); i++) {
                if(mAdyacencia[w][i] != 0 ) {
                    if(marcados.indexOf(i) < 0) {
                        pila.add(i);
                        marcados.add(i);
                    }
                }
            }
        }
    }
    
    public void imprimirMatrizdeAbyacencia() {
        for(int[] arr : mAdyacencia) {
        System.out.println(Arrays.toString(arr));
        }
    }

}