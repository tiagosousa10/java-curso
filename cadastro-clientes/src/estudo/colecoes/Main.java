package io.github.cursodsousa.clientes.colecoes;

import io.github.cursodsousa.clientes.dominio.Cliente;
import io.github.cursodsousa.clientes.dominio.enums.TipoSexo;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        OrganizacaoClientes cadastro = new OrganizacaoClientes();
        Cliente cliente = new Cliente();
        cliente.setCpf("0123");
        cliente.setNome("Rio Grande");
        cliente.setSexo(TipoSexo.M);

        cadastro.adicionar(cliente);

        Cliente cliente2 = new Cliente();
        cliente2.setCpf("0123");
        cliente2.setNome("Maria");
        cliente2.setSexo(TipoSexo.F);

        cadastro.adicionar(cliente2);

        Cliente cliente3 = new Cliente();
        cliente3.setCpf("0123");
        cliente3.setNome("Rita");
        cliente3.setSexo(TipoSexo.F);

        cadastro.adicionar(cliente3);

        Cliente cliente4 = new Cliente();
        cliente4.setCpf("0123");
        cliente4.setNome("Alguem");
        cliente4.setSexo(TipoSexo.O);

        cadastro.adicionar(cliente3);

        System.out.println("Femininos: ");
        cadastro.imprimirClientes(TipoSexo.F);

        System.out.println("Masculinos: ");
        cadastro.imprimirClientes(TipoSexo.M);

        System.out.println("Outros: ");
        cadastro.imprimirClientes(TipoSexo.O);
    }

    private static void exemplosMaps() {
        Map<Integer,String> mapa = new HashMap<>();
        mapa.put(1,"Fulano");
        mapa.put(2,"Cicrano");
        mapa.put(3,"Maria");

        String nome = mapa.get(1);
        System.out.println(nome);

        mapa.remove(1);

        System.out.println(mapa.get(1));

        boolean contemChave = mapa.containsKey(1);

        System.out.println("Contem a chave 1?: " + contemChave);
    }

    private static void TrabalhandoComOrdenacaoDeColecoes() {
        Cliente cliente = new Cliente();
        cliente.setCpf("0123");
        cliente.setNome("Rio Grande");
        cliente.setSexo(TipoSexo.M);

        Cliente cliente2 = new Cliente();
        cliente2.setCpf("0123");
        cliente2.setNome("Rio Grande");
        cliente2.setSexo(TipoSexo.M);

        List<Cliente> clientes = Arrays.asList(cliente, cliente2);
        clientes.sort(Cliente::compareTo);
        clientes.sort(new Comparator<Cliente>() {
            @Override
            public int compare(Cliente o1, Cliente o2) {
                return o1.getCodigo().compareTo(o2.getCodigo());
            }
        });

        for( Cliente c : clientes) {
            System.out.println(c);
        }
    }

    private static void repositorioComSet() {
        Set<String> linguagens = new HashSet<>();
        linguagens.add("Java");
        linguagens.add("JavaScript");
        linguagens.add("Python");
        linguagens.add("C#");

        for (String l : linguagens) {
            System.out.println(l);
        }

//        repositorioComList();
    }

//    private static void repositorioComList() {
//        List<Cliente> listaClientes = new ArrayList<>();
//
//
//        listaClientes.add(cliente);
//        listaClientes.add(cliente2);
//        for (Cliente c : listaClientes) {
//            System.out.println(c);
//        }
//
//        Cliente clienteRepetido = new Cliente();
//        clienteRepetido.setCpf("0123");
//        clienteRepetido.setNome("Rio Grande");
//        clienteRepetido.setSexo(TipoSexo.M);
//
//        boolean contain = listaClientes.contains(cliente);
//        System.out.println("Contem: " + contain);
//    }


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
