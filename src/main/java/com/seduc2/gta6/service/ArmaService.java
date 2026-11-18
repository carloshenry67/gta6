package com.seduc2.gta6.service;

import com.seduc2.gta6.entity.Arma;
import com.seduc2.gta6.repository.ArmaRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArmaService {

    private final ArmaRepository armaRepository;

    public ArmaService(ArmaRepository armaRepository) {
        this.armaRepository = armaRepository;
    }

    public List<Arma> mostrarArma(){
        return armaRepository.findAll();
    }

    public void cadastrarArma(Arma a){
        Arma arma = new Arma();

        arma.setNome_da_arma(a.getNome_da_arma());
        arma.setCategoria(a.getCategoria());
        arma.setDescricao(a.getDescricao());
        arma.setFabricante(a.getFabricante());
        arma.setImagem(a.getImagem());

    }

    public void deletar (int id){
        armaRepository.deleteById(id);
    }

    @Transactional
    public void alterar(int id, Arma a){
        Arma arma = armaRepository.getReferenceById(id);
        arma.setNome_da_arma(arma.getNome_da_arma());
        arma.setImagem(a.getImagem());
        arma.setFabricante(a.getFabricante());
        arma.setDescricao(a.getDescricao());
        arma.setCategoria(arma.getCategoria());
    }

}
