import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Carga carga = new Carga();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite el valor de la carga 1: ");
        carga.setcarga1(sc.nextFloat());

        System.out.println("Digite el valor de x1: ");
        carga.setx1(sc.nextFloat());

        System.out.println("Digite el valor de y1: ");
        carga.sety1(sc.nextFloat());

        System.out.println("Digite el valor de z1: ");
        carga.setz1(sc.nextFloat());

        System.out.println("Digite el valor de la carga 2: ");
        carga.setcarga2(sc.nextFloat());

        System.out.println("Digite el valor de x2: ");
        carga.setx2(sc.nextFloat());

        System.out.println("Digite el valor de y2: ");
        carga.sety2(sc.nextFloat());

        System.out.println("Digite el valor de z2: ");
        carga.setz2(sc.nextFloat());

        System.out.println("Digite o valor da la carga resultante: ");
        carga.setcargares(sc.nextFloat());

        System.out.println("Digite el valor de x resultante: ");
        carga.setxres(sc.nextFloat());

        System.out.println("Digite el valor de y resultante: ");
        carga.setyres(sc.nextFloat());

        System.out.println("Digite el valor de z resultante: ");
        carga.setzres(sc.nextFloat());

        carga.calcular();

    }
}
