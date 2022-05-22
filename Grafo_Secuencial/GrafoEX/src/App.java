import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Grafo g = new Grafo();
        int opcionDo = 0;
        int opcionRecorrido = 0;
        String opcionVertice = "";

        try (Scanner sc = new Scanner(System.in)) {

            g.addVertice("A");
            g.addVertice("B");
            g.addVertice("C");
            g.addVertice("D");
            g.addVertice("H");
            g.addVertice("R");
            g.addVertice("T");

            g.addArista("H", "T");
            g.addArista("H", "A");
            g.addArista("H", "D");
            g.addArista("R", "H");
            g.addArista("C", "R");
            g.addArista("D", "C");
            g.addArista("D", "B");
            g.addArista("B", "H");

            g.imprimirMatrizdeAbyacencia();

            //g.recorrerAnchura("D");
            //g.recorrerProfundidad("D");

            do {
                
                System.out.println("********************PROGRAMA DE GRAFOS********************\n\n\n");
                System.out.println("Desde que nodo desea comenzar a recorrer el grafo?\n");
                opcionVertice = sc.next();
                System.out.println("1. Recorrer Anchura\n2. Recorrer Profundidad\n3. Salir\n");
                opcionRecorrido = sc.nextInt();

                switch (opcionRecorrido) {

                    case 1: {
                        g.recorrerAnchura(opcionVertice);
                        System.out.println("\n\n");
                        break;
                    }

                    case 2: {
                        g.recorrerProfundidad(opcionVertice);
                        System.out.println("\n\n");
                        break;
                    }

                    case 3: {
                        System.out.println("Gracias por usar el programa");
                        break;
                }

                    default: {
                        System.out.println("Opcion no valida");
                        break;
                    }

                }
                
                System.out.println("Desea continuar?\n1. Si\n2. No\n");
                opcionDo = sc.nextInt();

            } while(opcionDo != 2);

        }

    }

}
