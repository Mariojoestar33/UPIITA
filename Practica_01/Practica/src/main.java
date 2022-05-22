public class main {
    public static void main(String[] args) {

        System.out.println("\nPractica 01: Areas y perimetros de figuras geometricas\n\nAlumno: Peña Romero Mariano\nMateria: Estructura de Datos\n");
       
         /*Creacion de objetos*/

        //Crear un objeto de la clase circulo
        circulo c = new circulo(5);

        //Crear un objeto de la clase rombo
        rombo r = new rombo(5, 5);

        //Crear un objeto de la clase rectangulo
        rectangulo r2 = new rectangulo(10, 5);

        //Crear un objeto de la clase cuadrado
        cuadrado c2 = new cuadrado(5);


        /*Imprimir el area y perimetro de cada tipo de dato*/

        //Imprimir el area del circulo

        System.out.println("\n\n********************************Circulo********************************\n\n");
        System.out.println("El radio del circulo es: " + c.getRadio());
        System.out.println("El area del circulo es: " + c.area());
        //Imprimir el perimetro del circulo
        System.out.println("El perimetro del circulo es: " + c.perimetro());

        //Imprimir el area del rombo
        System.out.println("\n\n********************************Rombo********************************\n\n");
        System.out.println("El lado X del rombo es: " + r.getDiagonalX());
        System.out.println("El lado Y del rombo es: " + r.getDiagonalY());
        System.out.println("El area del rombo es: " + r.area());
        //Imprimir el perimetro del rombo
        System.out.println("El perimetro del rombo es: " + r.perimetro());

        //Imprimir el area del rectangulo
        System.out.println("\n\n********************************Rectangulo********************************\n\n");
        System.out.println("La base del rectangulo es: " + r2.getBase());
        System.out.println("La altura del rectangulo es: " + r2.getAltura());
        System.out.println("El area del rectangulo es: " + r2.area());
        //Imprimir el perimetro del rectangulo
        System.out.println("El perimetro del rectangulo es: " + r2.perimetro());
        
        //Imprimir el area del cuadrado
        System.out.println("\n\n********************************Cuadrado********************************\n\n");
        System.out.println("El lado del cuadrado es: " + c2.getLado());
        System.out.println("El area del cuadrado es: " + c2.area());
        //Imprimir el perimetro del cuadrado
        System.out.println("El perimetro del cuadrado es: " + c2.perimetro() + "\n");      

    }
}
