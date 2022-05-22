import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        String cadena;
        Scanner sc = new Scanner(System.in);
        Pila pila = new Pila();

        System.out.println("Ingresa la expresion a evaluar: ");
        cadena = sc.nextLine();
        if(pila.verificarParentesis(cadena)){
            System.out.println("La expresion es correcta");
            System.out.println("Expresion en notacion postfija: " + pila.infijapostfija(cadena));
            Expresion s = new Expresion(cadena);
            pila.infijaprefija(s);
            //pila.evaluacion(cadena);
        } else {
            System.out.println("La expresion no tiene parentesis correctamente cerrado");
        }
    }
}
