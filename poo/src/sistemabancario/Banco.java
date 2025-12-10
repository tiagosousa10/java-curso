package sistemabancario;

public class Banco {
    void depositar(Conta conta, double valor) {
        double saldoAtual = conta.saldo;
        double novoSaldo = saldoAtual + valor;

        conta.saldo = novoSaldo;
    }

    void sacar(Conta conta, double valor) {
        double saldoAtual = conta.saldo;
        double novoSaldo = saldoAtual - valor;

        if (novoSaldo < 0) {
            System.out.println("Saldo insuficiente");
        } else {
            conta.saldo = novoSaldo;
        }

    }

    void transferir(Conta origem, Conta destino, double valor) {
        double saldoAtualOrigem = origem.saldo;
        double novoSaldoOrigem = saldoAtualOrigem - valor;

        if (novoSaldoOrigem < 0) {
            System.out.println("Saldo insuficiente");
        } else {
            origem.saldo = novoSaldoOrigem;
            double novoSaldoDestiono = destino.saldo + valor;
            destino.saldo = novoSaldoDestiono;
        }
    }
}
