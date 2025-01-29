import java.util.Scanner;
import java.util.Calendar;

public class Main{

    static Persona[] arregloPersona = new Persona[2];

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        boolean flag = false;

        while(!flag){
            
            menu();
            int opcion = sc.nextInt();
            sc.nextLine();

            if(opcion==1){
                System.out.println("\nIngrese nombre de la persona");
                String nombre = sc.nextLine();

                System.out.println("\nIngrese nombre de usuario de la persona");
                String username = sc.nextLine();

                System.out.println("\nIngrese la edad de la persona");
                int edad = sc.nextInt();

                System.out.println("\nIngrese la altura de la persona");
                double altura = sc.nextDouble();

                Persona p = new Persona(nombre, username, edad, altura);

                System.out.println(addPersona(p));
            }
            else if(opcion==2){
                System.out.println("\nIngrese nombre de la persona a buscar");
                String nombre = sc.nextLine();

                Persona p = searchPersona(nombre);
                if(p!=null){
                    System.out.println(p + "\n");
                }
                else{
                    System.out.println("La persona buscada no existe\n");
                }
                
            }
            else if(opcion==3){
                System.out.println("\nIngrese nombre de la persona a eliminar");
                String nombre = sc.nextLine();
                System.out.println(deletePersona(nombre));
                
            }
            else if(opcion==4){
                System.out.println("El programa terminó\n");
                flag = true;
            }
            else{
                System.out.println("\nIngrese un número válido");
            }
        }
    }

    public static void menu(){
        System.out.println("\nBienvenido al registro de persona");
        System.out.println("1. Añadir persona");
        System.out.println("2. Buscar persona");
        System.out.println("3. Eliminar persona");
        System.out.println("4. Salir");
    }

    public static String addPersona(Persona personaNueva){
        
        String mensaje = "\nNo se agregó la persona";
        boolean flag = false;
 
        for(int i=0; i<arregloPersona.length && !flag; i++){
            Persona persona = arregloPersona[i];
                if(persona == null){
                    arregloPersona[i] = personaNueva;
                    mensaje = "Se agregó la persona con éxito\n";
                    flag = true;
                }   
        }
        return mensaje;
    }

    public static Persona searchPersona(String name){
         
        for(int i=0; i<arregloPersona.length; i++){
            Persona persona = arregloPersona[i];
            if(persona!=null){
                if(persona.getName().equals(name)){
                    return persona;
                }
            }  
        }
        return null;
    }

    public static String deletePersona(String name){

        String mensaje = "\nNo se eliminó la persona";
        boolean flag = false;

        for(int i=0; i<arregloPersona.length && !flag; i++){
            Persona persona = arregloPersona[i];
            if(persona!=null){
                if(persona.getName(\n).equals(name)){
                    arregloPersona[i] = null;
                    flag = true;
                    mensaje = "Se eliminó con éxito la persona\n";
                }
            }  
        }
        return mensaje;
    }
}
