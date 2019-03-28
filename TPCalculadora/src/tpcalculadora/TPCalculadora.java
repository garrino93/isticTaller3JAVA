package tpcalculadora;

import java.util.Scanner;

public class TPCalculadora 
{
    
    public static void main(String[] args)
    {   
        int primerValor;
        int segundoValor;
        int respuesta;
        int resultado;
        float division;
        
        Scanner Lector;
        Lector = new Scanner(System.in);
        
        System.out.println("Ingrese primer número: ");
        primerValor = Lector.nextInt();
        
        System.out.println("Ingrese segundo número: ");
        segundoValor = Lector.nextInt();
        
        respuesta = Calculadora.sumarConParametro(primerValor, segundoValor);
        System.out.println("La suma es: " + respuesta);
        
        respuesta = Calculadora.restar(primerValor, segundoValor);
        System.out.println("La resta es: " + respuesta);
        
        respuesta = Calculadora.multiplicar(primerValor, segundoValor);
        System.out.println("La multiplicación es: " + respuesta);
        
        division = Calculadora.dividir(primerValor, segundoValor);
        System.out.println("La división es: " + division);
        
        /*
         int resultado;
         Calculadora.sumar();
         resultado = Calculadora.sumarConRetorno();
         System.out.println("La suma es: " + resultado);
         resultado = Calculadora.sumarConParametro(33, 33);
         System.out.println("El resultado es: " + resultado);
        */
        
        // Calculadora.restar();
        // Calculadora.multiplicar();
        // Calculadora.dividir();
        
/*
        System.out.println("Hola");
        Scanner Lector;
        Lector = new Scanner(System.in);
        int Edad;
        System.out.println("Por favor ingrese su edad: ");
        Edad=Lector.nextInt();
        System.out.println("La edad es: " + Edad);
*/
    }
}
