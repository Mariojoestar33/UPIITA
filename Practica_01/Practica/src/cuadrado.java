public class cuadrado {

    public float lado;

    public cuadrado(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    //metodo para calcular el area del cuadrado
    public float area() {
        return lado * lado;
    }

    //metodo para calcular el perimetro del cuadrado
    public float perimetro() {
        return lado * 4;
    }

}