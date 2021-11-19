package granja1;

public class Granjero
{
   
    private String nombre;
    private String apellidos;
    private int edad;
    private char sexo;
    private Mascota mascota;

  
    public Granjero(String suNombre, String suApellido, int suEdad, char suSexo)
    {
       
        nombre = suNombre;
        apellidos = suApellido;
        edad = suEdad;
        sexo = suSexo;
    }

  
    public String getNombre()
    {
        return nombre;
        
    }

    public String getApellido(){
        return apellidos;
    }

    public int getEdad(){
        return edad;
    }
    public char getSexo(){
        return sexo;
    }

    public void setNombre(String novoNombre){
        nombre = novoNombre;
    }
    public void setApellidos(String novoApellido){
        apellidos = novoApellido;
    }
    public void setEdad(int novaEdad){
        edad = novaEdad;
    }
    public void setMascota(Mascota mascota){
        this.mascota = mascota;
    }
    public String toString(){
        StringBuilder resultado = new StringBuilder();
        resultado.append ("\nNombre: ");
        resultado.append(nombre);
        resultado.append("\nApellidos: ");
        resultado.append(apellidos);
        resultado.append("\nEdad: ");
        resultado.append(edad);
        resultado.append("\nSexo: ");
        resultado.append(sexo);
        resultado.append(mascota);
        return resultado.toString();
    }
}
