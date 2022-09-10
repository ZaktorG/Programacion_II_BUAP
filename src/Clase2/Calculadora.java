package Clase2;

import java.util.Scanner;

public class Calculadora
{
    public static void main(String[] args)
    {

        int n1, n2, op;
        Scanner calc = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        n1 = calc.nextInt();
        System.out.println("Ingrese un numero");
        n2 = calc.nextInt();
        System.out.println("1)Suma\n2)Resta\n3)Division\n4)Multiplicacion");
        op = calc.nextInt();

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
