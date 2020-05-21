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
public class AreaCuadrado {
    public static void main(String []args){
        double area;
        Scanner sc=new Scanner (System.in);
        System.out.println("proporciona el numero");
        double b=sc.nextDouble();
        area=b*b;
        System.out.println(area);
    }
    
}
