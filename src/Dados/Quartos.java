/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

/**
 *
 * @author Hugo
 */
public class Quartos {
    private int idquartos;
    private String numero;
    private String andar;
    private String descricao;
    private String caracteristicas;
    private Double valordiaria;
    private String estado;
    private String tipoquarto;

    public Quartos(int idquartos, String numero, String andar, String descricao, String caracteristicas, Double valordiaria, String estado, String tipoquarto) {
        this.idquartos = idquartos;
        this.numero = numero;
        this.andar = andar;
        this.descricao = descricao;
        this.caracteristicas = caracteristicas;
        this.valordiaria = valordiaria;
        this.estado = estado;
        this.tipoquarto = tipoquarto;
    }

    public Quartos() {
        
    }

    public int getIdquartos() {
        return idquartos;
    }

    public void setIdquartos(int idquartos) {
        this.idquartos = idquartos;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public Double getValordiaria() {
        return valordiaria;
    }

    public void setValordiaria(Double valordiaria) {
        this.valordiaria = valordiaria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipoquarto() {
        return tipoquarto;
    }

    public void setTipoquarto(String tipoquarto) {
        this.tipoquarto = tipoquarto;
    }
}
