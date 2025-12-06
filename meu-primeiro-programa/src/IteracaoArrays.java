public class IteracaoArrays {
    public static void main(String[] args) {
        int[] numeros = {0,1,2,3,4,5,6,7,8,9} ;

        for(int i = 0; i < numeros.length; i++){
            if(i % 2 == 0) {
                System.out.println("PAR"+numeros[i]);
            } else {
                System.out.println("IMPAR"+numeros[i]);

            }
        }


        String[] emails = new String[5];

        emails[0] = "abc@gmail.com";
        emails[1] = "tfe@gmail.com";
        emails[2] = "pop@gmail.com";
        emails[3] = "lkl@gmail.com";
        emails[4] = "bnb@gmail.com";

        for(int i = 0; i < emails.length; i++){
            System.out.println(emails[i]);;
        }

        for(String email : emails ){
            System.out.println(email);
        }
    }
}
