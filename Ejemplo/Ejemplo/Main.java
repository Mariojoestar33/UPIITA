package Ejemplo;

//import java.util.Random;

public class Main {
    
public static void main(String[] args) {

    Lista_ligada listaAlumnos = new Lista_ligada();

   // Random rnd = new Random();

    listaAlumnos.imprimeLista();

    Alumno alumno1 = new Alumno();
    alumno1.setNombre("Prueba 1");
    alumno1.setEdad(20);
    Nodo nodo1 = new Nodo(alumno1);

    listaAlumnos.insertarNodo(nodo1, -10);

    Alumno alumno2 = new Alumno();
    alumno2.setNombre("Prueba 2");
    alumno2.setEdad(22);
    Nodo nodo2 = new Nodo(alumno2);

    listaAlumnos.insertarNodo(nodo2, -10);

    listaAlumnos.imprimeLista();

}

}


