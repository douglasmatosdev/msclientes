package com.douglasmatosdev.mscclientes.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("clientes")
public class ClientesResource {

    @GetMapping
    private String status() {
        return "ok";
    }
}
