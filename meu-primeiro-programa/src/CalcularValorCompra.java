import java.util.Scanner;

public class CalcularValorCompra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de maças: ");
        int quantidade = sc.nextInt();


        double precoUnidade;
        if(quantidade < 12) {
            precoUnidade = 0.30;
        } else {
            precoUnidade = 0.25;
        }


        double valorTotal = precoUnidade * quantidade;
        System.out.println("Valor total de compras: " + valorTotal);


        sc.close();
    }
}
