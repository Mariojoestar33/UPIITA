public class Pila {

    private Nodo cabeza;
    private int tamanio;

    public Pila() {
        this.cabeza = null;
        this.tamanio = 0;
    }

    public void push(char caracter) {
        Nodo nuevo = new Nodo(new Cadena(String.valueOf(caracter)));
        nuevo.setSiguiente(this.cabeza);
        this.cabeza = nuevo;
    }

    public void pop() {
        if (this.cabeza != null) {
            this.cabeza = this.cabeza.getSiguiente();
        }
    }

    public void mostrarCabeza() {
        System.out.println("Cabeza: " + this.cabeza.getCadena().getExpresion());
    }

    //Metodo para comprobar si la pila esta vacia
    public boolean isEmpty() {
        return this.cabeza == null;
    }

    public boolean balanceoParentesis(Cadena cadena) {
        int i = 0;
        while(cadena.getExpresion().length() > 0) {
            char it = cadena.getExpresion().charAt(0);
            if(it == '(') {
                push(it);
            } else {
                if(it == ')') {
                    if(this.cabeza == null) {
                        System.out.println("Error...");
                        break;
                    } else {
                        pop();
                    }
                }
            }
        }
        if(this.cabeza == null) {
            System.out.println("No esta balanceado");
            return false;
        } else {
            System.out.println("Esta balanceado");
            return true;
        }
    }

    //Metodo para convertir de infija a postfija
    public void infijoPostfijo(Cadena cadena) {
        char it;
        String postfija = "";
        while(cadena.getExpresion().length() > 0) {
            it = cadena.getExpresion().charAt(0);
            if(it != '+' || it != '-' || it !='/' || it != '*') {
            postfija += it;
            } else {
                while(this.cabeza != null) {

                }
            }
        }
    }

    //Metodo para convertir de notacion infija a prefija
    public void infijaprefija(Cadena cadena) {
        //int it = cadena.getExpresion().charAt(cadena.getExpresion().length());
        int it = cadena.getExpresion().length() - 1;
        char aux = cadena.getExpresion().charAt(it);
        System.out.println(it + "   -   " +aux);
        String prefija = "";
        char a;
        for(int i = it; i >= 0; i--) {
            //System.out.println(i);
            System.out.println(i+"° iteracion \n");
            a = cadena.getExpresion().charAt(i);
            System.out.println(a);

            if(a == '1' || a == '2' || a == '3' || a == '4' || a == '5' || a == '6' || a == '7' || a == '8' || a == '9' || a == '0') {
                prefija += a;
                System.out.print("Operando\n");
            } else {
                System.out.print("Operador\n");
                push(a);
                if(a == '(') {
                    //char a = this.cabeza.getCadena().getExpresion().charAt(0);
                    do {
                    System.out.print("Cabeza: " + this.cabeza.getCadena().getExpresion() + "\n");
                       prefija += this.cabeza.getCadena().getExpresion().charAt(0);
                       System.out.println("Operador agregado a la pila: " + this.cabeza.getCadena().getExpresion().charAt(0));
                       //prefija = prefija.concat(String.valueOf(0));
                       pop();
                    } while(!isEmpty());
                }
            }
            
        }

        prefija = prefija.replace("(", "");
            prefija = prefija.replace(")", "");
            StringBuilder builder = new StringBuilder(prefija);
            prefija = builder.reverse().toString();
            System.out.println("Prefija: " + prefija);

    System.out.println("\nPrefija: "+prefija);

    }
}
