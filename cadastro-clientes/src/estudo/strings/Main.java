package estudo.strings;

public class Main {
    static String valor = "Arroz";

    public static void main(String[] args) {
        tamanhoString();
        pegarCaracteres();
        trabalhandoComSubstring();
        exemploIndexOf();
    }

    private static void tamanhoString() {
        int tamanho = valor.length();
        System.out.println("Tamanho: " + tamanho);
    }

    private static void pegarCaracteres() {
        char caractere = valor.charAt(0);
        char ultimo = valor.charAt(valor.length() -1);
        System.out.println("primeiro caractere: " + caractere + " e " + ultimo);
    }

    private static void trabalhandoComSubstring() {
    String pedaco = valor.substring(0, 2);
    System.out.println(pedaco);
    }

    private static void exemploIndexOf() {
        int indice = valor.indexOf("R"); // -1 é nao encontrado
        System.out.println("indice da letra a: " + indice);

        String nome = "Pedro da Silva";

        indice = valor.indexOf("Silva");

        System.out.println(("Indice encontrado: " + indice));

        if(nome.indexOf("Sousa") != -1){
            System.out.println("Encontrei! + " + nome);

        } else {
            System.out.println("Não encontrei.");
        }

    }
}
