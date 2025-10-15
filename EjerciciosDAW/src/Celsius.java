import java.util.Scanner;

public class Celsius {
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Introduce los grados Celsius: ");
            int celsius = scanner.nextInt();

            int fahrenheit = celsius * 9 / 5 + 32;

            System.out.println("Temperatura en Celsius: "+celsius);
            System.out.println("Temperatura en Fahrenheit: "+fahrenheit);

            scanner.close();
        }
    }
}
