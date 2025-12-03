import java.util.Scanner;

public class PositivoNegativoZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = sc.nextInt();

        if(valor == 0 ) {
            System.out.println("ZERO");
        } else if( valor < 0 ) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("POSITIVO");
        }

        sc.close();
    }
}
