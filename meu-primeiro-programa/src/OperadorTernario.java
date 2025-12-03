public class OperadorTernario {
    public static void main(String[] args) {
        int idade = 20;
        int idadeMinima = 18;
        int anoNascimento = 2000;


        if (idade > idadeMinima && anoNascimento >= 2000 && idadeMinima <20) {
            System.out.println("AND &&");

        }

        if(idade > idadeMinima || anoNascimento >= 2000) {
            System.out.println("OR ||");
        }

        String deMaior = idade >= 18 ? "Sim" : "Nao";

        System.out.println(deMaior);
    }
}
