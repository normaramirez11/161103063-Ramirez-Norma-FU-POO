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
public class ImprimerNaM {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Desde que numero empezara:");
        num1=scan.nextInt();
        System.out.println("En que numero quieres que se detenga");
        num2=scan.nextInt();
        System.out.println("\n");
        for(int i=num1;i <=num2; i++){
            System.out.println(i);
        }
    }
}
