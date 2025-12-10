package sistemabancario;

public class Conta {
    private Cliente titular;
    private int numero;
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

    public void setSaldo(double saldo) {

        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo Negativo.");
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void imprimirSaldo() {
        System.out.println("Numero da Conta: " + this.numero + "| Saldo atual: " + this.saldo);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}
