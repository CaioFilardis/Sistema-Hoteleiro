/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Caio
 */
public class FQuartos { // classe de conexao com BD
    
    private Conexao mysql = new Conexao();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    public int totalRegistros;
    
    // método
    public DefaultTableModel mostrar(String buscar) {
        
        DefaultTableModel modelo;
        String[] titulos = {"ID", "Numero", "andar", "Descricao", "Caracteristica", "Preco", "Estado", "TipoQuarto"};
        String[] registro = new String[8]; // array instanciada
        totalRegistros = 0;
        
        modelo = new DefaultTableModel(null, titulos);
        sSQL = "select * from tb_quartos where andar like '%"+buscar+"%' order by id_quartos";
        
        try {
            
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            
            while (rs.next()) {
                registro [0] = rs.getString("id_quartos");
                registro [1] = rs.getString("numero");
                registro [2] = rs.getString("andar");
                registro [3] = rs.getString("descricao");
                registro [4] = rs.getString("caracteristica");
                registro [5] = rs.getString("preco_diaria");
                registro [6] = rs.getString("estado");
                registro [7] = rs.getString("tipo_quarto");
                
                totalRegistros += 1;
                modelo.addRow(registro);
            }
        }
        catch (Execption e) {
            JOptionPane.showConfirmaDialog(null, e);
        }
    }
    
    public boolean inserir(VQuartos dts) {
        try {
            
        }
        catch (Exception e) {
            JOptionPane.showConfirmaDialog(null, e);
            return null;
        }
    }
    
    public boolean editar(VQuartos dts) {
        try {
            
        }
        catch (Exception e) {
            JOptionPane.showConfirmaDialog(null, e);
            return null;
        }
    }
    
    public boolean deletar(VQuartos dts) {
        try {
            
        }
        catch (Exception e) {
            JOptionPane.showConfirmaDialog(null, e);
            return null;
        }
    }
    
}
