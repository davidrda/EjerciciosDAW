import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {
        // Declaro un Objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Pedimos información al usuario
        System.out.println("Introduce el número 1: ");
        int num1 = scanner.nextInt();

        System.out.println("Introduce el número 2; ");
        int num2 = scanner.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;

        // Muestro info
        System.out.println("Suma: "+suma);
        System.out.println("Resta: "+resta);
        System.out.println("Multiplicación: "+multiplicacion);
        System.out.println("División: "+division);

        // Cierro Scanner
        scanner.close();

    }
}
