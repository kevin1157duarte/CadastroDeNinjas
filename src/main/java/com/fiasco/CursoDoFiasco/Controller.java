package com.fiasco.CursoDoFiasco;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {
    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa e a minha primeira mensagen nessa rota!";
    }
}
