//Clase precioTotal
public class PrecioTotal {
    //Atributos
    public double totalComputadores;
    public double totalPortatiles;
    public double totalDeMesa;   
    public Computador[] listaComputadores;

    //Constructor
    public PrecioTotal(Computador[] arreglo){

    //Implementar el constructor
        this.listaComputadores = arreglo;
    }

    //Metodos
    public void mostrarTotales(){
            
        for (Computador i :listaComputadores )
        totalComputadores+= i.calcularPrecio();

        for (int i = 0; i < listaComputadores.length; i++)
            if (listaComputadores[i] instanceof Portatil){
                totalPortatiles += listaComputadores[i].calcularPrecio();
            }else if(listaComputadores[i] instanceof DeMesa){
                totalDeMesa += listaComputadores[i].calcularPrecio();
            }       
        System.out.println("La suma del precio de los computadores es de " + totalComputadores);
        System.out.println("La suma del precio de los portatiles es de " + totalPortatiles);
        System.out.println("La suma del precio de los de mesa es de " + totalDeMesa);
        }


}
