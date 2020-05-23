/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author norma
 */
import java.util.*;
public class Boletos {
    
    public static void main(String[] args) {
        float boletoa,boletob,boletoc,boletod;
        float totala,totalb,totalc,totald;
        Scanner scan = new Scanner(System.in);
        System.out.println("Dime cuantos boletos quieres de la tribuna A:");
        boletoa = scan.nextInt();
        totala=boletoa*2760;
        System.out.println("Dime cuantos boletos quieres de la tribuna B:");
        boletob = scan.nextInt();
        totalb=boletob*1200;
        System.out.println("Dime cuantos boletos quieres de la tribuna C:");
        boletoc = scan.nextInt();
        totalc=boletoc*740;
        System.out.println("Dime cuantos boletos quieres de la tribuna D:");
        boletod = scan.nextInt();
        totald=boletod*430;
        System.out.println("el total a pagar por cada tribuna seria:\n");
        System.out.println("Total de tribuna a: $"+totala);
        System.out.println("Total de tribuna b: $"+totalb);
        System.out.println("Total de tribuna c: $"+totalc);
        System.out.println("Total de tribuna d: $"+totald);
        
       
    }
    
}
