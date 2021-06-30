// Programa que lea dos números por teclado y muestre el
// resultado de la división del primer número por el segundo. Se
// debe comprobar que el divisor no puede ser cero.


import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("First number: ");
        float first = input.nextFloat();
        System.out.print("Second number: ");
        float second = input.nextFloat();        
        input.close();

        if (second != 0){
            float result = first / second;
            System.out.println(first + " dividided by " + second + " is: " + result);
        } else {
            System.out.println("Second number can\'t be zero\n>>>Try again<<<");
        }

    }
}
