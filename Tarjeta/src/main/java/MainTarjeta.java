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
public class MainTarjeta 
{
    public static void main(String args[])
    {    
        Tarjeta tarjeta;
        Scanner scan = new Scanner(System.in);
        int nCuenta, NIP;
        int opcion;
        System.out.print("Número de cuenta: ");
        nCuenta = scan.nextInt();
        System.out.print("NIP: ");
        NIP = scan.nextInt();
        tarjeta=new Tarjeta().verificarCuenta(nCuenta,NIP);
        
        do
        {
            System.out.println("¿Qué operación desea realizar?");
            System.out.println("1.- Depósito");
            System.out.println("2.- Retiro");
            System.out.println("3.- Eliminar apartado");
            System.out.println("4.- Imprimir los datos de su cuenta");
            System.out.println("5.- Salir");
            System.out.print("Opción: ");
            opcion = scan.nextInt();
            
            switch(opcion)
            {
                case 1:
                    System.out.print("Monto a depositar: ");
                    tarjeta.Deposito(scan.nextDouble());
                    break;
                    
                case 2:
                    System.out.print("Monto a retirar: ");
                    tarjeta.Retiro(scan.nextDouble());
                    break;
                    
                case 3:
                    tarjeta.EliminarApartado();
                    System.out.println("Apartado eliminado");
                    break;
                
                case 4:
                    System.out.println(tarjeta.toString());
                    break;
            }
        }while(opcion != 5);
        System.out.println("Puede retirar su Tarjeta");
       
        
        
    }
}
