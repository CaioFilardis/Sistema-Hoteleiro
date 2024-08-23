/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Dados.Clientes;
import Dados.Produtos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Caio
 */
public class TabelaClientes {
    
    private Conexao mysql = new Conexao();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    public Integer totalregistros;
    
     public DefaultTableModel mostrar(String buscar) {
         
        DefaultTableModel modelo;
        String[] titulos = {"ID", "Nome", "Pai", "Mae", "Documento", "CPF", "Endereco", "Telefone", "Email", "Código"};
        String[] registro = new String[5];
        totalregistros = 0;
        
        modelo = new DefaultTableModel(null, titulos);
        sSQL = "select p.id_pessoa, p.nome, p.nome_pai, p.nome_mae, p.tipo_documento, p.num_documento, " 
                + "p.endereco, p.telefone, p.email, c.codigo_cliente from tb_pessoas p inner join cliente c"
                + "on p.id_pessoa=c.id_pessoa where num_documento like '%"
                + buscar + "%' order by id_pessoa desc";
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            
            while(rs.next()){
               registro [0] = rs.getString("id_pessoa");
               registro [1] = rs.getString("nome");
               registro [2] = rs.getString("nome_pai");
               registro [3] = rs.getString("nome_mae");
               registro [4] = rs.getString("tipo_documento");
               registro [5] = rs.getString("num_documento");
               registro [6] = rs.getString("endereco");
               registro [7] = rs.getString("telefone");
               registro [8] = rs.getString("email");
               registro [9]=rs.getString("codigo_cliente");
               
               totalregistros = totalregistros +1;
               modelo.addRow(registro);
            }
            return modelo;
        }
        catch (SQLException e){
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
     }
     
     public boolean inserir (Clientes dts) {
        sSQL = "insert into tb_pessoas (nome, nome_pai, nome_mae, tipo_documento, num_documento, endereco, telefone, email)"
                + "values(?,?,?,?,?,?,?,?)"; // alterando valores
        
        sSQL2 = "insert into tb_clientes (id_pessoa, codigo_cliente)"
                + "values(select id_pessoa from tb_pessoa order by id_pessoa desc limit 1,?)"; // alterando valores
        
        try {
            
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getNome());
            pst.setString(2, dts.getDescricao());
            pst.setString(3, dts.getUnidadeDeMedida());
            pst.setDouble(4, dts.getValor());
            
            
            int n = pst.executeUpdate();
            
            if (n != 0){
                return true;
            }
            else {
                return false;
            }    
        }
        catch (SQLException e){
             JOptionPane.showConfirmDialog(null, e);
             return false;
        }
    }
     
    public boolean editar (Produtos dts){
        
        sSQL="update tb_produtos set nome=?, descricao=?, unidade_medida=?, preco_venda=?"
                + "where id_produto=?";
        
               
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getNome());
            pst.setString(2, dts.getDescricao());
            pst.setString(3, dts.getUnidadeDeMedida());
            pst.setDouble(4, dts.getValor());
            pst.setInt(5, dts.getId());
            
             int n = pst.executeUpdate();
             
            if (n != 0) {
                return true;
            }
            else {
                return false;
            }
        }
        catch (SQLException e) {
             JOptionPane.showConfirmDialog(null, e);
         return false;
        }
    }
    
    public boolean deletar (Produtos dts){
        
        sSQL = "delete from tb_produtos where id_produto=?";
        
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getId());
            int n = pst.executeUpdate();
            
            if (n != 0) {
                return true;
            }
            else {
                return false;
            }
        }
        catch (SQLException e) {
             JOptionPane.showConfirmDialog(null, e);
             return false;
        }
    }
}
