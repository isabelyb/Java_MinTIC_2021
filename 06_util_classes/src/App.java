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
        
        Integer totalSum = day + month + year;
        String totalSumString = totalSum.toString(); //pasar a string

        Integer luckyNumber = 0; //Inicializar en cero
        for(int  i = 0; i<totalSumString.length();i++){ // Mientras i < número de dígitos, contar
            luckyNumber += //Sumatoria de sus dígitos (Posición en la cadena)
                Integer.parseInt( //Recibe string y lo vuelve int
                    String.valueOf( //convierte nuevamente a string
                        totalSumString.charAt(i) //Retorna caracter en índice
                    )
                );
        }; 
        System.out.println("Your Lucky Number is: " + luckyNumber);
    }
}
