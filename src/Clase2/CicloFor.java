package Clase2;

import java.util.Scanner;

public class CicloFor

{
    public static void main(String[] args)
    {
        int suma = 0, n1;
        Scanner teclado = new Scanner(System.in);
        for (int i=0;i<3;i++)
        {
            System.out.println("Ingrese un numero");
            n1 = teclado.nextInt();
            suma = n1 + suma;
        }

        System.out.println(suma/3);

    }
}
