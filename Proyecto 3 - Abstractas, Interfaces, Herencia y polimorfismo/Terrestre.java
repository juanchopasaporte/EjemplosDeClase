public class Terrestre extends Animal implements Comida{

    private String tipoTierra;
    private boolean tienePelo;

    public Terrestre(String nameSpecie, int edad, String tipoTierra, boolean tienePelo){
        super(nameSpecie, edad);
        this.tipoTierra = tipoTierra;
        this.tienePelo = tienePelo;
    }

    public String getTierra(){
        return tipoTierra;
    }

    @Override
    public String gruñir(){
        return "RawrRawrRawr";
    }

    @Override
    public String desplazar(){
        return "Caminar";
    }
}