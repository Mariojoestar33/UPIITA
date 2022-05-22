public class Dato {

    private int valor;
    private int numero;

    public Dato(int valor) {
        this.valor = valor;
    }

    public Dato(int valor, int numero) {
        this.valor = valor;
        this.numero = numero;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}
