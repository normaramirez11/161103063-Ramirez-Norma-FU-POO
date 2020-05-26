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
public class Signo {
    public static void main(String[] args) {
    Scanner da=new Scanner(System.in);
    int reset;
    do {
    System.out.println("¿Quieres saber tu signo zodiacal");
    System.out.println("En que mes naciste? \n1.-Enero\n2.-Febrero\n3.-Marzo\n4.-Abril\n5.-Mayo\n6.-Junio"
            + "\n7.-Julio\n8.-Agosto\n9.-Septiembre\n10.-Octubre\n11.-Noviembre\n12.-Diciembre");
    System.out.println();
    int mes=da.nextInt();
    System.out.println("¿Que dia naciste?");
    System.out.println();
    int dia=da.nextInt();
    if(dia>=22 && dia<=31 && mes==12 || dia>=1 && dia<=20 && mes==1){
        System.out.println("Tu signo zodiacal es CAPRICORNIO");
    }else if (dia>=21 && dia<=31 && mes==1 || dia>=1 && dia<=19 && mes==2){
        System.out.println("Tu signo zodiacal es ACUARIO");
    }else if (dia>=20 && dia<=29 && mes==2 || dia>=1 && dia<=20 && mes==3){
        System.out.println("Tu signo zodiacal es PISCIS");
    }else if (dia>=21 && dia<=31 && mes==3 || dia>=1 && dia<=19 && mes==4){
        System.out.println("Tu signo zodiacal es ARIES");
    }else if (dia>=20 && dia<=30 && mes==4 || dia>=1 && dia<=20 && mes==5){
        System.out.println("Tu signo zodiacal es TAURO");
    }else if (dia>=21 && dia<=31 && mes==5 || dia>=1 && dia<=21 && mes==6){
        System.out.println("Tu signo zodiacal es GÉMINIS");
    }else if (dia>=22 && dia<=30 && mes==6 || dia>=1 && dia<=21 && mes==7){
        System.out.println("Tu signo zodiacal es CANCER");
    }else if (dia>=22 && dia<=31 && mes==7 || dia>=1 && dia<=21 && mes==8){
        System.out.println("Tu signo zodiacal es LEO");
    }else if (dia>=22 && dia<=31 && mes==8 || dia>=1 && dia<=22 && mes==9){
        System.out.println("Tu signo zodiacal es VIRGO");
    }else if (dia>=23 && dia<=30 && mes==9 || dia>=1 && dia<=22 && mes==10){
        System.out.println("Tu signo zodiacal es LIBRA");
    }else if (dia>=23 && dia<=31 && mes==10 || dia>=1 && dia<=21 && mes==11){
        System.out.println("Tu signo zodiacal es ESCORPIO");
    }else if (dia>=22 && dia<=30 && mes==11 || dia>=1 && dia<=21 && mes==12){
        System.out.println("Tu signo zodiacal es SAGITARIO");
    }
    else{
        System.out.println("Error de fecha");
    }
    System.out.println("¿Te gustaria consultar otro signo? [Si-1/No-2]");
    reset=da.nextInt();
    }while (reset==1);
    }
}
    

