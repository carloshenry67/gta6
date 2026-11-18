package com.seduc2.gta6.controller;

import com.seduc2.gta6.entity.Personagem;
import com.seduc2.gta6.repository.PersonagemRepository;
import com.seduc2.gta6.service.PersonagemService;
import org.aspectj.weaver.patterns.PerObject;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/personagens")
public class PersonagemController {

    private final PersonagemService service;
    public PersonagemController(PersonagemService service) {
        this.service = service;
    }

    @GetMapping
    public List<Personagem> mostrar(){
        return service.mostrarPersonagem();
    }

    @PostMapping
    public void criar (@RequestBody Personagem p) {
        service.cadastrarPersonagem(p);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id){
        service.deletar(id);
    }

    @PutMapping("/{id}")
    public void alterar(@PathVariable int id, @RequestBody Personagem p){
        service.alterar(id, p);
    }

}
