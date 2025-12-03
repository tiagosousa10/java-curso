import java.util.Scanner;

public class QuadradoNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero: ");
        double numero = scanner.nextDouble();

        double quadrado = numero * numero;

        System.out.println("Quadrado: " + quadrado);


        scanner.close();
    }
}
