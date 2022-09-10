package Clase2;

import java.util.Scanner;

public class CicloWhile
{
    final static float LARGO_MINIMO = 1.20f;
    final static float LARGO_MAXIMO = 1.30f;

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = 1, n, cantidad = 0;
        float largo;

        System.out.print("Ingrese el numero de pieza que procesara: ");
        n = sc.nextInt();

        while (x <= n)
        {
            System.out.print("Ingrese el valor de la pieza: ");
            largo = sc.nextFloat();

            if (largo >= LARGO_MINIMO && largo <= LARGO_MAXIMO)
                cantidad++;

            x++;
        }

        System.out.println("Piezas aptas: " + cantidad);
    }
}
