
public class cuadrado {

    public int lado;

    public cuadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int area() {
        return lado * lado;
    }

}