/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author norma
 */
import java.util.Scanner;
public class Numero {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int oportunidades=3;
        int numero=-1;
        int numero2=1;
        
        numero2=(int)(Math.random()*100+1);
        
        while(oportunidades > 0 && numero!=numero2)
        {
            System.out.println("Ingrese un numero");
            numero=sc.nextInt();
            
            if(numero==numero2)
            {
                System.out.println("Es correcto");
            }
            else if(numero!=numero2)
            {
                if(numero>numero2){
                    
                    System.out.println("Esta muy arriba, Intentalo de nuevo:");
                    oportunidades--;
                } else
                {
                System.out.println("Esta muy bajo,Intentalo de nuevo:");
                oportunidades--;
                }
            }
            if(oportunidades==0){
                System.out.println("No adivinaste, el numero era:"+numero2);
            }
        }
    }
}
