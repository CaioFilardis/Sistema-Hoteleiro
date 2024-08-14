/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Dados.VQuartos;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
            return modelo;
        }
        catch (Exception e) { // ou SQLException caos dê errado
            JOptionPane.showConfirmDialog(null, e);
        }
        return null;
    }
    
    // metodo inserir, se true
    public boolean inserir(VQuartos dts) {
        // irá inserir dados na tabela
        sSQL = "insert into quartos (numero, andar, descricao, caracteristicas, preco_diaria, estado, tipo_quarto)"+"values(?, ?, ?, ?, ?, ?, ?)";
        try {
               // chamando a conexão e retornandoos valores
               PreparedStatement pst = cn.prepareStatement(sSQL);
               pst.setString(1, dts.getNumero());
               pst.setString(2, dts.getAndar());
               pst.setString(3, dts.getDescricao());
               pst.setString(4, dts.getCaracteristicas());
               pst.setDouble(5, dts.getValorDiaria());
               pst.setString(6, dts.getEstado());
               pst.setString(7, dts.getTipoQuartos());
               
               int verificador = pst.executeUpdate();
               if (verificador != 0) {
                   return true;
               }
               else {
                   return false;
               }
        }
        catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    
    // método editar se true
    public boolean editar(VQuartos dts) {
        // irá atualizar a tabela com novos dados
        sSQL ="upadate tb_quartos set numero = ?, andar = ?, descricao = ?, caracteristicas = ?, preco_diaria = ?, estado = ?, tipo_quarto = ?"+"where id_quartos = ?0";
        
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getNumero());
            pst.setString(2, dts.getAndar());
            pst.setString(3, dts.getDescricao());
            pst.setString(4, dts.getCaracteristicas());
            pst.setDouble(5, dts.getValorDiaria());
            pst.setString(6, dts.getEstado());
            pst.setString(7, dts.getTipoQuartos());
            pst.setInt(8, dts.getIdQuartos());
            
            int verificador = pst.executeUpdate();
               if (verificador != 0) {
                   return true;
               }
               else {
                   return false;
               }
        }
        catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    
    // metodo deletar se true
    public boolean deletar(VQuartos dts) {
        // irá deletar da tabela
        sSQL = "delete from tb_quartos where id_quartos=?";
        
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdQuartos()); // inicializando pelo cód.quarto
            
            int verificador = pst.executeUpdate();
               if (verificador != 0) {
                   return true;
               }
               else {
                   return false;
               }
        }
        catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
}
