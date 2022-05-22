import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        ListaC num = new ListaC();
        int n;
        int d;
        int valor;
       
        Random numAl = new Random();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("********************************EXAMEN 01********************************");
        System.out.println("Alumno: Peña Romero Mariano\nGrupo: 1TV10\nMateria: EDD\n");
        System.out.println("Cantidad de elementos:\n");
        n = sc.nextInt();

        if(n >= 1 && n <= 100) {
            System.out.println("Ingresa la cantidad de Rotaciones");
            d = sc.nextInt();
            if(d >= 1) {
                for(int i=1; i <= n; i++){
                    valor=numAl.nextInt(100);
                    num.ingresarNodo(valor);
                     if(i==n){
                         System.out.println("Datos de la lista");
                         num.mostrarLista();
                         for(int j =1; j <= d; j++){
                             num.rotar();
                             if(j==d){ //Cuano se encuentra el mismo valor es porque el ciclo termino y nos permite imprimir la nueva lista rotada n veces
                               System.out.println("\n\nLista con " + d + " rotaciones:");
                               num.mostrarLista();  
                            }
                        }
                    }
                }
            } else {
                System.out.println("La cantidad de rotaciones debe ser mayor o igual a 1");
              }   
        } else {
            System.out.println("La cantidad de elementos debe ser mayor a 1 y menor a 100");
        }
    }
}
