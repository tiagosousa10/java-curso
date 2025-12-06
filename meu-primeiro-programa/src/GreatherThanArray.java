import java.util.Random;

public class GreatherThanArray {
    public static void main(String[] args) {
        int[] array = new int[10];

        Random random = new Random();
        double soma = 0;
        int contador = 0;

        for(int i = 0; i< array.length; i++){
            array[i] = random.nextInt(50) +1;
            if(array[i] > 25) {
            soma += array[i];
            contador++;
            }
        }

        if(contador <= 0) {
            System.out.println("Nao existe valores");
        } else {
            double media = soma/ contador;
            System.out.println("media: " + media);
        }
    }
}
