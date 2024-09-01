/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

/**
 *
 * @author Caio
 */
public class Funcionarios extends Pessoas {
    
    double salario;
    String acesso;
    String login;
    String password;
    String estado;
    
    public Funcionarios() { // construtor vazio
        
    }

    public Funcionarios(double salario, String acesso, String login, String password, String estado) {
        this.salario = salario;
        this.acesso = acesso;
        this.login = login;
        this.password = password;
        this.estado = estado;
    }

    
    

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getAcesso() {
        return acesso;
    }

    public void setAcesso(String acesso) {
        this.acesso = acesso;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
