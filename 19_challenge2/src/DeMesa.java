public class DeMesa extends Computador {
    //atributos
    double ram = 4;

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
}
