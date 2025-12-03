import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao ;
        double valorTotal = 0;


        do {
            System.out.println("Digite uma opcao do menu");
            System.out.println("1. Sandwiche");
            System.out.println("2. Pizza");
            System.out.println("3. Sorvete");
            System.out.println("0. Sair");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Sandwiche");
                    valorTotal += 10;
                    break;
                case 2:
                    System.out.println("Pizza");
                    valorTotal += 20;
                    break;
                case 3:
                    System.out.println("Sorvete");
                    valorTotal += 7;
                    break;
                case 0:
                    System.out.println("Finalizando o pedido");
                    break;

                default:
                    System.out.println("Escolha uma opcao valida");
            }


        }while (opcao != 0);


        System.out.println("Valor total "+ valorTotal);
        sc.close();
    }
}
