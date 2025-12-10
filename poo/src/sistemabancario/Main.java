package sistemabancario;

public class Main {


    public static void main(String[] args) {


        Cliente fulano = new Cliente("012345567980", "Fulano");

        Conta contaFulano = new Conta(fulano, 1000, 50);
        System.out.println("Saldo: " + " - " + contaFulano.getSaldo());


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

        /*
        Cliente cicrano = new Cliente();
        cicrano.setNome("Cicrano Bonito");
        cicrano.setCpf("123123123");
        */
        Cliente cicrano = new Cliente("012345567980", "Cicrano");

        Conta contaCicrano = new Conta(cicrano, 1000, 50);
        contaCicrano.setSaldo(50);
        contaCicrano.imprimirSaldo();


        System.out.println("Transferindo 50 para o cicrano");

        sistemaBancario.transferir(contaFulano, contaCicrano, 28d);


        contaFulano.imprimirSaldo();
        contaCicrano.imprimirSaldo();


        System.out.println("Quantidade de clientes: " + Cliente.quantidadeClientes);

    }
}
