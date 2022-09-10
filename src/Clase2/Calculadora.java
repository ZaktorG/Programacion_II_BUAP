package Clase2;

import java.util.Scanner;

public class Calculadora
{
    public static void main (String[] args)
    {
        int n1, n2, op;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        n1 = sc.nextInt();
        System.out.print("Ingrese un numero: ");
        n2 = sc.nextInt();
        System.out.println("1)Suma\n2)Resta\n3)Division\n4)Multiplicacion");
        op = sc.nextInt();

        switch (op)
        {
            case 1:
                System.out.println(n1+n2);
                break;
            case 2:
                System.out.println(n1-n2);
                break;
            case 3:
                System.out.println(n1/n2);
                break;
            case 4:
                System.out.println(n1*n2);
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }
}
