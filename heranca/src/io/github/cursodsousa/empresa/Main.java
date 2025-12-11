package io.github.cursodsousa.empresa;

public class Main {
    public static void main(String[] args) {
        Tecnico tecnico = new Tecnico();
        tecnico.setNome("Fulano");
        tecnico.setCpf("1234567890");
        tecnico.setSalario(2500);

        tecnico.imprimirRemuneracao();


        Gerente gerente = new Gerente();
        gerente.setNome("Cicrano");
        gerente.setCpf("1234567890");
        gerente.setSalario(4700);

        gerente.imprimirRemuneracao();

        Funcionario novoTecnico = new Tecnico();
        Funcionario novoGerente = new Gerente();

        System.out.println("Bonus anual: ");
        System.out.println("Gerente: "+ gerente.calcularBonificacaoAnual());
        System.out.println("Tecnico: "+ tecnico.calcularBonificacaoAnual());


        ConexaoBancaria conexaoBancaria = new ConexaoBancaria();
        GerenciaRH gerenciaRH = new GerenciaRH(conexaoBancaria);
        gerenciaRH.pagarBonificacaoAnual(gerente);
        gerenciaRH.pagarBonificacaoAnual(tecnico);

    }
}
