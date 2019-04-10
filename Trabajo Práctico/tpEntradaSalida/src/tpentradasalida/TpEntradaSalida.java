package tpentradasalida;


public class TpEntradaSalida
{

    public static void main(String[] args)
    {
        FuncionesEstaticas.Saludar();
           
        System.out.println("------------------------------------");
           
        FuncionesEstaticas.SaludarConNombre("Pepito");
        
        System.out.println("------------------------------------");
        
        FuncionesEstaticas.SaludarConNombreYApellido("Pepito", "Valdivia");
        
        System.out.println("------------------------------------");
        
        FuncionesEstaticas.SaludarConNombreYEdad("Pepito", 35);
        
        System.out.println("------------------------------------");
        
        FuncionesEstaticas.SumarSinRetorno(5, 10);
        
        System.out.println("------------------------------------");
        
        int suma;
        suma=FuncionesEstaticas.SumarConRetorno(4, 6);
        
        System.out.println(suma);
        
        System.out.println("------------------------------------");
        
        double Promedio;
        
        Promedio = FuncionesEstaticas.Promedio(4, 6, 2);
        
        System.out.println(Promedio);
        
        System.out.println("------------------------------------");
        
        float Perimetro;
        
        Perimetro = FuncionesEstaticas.PerimetroCuadrado(10);
        
        System.out.println(Perimetro);
        
        System.out.println("------------------------------------");
        
        FuncionesEstaticas.PromedioRectangulo();
    }
}
