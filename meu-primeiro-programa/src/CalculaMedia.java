import java.util.Scanner;

public class CalculaMedia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

    System.out.println("Digite a noto do primeiro trimestre: ");
    int nota1 = teclado.nextInt();
    System.out.println("Digite a noto do primeiro trimestre: ");
    int nota2 = teclado.nextInt();
    System.out.println("Digite a noto do primeiro trimestre: ");
    int nota3 = teclado.nextInt();


    double media = (nota1 + nota2 + nota3) / 3;
    System.out.println("A média é: " + media);

    boolean isAprovado= false;

    System.out.println("é aluno do 4 ano?: ");
    boolean isAlunoDoQuartoAno = teclado.nextBoolean();

    if(!isAlunoDoQuartoAno){
     System.out.println("Aluno nao inscrito")   ;
    } else {
    if(media > 9) {
        isAprovado = true;
        System.out.println("Aprovado "+ isAprovado);
    } else {
        isAprovado = false;
        System.out.println("Reprovado " + isAprovado);
    }
    }




    teclado.close();
    }
}
