public class AK 
{
    String tipo;
    int cargador;
    int precision;
    double velocidadCarga;
    double precio;
    int daño;
    double velocidadDisparo;
    
     public AK(String tipo, int cargador, int precision, double velocidadCarga, double precio, int daño, double velocidadDisparo)
    {
        this.tipo = tipo;
        this.cargador = cargador;
        this.precision = precision;
        this.velocidadCarga = velocidadCarga;
        this.precio = precio;
        this.daño = daño;
        this.velocidadDisparo = velocidadDisparo;
    }
    
    public AK(){}  
    
    public void disparar()
    {
        System.out.println("Te estoy disparando con un daño de: "); 
    }
    public void apuntar()
    {
        
    }
    public void recargar()
    {
        
    }

    @Override

   
    public String toString() {
        return "AK{" + "tipo=" + tipo + ", cargador=" + cargador + ", precision=" + precision + ", velocidadCarga=" + velocidadCarga + ", precio=" + precio + ", da\u00f1o=" + daño + ", velocidadDisparo=" + velocidadDisparo + '}';
    }
    
}
