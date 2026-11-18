package com.seduc2.gta6.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Arma {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome_da_arma;
    private String categoria;
    private String fabricante;
    private String imagem;
    private String descricao;

    public Arma() {

    }

    public void Arma(){}

    public Arma(int id, String nome_da_arma, String categoria, String fabricante, String imagem, String descricao) {
        this.id = id;
        this.nome_da_arma = nome_da_arma;
        this.categoria = categoria;
        this.fabricante = fabricante;
        this.imagem = imagem;
        this.descricao = descricao;
    }

    public Arma(String nome_da_arma, String categoria, String fabricante, String imagem, String descricao) {
        this.nome_da_arma = nome_da_arma;
        this.categoria = categoria;
        this.fabricante = fabricante;
        this.imagem = imagem;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_da_arma() {
        return nome_da_arma;
    }

    public void setNome_da_arma(String nome_da_arma) {
        this.nome_da_arma = nome_da_arma;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
