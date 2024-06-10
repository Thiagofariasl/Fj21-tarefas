package com.example.fj21tarefas.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

@Entity
@Table(name="tarefas")
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Size(min = 5)
    private String descricao;

    private boolean finalizado;


    @NotNull
    @Column(name = "data_finalizacao")
    private LocalDate dataFinalizacao = LocalDate.now();



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public LocalDate getDataFinalizacao() {
        return dataFinalizacao;
    }

    public void setDataFinalizacao(LocalDate dataFinalizacao) {
        this.dataFinalizacao = dataFinalizacao;
    }


    @Override
    public String toString() {
        return "Tarefa{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", finalizado=" + finalizado +
                ", dataFinalizacao=" + dataFinalizacao +
                '}';
    }
}