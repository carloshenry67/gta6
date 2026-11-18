package com.seduc2.gta6.service;



import com.seduc2.gta6.entity.Carro;
import com.seduc2.gta6.repository.CarroRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarroService {


    private final CarroRepository carroRepository;

    public CarroService(CarroRepository carroRepository) {
        this.carroRepository = carroRepository;
    }


    public List<Carro> mostrarCarro(){
        return carroRepository.findAll();
    }

    public void cadastrarArma(Carro c){
        Carro carro = new Carro();

        carro.setNome_do_veiculo(c.getNome_do_veiculo());
        carro.setCategoria(c.getCategoria());
        carro.setDescricao(c.getDescricao());
        carro.setMarca(c.getMarca());
        carro.setImagem(c.getImagem());

    }

    public void deletar (int id){
        carroRepository.deleteById(id);
    }

    @Transactional
    public void alterar(int id, Carro c){
        Carro carro = carroRepository.getReferenceById(id);
    carro.setImagem(c.getImagem());
    carro.setCategoria(carro.getCategoria());
    carro.setMarca(carro.getMarca());
    carro.setNome_do_veiculo(c.getNome_do_veiculo());
    carro.setDescricao(c.getDescricao());
}

}

