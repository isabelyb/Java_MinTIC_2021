//Inicio de la solucion
public class App{
    public static void main(String[] parametrosDeConsola){
    //Ejemplo de como se evaluaran las soluciones: Solucion prueba 1 
    
    //Inicializacion de la lista de computadores
    Computador[] arregloComputadores = new Computador[5];
    
    //Definicion de cada componente de la lista
    arregloComputadores[0] = new Computador(1200000);
    arregloComputadores[1] = new Computador(19,1600000);
    arregloComputadores[2] = new DeMesa(1300000,8);
    arregloComputadores[3] = new Portatil(2016,21,1650000,true);
    arregloComputadores[4] = new Portatil(1900000,false);
    
    //Inicializacion de la solucion (Clase PrecioTotal)
    PrecioTotal solucion = new PrecioTotal(arregloComputadores);
    //Mostrar Totales
    solucion.mostrarTotales();
    }
}
    