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
public class CalcularCuboNumero {
    public static void main (String []args){
        Scanner Sca=new Scanner(System.in);
        System.out.print("Ingrese un numero");
        int cubo=Sca.nextInt();
        
        int resultado=cubo*cubo*cubo;
        System.out.print("El numero elevado al cubo es"+resultado);
    }
}
