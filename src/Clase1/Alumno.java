package Clase1;

public class Alumno {
    private String nombre;
    private int edad;
    private static int contadorAlumnos;

    public void setNombre(String nombre) {
        nombre = this.nombre;
    }

    public void setEdad(int edad) {
        edad = this.edad;
    }

    public static int getContadorAlumnos() {
        return contadorAlumnos;
    }

    public static void incrementarAlumnos()
    {
        contadorAlumnos++;
    }

    public static void main(String[] args)
    {
        Alumno a1 = new Alumno();
        a1.setNombre("Rodrigo");
        a1.setEdad(18);
        incrementarAlumnos();
        System.out.println("Numero de alumnos: " + getContadorAlumnos());
    }
}
