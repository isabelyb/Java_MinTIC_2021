
public class PrecioTotal extends Computador {
    //Atributos
    double totalComputadores;
    double totalPortatiles;
    double totalDeMesa;
    Computador[] listaComputadores;

    //Constructor
    public PrecioTotal(Computador[] arreglo){
    //Implementar el constructor
    this.listaComputadores = listaComputadores;
            }
    
    //Metodos
    public void mostrarTotales(){
     
    //Inicializacion de las sumatorias
    totalComputadores = 0;
    totalPortatiles = 0;
    totalDeMesa = 0;
    
    //For para recorrer todos los elementos de la lista Para ir sumando a traves de los elementos el precioFinal de cada elemento
    for (int i = 0; i < listaComputadores.length; i++){
        System.out.println("La suma del precio de los computadores es de " + totalComputadores);
    }


    //Mostrar los resultados
    
    System.out.println("La suma del precio de los portatiles es de " + totalPortatiles);
    System.out.println("La suma del precio de los de mesa es de " + totalDeMesa);

    
}
}

