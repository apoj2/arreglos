package clases;

public class Estudiante {

    private String nombre;
    private String identificacion;
    private String areaDesarrollada;
    private int Edad;

    public Estudiante() {
    }

    public Estudiante(String nombre, String identificacion, String areaDesarrollada, int edad) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.areaDesarrollada = areaDesarrollada;
        Edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getAreaDesarrollada() {
        return areaDesarrollada;
    }

    public void setAreaDesarrollada(String areaDesarrollada) {
        this.areaDesarrollada = areaDesarrollada;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }


}
