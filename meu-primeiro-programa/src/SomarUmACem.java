public class SomarUmACem {
    public static void main(String[] args) {
        for(int i = 0; i <= 100; i++) {
            int soma = 0;
            soma = soma + i;

            System.out.println(soma);
        }

        int i = 1;
        int sum = 0;

        while ( i <= 100) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
