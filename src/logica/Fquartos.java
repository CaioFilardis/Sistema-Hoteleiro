/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;


import com.mysql.cj.xdevapi.Statement;
import dados.Quartos;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Caio
 */
public class Fquartos { // Gerando conexão com a tabela quartos
        
    private Conexao mysql = new Conexao();
    private Connection connection = mysql.conectar();
    private String sSQL = "";
    public Integer totalRegistros;
    
    public DefaultTableModel mostrar(String buscar) {
       
        DefaultTableModel modelo;
        String[] titulos = {"ID", "Numero", "Andar", "Descricao", "Caracteristicas", "ValorDiaria", "Estado", "TipoQuarto"};
        String[] registro = new String[8]; // quantidade de campos na entidade quartos
        
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos); // parâmetro para busca
        sSQL = "select * from tb_quartos where andar like '%'"+ buscar + "%' order by id_quartos";
        
        try {
            Statement statement = connection.createStatement(); // criar um novo estado para a conexão
            ResultSet resultset = statement.executeQuery(sSQL);
            
            while (resultset.next()) { // percorrendo 
                registro[0] = resultset.getString("id_quartos");
                registro[1] = resultset.getString("numero");
                registro[2] = resultset.getString("andar");
                registro[3] = resultset.getString("descricao");
                registro[4] = resultset.getString("caracteristicas");
                registro[5] = resultset.getString("preco_diaria");
                registro[6] = resultset.getString("estado");
                registro[7] = resultset.getString("tipo_quarto");
                
                totalRegistros++;
                modelo.addRow(registro); // adicionar linhas com registros
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }   
    
    // gerar cadastro, edição e deleção
    public boolean inserir(Quartos dadosQuartos) {
        sSQL = "insert into Quatos (numero, andar, descricao, caracteristicas, preco_diaria, estado, tipo_quarto)"+
                "values(?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement prepare = connection.prepareStatement(sSQL);
            prepare.setInteger(1, dadosQuartos.getNumero());
            prepare.setString(2, dadosQuartos.getAndar());
            prepare.setString(3, dadosQuartos.getDescricao());
            prepare.setString(4, dadosQuartos.getCaracteristicas());
            prepare.setDouble(5, dadosQuartos.getValorDiaria());
            prepare.setString(6, dadosQuartos.getEstado());
            prepare.setString(7, dadosQuartos.getTipoQuarto());
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
    }
    
    public boolean editar(Quartos dadosQuartos) {
          try {
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
    }
    
    public boolean excluir(Quartos dadosQuartos) {
          try {
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
    }
}
