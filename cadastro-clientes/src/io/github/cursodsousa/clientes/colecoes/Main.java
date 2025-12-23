package io.github.cursodsousa.clientes.colecoes;

import io.github.cursodsousa.clientes.dominio.Cliente;
import io.github.cursodsousa.clientes.dominio.enums.TipoSexo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> linguagens = new HashSet<>();
        linguagens.add("Java");
        linguagens.add("JavaScript");
        linguagens.add("Python");
        linguagens.add("C#");

        for (String l : linguagens) {
            System.out.println(l);
        }

        repositorioComList();

    }

    private static void repositorioComList() {
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

        Cliente clienteRepetido = new Cliente();
        clienteRepetido.setCpf("0123");
        clienteRepetido.setNome("Rio Grande");
        clienteRepetido.setSexo(TipoSexo.M);

        boolean contain = listaClientes.contains(cliente);
        System.out.println("Contem: " + contain);
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
