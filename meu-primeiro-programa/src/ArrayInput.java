import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.print("Introduz o valor: ");
        for(int i = 0; i< numeros.length; i++){
            numeros[i] = input.nextInt();
        }

        int soma = 0;
        for(int num : numeros) {
            soma = soma + num;
        }


        double media = soma/numeros.length;

        System.out.println("MEdia "+  media);


        input.close();



        double[] n = {10.5,23.2,4.7,18.1,33} ;
        double maior = n[0];
        for(int i = 0; i< n.length; i++){
            if(n[i] > maior) {
                maior = n[i];
            }
        }

        System.out.println("Maior valor: "+maior);

    }
}
