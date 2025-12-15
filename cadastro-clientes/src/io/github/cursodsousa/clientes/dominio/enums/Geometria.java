package io.github.cursodsousa.clientes.dominio.enums;

import io.github.cursodsousa.clientes.dominio.Cliente;

public class Geometria
{
    public static void main(String[] args) {
        FormaGeometrica formaGeometrica = FormaGeometrica.QUADRADO;

        int ladoRetangulo = formaGeometrica.getLados();
        System.out.println("Lados do Retangulo: " + ladoRetangulo);

        Cliente cliente = new Cliente();
        cliente.setNome("Fulano");
        cliente.setCpf("123.456.789-00");
        cliente.setSexo(TipoSexo.F);

        Cliente outroCliente = new Cliente();
        outroCliente.setNome("Fulano");
        outroCliente.setCpf("123.456.789-00");
        outroCliente.setSexo(TipoSexo.F);

    }
}
