public class rectangulo {
    
    public float base;

    public float altura;

    public rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() { 
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    //Metodo para calcular el area del rectangulo
    public float area() {
        return base * altura;
    }

    //Metodo para calcular el perimetro del rectangulo
    public float perimetro() {
        return (base * 2) + (altura * 2);
    }

}
