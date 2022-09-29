package com.foodapi;

import com.foodapi.modelo.Cliente;
import com.foodapi.di.servico.AtivacaoClienteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodController {

    private AtivacaoClienteService ativacaoClienteService;

    public FoodController(AtivacaoClienteService ativacaoClienteService) {
        this.ativacaoClienteService = ativacaoClienteService;

    }

    @GetMapping("/test")
    public String test () {
        Cliente joao = new Cliente("Joao", "joao@hotmail.com", "01670700707");
        Cliente maria = new Cliente("Maria", "Maria@hotmail.com", "01690909292");

        ativacaoClienteService.ativar(joao);
        ativacaoClienteService.ativar(maria);

        return "Testing @GetMapping, @ResponseBody on localhost:8080 from project food-api";
    }
}
