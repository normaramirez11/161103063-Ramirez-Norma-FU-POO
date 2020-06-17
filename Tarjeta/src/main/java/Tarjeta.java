public class Tarjeta 
{
    int nCuenta;
    int NIP;
    String nombre;
    int dia, mes, año;
    int cv;
    double montoDisponible;
    double montoApartado;
    
    public Tarjeta(){}
    
    public Tarjeta(int nCuenta, int NIP, String nombre, int dia, int mes, int año, int cv, double montoDisponible, double montoApartado)
    {
        this.nCuenta = nCuenta;
        this.NIP = NIP;
        this.nombre = nombre;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.cv = cv;
        this.montoDisponible = montoDisponible;
        this.montoApartado = montoApartado;
        
}
    
   public Tarjeta verificarCuenta(int nCuenta, int NIP)
    {
        if(nCuenta == 123123 && NIP == 1133)
        {
            return new Tarjeta(123123, 1133, "Eduardo Díaz Flores",31,12,2032, 542, 45987.22, 550);
        }
        else if(nCuenta == 456789 && NIP == 3367)
        {    
            return new Tarjeta(456789, 3367, "Kevin Meza González",31,12,2032, 544, 360, 5322.23);
        }
        else
            return new Tarjeta() ;
    }
    
    public void Deposito(double deposito)
    {
        this.montoDisponible = this.montoDisponible + deposito;
    }
    public void verificarRetiro(double retiro){
        if (retiro<=this.montoDisponible ){
            retiro(retiro);
            System.out.println("Retiro realizado\n");
            
        }else{
            System.out.println("No hay saldo suficiente");
        }
    }
    
    public void retiro(double retiro){
        this.montoDisponible=this.montoDisponible - retiro;

    }
    
    public void Apartado(){
        this.montoDisponible=this.montoDisponible+this.montoApartado;
        this.montoApartado=0;
    }
    
    public void verificarApartado(double apartado){
        if (apartado<=this.montoDisponible){
            crearApartado(apartado);
            System.out.println("Apartado realizado");
            
        }else{
            System.out.println("No hay saldo suficiente");
        }
    }
    
    public void crearApartado(double apartado){
        this.montoApartado=this.montoApartado+apartado;
        this.montoDisponible=this.montoDisponible- this.montoApartado;
        
    }
    public double Total()
    {
        return this.montoDisponible + this.montoApartado;
    }

    @Override
    public String toString() {
        return " nCuenta=" + nCuenta +"\n NIP="+NIP+ "\n nombre= " + nombre + "\n Fecha de vencimiento" 
                + dia + "/" + mes + "/" + año + "\n cv= " + cv + "\n montoDisponible=" + this.montoDisponible + "\n montoApartado= " + montoApartado + "\n Total=" 
                + this.Total();
    }
    
    
}