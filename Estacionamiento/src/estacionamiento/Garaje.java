package estacionamiento;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Garaje
{
    public static void ingresarAuto(Auto unAuto) throws IOException
    {
        FileWriter Archivo;
        Archivo = new FileWriter("Estacionados.txt", true);
        
        PrintWriter Escritor;
        Escritor = new PrintWriter(Archivo);
        Escritor.println(unAuto.Patente);
        Archivo.close();
        
        System.out.println(unAuto.Patente);
    }
}