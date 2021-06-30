import java.util.Scanner;

// Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por
// teclado

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type velocity in Km/h: ");
        float velocity = input.nextFloat();
        input.close();
        
        float newVelocity = velocity * 10 / 36;
        

        System.out.println("Your velocity is " + newVelocity + " m/s");
    }
}
