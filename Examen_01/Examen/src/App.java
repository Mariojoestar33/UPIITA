import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        ListaC lista = new ListaC();
        int n, d;
        Random rand = new Random();

        try {
            System.out.println("********************************EXAMEN 01********************************\n\n");
            System.out.println("Cantidad de elementos:\n");
            n = sc.nextInt();
            System.out.println("Cantidad de rotaciones:\n");
            d = sc.nextInt();
            for(int i = 0; i < n; i++) {
                lista.insertar(new Dato(rand.nextInt((100 - 1)+1), i+1));
            }
            lista.mostrar();
            System.in.read();
            //lista.inverso(d);
            lista.mover();
            lista.mostrar();
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
       

    }
}
