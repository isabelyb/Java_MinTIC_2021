public class Portatil extends Computador {
    //Atributos
    public boolean tarjetaDeVideo = false;


    //Constructores
    public Portatil(double precioBase, boolean tarjetaDeVideo){
        super(precioBase);
        this.tarjetaDeVideo = tarjetaDeVideo;
        }
    
    public Portatil(double pantalla, double precioBase, boolean tarjetaDeVideo){
        super(pantalla,precioBase);
        this.tarjetaDeVideo = tarjetaDeVideo;
        }
    
    public Portatil(double ano, double pantalla, double precioBase, boolean tarjetaDeVideo){
        super(ano, pantalla, precioBase);
        this.tarjetaDeVideo = tarjetaDeVideo;
        }

    //Metodos
    public double calcularPrecio(){
        double factor;
        if (tarjetaDeVideo == true){
            factor = 1.2;
        } else {
            factor = 1;
        }
        double precioFinal = precioBase * (ano/2021) * ( pantalla/16) * factor;
        return precioFinal;
    }
}

