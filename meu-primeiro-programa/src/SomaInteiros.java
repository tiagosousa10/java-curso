import java.util.Scanner;

public class SomaInteiros {
    public static void main(String[] args) {
        //ex1.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int p1 = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int p2 = scanner.nextInt();


        int soma = p1 + p2;

        System.out.println("Soma: " + soma);

        scanner.close();
    }
}
