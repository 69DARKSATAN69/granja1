package granja1;

public class Mascota
{
  private String nombre;
  private int edad;
  private String tipo; 
    

   
    public Mascota(String nombre, int edad, String tipo)
    {
        this.nombre=nombre;
        this.edad=edad;
        this.tipo=tipo;
    }

  
public String toString(){
    StringBuilder resultado = new StringBuilder();
    resultado.append("\nDatos Mascota: ");
    resultado.append("\n-----------");
    resultado.append("\nNombre: ");
    resultado.append(nombre);
    resultado.append("\nEdad: ");
    resultado.append(edad);
    resultado.append("\nTipo: ");
    resultado.append(tipo);
    return resultado.toString();
}
}
