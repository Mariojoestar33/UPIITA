/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyinscripción;

import java.text.Normalizer;

/**
 *Clase Inscripción
 * Corresponde a la clase generada para la Práctica 3
 * @author belli
 */
public class Inscripción {
    /** guarda la boleta del alumno asiganda*/
    private long boletaAlumno;
    /** Guarda en mayúsculas y sin acentos los nombre de las carreras, por ejemplo: TELEMATICA*/
    private String carrera;
    /** Total de créditos que desea inscribir*/
    private double créditosParaInscribir;
    /**El número de unidades de aprendizaje que desea inscribir, la suma de los créditos de éstas se encuentras en el atributo créditosAInscribir*/
    private int numUnidadesAprendizaje;
    /**El número de créditos que adeuda*/
    private double créditosAdeuda;
    /**guarda una r para alumno regular, una i para irregular o una d para un alumno fuera de reglamento o en dictamen*/
    private char regularIrregularDictamen;

    /**Constructor requiere la boleta y carrera para poder crear el objeto. 
     * Inicializa los créditos y la cantidad de materias a inscribir con 0
     * El nombre de la carrera lo normaliza quitando acentos y pasando a mayúsculas
     * @param boletaAlumno recibe un número largo que representa su número de boleta
     * @param carrera recibe el nombre de la carrera 
     */
    public Inscripción(long boletaAlumno, String carrera) {
        this.boletaAlumno = boletaAlumno;
        //this.carrera = carrera;
        //Pasa a mayúsculas el nombre de la carrera
        carrera = carrera.toUpperCase();
        // Normalizar texto separando Á como A´
        carrera = Normalizer.normalize(carrera, Normalizer.Form.NFD);
        //quitamos con expresiones regulares los acentos
        this.carrera = carrera.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        créditosAdeuda = 0;
        créditosParaInscribir = 0;
        numUnidadesAprendizaje = 0;
    }

    public Inscripción() {
    }
    
    
    /**Hace los cálculos considerando carrera y créditos para determinar si se puedo o no inscribir en esos términos
     * @return regresa un booleno que será true si la inscripción procede para los parámetros ingresados
     */
    public boolean calcularSiProcedeInscripción(){
        double min=0, max=0;
        //estableciendo el rango de créditos que pueden inscribir según situación escolar y carrera
        if(regularIrregularDictamen=='d'){ //FUERA DE REGLAMENTO
            return false;
        }
        if (regularIrregularDictamen=='i'){ //IRREGULAR
            switch(carrera){
                case "TELEMATICA":case "BIONICA":
                    min = 27;
                    max = 39;//la media se convierte en la máxima si es irregular
                    break;
                case "MECATRONICA":
                    min = 27;
                    max = 40;
                    break;
                case "ENERGIA":
                    min = 32;
                    max = 50;
                    break;
            }
        }else{ //REGULAR
            switch(carrera){
                case "TELEMATICA":case "BIONICA":
                    min = 27;
                    max = 79;
                    break;
                case "MECATRONICA":
                    min = 27;
                    max = 80;
                    break;
                case "ENERGIA":
                    min = 32;
                    max = 90;
                    break;
                default:
                    return false;
            }
        }
        //calculando si la inscripción procede según adeudos
        double totalCreditos = this.créditosAdeuda+this.créditosParaInscribir;
        return !(totalCreditos>max || totalCreditos<min);
    }

    public long getBoletaAlumno() {
        return boletaAlumno;
    }

    public void setBoletaAlumno(long boletaAlumno) {
        this.boletaAlumno = boletaAlumno;
    }
    
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getCréditosParaInscribir() {
        return créditosParaInscribir;
    }

    public void setCréditosParaInscribir(double créditosParaInscribir) {
        this.créditosParaInscribir = créditosParaInscribir;
    }

    public int getNumUnidadesAprendizaje() {
        return numUnidadesAprendizaje;
    }

    public void setNumUnidadesAprendizaje(int numUnidadesAprendizaje) {
        this.numUnidadesAprendizaje = numUnidadesAprendizaje;
    }

    public double getCréditosAdeuda() {
        return créditosAdeuda;
    }

    public void setCréditosAdeuda(double créditosAdeuda) {
        this.créditosAdeuda = créditosAdeuda;
    }

    public char getRegularIrregularDictamen() {
        return regularIrregularDictamen;
    }

    public void setRegularIrregularDictamen(char regularIrregularDictamen) {
        this.regularIrregularDictamen = regularIrregularDictamen;
    }
    
}
