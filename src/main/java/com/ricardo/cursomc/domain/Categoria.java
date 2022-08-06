package com.ricardo.cursomc.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import net.bytebuddy.asm.Advice;

import javax.persistence.*;

@Entity
public class Categoria {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    public Categoria () {

    }
    public Categoria (Integer id, String nome) {
        this.nome = nome;
        this.id = id;
    }


    public Categoria(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
