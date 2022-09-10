package Clase2;

import java.util.Scanner;

public class CicloDo
{
    final static float PESO_MINIMO = 10.2f;

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int cantidad = 0;
        float peso;

        do
        {
            System.out.print("Ingrese el peso(0 para terminar): ");
            peso = sc.nextFloat();

            if (peso > PESO_MINIMO)
                cantidad++;

        } while (peso != 0);

        System.out.println("Piezas aptas: " + cantidad);
    }
}
