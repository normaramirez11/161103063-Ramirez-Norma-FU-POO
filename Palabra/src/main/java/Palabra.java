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
public class Palabra {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String palabra; 
        int num;
        System.out.println("Que palabra quieres mostrar: ");
        palabra = scan.next();
        System.out.println("¿Cuantas veces quieres repetirla?");
        num = scan.nextInt();
        for (int i = 1; i <=num; i++) {
            System.out.println(palabra);
        }
    }
}
