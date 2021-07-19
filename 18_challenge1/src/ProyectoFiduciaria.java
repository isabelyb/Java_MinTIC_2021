import java.lang.Math;

public class ProyectoFiduciaria {

    public static void main(String[] args) {

        // PRUEBAS

        // ProyectoFiduciaria objeto = new ProyectoFiduciaria ();
        // String resultado = objeto.diferenciaInteresSimpleYCompuesto(12, 150000, 0.1);
        // System.out.println(resultado);

        // ProyectoFiduciaria objeto = new ProyectoFiduciaria ();
        // String resultado = objeto.diferenciaInteresSimpleYCompuesto(0, 150000, 0.1);
        // System.out.println(resultado);

    }

    public String diferenciaInteresSimpleYCompuesto(int pTiempo, double pMonto, double pInteres) {

        
        double compararInversion = ProyectoFiduciaria.totalInteresCompuesto(pMonto, pInteres, pTiempo) - ProyectoFiduciaria.totalInteresSimple(pMonto, pInteres, pTiempo);

        String resultado;

        if(compararInversion > 0){
            resultado = "La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: $" + compararInversion + "."; 
        }else{
            resultado = "Faltan datos para calcular la diferencia en el total de intereses generados para el proyecto.";
        }

        return resultado;
    
    }


    public static double totalInteresCompuesto(double pMonto, double pInteres, int pTiempo){
        double totalInteresCompuesto = pMonto * ((Math.pow((1 + pInteres), pTiempo)) - 1) ;
        return totalInteresCompuesto;
    }

    public static double totalInteresSimple(double pMonto, double pInteres, int pTiempo){
        double totalInteresSimple = pMonto * pInteres * pTiempo;
        return totalInteresSimple;

    }
}