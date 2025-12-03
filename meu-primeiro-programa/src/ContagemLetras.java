import java.util.Scanner;

public class ContagemLetras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();

        int quantidadeLetras = 0;

        for(int indice = 0; indice < frase.length(); indice++) {
            char letra = frase.charAt(indice);
            boolean isLetra = Character.isLetter(letra);

            if(isLetra) {
                quantidadeLetras++;
            }
        }


        System.out.println("A quantidade de letras é: " + quantidadeLetras);

        sc.close();
    }
}
