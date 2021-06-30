// Programa que lea un carácter por teclado y compruebe si es
// una letra mayúscula.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Type a letter: ");
        String character = input.nextLine();
        input.close();

        if (character == character.toUpperCase()){
            System.out.println("Your character is a capital letter");
        } else {
            System.out.println("Your character is not a capital letter");
        }
    }
}
