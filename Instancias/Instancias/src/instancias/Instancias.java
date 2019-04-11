package instancias;

public class Instancias {

    
    public static void main(String[] args) 
    {
        int legajo;
        String Nombre;
        
        int UnEntero;
        String UnaPlabra;
        
        Alumno UnAlumno;
        
        // Instanciando la variable Alumno.
        
        UnAlumno = new Alumno();
        UnAlumno.legajo = 777;
        UnAlumno.Mostrar();
        
        Alumno OtroAlumno = new Alumno();
        OtroAlumno.legajo = 555;
        OtroAlumno.Mostrar();
        
        Calculadora UnCal = new Calculadora();
        UnCal.NumeroUno = 10;
        UnCal.NumeroDos = 15;
        UnCal.Sumar();
        
        System.out.println("El resultado es" + UnCal.Resultado);
    }
    
}
