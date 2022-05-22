//import org.nfunk.jep.JEP;

public class Pila {

    private Nodo tope;
    private int tamanio = 0;
    String prefija = "";

    //Constructor
    public Pila() {
        this.tope = null;
        this.tamanio = 0;
    }

    public boolean PilaVacia() {
        if(this.tope == null) {
            System.out.println("La pila esta vacia");
            return true;
        } else {
            return false;
        }
    }

    //Metodo para insertar un elemento en la pila
    public void push(Expresion expresion) {
        this.tope = new Nodo(expresion, this.tope);
        tamanio++;
    }

    //Sobrecarga de Metodo para insertar un elemento en la pila
    public void push(char caracter) {
        Nodo nuevo = new Nodo(new Expresion(String.valueOf(caracter)));
        nuevo.setSiguiente(this.tope);
        this.tope = nuevo;
    }

    //Metodo para sacar un elemento de la pila
    public Expresion pop() {
        if (this.tope == null) {
            return null;
        }
        Expresion expresion = this.tope.getExpresion();
        this.tope = this.tope.getSiguiente();
        return expresion;
    }

    public boolean vacia() {
        return this.tope == null;
    }

    //Metodo para convertir de notacion infija a notacion postfija
    public String infijapostfija(String expresion) {
        String resultado = "";
        for (int i = 0; i < expresion.length(); i++) {
            char caracter = expresion.charAt(i);
            if (caracter == '(') {
                push(new Expresion(String.valueOf(caracter)));
            } else if (caracter == ')') {
                while (!vacia()) {
                    Expresion expresion1 = pop();
                    if (expresion1.getExpresion().equals("(")) {
                        break;
                    }
                    resultado += expresion1.getExpresion();
                }
            } else if (caracter == '+' || caracter == '-' || caracter == '*' || caracter == '/') {
                while (!vacia()) {
                    Expresion expresion1 = pop();
                    if (expresion1.getExpresion().equals("(")) {
                        push(expresion1);
                        break;
                    }
                    resultado += expresion1.getExpresion();
                }
                push(new Expresion(String.valueOf(caracter)));
            } else {
                resultado += caracter;
            }
        }
        while (!vacia()) {
            Expresion expresion1 = pop();
            resultado += expresion1.getExpresion();
        }
        return resultado;
    }

    //Metodo para comprobar si la pila esta vacia
    public boolean isEmpty() {
        return this.tope == null;
    }


     //Metodo para convertir de notacion infija a prefija
     public void infijaprefija(Expresion cadena) {
        int it = cadena.getExpresion().length() - 1;
        prefija = "";
        char a;
        for(int i = it; i >= 0; i--) {    
            a = cadena.getExpresion().charAt(i);
            if(a == '1' || a == '2' || a == '3' || a == '4' || a == '5' || a == '6' || a == '7' || a == '8' || a == '9' || a == '0') {
                prefija += a;
            } else {
                push(a);
                if(a == '(') {
                    do {
                       prefija += this.tope.getExpresion().getExpresion().charAt(0);
                       pop();
                    } while(!isEmpty());
                }
            }  
        }
        prefija = prefija.replace("(", "");
        prefija = prefija.replace(")", "");
        StringBuilder builder = new StringBuilder(prefija);
        prefija = builder.reverse().toString();
        System.out.println("Expresion en notacion prefija: " +prefija);
    }

    //Metodo para evaluar la expresion
    /*public void evaluacion(String cadena) {
        JEP jep = new JEP();
        jep.parseExpression(cadena);
        int resultado = (int) jep.getValue();
        System.out.println("Evaluacion de la expresion: " + resultado);
    }*/

     //Metodo para verificar que se cierra el parentesis
    public boolean verificarParentesis(String expresion) {
        int contador = 0;
        for (int i = 0; i < expresion.length(); i++) {
            char caracter = expresion.charAt(i);
            if (caracter == '(') {
                contador++;
            } else if (caracter == ')') {
                contador--;
            }
        }
        if (contador == 0) {
            return true;
        } else {
            return false;
        }
    }

    //Metodo para calcular el resultado de la expresion
    
    
}
