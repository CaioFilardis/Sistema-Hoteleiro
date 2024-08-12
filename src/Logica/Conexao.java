/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Caio
 */
public class Conexao {
    
    // Atributos
    public String db = "bancoreserva"; // nome do banco de dados 
    public String url = "jdbc:mysql://localhost:3306/"+db; // local web do servidor + nome do banco
    public String user = "root"; // usuario de acesso ao servidor
    public String password = ""; // senha(sendo nula por padrão)
    
    // contrutor
    public Conexao() {
        
    }
    
    // método de conexão
    public Connection conectar() {
        Connection link = null;
        
        try { // tratando exceção
            link = DriverManager.getConnection(this.url, this.user, this.password);
        }
        catch (SQLException e) { // caso dê errado
            JOptionPane.showConfirmDialog(null, e);
        }
        return link;
    }
    

}
