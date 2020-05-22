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
public class SueldoBase {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         float sueldof,porcentaje,valor,total;
         System.out.println("Dime cual fue la venta total del vendedor");
         valor = scan.nextInt();
         porcentaje= (valor*10)/100;
         total= porcentaje+3000;
         System.out.println("El porcentaje que le corresponde es: $" + porcentaje +"\n");
         System.out.println("El total a cobrar por el vendedor es: $"+ total);
    }
}
