import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu altura: ");
        double altura = sc.nextDouble();

        System.out.println("Digite o sexo: ");
        int sexo = sc.nextInt(); //1(F) e 2(M)


        double pesoIdeal;
        if(sexo == 1 ){
            pesoIdeal = (62.1 * altura) -44.7;
        } else if(sexo == 2) {
            pesoIdeal = (72.7 * altura) - 58;
        } else {
            System.out.println("Sexo invalido");
            return;
        }

        System.out.println("Peso Ideal: " + pesoIdeal);

        sc.close();
    }
}
