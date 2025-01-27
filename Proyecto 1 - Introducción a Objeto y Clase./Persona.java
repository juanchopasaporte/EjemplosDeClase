import java.util.Date;

public class Persona{

    private String nombre;
    private String username;
    private int edad;
    private double altura;
    //private Date fecha_nacimiento;
    /*
    **/

    public Persona(String nombre, String username, int edad, double altura){
        this.nombre = nombre;
        this.username = username;
        this.edad = edad;
        this.altura = altura;
    }

    public String toString(){
        return "Nombre= " + this.nombre + " Username=" + this.username 
        + " Edad=" + this.edad + " Altura=" + this.altura;
    }

    public String getName(){

    }

    public void setName(){
        
    }

    // Estas son funciones sin retorno que solo me hacen modificaciones
    public void setUsername(String new_username){
        this.username = new_username;
    }
}