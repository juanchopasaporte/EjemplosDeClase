public class Main{

    public static void main(String[] args) {
        Animal[] animal = new Animal[3];

        animal[0] = new Acuatico("Ballenas", 200, 50, "salada");
        animal[1] = new Terrestre("Felinos", 20, "caliente", true);
        animal[2] = new Volador("Gallinas", 10, 1, true);
        
        Comida co = new Acuatico(null, 0, 0, null);

        //for each
        for (Animal animl : animal){
            if(animl instanceof Acuatico){
                Acuatico ac = (Acuatico) animl;
                System.out.println(ac.getProfundidad());
                System.out.println(ac.comer());
            }
            else if(animl instanceof Terrestre){
                Terrestre tr = (Terrestre) animl;
                System.out.println(tr.getTierra());
                System.out.println(tr.comer());
            }
            else{
                Volador vl = (Volador) animl;
                System.out.println(vl.getVelocidad());
                System.out.println(vl.comer());
            }
        }
        
        for (Animal animl : animal){
            System.out.println(animl.desplazar());
            System.out.println(animl.gruñir());
        }
    }
}