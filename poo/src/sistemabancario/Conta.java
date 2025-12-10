package sistemabancario;

public class Conta {
    public Cliente titular;
    public int numero;
    private double saldo;


    public Conta(Cliente titular, int numero, double saldo) {
        if (titular == null) {
            //lancar um erro no system
        }
        this.titular = titular;
        this.numero = numero;
        if (saldo >= 0) {
            this.saldo = saldo;

        }

    }

    public void modificarSaldo(double saldo) {

        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo Negativo.");
        }
    }

    public double obterSaldo() {
        return this.saldo;
    }

    public void imprimirSaldo() {
        System.out.println("Numero da Conta: " + this.numero + "| Saldo atual: " + this.saldo);
    }


}
