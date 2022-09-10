package Clase2;

import java.util.Scanner;

public class CicloFor
{
    final static int NUMERO_ELEMENTOS = 3;
    public static void main (String[] args)
    {
        int suma = 0, numero_ingresado;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < NUMERO_ELEMENTOS; i++)
        {
            System.out.print("Ingrese un numero: ");
            numero_ingresado = sc.nextInt();
            suma += numero_ingresado;
        }
        System.out.println("El promedio es: " + suma/3);
    }
}
