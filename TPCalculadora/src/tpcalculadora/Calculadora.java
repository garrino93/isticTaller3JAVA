package tpcalculadora;

import java.util.Scanner;

public class Calculadora 
{
    public static int sumarConParametro(int parametro1, int parametro2)
    {
        System.out.println("...Estoy sumando con parametro...");
        int suma;
        suma=parametro1+parametro2;
        
        return suma;
    }
    
    public static int sumarConRetorno()
    {
        System.out.println("...Estoy sumando con retorno...");
        int numeroUno;
        int numeroDos;
        int suma;
        
        Scanner Lector;
        Lector = new Scanner(System.in);
        
        System.out.println("Ingrese primer número: ");
        numeroUno=Lector.nextInt();
        System.out.println("Ingrese segundo número: ");
        numeroDos=Lector.nextInt();
        
        suma=numeroUno+numeroDos;
        System.out.println("El resultado de la suma es: " + suma);
        
        return suma;
    }
    
    private static void sumar()
    {
        System.out.println("...Estoy sumando...");
        int numeroUno;
        int numeroDos;
        int suma;
        
        Scanner Lector;
        Lector = new Scanner(System.in);
        
        System.out.println("Ingrese primer número: ");
        numeroUno=Lector.nextInt();
        System.out.println("Ingrese segundo número: ");
        numeroDos=Lector.nextInt();
        
        suma=numeroUno+numeroDos;
        System.out.println("El resultado de la suma es: " + suma);
    }
    public static int restar(int parametro1, int parametro2)
    {
        System.out.println("...Estoy restar con parametro...");
        int restar;
        restar=parametro1+parametro2;
        
        return restar;
    }
    public static int multiplicar(int parametro1, int parametro2)
    {
        System.out.println("...Estoy multiplicar con parametro...");
        int multiplicar;
        multiplicar=parametro1*parametro2;
        
        return multiplicar;
    }
    public static int dividir(int parametro1, int parametro2)
    {
        System.out.println("...Estoy dividiendo con parametro...");
        int dividir;
        dividir=parametro1/parametro2;
        
        return dividir;        
    }
}
