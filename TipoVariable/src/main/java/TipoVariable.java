/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author norma
 */
public class TipoVariable {
    
    public static void main(String args[]){
        //
        /*
        Fuertemente tipado
        
        */
        int a=10,b=2;
        //operaciones aritmeticas
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        
       
        //tipos flotantes
        float pi=3.14f;
        double pi2=3.14;
        
        //cambios de variable
        boolean bandera=true;
        //Ingresar caracteres
        char letra='a';
        String palabra="Puedes poner un mensaje largo";
        
        System.out.println(palabra);
        
        //concatenar
        System.out.println(palabra+" y esta es una prueba de ello");
        
        System.out.println("Este es el valor del pi"+pi);
        System.out.println("Este es el valor del circulo"+pi*a);
        
        
    }
}
