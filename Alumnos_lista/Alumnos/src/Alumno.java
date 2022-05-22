public class Alumno {

    private String nombre;
    private int edad;

    /** Getters */
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }

    /**
     * Setters
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    } 

    /**
     * Constructores
     */
    public Alumno() {

    }

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

}