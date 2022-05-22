import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        ListaCD lista = new ListaCD();

        try (Scanner sc = new Scanner(System.in)) {
            int opcion = 0;

            while(opcion != 5) {

                System.out.print("\033[H\033[2J");
                System.out.flush();

                System.out.println("*************************PRACTICA 02*************************\n");
                System.out.println("Alumno: Peña Romero Mariano");
                System.out.println("Grupo: 1TV10\n");
                System.out.println("1. Ingresar un dato en la lista");
                System.out.println("2. Imprimir la lista");
                System.out.println("3. Buscar un valor y retornar su posicion");
                System.out.println("4. Continuacion de la PRACTICA");
                System.out.println("5. Salir");

                opcion = sc.nextInt();

                switch(opcion) {
                    case 1: { //Ingresar un dato en la lista
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("***Ingresar un dato***\n\n");
                        System.out.print("Deseas ingresar un dato al Final(1) o en una posicion en especifico(2)? \n(1) Si (2) No\n");
                        int opcion2 = sc.nextInt();
                       
                       switch(opcion2) { //Ingresar un dato al final   
                            case 1: {
                                System.out.println("Ingrese un valor:\n");
                                int valor = sc.nextInt();
                                lista.ingresarNodo(new Dato(valor));
                                System.out.println("Se ha insertado el Nodo correctamente...");
                                break;
                            }
                            case 2: { //Ingresar un dato en una posicion en especifico
                                System.out.println("Ingrese un valor:\n");
                                int valor = sc.nextInt();
                                System.out.println("Ingrese una posicion:\n");
                                int posicion = sc.nextInt();
                                lista.ingresarNodo(new Dato(valor), posicion);
                                System.out.println("Se ha insertado el Nodo correctamente...");
                                break;
                            }
                            default: { 
                                System.out.println("Opcion no valida...");
                                break;
                            }
                        }
                        System.in.read();
                        break;
                    }
                    case 2: { //Imprime la lista
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("***Imprimir la lista***\n\n");
                        System.out.println("Quieres imprimir la lista Normal(1) o Invertida(2)??:\n\n");
                        int opcion2 = sc.nextInt();
                        if(opcion2 != 1 || opcion2 != 2) {
                            System.out.println("Opcion no valida...");
                            break;
                        }
                        lista.imprimir(opcion2);
                        System.in.read();
                        break;
                    }
                    case 3: { //Buscar un valor y retornar su posicion
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("********************************Buscar********************************\n\n");
                        System.out.println("Ingrese un valor:\n");
                        int valor = sc.nextInt();
                        int k = lista.buscarDato(valor);
                        if(k == -1) //Si se retorna un valor de -1 es porque no se encontro el valor
                            System.out.println("El valor que tratas de buscar no existe...\n");   
                        else
                            System.out.println("El valor que tratas de buscar existe en la posicion: " + k + "\n");
                        System.in.read();
                        break;
                    }
                    case 4: { //Crea n nodos con valores pseudoaleatorios
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        int n;
                        System.out.println("*************************Continuacion*************************\n\n");
                        System.out.println("-Ingrese un numero entero n:\n");
                        n = sc.nextInt();
                        //int j[] = new int[n];
                        Random R = new Random();
                        for(int i = 0; i < n; i++) {
                            lista.ingresarNodo(new Dato(R.nextInt((100 + 9) +1)));
                        }
                        System.out.println("Se han insertado los nodos y la lista queda de la siguiente forma:\n\n");
                        lista.imprimirLista();
                        System.in.read();
                        lista.ordenarLista(); //Se llama al metodo ordenarLista
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("Ahora se ordenan los datos de la lista:\n\n");
                        System.in.read();
                        System.out.println("Lista de manera ASCENDENTE:\n\n");
                        lista.imprimirLista();
                        System.out.println("\n\nLista de manera DESCENDENTE:\n\n");
                        lista.imprimirListaInvertida();
                        System.in.read();
                        break;
                    }
                    case 5: { //Sale de la aplicacion
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("Que tengas un bonito dia :)))\n\n");
                        System.in.read();
                        break;
                    }
                    default: {
                        System.out.println("Opcion no valida...");
                        System.in.read();
                        break;
                    }
                }
            }
        }
    }
}