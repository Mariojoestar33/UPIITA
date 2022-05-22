public class Carga {

    public float carga1;
    public float carga2;
    public float cargares;

    public float x1;
    public float x2;
    public float xres;

    public float y1;
    public float y2;
    public float yres;

    public float z1;
    public float z2;
    public float zres;

    public void setcarga1(float carga1) {
        this.carga1 = carga1;
    }

    public void setcarga2(float carga2) {
        this.carga2 = carga2;
    }

    public void setcargares(float cargares) {
        this.cargares = cargares;
    }

    public void setx1(float x1) {
        this.x1 = x1;
    }

    public void setx2(float x2) {
        this.x2 = x2;
    }

    public void setxres(float xres) {
        this.xres = xres;
    }

    public void sety1(float y1) {
        this.y1 = y1;
    }

    public void sety2(float y2) {
        this.y2 = y2;
    }

    public void setyres(float yres) {
        this.yres = yres;
    }

    public void setz1(float z1) {
        this.z1 = z1;
    }

    public void setz2(float z2) {
        this.z2 = z2;
    }

    public void setzres(float zres) {
        this.zres = zres;
    }

    public float getcarga1() {
        return carga1;
    }

    public float getcarga2() {
        return carga2;
    }

    public float getcargares() {
        return cargares;
    }

    public float getx1() {
        return x1;
    }

    public float getx2() {
        return x2;
    }

    public float getxres() {
        return xres;
    }

    public float gety1() {
        return y1;
    }

    public float gety2() {
        return y2;
    }

    public float getyres() {
        return yres;
    }

    public float getz1() {
        return z1;
    }

    public float getz2() {
        return z2;
    }

    public float getzres() {
        return zres;
    }

    public void calcular() {

        float R;

        float xR1, yR1, zR1;

        float xR2, yR2, zR2;

        float componenteX, componenteY, componenteZ;

        float componenteX2, componenteY2, componenteZ2;

        float xT, yT, zT;

        xR1 = xres - x1;
        yR1 = yres - y1;
        zR1 = zres - z1;

        R = (float) Math.sqrt(Math.pow(xR1, 2) + Math.pow(yR1, 2) + Math.pow(zR1, 2));

        componenteX = (float) (9*Math.pow(10, 9)*(carga1)*(cargares)/(Math.pow(R, 3))) * xR1;
        componenteY = (float) (9*Math.pow(10, 9)*(carga1)*(cargares)/(Math.pow(R, 3))) * yR1;
        componenteZ = (float) (9*Math.pow(10, 9)*(carga1)*(cargares)/(Math.pow(R, 3))) * zR1;

        System.out.println("Carga 1:");

        System.out.println("Componente X: " + componenteX);
        System.out.println("Componente Y: " + componenteY);
        System.out.println("Componente Z: " + componenteZ);

        xR2 = xres - x2;
        yR2 = yres - y2;
        zR2 = zres - z2;

        R = (float) Math.sqrt(Math.pow(xR2, 2) + Math.pow(yR2, 2) + Math.pow(zR2, 2));

        componenteX2 = (float) (9*Math.pow(10, 9)*(carga2)*(cargares)/(Math.pow(R, 3))) * xR2;
        componenteY2 = (float) (9*Math.pow(10, 9)*(carga2)*(cargares)/(Math.pow(R, 3))) * yR2;
        componenteZ2 = (float) (9*Math.pow(10, 9)*(carga2)*(cargares)/(Math.pow(R, 3))) * zR2;

        System.out.println("Carga 2:"); 

        System.out.println("Componente X: " + componenteX2);
        System.out.println("Componente Y: " + componenteY2);
        System.out.println("Componente Z: " + componenteZ2);

        xT = componenteX + componenteX2;
        yT = componenteY + componenteY2;
        zT = componenteZ + componenteZ2;

        System.out.println("La carga total es de: " + xT + " ax  " + yT + " ay   " + zT+ "az");

    }

}