import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Pila pila = new Pila();

        pila.infijaprefija(new Cadena ("(1*(2-3))+(4+5)"));

    }
}
