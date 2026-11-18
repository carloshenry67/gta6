package com.seduc2.gta6.service;


import com.seduc2.gta6.entity.Missao;

import com.seduc2.gta6.repository.MissaoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissaoService {
    private final MissaoRepository missaoRepository;

    public MissaoService(MissaoRepository missaoRepository) {
        this.missaoRepository = missaoRepository;
    }

    public List<Missao> mostrarMissao(){
        return missaoRepository.findAll();
    }

    public void cadastrarArma(Missao m){
        Missao missao = new Missao();

        missao.setDescricao(m.getDescricao());
        missao.setDificuldade(m.getDificuldade());
        missao.setImagem(m.getImagem());
        missao.setLocal(m.getLocal());
        missao.setNome_da_missao(missao.getNome_da_missao());
    }

    public void deletar (int id){
        missaoRepository.deleteById(id);
    }

    @Transactional
    public void alterar(int id, Missao m){
        Missao missao = missaoRepository.getReferenceById(id);
        missao.setLocal(missao.getLocal());
        missao.setNome_da_missao(missao.getNome_da_missao());
        missao.setImagem(missao.getImagem());
        missao.setDificuldade(missao.getDificuldade());
        missao.setDescricao(missao.getDescricao());
    }

}

