/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dados;

/**
 *
 * @author Caio
 */
public class Quartos {
    
        private int idQuartos;
        private String numero;
        private String andar;
        private String descricao;
        private String caracteristicas;
        private double valorDiaria;
        private String estado;
        private String tipoQuarto;
        
        public Quartos() {
        }

    public Quartos(int idQuartos, String numero, String andar, String descricao, String caracteristicas, double valorDiaria, String estado, String tipoQuarto) {
        this.idQuartos = idQuartos;
        this.numero = numero;
        this.andar = andar;
        this.descricao = descricao;
        this.caracteristicas = caracteristicas;
        this.valorDiaria = valorDiaria;
        this.estado = estado;
        this.tipoQuarto = tipoQuarto;
    }
        
        
        

        public int getIdQuartos() {
            return idQuartos;
        }

        public void setIdQuartos(int idQuartos) {
            this.idQuartos = idQuartos;
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

        public String getTipoQuarto() {
            return tipoQuarto;
        }

        public void setTipoQuarto(String tipoQuarto) {
            this.tipoQuarto = tipoQuarto;
        }

        
}
