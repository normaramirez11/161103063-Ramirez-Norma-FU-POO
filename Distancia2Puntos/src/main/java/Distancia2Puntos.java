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
public class Distancia2Puntos {
    public void recibe()
            {
        double x1;
        double y1;
        double x2;
        double y2;
        double distancia;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("ingrese la coordenada de x del primero: ");
        x1=entrada.nextDouble();
        
        System.out.println("ingrese la coordenada de y del primero: ");
        y1=entrada.nextDouble();
        
        System.out.println("ingrese la coordenada de x del segundo:");
        x2=entrada.nextDouble();
        
        System.out.println("ingrese la coordenada de y del segundo:");
        y2=entrada.nextDouble();
        
        distancia=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        
        System.out.printf("\n la distancia entre los puntos es : %.2f\n", distancia);
        
    }
}
