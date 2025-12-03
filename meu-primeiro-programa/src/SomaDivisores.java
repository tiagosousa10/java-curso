public class SomaDivisores {
    public static void main(String[] args) {
        int numero = 28;
        int somaDivisores = 0;

        for(int i = 1; i < numero; i++) {
            if(numero % i == 0 ) {
                somaDivisores += i;
            }
        }

        if(somaDivisores == numero) {
            System.out.println("o numero é perfeito");
        } else {
            System.out.println("o numero NAO  é perfeito");

        }
    }
}
