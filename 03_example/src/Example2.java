import java.util.Scanner;  //Para que  funcione Scanner

public class Example2 {  //nombre de la clase
    public static void main(String[] args) { //función estática
        var sc = new Scanner(System.in); // Instanciando objeto sc para capturar el System.in

        System.out.print("Type an int number: "); //Imprimir en consola
        var number = sc.nextInt(); // capturar como un numero entero de 32 bits
    
        var digits = numberDigits(number); //Obtiene la cantidad de dígitos de la función NumberDigits()
        System.out.println("The number has " + digits + " digits");  //String de salida

    }

    public static int numberDigits(int number){  //función estática que regresa int
        var digits = 0; //Inicializando variable en 0
        while (number != 0) { //Mientras número diferente de cero
            number /= 10; // divida el número en en 10
            digits++; // sume cada iteración
        }

        return digits; //último resultado de la iteración
    }
}
