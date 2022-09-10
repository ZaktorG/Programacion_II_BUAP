package Clase2;

import java.util.Scanner;

public class CompararClase
{
    public static void main(String[] args)
    {
        Scanner compc = new Scanner(System.in);
        String apellido1, apellido2;

        System.out.println("Ingrese primer apellido");
        apellido1 = compc.nextLine();

        System.out.println("Ingrese segundo apellido");
        apellido2 = compc.nextLine();

        if (apellido1.equals(apellido2))
            System.out.println("los apellidos son iguales");
        else
            System.out.println("Los apellidos son diferentes");
    }
}
