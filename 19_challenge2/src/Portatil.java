public class Portatil extends Computador {
    //Atributos
    public boolean tarjetaDeVideo = false;
    private double factor;


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

    //Metodos
    public double calcularPrecio(){
        double precioFinal = precioBase * factor;
        if (tarjetaDeVideo == true){
            factor = 1.2;
        } else {
            factor = 1;
        }
    return precioFinal;
    }



        
}
