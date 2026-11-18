package com.seduc2.gta6.controller;

import com.seduc2.gta6.entity.Arma;
import com.seduc2.gta6.service.ArmaService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/armas")
public class ArmaController {

    private final ArmaService service;

    public ArmaController(ArmaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Arma> mostrar(){
      return service.mostrarArma();
    }

    @PostMapping
    public void criar (@RequestBody Arma a){
        service.cadastrarArma(a);
    }

    @DeleteMapping("{id}")
    public void deletar(@PathVariable int id){
        service.deletar(id);
    }

    @PutMapping
    public void alterar(@PathVariable int id, @RequestBody Arma a){

    }

}
