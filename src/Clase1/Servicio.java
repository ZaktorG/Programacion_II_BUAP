package Clase1;

public class Servicio
{
    public static void main(String[] args)
    {
        Servicio juan = new Servicio();

        System.out.println("Clase1.Servicio disponibles");
        juan.contratar("amplio", 150, 3);
    }

    public void contratar(String tipo, int monto, int vigencia)
    {
        System.out.println("Contratando\nTipo cobertura: " + tipo + "\nPago: " + monto
                + "\nVigencia: " + vigencia);
    }
}