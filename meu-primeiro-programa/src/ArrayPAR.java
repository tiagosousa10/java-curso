import java.util.Random;

public class ArrayPAR {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Random rand = new Random();

        for(int i = 0; i< numeros.length; i++) {
            numeros[i] = rand.nextInt(100);
        }

        int indicePar = -1;
        for(int i = 0; i< numeros.length; i++) {
            if(numeros[i] % 2 == 0) {
                indicePar = i;
                break;
            }
        }

        if(indicePar != -1) {
            System.out.println("Primeiro Par" + indicePar);
        } else {
            System.out.println("Nenhum Primeiro Par");
        }
    }
}
