package com.rafamamu.pecaFacil;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PecaDTO {
    private Long id;
    private String codigo;
    private String nome;
    private int quantidade;
    private String numeroChamado;

}
