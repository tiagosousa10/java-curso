package io.github.cursodsousa.clientes.logicanegocio;

import io.github.cursodsousa.clientes.dominio.Cliente;
import io.github.cursodsousa.clientes.dominio.exception.CpfInvalidoException;

public class ValidadorCliente {

    public static void validar(Cliente cliente) throws CpfInvalidoException{
        if(cliente.getCpf().length() != 11) {
            throw new CpfInvalidoException("Cpf Invalido!");
        }
    }
}
