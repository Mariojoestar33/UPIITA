import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        final int MAX = 10000;
        int[] arreglo = new int[MAX];
        ArbolBB arbol = new ArbolBB();
        Random rand = new Random();

        System.out.print("Generando... ");
        for (int i = 0; i < MAX; i++) {
            int num = rand.nextInt(MAX);
            arreglo[i] = num;
            arbol.insertar(num);
        }
        System.out.println("Listo");
        // Valor a buscar
        int valor = rand.nextInt(MAX);
        long inicio, fin;

        // Busqueda lineal
        inicio = System.nanoTime();
        Boolean resultado1 = buscar(arreglo, valor);
        fin = System.nanoTime();

        System.out.println("Resultado: " + resultado1 + 
        " Busqueda lineal: " + (fin - inicio)/1e6 + " ms");

        // Busqueda binaria
        inicio = System.nanoTime();
        Boolean resultado2 = arbol.buscar(valor) == null ? false : true;
        fin = System.nanoTime();

        System.out.println("Resultado: " + resultado2 + 
        " Busqueda binaria: " + (fin - inicio)/1e6 + " ms");

    }
    public static Boolean buscar(int[] arr, int valor) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == valor) {
                return true;
            }
        }
        return false;
    }
}
