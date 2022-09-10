package Clase1;

public class Servicios
{
    public static void main(String[] args)
    {
        Servicios juan = new Servicios();
        Servicios carla = new Servicios();

        System.out.println("Clase1.Servicio disponibles");
        juan.contratar("Juan", "amplio", 150, 3);
        carla.contratar("Carla", "amplio", 150, 3);
    }

    public void contratar(String nombre, String tipo, int monto, int vigencia)
    {
        System.out.println("Contratando" + "\nNombre: " + nombre + "\nTipo cobertura: " + tipo
                + "\nPago: " + monto + "\nVigencia: " + vigencia);
    }
}
