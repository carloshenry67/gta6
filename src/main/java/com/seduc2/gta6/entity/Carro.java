package com.seduc2.gta6.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Carro {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome_do_veiculo;
    private String marca;
    private String categoria;
    private String imagem;
    private String descricao;

    public Carro(int id, String nome_do_veiculo, String marca, String categoria, String imagem, String descricao) {
        this.id = id;
        this.nome_do_veiculo = nome_do_veiculo;
        this.marca = marca;
        this.categoria = categoria;
        this.imagem = imagem;
        this.descricao = descricao;
    }

    public Carro(String nome_do_veiculo, String marca, String categoria, String imagem, String descricao) {
        this.nome_do_veiculo = nome_do_veiculo;
        this.marca = marca;
        this.categoria = categoria;
        this.imagem = imagem;
        this.descricao = descricao;
    }

    public Carro() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_do_veiculo() {
        return nome_do_veiculo;
    }

    public void setNome_do_veiculo(String nome_do_veiculo) {
        this.nome_do_veiculo = nome_do_veiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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
