public class circulo {
    
    public float radio;

    public circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    //metodo para calcular el area del circulo
    public float area() {
        return (float) (Math.PI * Math.pow(radio, 2));
    }

    //metodo para calcular el perimetro del circulo
    public float perimetro() {
        return (float) (Math.PI * radio * 2);
    }

}
