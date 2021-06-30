import java.util.Scanner;

// Programa que lea dos variables enteras N y m y le quite a N sus m últimas
// cifras.
// Por ejemplo, si N = 123456 y m = 2 el nuevo valor de N será 1234.

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("N: ");
        Integer number = input.nextInt();
        System.out.print("m: ");
        Integer minus = input.nextInt();
        input.close();

        String stringNumber = number.toString();  //Convertir N a string
        int lenNumber = stringNumber.length(); // Averiguar longitud de string
        String newNumber =  stringNumber.substring(0, (lenNumber - minus)); // Slice de N - m


        System.out.println("The new number is: " + newNumber);

        
    }
}
