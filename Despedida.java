import java.util.Scanner;

public class Despedida {
  
    public static void despedir(){
        Scanner teclado= new Scanner(System.in);
        System.out.println("Dime tu nombre");
        String nombre=teclado.nextLine();
       
        System.out.println("Adios" + nombre + "Espero verte mas a menudo");
        teclado.close();
    }
}
