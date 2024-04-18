package com.algaworks.awpag.api.controller;

import com.algaworks.awpag.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

  @GetMapping("/clientes")
  public List<Cliente> listar(){

    var cliente1 = new Cliente();
    cliente1.setId(1L);
    cliente1.setNome("Moranguinho");
    cliente1.setEmail("morango@gmail.com");
    cliente1.setTelefone("(99)95874-2659");

    var cliente2 = new Cliente();
    cliente2.setId(2L);
    cliente2.setNome("Prome");
    cliente2.setEmail("prome@gmail.com");
    cliente2.setTelefone("(99)98774-2659");

    return Arrays.asList(cliente1, cliente2);

  }

}
