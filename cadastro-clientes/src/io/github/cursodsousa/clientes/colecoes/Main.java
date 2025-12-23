package io.github.cursodsousa.clientes.colecoes;

import io.github.cursodsousa.clientes.dominio.Cliente;
import io.github.cursodsousa.clientes.dominio.enums.TipoSexo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Cliente> listaClientes = new ArrayList<>();
        Cliente cliente = new Cliente();
        cliente.setCpf("0123");
        cliente.setNome("Rio Grande");
        cliente.setSexo(TipoSexo.M);

        Cliente cliente2 = new Cliente();
        cliente2.setCpf("0123");
        cliente2.setNome("Rio Grande");
        cliente2.setSexo(TipoSexo.M);
        listaClientes.add(cliente);
        listaClientes.add(cliente2);
        for (Cliente c : listaClientes) {
            System.out.println(c);
        }

    }

    private static void repositorioComArray() {
        RepositorioClientes repositorioClientes = new RepositorioClientes();
        Cliente cliente = new Cliente();
        cliente.setCpf("0123");
        cliente.setNome("Rio Grande");
        cliente.setSexo(TipoSexo.M);

        Cliente cliente2 = new Cliente();
        cliente2.setCpf("0123");
        cliente2.setNome("Rio Grande");
        cliente2.setSexo(TipoSexo.M);


        repositorioClientes.adicionar(cliente);
        repositorioClientes.adicionar(cliente2);
        repositorioClientes.imprimirClientes();
    }
}
