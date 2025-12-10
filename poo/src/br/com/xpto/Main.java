package br.com.xpto;


public class Main {
    public static void main(String[] args) {
        br.com.xpto.concessionario.Pessoa pessoaConcessionaria = new br.com.xpto.concessionario.Pessoa();
        br.com.xpto.sistemabancario.Pessoa pessoaSistemaBancario = new br.com.xpto.sistemabancario.Pessoa();

        String rg = pessoaConcessionaria.getRg();
        String cpf = pessoaSistemaBancario.getCpf();
    }
}
