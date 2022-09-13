package Clase3;

public class Docente
{
    private String nombre, apellido, tipo;
    private int horas;

    public Docente(String nombre, String apellido, String tipo, int horas)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo = tipo;
        this.horas = horas;
    }

    //Set y Get de nombre
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public String getNombre()
    {
        return nombre;
    }

    //Set y Get apellido
    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }
    public String getApellido()
    {
        return apellido;
    }

    //Set y Get tipo
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }
    public String getTipo()
    {
        return tipo;
    }

    //Set y Get horas
    public void setHoras(int horas)
    {
        this.horas = horas;
    }
    public int getHoras()
    {
        return horas;
    }

    //Funcion para retornar el nombre completo
    public String NombreCompleto()
    {
        return nombre + " " + apellido;
    }

    //Funcion para retornar sueldo bruto
    public int SueldoBruto()
    {
        if(tipo == "ciencia")
            return horas*3;
        else
            return horas*5;
    }

    //Funcion para retornar el descuento
    public double Descuento()
    {
        return SueldoBruto()*0.10;
    }

    //Funcion para retornar el sueldo neto
    public double SueldoNeto()
    {
        return SueldoBruto()-Descuento();
    }

    public static void main(String[] args)
    {
        Docente d1 = new Docente("Rodrigo", "Aguilar", "ciencia", 5);
        System.out.println("Nombre: " + d1.getNombre() + "\nHoras: " + d1.getHoras() + "\nSueldo neto: " + d1.SueldoNeto());

    }
}
