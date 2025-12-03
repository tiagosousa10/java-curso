import java.util.Scanner;

public class TipoTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o lado1: ");
        double lado1 = sc.nextDouble();

        System.out.println("Digite o lado2: ");
        double lado2 = sc.nextDouble();

        System.out.println("Digite o lado3: ");
        double lado3 = sc.nextDouble();

        if(lado1 == lado2 && lado2 == lado3) {
            System.out.println("Equilátero");
        } else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Escaleno");
        }


        sc.close();

    }
}
