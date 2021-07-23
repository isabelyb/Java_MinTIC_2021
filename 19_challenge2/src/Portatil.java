public class Portatil extends Computador {
    //Atributos
    public boolean tarjetaDeVideo = false;

    //Constructores
    public Portatil(double precioBase, boolean tarjetaDeVideo){
        this.precioBase = precioBase;
        this.tarjetaDeVideo = tarjetaDeVideo;
        }
    
    public Portatil(double pantalla, double precioBase, boolean tarjetaDeVideo){
        this.pantalla = pantalla;
        this.precioBase = precioBase;
        this.tarjetaDeVideo = tarjetaDeVideo;
        }
    
    public Portatil(double ano, double pantalla, double precioBase, boolean tarjetaDeVideo){
        this.pantalla = pantalla;
        this.precioBase = precioBase;
        this.tarjetaDeVideo = tarjetaDeVideo;
        this.ano = ano;    
        }
        
}
