package sistemabancario;

public class Main {
    public static void main(String[] args) {

        Cliente fulano = new Cliente();
        fulano.nome = "Fulano";
        fulano.cpf = "012345567980";

        Conta contaFulano = new Conta();
        contaFulano.titular = fulano;
        contaFulano.numero = 1000;
        contaFulano.saldo = 50;


        Banco sistemaBancario = new Banco();
        System.out.println("Antes do deposito");
        contaFulano.imprimirSaldo();

        sistemaBancario.depositar(contaFulano, 100d);

        System.out.println("Depois do deposito");
        contaFulano.imprimirSaldo();

        System.out.println("Sacando 30");
        sistemaBancario.sacar(contaFulano, 30);

        contaFulano.imprimirSaldo();

        System.out.println("Sacando 200");
        sistemaBancario.sacar(contaFulano, 200);

        contaFulano.imprimirSaldo();

        Cliente cicrano = new Cliente();
        cicrano.nome = "Cicrano";
        cicrano.cpf = "321123123";


        Conta contaCicrano = new Conta();
        contaCicrano.titular = cicrano;
        contaCicrano.numero = 50;
        contaCicrano.saldo = 0;

        System.out.println("Transferindo 50 para o cicrano");

        sistemaBancario.transferir(contaFulano, contaCicrano, 28d);


        contaFulano.imprimirSaldo();
        contaCicrano.imprimirSaldo();

    }
}
