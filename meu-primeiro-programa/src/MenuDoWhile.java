import java.util.Scanner;

public class MenuDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 0;
        do {
            System.out.println("Digite uma opcao do menu");
            System.out.println("1. Sandwiche");
            System.out.println("2. Pizza");
            System.out.println("3. Sorvete");
            System.out.println("0. Sair");

            opcao = sc.nextInt();

            if(opcao == 0) {
                System.out.println("Saindo do sistema");
            } else if (opcao == 1) {
                System.out.println("Pegou um Sandwiche");
            } else if (opcao == 2) {
                System.out.println("Pegou um Pizza");
            } else {
                System.out.println("Pegou um Sorvete");
            }
        }while(opcao != 0);
        sc.close();
    }


}
