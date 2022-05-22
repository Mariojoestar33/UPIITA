package Ejemplo;

public class Nodo {

    private Alumno alumno; //Datos del nodo
    private Nodo siguiente; //Puntero al siguiente nodo

    public Nodo() {
        alumno = null;
        siguiente = null;
    }

    public Nodo(Alumno alumno) {
        this.alumno = alumno;
        siguiente = null;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
