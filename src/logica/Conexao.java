/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author Caio
 */
public class Conexao {
    
    public String dataBase = "bancoreserva";
    public String url = "jdbc:mysql://127.0.0.1/" + dataBase; // caminho local (Servidor Local)
    public String user = "root";
    public String password = "";
    
    public Conexao () { // construtor vazio
        
    }
    
    public Connection conectar () {
        Connection link = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            link = DriverManager.getConnection(this.url, this.user, this.password);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return link;
    }
    
    
}
