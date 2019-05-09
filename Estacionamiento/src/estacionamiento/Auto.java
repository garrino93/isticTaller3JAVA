package estacionamiento;

import java.util.Date;

public class Auto
{
    public String Patente;
    public Date fechaIngreso;
    
    public Auto(String Patente)
    {
        this.Patente = Patente;
        this.fechaIngreso = new Date();
    }
}