import java.util.Scanner;

public class JuegoMain 
{
    public static void main(String args[])
    {
       /* AK bronce = new AK("bronce",5,65,5,1000,10,20);
        bronce.tipo = "Bronce"; */
        Scanner scant = new Scanner (System.in);
        AK ak = new AK();
        
        int valor;
        int i=1;
        
        while (i<3){
            if(i==1){
                
                System.out.println("menu");
                System.out.println("personaje " + i + "selecciona arma");
                System.out.println("1-bronce");
                System.out.println("2-plata");
                System.out.println("3-oro");
                System.out.println("4-diamante");
                System.out.println("5-adamantium");
                valor =scant.nextInt();
                
                
               Personaje p1=new Personaje("Nestor");
                p1.equipaArma(valor);
                System.out.println(p1);
                System.out.println(p1.disparar());
                
                i++;
            }else{
               System.out.println("menu");
                System.out.println("jugador"+i+"elija arma");
                System.out.println("1-bronce");
                System.out.println("2-plata");
                System.out.println("3-oro");
                System.out.println("4-diamante");
                System.out.println("adamantium");
                valor =scant.nextInt();
                
                
               Personaje p2=new Personaje("hanny");
                p2.equipaArma(valor);
                System.out.println(p2);
                System.out.println(p2.disparar());
                
                i++;
            }
            if(i==3){
             System.out.println("menu");
                System.out.println("jugador"+i+"elija arma");
                System.out.println("1-bronce");
                System.out.println("2-plata");
                System.out.println("3-oro");
                System.out.println("4-diamante");
                System.out.println("adamantium");
                valor =scant.nextInt();   
                    
                      
               Personaje p3=new Personaje("norma");
                p3.equipaArma(valor);
                System.out.println(p3);
                System.out.println(p3.disparar());
                
                i++;
                
            }
        }
       
    }
}
