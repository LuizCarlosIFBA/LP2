
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author 071720382
 */
public class TelaProduto extends javax.swing.JFrame {

        private ArrayList<Produto> listaProd = new ArrayList <Produto>();

    /**
     * Creates new form TelaProduto
     */
        
        
    public TelaProduto(ArrayList<Produto> lista) {
        initComponents();
        this.listaProd = lista;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoCodigo = new javax.swing.JTextField();
        campoNome = new javax.swing.JTextField();
        campoCategoria = new javax.swing.JComboBox<>();
        opcaoPerecivel = new javax.swing.JCheckBox();
        botaoInserir = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        campoPrecoVenda = new javax.swing.JTextField();
        botaoExcluir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Produtos");

        jLabel2.setText("Código:");

        jLabel3.setText("Nome: ");

        jLabel4.setText("Categoria: ");

        jLabel5.setText("Alimento Perecível");

        jLabel6.setText("Preço (R$) : ");

        campoCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCodigoActionPerformed(evt);
            }
        });

        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });

        campoCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grão", "Proteína", "Limpeza", "Hortifruti" }));

        opcaoPerecivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoPerecivelActionPerformed(evt);
            }
        });

        botaoInserir.setText("Inserir");
        botaoInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInserirActionPerformed(evt);
            }
        });

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        campoPrecoVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPrecoVendaActionPerformed(evt);
            }
        });

        botaoExcluir.setText("Excluir");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar Produto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton1))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(botaoInserir)
                        .addGap(29, 29, 29)
                        .addComponent(botaoExcluir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opcaoPerecivel))))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(opcaoPerecivel)
                    .addComponent(jLabel5))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campoPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoInserir)
                    .addComponent(botaoExcluir))
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCodigoActionPerformed

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void opcaoPerecivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoPerecivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcaoPerecivelActionPerformed

    private void botaoInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInserirActionPerformed
        Produto prod;
        
        String categoria = campoCategoria.getModel().getSelectedItem().toString();
        float precoVenda = Float.valueOf(campoPrecoVenda.getText()).floatValue();
        boolean perecivel = false;
                
        if(opcaoPerecivel.isSelected())
            perecivel = true;
        else
            perecivel = false;
              
       
        prod = new Produto(campoCodigo.getText(),campoNome.getText(),categoria,precoVenda,perecivel);
        
        listaProd.add(prod);
        
        JOptionPane.showMessageDialog(null, "Incluido com sucesso!");
        limpar();
    }//GEN-LAST:event_botaoInserirActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     
        String precoVenda;
  
        for (int i=0;i<listaProd.size();i++)
            if (listaProd.get(i).getCodigo().equals(campoCodigo.getText()))
            {
                campoNome.setText(listaProd.get(i).getNomeProduto());
                precoVenda = Float.toString(listaProd.get(i).getPrecoVenda());
                campoPrecoVenda.setText(precoVenda);
                opcaoPerecivel.setSelected(listaProd.get(i).isPerecivel());
                String categoria = listaProd.get(i).getCategoria();
                for (int j=0 ;j<campoCategoria.getModel().getSize(); j++)
                    if (campoCategoria.getModel().getElementAt(j).toString().equals(categoria))
                    { 
                        campoCategoria.setSelectedIndex(j);
                        break;
                    }
                
                }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void campoPrecoVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPrecoVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPrecoVendaActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
      
        for (int i=0;i<listaProd.size();i++)
            if (listaProd.get(i).getCodigo().equals(campoCodigo.getText()))
            {
               listaProd.remove(i);
            }
            
            limpar();
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          
        String precoVenda;
        Produto produto = new Produto();
        for (int i=0;i<listaProd.size();i++)
            
            if (listaProd.get(i).getNomeProduto().equals(campoNome.getText()))
            {
                
                campoNome.setText(listaProd.get(i).getCodigo());
                precoVenda = Float.toString(listaProd.get(i).getPrecoVenda());
                JOptionPane.showMessageDialog(null, "O preço de venda do produto é: " +produto.calculaPrecoVenda(listaProd.get(i).getPrecoVenda()));
                campoPrecoVenda.setText(precoVenda);
                
                String categoria = listaProd.get(i).getCategoria();
                for (int j=0 ;j<campoCategoria.getModel().getSize(); j++)
                    if (campoCategoria.getModel().getElementAt(j).toString().equals(categoria))
                    { 
                        campoCategoria.setSelectedIndex(j);
                        break;
                    }
                
                }
       
    }//GEN-LAST:event_jButton1ActionPerformed

        
    public void limpar(){
        campoCodigo.setText("");
        campoNome.setText("");
        campoCategoria.setSelectedIndex(0);
        campoPrecoVenda.setText("");
        opcaoPerecivel.setSelected(false);
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoInserir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> campoCategoria;
    private javax.swing.JTextField campoCodigo;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoPrecoVenda;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JCheckBox opcaoPerecivel;
    // End of variables declaration//GEN-END:variables
}
