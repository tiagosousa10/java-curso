package io.github.cursodsousa.interfaces;

public class Main {
    public static void main(String[] args) {

        CarroHibrido carroHibrido = new CarroHibrido();
        carroHibrido.fazAlgo();
        CarroEletrico.imprimirAlgo();



        Autenticador autenticador = new Autenticador();

        Autenticacao email = new CredencialEmail("teste@teste.com", "123123");
        boolean isAutenticado = autenticador.autenticar(email);

        Autenticacao usuario = new CredencialLogin("username", "123");
        boolean isUsuarioAutenticado = autenticador.autenticar(usuario);

        Autenticacao biometrica = new CredencialBiometrica(new byte[]{});
        boolean isBiometricaAutenticada = autenticador.autenticar(biometrica);
    }
}
