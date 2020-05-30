/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author norma
 */
public class Aviso {
    
    int id=0;
    String titulo="";
    String texto="";
    String resumen="";
    String fecha="";
    String alta="";
    String baja="";
    String tipo="";
    String status="";
    String nombre="";
    
    
    public Aviso(int id, String titulo,String texto,String resumen, String fecha,String alta, String baja, String tipo, String status, String nombre){
        this.id=id;
        this.titulo=titulo;
        this.texto=texto;
        this.resumen=resumen;
        this.fecha=fecha;
        this.alta=alta;
        this.baja=baja;
        this.tipo=tipo;
        this.status=status;
        this.nombre=nombre;
    }
    @Override
   public String toString(){
 return "Aviso "+"\nAviso No."+id+"\nTitulo: "+titulo+"\nPublico: "+nombre+"\nTexto del aviso: "+texto+"\n\nResumen: "+resumen+"\nFecha de publicacion: "+fecha+"\nFecha de alta: "+alta+"\nFecha de baja: "+baja+"Status: "+status;
}


}
