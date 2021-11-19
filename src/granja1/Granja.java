package granja1;

public class Granja
{
    private Granjero granjero;
    private String nombre;
    private String ubicacion;
    


    public Granja(Granjero propietario)
    {
       
       granjero = propietario;
    }

    public Granja(String nombre, String ubicacion, Granjero granjero){
        this.nombre=nombre;
        this.ubicacion=ubicacion;
        this.granjero=granjero;
    }
  
 public static void main(){
     Granjero paco = new Granjero("Paco","Martinez",50,'H');
     System.out.print(paco);
    }
        
public String toString(){
   StringBuilder resultado = new StringBuilder();
   
   resultado.append("\nDatos de la Granja");
   resultado.append("\n-----------------------");
   resultado.append("\nNombre: ");
   resultado.append(nombre);
   resultado.append("\nUbicacion: ");
   resultado.append(ubicacion);
   resultado.append("\nGranjero: ");
   resultado.append(granjero);
   
   
   
    return resultado.toString();
}




}

