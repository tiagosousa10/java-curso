package estudo.files;

import java.io.*;

public class CriadorArquivo {
    public static void main(String[] args) {
        CriadorArquivo criadorArquivo = new CriadorArquivo();
        criadorArquivo.lerArquivoTexto();

    }

    public void deletarArquivo() {
        File arquivo = new File("/home/tiago/Documents/cursos&Projetos-udemy&youtube/cursos&PROJETOS-udemy&youtube/udemyCURSOS/java-curso/arquivo.txt");
       boolean deletou= arquivo.delete();
       System.out.println("Deletou?" + deletou);
    }

    public void lerArquivo() {
        File arquivo = new File("/home/tiago/Documents/cursos&Projetos-udemy&youtube/cursos&PROJETOS-udemy&youtube/udemyCURSOS/java-curso/arquivo.txt");
        System.out.println("Caminho"+arquivo.getAbsolutePath());
        System.out.println("Nome"+arquivo.getName());
        System.out.println("Tamanho"+arquivo.length());
        System.out.println("É arquivo?"+arquivo.isFile());
    }

    public void criarPasta() {
        File file = new File("/home/tiago/Documents/cursos&Projetos-udemy&youtube/cursos&PROJETOS-udemy&youtube/udemyCURSOS/java-curso/pasta");
        boolean criou = file.mkdir();
        System.out.println("Pasta Criada?"  + criou);
    }

    public void lerArquivoTexto() {
        try {
            File arquivo = new File("/home/tiago/Documents/cursos&Projetos-udemy&youtube/cursos&PROJETOS-udemy&youtube/udemyCURSOS/java-curso/arquivo.txt");
            FileReader fileReader = new FileReader(arquivo);
            BufferedReader reader = new BufferedReader(fileReader);

            String linha ;
            while((linha = reader.readLine()) != null){
                System.out.println(linha);
            }


            reader.close();
        } catch(IOException e) {

        }
    }

    public void criarArquivo() {
        try {
            File arquivo = new File("/home/tiago/Documents/cursos&Projetos-udemy&youtube/cursos&PROJETOS-udemy&youtube/udemyCURSOS/java-curso/arquivo.txt");
            FileWriter fileWriter = new FileWriter(arquivo);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            writer.write("Conteudo novo");

            writer.flush();
            writer.close();

        } catch(Exception e) {
            System.out.println("ocorreu um erro");
        }
    }
}
