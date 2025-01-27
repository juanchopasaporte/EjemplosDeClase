import java.util.Scanner;
import java.util.Calendar;

public class Main{

    public static void main(String[] args){

        System.out.println("Bienvenido al registro de persona");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese nombre de la persona");
        String nombre = sc.nextLine();

        System.out.println("Ingrese nombre de usuario de la persona");
        String username = sc.nextLine();

        System.out.println("Ingrese la edad de la persona");
        int edad = sc.nextInt();

        System.out.println("Ingrese la altura de la persona");
        double altura = sc.nextDouble();
        
        Persona p1 = new Persona(nombre, username, edad, altura);
        
        System.out.println(p1.toString());
        p1.setUsername("juancho");

        System.out.println(p1.toString());
    }
}