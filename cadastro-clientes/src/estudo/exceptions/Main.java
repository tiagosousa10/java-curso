package estudo.exceptions;

import io.github.cursodsousa.clientes.dominio.Cliente;
import io.github.cursodsousa.clientes.dominio.enums.TipoSexo;
import io.github.cursodsousa.clientes.dominio.exception.CpfInvalidoException;
import io.github.cursodsousa.clientes.logicanegocio.ValidadorCliente;

public class Main {
    public static void main(String[] args) {

        try {
            Cliente cliente = new Cliente();
//            cliente.setSexo(TipoSexo.M);
            String descricao = cliente.getSexo().getDescricao();
            System.out.println(descricao);
        } catch (NullPointerException e) {
            System.out.println("O tipo sexo estava null");
        } catch(Exception e) {
            System.out.println("Ocorreu um erro inexperado");
        }

        Cliente cliente = new Cliente();
        cliente.setCpf("01123");
        try {

            ValidadorCliente.validar(cliente);
            System.out.println("OK!");
        } catch (CpfInvalidoException e) {
            System.out.println(e.getMessage());
        }



    }
}
