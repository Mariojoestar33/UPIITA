import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws Exception {
       
        Arbol arbol = new Arbol();
        Scanner sc = new Scanner(System.in);
        int maximo = 2000000;

        //Se meten numeros en un intervalo que va desde el 1 hasta el 2000000
        int[] numerosAleatorios = IntStream.rangeClosed(1, 2000000).toArray();
        Random r = new Random();
        for (int i = numerosAleatorios.length; i > 0; i--) {
            int posicion = r.nextInt(i);
            int tmp = numerosAleatorios[i-1];
            numerosAleatorios[i - 1] = numerosAleatorios[posicion];
            numerosAleatorios[posicion] = tmp;
        }

        //Metemos los numeros del arreglo dentro del arbol
        for (int i = 0; i < numerosAleatorios.length; i++) {
            arbol.insertar(numerosAleatorios[i]);
        }

        //Se realizan las 50 busquedas en las dos estructuras
        for(int i = 1; i <= 50; i++) {

            int numBuscar = (int)(Math.random() * maximo + 1);

            System.out.println("\nBusqueda " + i);

            long start = System.currentTimeMillis();
            arbol.buscar(numBuscar, arbol.getRaiz());
            long end = System.currentTimeMillis();
            long duration = end - start;
            System.out.println("\nTiempo de ejecucion (ARBOL): " + duration + " ms");
            
            long start2 = System.currentTimeMillis();
            for(int j = 0; j < numerosAleatorios.length; j++) {
                if(numerosAleatorios[i] == numBuscar) {
                    break;
                }
            }
            long end2 = System.currentTimeMillis();
            long duration2 = end2 - start2;
            System.out.println("Tiempo de ejecucion (ARREGLO): " + duration2 + " ms");
        }

        System.out.println("\n");
        arbol.minimo(arbol.getRaiz());
        System.out.println("\n");
        arbol.maximo(arbol.getRaiz());
        System.out.println("\n");

        int b;
        System.out.println("Ingrese el dato a buscar:");
        b = sc.nextInt();

        arbol.buscar(b, arbol.getRaiz());
        System.out.println("\n");
        arbol.buscar(b-1, arbol.getRaiz());
        System.out.println("\n");
        arbol.buscar(b+1, arbol.getRaiz());
        System.out.println("\n");

        System.out.println("Estamos creando el archivo de texto, esta accion puede tardar un par de minutos...\n");
        arbol.imprimirInOrden();

    }

}
