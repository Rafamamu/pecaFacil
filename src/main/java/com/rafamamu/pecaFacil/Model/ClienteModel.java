package com.rafamamu.pecaFacil.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "tb_clientes")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class ClienteModel {

    @Id
    @Column(name = "numero_chamado", unique = true, nullable = false)
    private String numeroChamado;

    @Column(name = "servico_concluido")
    private boolean servicoConcluido;

    @Column(name = "data")
    private LocalDate data;
}
