import java.util.Scanner;

public class PerimetroAreaRetangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor da largura: ");
        double largura = teclado.nextDouble();

        System.out.println("Digite o valor da comprimento: ");
        double comprimento = teclado.nextDouble();

        double perimetro = 2 * (largura + comprimento);
        double area = largura * comprimento;

        System.out.println("Perimetro: " + perimetro);
        System.out.println("Area: " + area);

        teclado.close();
    }
}
