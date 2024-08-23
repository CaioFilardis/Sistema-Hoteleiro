/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

/**
 *
 * @author Caio
 */
public class Produtos {
    
    private int id;
    private String nome;
    private String descricao;
    private String unidadeDeMedida;
    private double valor;

    public Produtos() {
    }
    
    // construtor para inicializar as variáveis de instância
    public Produtos(int id, String nome, String descricao, String unidadeDeMedida, double valor) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.unidadeDeMedida = unidadeDeMedida;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUnidadeDeMedida() {
        return unidadeDeMedida;
    }

    public void setUnidadeDeMedida(String unidadeDeMedida) {
        this.unidadeDeMedida = unidadeDeMedida;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
