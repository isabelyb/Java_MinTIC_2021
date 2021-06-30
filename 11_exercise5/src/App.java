// Programa que lea la longitud de los catetos de un triángulo rectángulo y
// calcule la longitud de la hipotenusa según el teorema de Pitágoras.

import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
        System.out.print("Side a: ");
        float a = input.nextFloat();
        System.out.print("Side b: ");
        float b = input.nextFloat();
        double c = Math.pow((a*a + b*b), 0.5);  
        input.close();
        
        System.out.println("Hypotenuse: " + c);
    }
}
