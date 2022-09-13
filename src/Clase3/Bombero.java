package Clase3;

import java.util.Scanner;

public class Bombero
{
    private String nombre, apellido;
    private int edad;
    private boolean casado, especialista;

    public Bombero(String nombre, String apellido, int edad,boolean casado, boolean especialista)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.casado = casado;
        this.especialista = especialista;
    }

    //Get y Set de nombre
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public String getNombre()
    {
        return nombre;
    }

    //Get y Set de apellido
    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }
    public String getApellido()
    {
        return apellido;
    }

    //Get y Set de Especialista
    public void setEspecialista(boolean especialista)
    {
        this.especialista = especialista;
    }
    public boolean getEspecialista()
    {
        return especialista;
    }

    //Get y Set de Casado
    public void setCasado(boolean casado)
    {
        this.casado = casado;
    }
    public boolean getCasado()
    {
        return casado;
    }

    public static void main(String[] args)
    {
        Bombero b1 = new Bombero("Rodrigo", "Aguilar", 18, false, true);
        System.out.println("Nombre: " + b1.getNombre() + "\nEdad: " + b1.edad);
    }
}
