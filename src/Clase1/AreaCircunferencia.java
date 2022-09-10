package Clase1;

import java.util.Scanner;

public class AreaCircunferencia
{
    public static void main (String[] args)
    {
        final double PI = 3.141592;
        double area, radio;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Radio: ");
        radio = teclado.nextDouble();

        area = PI*radio*radio;

        System.out.println("El area de la circunferencia es: " + area);
        System.out.printf("El area de la circunferencia es: %.2f", area);

    }
}
