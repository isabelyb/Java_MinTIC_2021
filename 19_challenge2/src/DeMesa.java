public class DeMesa extends Computador {
    //atributos
    double ram = 4;
    private double factor;

    //constructores
    public DeMesa(double precioBase, double ram){
        this.precioBase = precioBase;
        this.ram = ram;
        }

    public DeMesa(double pantalla, double precioBase, double ram){
        this.pantalla = pantalla;
        this.precioBase = precioBase;
        this.ram = ram;
        }

    public DeMesa(double ano, double pantalla, double precioBase, double ram){
        this.ano = ano;
        this.pantalla = pantalla;
        this.precioBase = precioBase;
        this.ram = ram;
        }

    //Metodos
    public double calcularPrecio(){
        double precioFinal = precioBase * factor;
        if (ram < 4){
            factor = 0.9;
        } else if (ram > 12){
            factor = 1.3;
        } else {
            factor = 1.1;
        }
    return precioFinal;
    }
        
}
