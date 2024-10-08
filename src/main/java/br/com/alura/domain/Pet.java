package br.com.alura.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Mateus Dantas
 */
@Data
@NoArgsConstructor
public class Pet {
    private Long id;
    private String tipo;
    private String nome;
    private String raca;
    private int idade;
    private String cor;
    private Float peso;

    public Pet(String tipo, String nome, String raca, int idade, String cor, Float peso) {
        this.tipo = tipo;
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.cor = cor;
        this.peso = peso;
    }
}
