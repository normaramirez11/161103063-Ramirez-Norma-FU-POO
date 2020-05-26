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
public class NumeroMayor {
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        int A;
        int B;
        System.out.println("Dame el primer numero A");
        A = reader.nextInt(); 
        
        System.out.println("Dame el segundo numero B");
        B = reader.nextInt();
        
        if(A>B){
            System.out.println("El numero mayor es:"+A);
  }
        else{
            System.out.println("El numero mayor es:"+B);
  }
    }
    
}
