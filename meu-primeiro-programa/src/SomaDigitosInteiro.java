public class SomaDigitosInteiro {
    public static void main(String[] args) {
        int numero = 12345;
        int soma = 0;

        while(numero != 0) {
            soma += numero %10;
            numero /= 10;
        }

        System.out.println(soma);
    }
}
