
public class Personaje {

    int vida;
    String nombre;
    AK arma;
    int danio;
/*asignarle vida*/
    public Personaje() {
        this.vida = 100;
    }
/*verificar su nombre*/
    
    public Personaje(String nombre) {
        this();
        this.nombre = nombre;
    }
/*datos de las armas*/ 
    public void equipaArma(int valor) {
        switch (valor) {
            case 1:
                this.arma = new AK("Bronce", 5, 65, 5, 1000, 10, 20);
                this.danio = 10;
                break;
            case 2:
                this.arma = new AK("Plata", 8, 70, 45, 2300, 11, 9.8);
                this.danio = 11;
                break;
            case 3:
                this.arma = new AK("Oro", 10, 85, 4.3, 2500, 13, 9.7);
                this.danio = 13;
                break;
            case 4:
                this.arma = new AK("Diamante", 20, 95, 3, 4000, 20, 9.4);
                this.danio = 20;
                break;
            case 5:
                this.arma = new AK("Adamantium", 30, 100, 1, 1000, 27, 8);
                this.danio = 27;
                break;
        }

    }
/*muestra los datos del personaje que seleccionaste*/
    public String disparar() {
        return " disparando con danio de " + danio + "\n";
    }

    @Override
    public String toString() {
        return "Personaje{" + "vida=" + vida + ", nombre=" + nombre + ", arma=" + arma + '}';
    }

}
    

