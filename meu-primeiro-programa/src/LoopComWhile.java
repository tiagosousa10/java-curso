import java.util.Scanner;

public class LoopComWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int contador = sc.nextInt();

        int valor = 1;

        while(valor <= contador) {
            if(valor % 2 == 0) {
            System.out.println("Numero PAR " + valor);
            } else {
            System.out.println("Numero IMPAR " + valor);
            }
            valor++;
        }

        sc.close();
    }

}
