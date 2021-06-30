// El programa lee por teclado tres números enteros y
// muestra el mayor de los tres.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Type the first integer number: "); 
        int first = input.nextInt();
        System.out.print("Type the second integer number: "); 
        int second = input.nextInt();
        System.out.print("Type the third integer number: "); 
        int third = input.nextInt();
        input.close();

        if (first > second & first > third){
            System.out.println(first + " is the largest number");
        } else if (second > first & second > third){
            System.out.println(second + " is the largest number");
        } else {
            System.out.println(third + " is the largest number");
        }
    }
}