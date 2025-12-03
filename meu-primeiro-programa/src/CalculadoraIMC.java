import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {

        Scanner leitorTeclado = new Scanner(System.in);

        //peso div (altura * altura)
        System.out.println("Digite o seu peso: ");
        float peso = leitorTeclado.nextFloat();
        System.out.println("Digite a sua altura: ");
        float altura = leitorTeclado.nextFloat();


        System.out.println("Resultado: ");
        float resultado = peso / (altura * altura);

        System.out.println("resultado é :" + resultado);

        leitorTeclado.close();
    }
}
