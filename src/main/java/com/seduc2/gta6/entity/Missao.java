package com.seduc2.gta6.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.stereotype.Repository;

@Repository
public class Missao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome_da_missao;
    private String local;
    private String descricao;
    private String imagem;
    private String dificuldade;

    public Missao(int id, String nome_da_missao, String local, String descricao, String imagem, String dificuldade) {
        this.id = id;
        this.nome_da_missao = nome_da_missao;
        this.local = local;
        this.descricao = descricao;
        this.imagem = imagem;
        this.dificuldade = dificuldade;
    }

    public Missao(String nome_da_missao, String local, String descricao, String imagem, String dificuldade) {
        this.nome_da_missao = nome_da_missao;
        this.local = local;
        this.descricao = descricao;
        this.imagem = imagem;
        this.dificuldade = dificuldade;
    }

    public Missao() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_da_missao() {
        return nome_da_missao;
    }

    public void setNome_da_missao(String nome_da_missao) {
        this.nome_da_missao = nome_da_missao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }
}
