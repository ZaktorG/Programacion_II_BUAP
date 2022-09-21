package Clase4;

import java.util.Scanner;

public class AdivinaMes
{
    public static void main(String[] args)
    {
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto",
                "septiembre", "octubre", "noviembre", "diciembre"};
        Scanner sc = new Scanner(System.in);
        int numeroRandom = (int)(Math.random()*10 + 1);

        System.out.println("Ingrese el mes:");
        String mesIngresado = sc.nextLine().toLowerCase();

        if(mesIngresado.equals(meses[numeroRandom]))
            System.out.println("Correcto");
        else
            System.out.println("Incorrecto el mes era " + meses[numeroRandom]);
    }
}
