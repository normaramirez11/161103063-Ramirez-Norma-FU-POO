/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author norma
 */
public class Tarjeta {
    int nCuenta;
    String nombre;
    int dia; 
    int mes;
    int anio;
    int cv;
    double monto;
    double apartado;
    
    public Tarjeta(int nCuenta, String nombre,int dia, int mes, int anio,int cv,double monto,double apartado){
        this.nCuenta=nCuenta;
        this.nombre=nombre;
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
        this.cv=cv;
        this.monto=monto;
        this.apartado=apartado;
    }
     public void verificarCuenta(int noCuenta,int NIP)
    {
        if(noCuenta == 123123 && NIP ==1133)
        {
            System.out.println("Eres la cuenta de Eduardo Diaz Flores");
            
        }
        else if(noCuenta == 456789 && NIP==3367)
        {
            System.out.println("Eres la cuenta de Kevin Mesa Gonzalez");
        }
        else 
            System.out.println("El cliente no existe");
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "noCuenta=" + nCuenta + ", nombre=" + nombre + ", dia=" + dia + ", mes=" + mes + ", anio=" + anio + ", cv=" + cv + ", monto=" + monto + ", apartado=" + apartado + '}';
    }
    
}
