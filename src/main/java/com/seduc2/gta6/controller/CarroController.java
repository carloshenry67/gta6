package com.seduc2.gta6.controller;

import com.seduc2.gta6.entity.Carro;
import com.seduc2.gta6.service.CarroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/armas")
public class CarroController {


    public class ArmaController {

        private final CarroService service;

        public ArmaController(CarroService service) {
            this.service = service;
        }

        @GetMapping
        public List<Carro> mostrar(){
            return service.mostrarCarro();
        }

        @PostMapping
        public void criar (@RequestBody Carro c){
            service.cadastrarArma(c);
        }

        @DeleteMapping("{id}")
        public void deletar(@PathVariable int id){
            service.deletar(id);
        }

        @PutMapping
        public void alterar(@PathVariable int id, @RequestBody Carro c){

        }

    }
}
