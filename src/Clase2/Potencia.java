package Clase2;

import java.util.Scanner;
import java.util.*;

public class Potencia
{
    public static void main(String[] args)
    {
        double n1, n2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la base: ");
        n1 = sc.nextDouble();
        System.out.print("Ingrese el exponente: ");
        n2=sc.nextDouble();

        double res= Math.pow(n1, n2);

        System.out.println(res);
    }
}
