// Programa que calcule el precio de venta de un producto conociendo el precio
// por unidad (sin IVA) del producto, el número de productos vendidos y el
// porcentaje de IVA aplicado. Los datos anteriores se leerán por teclado.

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Crear el input
        System.out.println("How many products do you buy? "); //Pregunta
        int products = input.nextInt(); // Capturar input
        System.out.println("How much is the price per unit? "); //Pregunta
        float gross_price = input.nextFloat(); // Capturar input
        System.out.println("What is the pertentage for IVA? "); //Pregunta
        int iva = input.nextInt(); // Capturar input
        input.close(); //Cerrar el stream
        float net_price = gross_price + ((gross_price * iva )/100);
        float bill = products  * net_price;
        System.out.println("The total bill is $" + bill); //Respuesta
    }
}


