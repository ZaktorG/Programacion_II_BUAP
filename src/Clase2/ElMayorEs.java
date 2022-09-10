package Clase2;

import java.util.Scanner;

public class ElMayorEs
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String nombre1, nombre2;
        int edad1, edad2;

        System.out.print("Ingrese nombre: ");
        nombre1 = sc.nextLine();
        System.out.print("Ingrese edad: ");
        edad1 = sc.nextInt();

        sc.nextLine();//limpiar el buffer

        System.out.print("Ingrese nombre: ");
        nombre2 = sc.nextLine();
        System.out.print("Ingrese edad: ");
        edad2 = sc.nextInt();

        System.out.println("El mayor de edad es ");
        if(edad1 > edad2)
            System.out.print(nombre1);
        else
            System.out.print(nombre2);
    }
}
