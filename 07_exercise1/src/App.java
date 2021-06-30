// Programa que pida por teclado la fecha de nacimiento de una persona
// (día, mes, año) y calcule su número de la suerte.
// El número de la suerte se calcula sumando el día, mes y año de la fecha
// de nacimiento y a continuación sumando las cifras obtenidas en la suma.
// Por ejemplo:
// Si la fecha de nacimiento es 12/07/1980
// Calculamos el número de la suerte así: 12+7+1980 = 1999 1+9+9+9 =
// 28
// Número de la suerte: 28

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); //Crear input
        System.out.println("Hello, This program give you the lucky number!");
        System.out.print("Type your birth_day: ");
        Integer day = input.nextInt();
        System.out.print("Type your month_day: ");
        Integer month = input.nextInt();
        System.out.print("Type your year_day: ");
        Integer year = input.nextInt();
        input.close();
        
        Integer totalSum = day + month + year;// 1. Sumar los datos ingresados
        String totalSumString = totalSum.toString(); //2. pasar la suma a string

        Integer luckyNumber = 0; //Inicializar en cero
        for(int  i = 0; i<totalSumString.length();i++){ // Mientras i < número de dígitos, contar
            luckyNumber += //2.4. Sumatoria de sus dígitos (Posición en la cadena)
                Integer.parseInt( //2.3. Recibe string y lo vuelve int
                    String.valueOf( //2.2. convierte nuevamente a string
                        totalSumString.charAt(i) //2.1. Retorna caracter en índice
                    )
                );
        }; 
        System.out.println("Your Lucky Number is: " + luckyNumber);
    }
}
