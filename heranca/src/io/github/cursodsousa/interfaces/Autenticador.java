package io.github.cursodsousa.interfaces;

public class Autenticador {
    public boolean autenticar(Autenticacao autenticacao) {
        String identificacao = autenticacao.getIndentificacao();

        if (autenticacao.isUsaSenha()) {
            String senha = autenticacao.getSenha();

            return true;

        } else {
            //buscar pessoa no banco de dados atraves da identificacao
            //se encontrou a pessoa
            return true;
        }
    }
}
