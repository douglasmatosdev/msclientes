package com.douglasmatosdev.mscclientes.application.representation;

import com.douglasmatosdev.mscclientes.domain.Cliente;
import lombok.Data;

@Data
public class ClienteSaveRequest {
    private String nome;
    private String cpf;
    private Integer idade;

    public Cliente toModel() {
        return new Cliente(nome, cpf, idade);
    }
}
