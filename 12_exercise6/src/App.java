// Programa que lea un número entero y muestre si el número es
// múltiplo de 10.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Type an integer number: ");
        int number = input.nextInt();
        input.close();

        if (number % 10 == 0){
            System.out.println(number + " is multiple of 10");
        } else {
            System.out.println(number + " is not multiple of 10");
        }
    }
}
