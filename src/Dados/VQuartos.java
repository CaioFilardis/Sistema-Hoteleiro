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
    private String numero;
    private String andar;
    private String descricao;
    private String caracteristicas;
    private double valorDiaria;
    private String estado;
    private String tipoQuartos;

    // Explicitando construtor
    public VQuartos(int idQuartos, String numero, String andar, String descricao, String caracteristicas, double valorDiaria, String estado, String tipoQuartos) {
        this.idQuartos = idQuartos;
        this.numero = numero;
        this.andar = andar;
        this.descricao = descricao;
        this.caracteristicas = caracteristicas;
        this.valorDiaria = valorDiaria;
        this.estado = estado;
        this.tipoQuartos = tipoQuartos;
    }
    
    public VQuartos() {
        
    }

    // idQuartos
    public int getIdQuartos() {
        return idQuartos;
    }

    public void setIdQuartos(int idQuartos) {
        this.idQuartos = idQuartos;
    }

    // numeros
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    // andar
    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    // descricao
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // caracteristicas
    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    // valorDiaria
    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
    
    // estado
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // tipoQuartos
    public String getTipoQuartos() {
        return tipoQuartos;
    }

    public void setTipoQuartos(String tipoQuartos) {
        this.tipoQuartos = tipoQuartos;
    }
}
