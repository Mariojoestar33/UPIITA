public class rombo {
    
    public float diagonalX;

    public float diagonalY;

    public rombo(float diagonalX, float diagonalY) {
        this.diagonalX = diagonalX;
        this.diagonalY = diagonalY;
    }

    public float getDiagonalX() {
        return diagonalX;
    }

    public void setDiagonalX(float diagonalX) {
        this.diagonalX = diagonalX;
    }

    public float getDiagonalY() {
        return diagonalY;
    }

    public void setDiagonalY(float diagonalY) {
        this.diagonalY = diagonalY;
    }

    //metodo para calcular el area del rombo
    public float area() {
        return (diagonalX * diagonalY) / 2;
    }

    //metodo para calcular el perimetro del rombo
    public float perimetro() {
        return (diagonalX * 2) + (diagonalY * 2);
    }

}
