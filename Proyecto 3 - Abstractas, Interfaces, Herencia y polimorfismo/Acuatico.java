public class Acuatico extends Animal implements Comida{

    private int profundidad;
    private String tipoDeAgua;

    public Acuatico(String nameSpecie,int edad, int profundidad, String tipoDeAgua){
        super(nameSpecie, edad);
        this.profundidad = profundidad;
        this.tipoDeAgua = tipoDeAgua;
    }    

    public int getProfundidad(){   
        return profundidad;
    }

    @Override
    public String gruñir(){
        return "GluGluGlu";
    }

    @Override
    public String desplazar(){
        return "Nadar";
    }
}