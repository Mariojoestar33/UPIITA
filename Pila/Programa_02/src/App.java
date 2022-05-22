import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Pila pila = new Pila();
        String cadena = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("***************************PROGRAMA 02***************************\n");
        System.out.println("Ingrese una cadena de caracteres: \n");
        cadena = sc.next();

        if (pila.verificarBalanceo(cadena)) {
            System.out.println("La cadena de caracteres esta balanceada");
        } else {
            System.out.println("La cadena de caracteres no esta balanceada");
        }

        System.out.println("Notacion Infija: " + cadena);
        System.out.println("Notacion Postfija: " + pila.postfija(cadena));
        System.out.println("Notacion Prefija: " + pila.postfijaInversa(cadena));

    }
}
