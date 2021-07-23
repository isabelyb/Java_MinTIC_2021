//Clase Computador
public class Computador{
    //Atributos
    public double ano = 2019;
    public double pantalla = 16;
    public double precioBase = 1570500;

    //Constructores
    public Computador(){
        }

    public Computador(double precioBase){
        this.precioBase = precioBase;
        }
    
    public Computador(double pantalla, double precioBase){
        this.pantalla = pantalla;
        this.precioBase = precioBase;
        }

    public Computador(double ano, double pantalla, double precioBase){
        this.ano = ano;
        this.pantalla = pantalla;
        this.precioBase = precioBase;
        }

    //Metodos
    public double calcularPrecio(){
        double precioFinal = precioBase * double factor;
    return precioFinal;
    }
    

}
        

        