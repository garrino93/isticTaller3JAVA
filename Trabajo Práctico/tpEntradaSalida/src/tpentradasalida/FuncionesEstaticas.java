package tpentradasalida;


public class FuncionesEstaticas 
{
   
    public static void Saludar()
    {
        System.out.println("Bienvenido a JAVA");
    }

    public static void SaludarConNombre(String Nombre)
    {   
        System.out.println("bienvenido a java " + Nombre );
    }
   
    public static void SaludarConNombreYApellido(String Nombre, String Apellido)
    {
        System.out.println("su nombre es " + Nombre + " y " + Apellido + " es su apellido");
    }
    
    public static void SaludarConNombreYEdad(String Nombre, int Edad)
    {
        System.out.println("Usted se llama " + Nombre + " y tiene " + Edad + " años de edad");
    }
    
    public static void SumarSinRetorno(int numero1, int numero2)
    {
        int result;
        
        result = numero1 + numero2;
        
        System.out.println(result);
    }
    public static int SumarConRetorno(int numero1, int numero2)
    {
        int suma;
        
        suma = numero1 + numero2;
        
        return suma;
    }
    public static double Promedio(int numero1, int numero2, int numero3)
    {

        double Promedio = (numero1 + numero2 + numero3) / 3;
        
        return Promedio;
    }
    public static float PerimetroCuadrado(float base)
    {
        float Perimetro = 4 * base;
        
        return Perimetro;
    }
    
    public static void PromedioRectangulo(float altura, float base)
    {
        //float Perimetro = 4 * base;
        
        //return Perimetro;
    }
}
    