import java.util.Scanner;

public class LoopComDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int numero ;

        do {
        System.out.print("Enter a number: ");
            numero = sc.nextInt();
        } while (numero < 1 || numero > 10);


        System.out.print(numero);

        sc.close();


    }
}
