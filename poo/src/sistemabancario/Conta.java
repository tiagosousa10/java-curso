package sistemabancario;

public class Conta {
    Cliente titular;
    int numero;
    double saldo;

    void imprimirSaldo() {
        System.out.println("Numero da Conta: " + this.numero + "| Saldo atual: " + this.saldo);
    }


}
