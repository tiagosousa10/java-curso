package estudo.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class CriadorArquivo {
    public static void main(String[] args) {

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
