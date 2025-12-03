import java.util.Scanner;


public class CalculadoraIdade {
    public static void main(String[] args) {
        //pegar ano atual
        //ano de nascimento

        //substrair o ano atual - ano de nascimento

        Scanner teclado = new Scanner(System.in);


        System.out.println("Digite o ano atual: ");
        int anoAtual = teclado.nextInt();
        System.out.println("Digite o ano de nascimento: ");
        int anoNascimento = teclado.nextInt();

        System.out.println("Resultado: ");
        int resultado = anoAtual - anoNascimento;

        System.out.println(resultado);
    }
}
