package Clase2;

import java.util.Scanner;

public class Potencia
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double n1, n2;

        System.out.print("Ingrese la base: ");
        n1 = sc.nextDouble();
        System.out.print("Ingrese el exponente: ");
        n2=sc.nextDouble();

        double res = Math.pow(n1, n2);

        System.out.println(res);
    }
}
