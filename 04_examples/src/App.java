package src;  //ubicación del archivo
import java.util.Scanner; //importar Scanner

class Program{ //Nombre del programa principal
    public static void main(String[] args){
        Integer userNumber = ReadNumber();   //Clase nombre = valor; en este caso es una función que me lle  el número
        OddOrEven(userNumber); //averiguar par o impar
        float fahrenheit = ConversorCtoF(userNumber); //definir variable para poderla llamar en el  print -> Clase nombre = valor;
        System.out.println("2. Temperature in Fahrenheit is: " + fahrenheit);
        }
   

    public static void Saludo(String nombre){
        System.out.print("Hola " + nombre + "!");
    }

    public static float ConversorCtoF(float tCelcius){  //Convertir celsius a fahrenheit
        float tFahrenheit = 32 + ( 9 * tCelcius / 5 );
        return tFahrenheit;
    }

    public static void OddOrEven(Integer number){ //Número par o impar}
        if (number % 2 == 0 ){
            System.out.println("\n1. Number is Even");
        }
        else{
            System.out.println("\n2. Number is Odd");
        }
    }

    public static Integer ReadNumber(){ //Función que captura el número
        Scanner read = new Scanner(System.in); //Capturar un valor de consola
        System.out.println("\n>>>This program is for<<<\n\n1. Verify if is an even number or an odd number\n2. Convert Temperature from Celsius to Fahrenheit\n"); // Información en Consola
        System.out.print("-> Type a number: "); //Solicitud de número
        int number = read.nextInt(); //Variable tipo entero -> capturar entero 
        read.close(); //Cerrar el Stream, toda transmisión de datos, porque consume muchos recursos.
        return number; //Retornar número
    }

}
