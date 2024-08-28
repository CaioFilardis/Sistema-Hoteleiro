/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Apresentacao;

import Dados.Produtos;
import Logica.TabelaProdutos;
import Logica.TabelaQuartos;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Caio
 */
public class FormularioClientes extends javax.swing.JFrame {

    /**
     * Creates new form FormularioClientes
     */
    public FormularioClientes() {
        initComponents();
        desativar();
        mostrar("null");
        this.setLocationRelativeTo(null);
    }
    
     private String acao = "salvar";
    void ocultar_coluna(){
        TB_lista.getColumnModel().getColumn(0).setMaxWidth(0);
        TB_lista.getColumnModel().getColumn(0).setMinWidth(0);
        TB_lista.getColumnModel().getColumn(0).setPreferredWidth(0);
    }
    
    void desativar(){
        txt_id_pessoa.setVisible(false);
        txt_nome.setVisible(false);
        txt_nomepai.setVisible(false);
        txt_nomemae.setVisible(false);
        txt_email.setVisible(false);
        txt_valor.setVisible(false);
        txt_codigo_cliente.setVisible(false); 
        txt_telefone.setVisible(false);
        CB_num_doc.setVisible(false);
        
        btn_salvar.setEnabled(false);
        
        btn_cancelar.setEnabled(false);
          
       // Limpa o que for texto
        txt_nome.setText("");
        txt_nomepai.setText("");
        txt_nomemae.setText("");
        txt_telefone.setText("");
        txt_codigo_cliente.setText("");
        txt_email.setText("");
        txt_nome.setText("");
        txt_endereco.setText("");

    }
    
    void ativar(){
        txt_id_pessoa.setVisible(false);
        txt_nome.setVisible(true);
        txt_nomepai.setVisible(true);
        txt_nomemae.setVisible(true);
        txt_email.setVisible(true);
        txt_valor.setVisible(true);
        txt_codigo_cliente.setVisible(true); 
        txt_telefone.setVisible(true);
        CB_num_doc.setVisible(true);
        
        btn_salvar.setEnabled(true);
        
        btn_cancelar.setEnabled(true);
        
        JOptionPane.showMessageDialog(rootPane, "Dados registrados com sucesso!");
          
       // Limpa o que for texto
        txt_nome.setText("");
        txt_nomepai.setText("");
        txt_nomemae.setText("");
        txt_telefone.setText("");
        txt_codigo_cliente.setText("");
        txt_email.setText("");
        txt_nome.setText("");
        txt_endereco.setText("");
    }
    
    void mostrar (String buscar){
        
        try {
            DefaultTableModel modelo;
            TabelaProdutos func = new TabelaProdutos();
            modelo = func.mostrar(buscar);
            TB_lista.setModel(modelo);
            ocultar_coluna();
            LB_registros.setText("Total Registros " + Integer.toString(func.totalregistros) );
                        
        } 
        catch (Exception e){
            JOptionPane.showConfirmDialog(null, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CB_num_doc = new javax.swing.JComboBox<>();
        btn_novo = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        txt_id_pessoa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_nomepai = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_nomemae = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_valor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_endereco = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        txt_telefone = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_codigo_cliente = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TB_lista = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        txt_pesquisar = new javax.swing.JTextField();
        btn_sair = new javax.swing.JButton();
        btn_apagar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        LB_registros = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de clientes");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Cadastro de Produtos");

        jLabel3.setText("Nome");

        txt_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomeActionPerformed(evt);
            }
        });

        jLabel4.setText("Endereço");

        CB_num_doc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CPF ", "RG", "CNH", "TÍTULO ELEITOR", " " }));
        CB_num_doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_num_docActionPerformed(evt);
            }
        });

        btn_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/novo.GIF"))); // NOI18N
        btn_novo.setText("Novo");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/salvar.png"))); // NOI18N
        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/cancelar.png"))); // NOI18N
        btn_cancelar.setText("Limpar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        jLabel6.setText("Nome Pai");

        txt_nomepai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomepaiActionPerformed(evt);
            }
        });

        jLabel9.setText("Nome Mãe");

        txt_nomemae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomemaeActionPerformed(evt);
            }
        });

        jLabel5.setText("Email");

        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });

        jLabel8.setText("Tipo DOC");

        jLabel12.setText("Valor");

        txt_valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_valorActionPerformed(evt);
            }
        });

        txt_endereco.setColumns(20);
        txt_endereco.setRows(5);
        jScrollPane1.setViewportView(txt_endereco);

        jLabel7.setText("Telefone");

        txt_telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefoneActionPerformed(evt);
            }
        });

        jLabel13.setText("Cód. Cliente");

        txt_codigo_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigo_clienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel5)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_cancelar)
                            .addComponent(txt_email, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane1))
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(CB_num_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_nome, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                .addComponent(txt_nomepai))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txt_id_pessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_codigo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_nomemae, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_id_pessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(txt_codigo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_nomemae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txt_nomepai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(CB_num_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txt_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );

        jPanel2.setBackground(new java.awt.Color(206, 206, 206));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setForeground(new java.awt.Color(0, 153, 255));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Lista de Produtos");

        TB_lista.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TB_lista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TB_lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TB_listaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TB_lista);

        jLabel11.setText("Pesquisar");

        btn_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/cancelar.png"))); // NOI18N
        btn_sair.setText("Sair");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });

        btn_apagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/salvar.png"))); // NOI18N
        btn_apagar.setText("Apagar");
        btn_apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_apagarActionPerformed(evt);
            }
        });

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/novo.GIF"))); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        LB_registros.setText("Registros");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LB_registros)
                .addGap(107, 107, 107))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar)
                    .addComponent(btn_apagar)
                    .addComponent(btn_sair))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LB_registros)
                .addGap(157, 157, 157))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomeActionPerformed
        txt_nome.transferFocus();
    }//GEN-LAST:event_txt_nomeActionPerformed

    private void CB_num_docActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_num_docActionPerformed
        CB_num_doc.transferFocus();
    }//GEN-LAST:event_CB_num_docActionPerformed

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        ativar();
        btn_salvar.setText("Salvar");
        acao="salvar";
        btn_novo.enable(false);
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        if (txt_nome.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Insira o nome do quarto");
            txt_nome.requestFocus();
            return;
        }

        if (txt_descricao.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Insira umas descrição para o produto");
            txt_descricao.requestFocus();
            return;
        }

        if (txt_valor.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Insira o valor do produto");
            txt_valor.requestFocus();
            return;
        }

        Produtos dts = new Produtos();
        TabelaProdutos func = new TabelaProdutos();

        dts.setNome(txt_nome.getText());
        dts.setValor(Double.parseDouble(txt_valor.getText()));
        dts.setDescricao(txt_descricao.getText());

        int selecionado = CB_num_doc.getSelectedIndex();
        dts.setUnidadeDeMedida((String) CB_num_doc.getItemAt(selecionado));

        // realiza a ação ao clicar em salvar
        if (acao.equals("salvar")) {
            if (func.inserir(dts)) {
                JOptionPane.showMessageDialog(rootPane, "Produto foi registrado com sucesso!");
                mostrar("");
                desativar();
            }
        }
        else if (acao.equals("editar")) {
            dts.setId(Integer.parseInt(txt_id_pessoa.getText()));

            if (func.editar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "Produto editado com sucesso!");
                mostrar("");
                desativar();
            }
        }
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        limpar();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    void limpar() {
        txt_nome.setText("");
        txt_nomepai.setText("");
        txt_nomemae.setText("");
        txt_telefone.setText("");
        txt_codigo_cliente.setText("");
        txt_email.setText("");
        txt_nome.setText("");
        txt_endereco.setText("");
    }
    private void TB_listaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TB_listaMouseClicked
        btn_salvar.setText("Editar");
        ativar();
        btn_apagar.setEnabled(true);
        acao = "editar";
        int linha = TB_lista.rowAtPoint(evt.getPoint());

        txt_id_pessoa.setText(TB_lista.getValueAt(linha, 0).toString());
        txt_nome.setText(TB_lista.getValueAt(linha, 1).toString());
        CB_num_doc.setSelectedItem(TB_lista.getValueAt(linha, 3).toString());
        txt_descricao.setText(TB_lista.getValueAt(linha, 2).toString());
        txt_valor.setText(TB_lista.getValueAt(linha, 4).toString());

    }//GEN-LAST:event_TB_listaMouseClicked

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_sairActionPerformed

    private void btn_apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_apagarActionPerformed
        if (!txt_id_pessoa.getText().equals("")) {
            int confirmacao = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir este registro", "Exluir", 2);

            if (confirmacao == 0) {
                TabelaProdutos func = new TabelaProdutos();
                Produtos dts = new Produtos();
                dts.setId(Integer.parseInt(txt_id_pessoa.getText()));
                func.deletar(dts);
                mostrar("");
                desativar();
            }
        }
    }//GEN-LAST:event_btn_apagarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        mostrar(txt_pesquisar.getText());
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void txt_nomepaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomepaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomepaiActionPerformed

    private void txt_nomemaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomemaeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomemaeActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void txt_valorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_valorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_valorActionPerformed

    private void txt_telefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefoneActionPerformed

    private void txt_codigo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigo_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigo_clienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormularioClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB_num_doc;
    private javax.swing.JLabel LB_registros;
    private javax.swing.JTable TB_lista;
    private javax.swing.JButton btn_apagar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_sair;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txt_codigo_cliente;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextArea txt_endereco;
    private javax.swing.JTextField txt_id_pessoa;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_nomemae;
    private javax.swing.JTextField txt_nomepai;
    private javax.swing.JTextField txt_pesquisar;
    private javax.swing.JTextField txt_telefone;
    private javax.swing.JTextField txt_valor;
    // End of variables declaration//GEN-END:variables
}