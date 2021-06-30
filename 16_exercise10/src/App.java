// Programa que lea por teclado tres números enteros H, M, S
// correspondientes a hora, minutos y segundos respectivamente, y
// comprueba si la hora que indican es una hora válida.


import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Type hour: "); 
        Integer H = input.nextInt();
        System.out.print("Type minutes: "); 
        int M = input.nextInt();
        System.out.print("Type seconds: "); 
        int S = input.nextInt();
        input.close();

        if (H >= 0 & H < 24){
            if (M >= 0 & M < 61){
                if (S >= 0 & S < 61){
                    System.out.println("The time is " + H + ":"+ M + ":"+ S);
                } else {
                    System.out.println("Please, type correct seconds");
                }
            } else {
                System.out.println("Please, type correct minutes");
            }
        } else {
            System.out.println("Please, type a correct hour");
        }
    }
}

