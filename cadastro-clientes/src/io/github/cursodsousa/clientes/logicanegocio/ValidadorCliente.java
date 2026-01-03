package io.github.cursodsousa.clientes.logicanegocio;

import io.github.cursodsousa.clientes.dominio.Cliente;
import io.github.cursodsousa.clientes.dominio.exception.CpfInvalidoException;
import io.github.cursodsousa.clientes.dominio.exception.DadoObrigatorioException;

public class ValidadorCliente {

    public static void validar(Cliente cliente) throws CpfInvalidoException{
        if(cliente.getCpf().length() != 11) {
            throw new CpfInvalidoException("Cpf Invalido!");
        }
        validarDadosObrigatorios(cliente);
    }

    public static void validarDadosObrigatorios(Cliente cliente) {
        if(cliente.getNome() == null || cliente.getNome().isBlank()) {
            throw  new DadoObrigatorioException("Campo nome é Obrigatório!");
        }

        if(cliente.getSexo() == null) {
            throw new DadoObrigatorioException("Campo sexo é Obrigatório!");
        }
    }
}
