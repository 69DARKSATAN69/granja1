package granja1;

public class Principal
{

    

  
    public static void main(){
        Granjero paco = new Granjero("Paco","Martinez",50,'H');
        Granja granjaDePaco = new Granja("Pacolandia", "Corea del Norte", paco);
        Mascota mascota = new Mascota("Rex", 13, "Perro");
        paco.setMascota(mascota);
        System.out.println(granjaDePaco);
        
        
    }
    
       
    

}
