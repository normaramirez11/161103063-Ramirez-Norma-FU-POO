
import java.util.Scanner;

public class LeerJava {
    public static void main(String args[]){
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Dame un numero ");
        int numero=leer.nextInt();
        System.out.println("El numero leido es:"+numero);
        
        System.out.println("Dame un numero ");
        double numero2=leer.nextDouble();
        System.out.println("El numero leido es:"+numero2);
        
        System.out.println("Dame tu nombre completo");
        String nombre=leer.nextLine();
        System.out.println("el nombre es:"+nombre);
    }
    
}
