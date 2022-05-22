import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        ColaP cola = new ColaP();
        int prioridad = 0;
        int dato = 0;
        
        while(true) {
            System.out.println("Ingrese la prioridad del dato: ");
            prioridad = sc.nextInt();
            if(prioridad <  1 || prioridad > 3) {
                System.out.println("La prioridad debe estar entre 1 y 3");
            } else {
                System.out.println("Ingrese el dato: ");
                dato = sc.nextInt();
                cola.insertar(prioridad, dato);
                //cola.imprimir();
                //System.out.println("Tamaño de la cola: " + cola.tamaño());
                System.out.println("Desea ingresar otro dato? (1. Si / 2. No)");
                int opcion = sc.nextInt();
                if(opcion == 2) {
                    break;
                }
            }
        }
        System.out.println("Tamaño final de la cola: " + cola.tamaño());
        for(int i = 0; i <= cola.tamaño(); i++) {
            cola.imprimir(); 
            cola.sacar();
        }
    }
}
