package io.github.cursodsousa.interfaces;

public interface CarroEletrico {
    int VELOCIDADEMAXIMA= 150;
    
    void carregarBateria();

    static void imprimirAlgo() {
        System.out.println("imprimirAlgo");
    }

    default void fazAlgo() {
        System.out.println("fazAlgo");
    }
}
