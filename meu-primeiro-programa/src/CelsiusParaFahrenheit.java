import java.util.Scanner;

public class CelsiusParaFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da TEMPERATURA: ");
        double temp = sc.nextDouble();
        double tempFahrenheit = (temp + 9/5) +32;

        System.out.println("Temperatura em FAHRENHEIT: "+ tempFahrenheit);

        sc.close();


    }
}
