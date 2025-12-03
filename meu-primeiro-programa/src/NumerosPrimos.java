public class NumerosPrimos {
    public static void main(String[] args) {
        for(int numero = 2; numero <= 50; numero++) {
            boolean isPrimo = true;
            for(int j = 2; j < numero; j++) {
                if(numero % j == 0) {
                    isPrimo = false;
                    break;
                }
            }

            if(isPrimo) {
                System.out.println(numero + "é primo.");
            }
        }
    }
}
