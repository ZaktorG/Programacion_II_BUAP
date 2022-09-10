package Clase2;

import java.util.Scanner;

public class CompararClase
{
    public static void main (String[] args)
    {
        String apellido1, apellido2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese primer apellido: ");
        apellido1 = sc.nextLine();
        System.out.print("Ingrese segundo apellido: ");
        apellido2 = sc.nextLine();

        if (apellido1.equals(apellido2))
            System.out.println("Los apellidos son iguales");
        else
            System.out.println("Los apellidos son diferentes");
    }
}
