package Clase4;

import java.util.Scanner;

public class ContarVocales
{
    public static void main(String[] args)
    {
        char[] cadena = new char[10];
        int contadorVocales = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < cadena.length; i++)
        {
            System.out.print("Ingrese el caracter [" + i + "] : ");
            cadena[i] = sc.next().toLowerCase().charAt(0);
        }

        for (int i = 0; i < cadena.length; i++)
        {
            if(cadena[i] == 'a' || cadena[i] == 'e' || cadena[i] == 'i' || cadena[i] == 'o' || cadena[i] ==  'u')
                contadorVocales++;
        }

        System.out.println(contadorVocales);
    }
}
