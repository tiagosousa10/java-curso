import java.util.Scanner;

public class VerificarVoto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dataNascimento: ");
        int dataNascimento = sc.nextInt();

        System.out.println("Digite dataAtual: ");
        int dataAtual = sc.nextInt();

        int idade = dataAtual - dataNascimento;

        if(idade < 18) {
            System.out.println("Nao pode Votar.");
        } else {
            System.out.println("Pode Votar.");
        }


        sc.close();
    }
}
