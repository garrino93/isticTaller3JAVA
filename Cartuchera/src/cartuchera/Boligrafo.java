package cartuchera;

public class Boligrafo 
{
    String Marca;
    Tinta tuTinta;
    
    private Boligrafo(){
        this.tuTinta = new Tinta(); 
       // System.out.println("por defecto");
    }
    
    public Boligrafo(String Marca){
       
        //this.tuTinta = new tinta();
        this();
        this.Marca = Marca;
        // System.out.println("con marca");
    }
    public Boligrafo(String Marca,String Color,int Cantidad)
    { 
         
        this(Marca);
        this.tuTinta.Color = Color;
        this.tuTinta.Cantidad = Cantidad;
        
       // System.out.println("todi");
    }
    
    public int Escribir(String Color,int Cantidad)
    {
        int retorno = 0;
        if(this.tuTinta.Color == Color)
        {
            if(this.tuTinta.Cantidad> Cantidad)
                {                    
                    retorno=1;
                    this.tuTinta.Cantidad=this.tuTinta.Cantidad-Cantidad;
                }           
        }
        return retorno;
    }
    public void recargar(int Cantidad)
   {
       this.tuTinta.Cantidad=this.tuTinta.Cantidad + Cantidad;
   }
    
    public void reciclar(String color,int Cantidad)
    {
        
    }
}