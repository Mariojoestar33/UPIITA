public class Main {
    public static void main(String[] args) {
        
        ListaLigada listaAlumnos = new ListaLigada();
        listaAlumnos.imprimeLista(); // Lista vacia

        Alumno al1 = new Alumno();
        al1.setNombre("Prueba 1");
        al1.setEdad(18);
        Nodo nodo1 = new Nodo(al1);

        listaAlumnos.insertaNodo(nodo1, -10);

        Alumno al2 = new Alumno();
        al2.setNombre("Prueba 0");
        al2.setEdad(23);
        Nodo nodo0 = new Nodo(al2);
        listaAlumnos.insertaNodo(nodo0, -10);

        al2 = new Alumno();
        al2.setNombre("Prueba 2");
        al2.setEdad(25);
        Nodo nodo2 = new Nodo(al2);
        listaAlumnos.insertaNodo(nodo2, 20);
        


        al2 = new Alumno();
        al2.setNombre("Prueba 1.5");
        al2.setEdad(30);
        Nodo nodo3 = new Nodo(al2);
        listaAlumnos.insertaNodo(nodo3, 2);
        
        listaAlumnos.imprimeLista();

        listaAlumnos.eliminaNodo(2);
        listaAlumnos.imprimeLista();

        Nodo found = listaAlumnos.buscaAlumnoXEdad(1);

        if(found != null) {
            System.out.println(found.getAlumno().getNombre() + " " + found.getAlumno().getEdad());
        } else {
            System.out.println("No se encontro el alumno");
        }
        
    }

}
