/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

/**
 *
 * @author Caio
 */
public class VQuartos {
    
    private int idQuartos;
    private String numer;
    private String andar;
    private String descricao;
    private String caracteristicas;
    private double valorDiaria;
    private String estado;
    private String tipoQuartos;

    // Explicitando construtor
    public VQuartos(int idQuartos, String numer, String andar, String descricao, String caracteristicas, double valorDiaria, String estado, String tipoQuartos) {
        this.idQuartos = idQuartos;
        this.numer = numer;
        this.andar = andar;
        this.descricao = descricao;
        this.caracteristicas = caracteristicas;
        this.valorDiaria = valorDiaria;
        this.estado = estado;
        this.tipoQuartos = tipoQuartos;
    }
    
    public VQuartos() {
        
    }

    public int getIdQuartos() {
        return idQuartos;
    }

    public void setIdQuartos(int idQuartos) {
        this.idQuartos = idQuartos;
    }

    public String getNumer() {
        return numer;
    }

    public void setNumer(String numer) {
        this.numer = numer;
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

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipoQuartos() {
        return tipoQuartos;
    }

    public void setTipoQuartos(String tipoQuartos) {
        this.tipoQuartos = tipoQuartos;
    }
    
    
    
    
}
