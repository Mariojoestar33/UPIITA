public class Pila {

    private Nodo cima;

    public Pila() {
        this.cima = null;
    }

    public void push(Dato dato) {
        Nodo nodo = new Nodo(dato);
        nodo.setSiguiente(this.cima);
        this.cima = nodo;
    }

    public Dato pop() {
        if (this.cima == null) {
            return null;
        }
        Dato dato = this.cima.getDato();
        this.cima = this.cima.getSiguiente();
        return dato;
    }

    public boolean verificar() {
        return this.cima == null;
    }

    public Dato top() {
        if (this.cima == null) {
            return null;
        }
        return this.cima.getDato();
    }

    //Metodo para verificar el Balanceo de caracteres
    public boolean verificarBalanceo(String cadena) {
        
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == '(' || cadena.charAt(i) == '[' || cadena.charAt(i) == '{') {
                push(new Dato(cadena.charAt(i) + ""));
            } else {
                if (verificar()) {
                    return false;
                }
                if (top().getCaracter().equals("(")) {
                    if (cadena.charAt(i) == ')') {
                        pop();
                    }
                } else if (top().getCaracter().equals("[")) {
                    if (cadena.charAt(i) == ']') {
                        pop();
                    }
                } else if (top().getCaracter().equals("{")) {
                    if (cadena.charAt(i) == '}') {
                        pop();
                    }
                }
            }
        }
        return verificar();
    }

    //Metodo para convertir a notacion polaca
    /*public String postfija(String cadena) {
        for(int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i) == '(') {
                this.push(new Dato(cadena.charAt(i) + ""));
            } else if(cadena.charAt(i) == ')') {
                while(top().getCaracter().charAt(0) != '(') {
                    cadena += this.pop().getCaracter();
                }
                this.pop();
            } else {
                this.push(new Dato(cadena.charAt(i) + ""));
            } 
        }
        return cadena;
    }*/

    //Metodo para convertir a notacion polaca
    public String postfija(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == '(') {
                this.push(new Dato(cadena.charAt(i) + ""));
            } else if (cadena.charAt(i) == ')') {
                while (top().getCaracter().charAt(0) != '(') {
                    cadena = cadena.replaceFirst(top().getCaracter(), "");
                    this.pop();
                }
                this.pop();
            } else {
                this.push(new Dato(cadena.charAt(i) + ""));
            }
        }
        return cadena;
    }

    //Metodo para convertir a notacion polaca inversa
    public String postfijaInversa(String cadena) {
        String cadenaInversa = "";
        for(int i = cadena.length() - 1; i >= 0; i--) {
            if(cadena.charAt(i) == '(') {
                this.push(new Dato(cadena.charAt(i) + ""));
            } else if(cadena.charAt(i) == ')') {
                while(top().getCaracter().charAt(0) != '(') {
                    cadenaInversa += this.pop().getCaracter();
                }
                this.pop();
            } else {
                this.push(new Dato(cadena.charAt(i) + ""));
            } 
        }
        return cadenaInversa;
    }
    
}
