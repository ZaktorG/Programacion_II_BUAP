package Clase1;

import java.util.Scanner;

public class ClaseLee
{
    public static void main(String[] args)
    {
        String nombre;
        int edad;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese su edad: ");
        edad = sc.nextInt();

        System.out.println("Nombre: " + nombre + "\nEdad: " + edad);
    }
}
