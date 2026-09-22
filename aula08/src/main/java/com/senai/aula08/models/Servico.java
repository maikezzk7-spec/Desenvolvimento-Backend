package com.senai.aula08.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

// Cria tabela para relacionar com o banco de dados
@Entity
@Table(name = "servico")
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_servico")
    private Long idServico;

    // Relacionamento
    // Um serviço pode estar relacionado a vários contratos
    @OneToMany(mappedBy = "servico")
    private List<Contrato> contratos = new ArrayList<>();

    // Construtor vazio
    public Servico() {
    }

    // Getter do ID
    public Long getIdServico() {
        return idServico;
    }

    // Setter do ID
    public void setIdServico(Long idServico) {
        this.idServico = idServico;
    }

    // Getter dos contratos
    public List<Contrato> getContratos() {
        return contratos;
    }

    // Setter dos contratos
    public void setContratos(List<Contrato> contratos) {
        this.contratos = contratos;
    }
}