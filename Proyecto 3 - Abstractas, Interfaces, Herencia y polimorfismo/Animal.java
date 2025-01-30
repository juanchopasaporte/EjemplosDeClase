public abstract class Animal{

    private String nameSpecie;
    private int edad;

    public Animal(String nameSpecie, int edad){
        this.nameSpecie = nameSpecie;
        this.edad = edad;
    }

    public String getNameSpecie(){
        return nameSpecie;
    }

    public int getEdad(){
        return edad;
    }

    public String desplazar(){
        return "Algún desplazamiento";
    }

    public String gruñir(){
        return "Algún gruñido";
    }
}