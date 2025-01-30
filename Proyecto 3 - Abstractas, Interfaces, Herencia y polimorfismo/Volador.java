public class Volador extends Animal implements Comida{

    private double velocidad;
    private boolean tienePlumas;

    public Volador(String nameSpecie,int edad, double velocidad, boolean tienePlumas){
        super(nameSpecie, edad);
        this.velocidad = velocidad;
        this.tienePlumas = tienePlumas;
    }

    public double getVelocidad(){
        return velocidad;
    }

    @Override
    public String gruñir(){
        return "FiuuuFiuuuFiuuu";
    }

    @Override
    public String desplazar(){
        return "Volar";
    }

    @Override
    public String comer(){
        return "Comer frutas";
    }
}