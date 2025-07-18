package view;

import controller.MateriaPrimaController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.MateriaPrimaModel;

/**
 *
 * @author pichau
 */
public class MateriaPrimaView extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MateriaPrimaView.class.getName());

    /**
     * Creates new form MateriaPrimaView
     */
    private int linha = -1;
    public MateriaPrimaView() {
        initComponents();
        preencherTabela();
        inicializa();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jpMateriaPrima = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMateriaPrima = new javax.swing.JTable();
        jlCodigo = new javax.swing.JLabel();
        jlNome = new javax.swing.JLabel();
        jlCustoPorKG = new javax.swing.JLabel();
        jtxidMateriaPrima = new javax.swing.JTextField();
        jtxNome = new javax.swing.JTextField();
        jtxCustoPorKG = new javax.swing.JTextField();
        jbNovo = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbFechar = new javax.swing.JButton();
        jbPesquisar = new javax.swing.JButton();
        jifMateriaPrima = new javax.swing.JInternalFrame();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtMateriaPrima.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nome", "Custo por Kg"
            }
        ));
        jtMateriaPrima.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtMateriaPrimaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtMateriaPrima);

        jlCodigo.setText("Código");

        jlNome.setText("Nome:");

        jlCustoPorKG.setText("Custo por Kg:");

        jtxidMateriaPrima.setMinimumSize(new java.awt.Dimension(80, 22));

        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbEditar.setText("Editar");
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbFechar.setText("Fechar");
        jbFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharActionPerformed(evt);
            }
        });

        jbPesquisar.setText("Pesquisar");
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpMateriaPrimaLayout = new javax.swing.GroupLayout(jpMateriaPrima);
        jpMateriaPrima.setLayout(jpMateriaPrimaLayout);
        jpMateriaPrimaLayout.setHorizontalGroup(
            jpMateriaPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMateriaPrimaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jpMateriaPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpMateriaPrimaLayout.createSequentialGroup()
                        .addComponent(jbNovo)
                        .addGap(18, 18, 18)
                        .addComponent(jbSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(jbEditar)
                        .addGap(18, 18, 18)
                        .addComponent(jbExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(jbFechar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpMateriaPrimaLayout.createSequentialGroup()
                        .addGroup(jpMateriaPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlCustoPorKG)
                            .addComponent(jlNome)
                            .addComponent(jlCodigo))
                        .addGap(18, 18, 18)
                        .addGroup(jpMateriaPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpMateriaPrimaLayout.createSequentialGroup()
                                .addComponent(jtxidMateriaPrima, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbPesquisar))
                            .addComponent(jtxNome)
                            .addGroup(jpMateriaPrimaLayout.createSequentialGroup()
                                .addComponent(jtxCustoPorKG, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                .addGap(174, 174, 174)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jpMateriaPrimaLayout.setVerticalGroup(
            jpMateriaPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMateriaPrimaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jpMateriaPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCodigo)
                    .addComponent(jtxidMateriaPrima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPesquisar))
                .addGap(18, 18, 18)
                .addGroup(jpMateriaPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome)
                    .addComponent(jtxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpMateriaPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCustoPorKG)
                    .addComponent(jtxCustoPorKG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jpMateriaPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNovo)
                    .addComponent(jbSalvar)
                    .addComponent(jbEditar)
                    .addComponent(jbExcluir)
                    .addComponent(jbFechar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jifMateriaPrima.setVisible(true);

        javax.swing.GroupLayout jifMateriaPrimaLayout = new javax.swing.GroupLayout(jifMateriaPrima.getContentPane());
        jifMateriaPrima.getContentPane().setLayout(jifMateriaPrimaLayout);
        jifMateriaPrimaLayout.setHorizontalGroup(
            jifMateriaPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jifMateriaPrimaLayout.setVerticalGroup(
            jifMateriaPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jpMateriaPrima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jifMateriaPrima))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jifMateriaPrima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpMateriaPrima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        jbPesquisar.setEnabled(false);
        jbNovo.setEnabled(false);
        jbEditar.setEnabled(false);
        jbExcluir.setEnabled(false);
        jbSalvar.setEnabled(true);
        jtxidMateriaPrima.setEditable(false);
        jtxNome.setEditable(true);
        jtxCustoPorKG.setEditable(true);
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        if((jtxNome.getText().isEmpty())||(jtxCustoPorKG.getText().isEmpty()))
            JOptionPane.showMessageDialog(this, "Digite todos os campos!"
                    , "Retorno Tela", JOptionPane.ERROR_MESSAGE);
        else{
            String nome = jtxNome.getText();
            float custo  = Float.parseFloat(jtxCustoPorKG.getText());
            //PASSAR PARAMETROS
            MateriaPrimaModel materiaPrima = new MateriaPrimaModel();
            materiaPrima.setNome(nome);
            materiaPrima.setCustoPorKG(custo);
            //CONTROLLER
            MateriaPrimaController controller = new MateriaPrimaController();
            if(controller.inserir(materiaPrima)){
                JOptionPane.showMessageDialog(this, "Materia Prima Inserida com sucesso!");
                limparCampos();
                inicializa();
                preencherTabela();
            }else
                JOptionPane.showMessageDialog(this, "Erro ao inserir Materia Prima!"
                    , "Retorno BD", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        int idMateriaPrima = Integer.parseInt(jtxidMateriaPrima.getText());
        
        if((jtxNome.getText().isEmpty())||(jtxCustoPorKG.getText().isEmpty()))
            JOptionPane.showMessageDialog(this, "Digite todos os campos!"
                    , "Retorno Tela", JOptionPane.ERROR_MESSAGE);
        else{
            String nome = jtxNome.getText();
            float custo  = Float.parseFloat(jtxCustoPorKG.getText());
            
            MateriaPrimaModel MP = new MateriaPrimaModel();
            MP.setIdMateriaPrima(idMateriaPrima);
            MP.setNome(nome);
            MP.setCustoPorKG(custo);
            //CONTROLLER
            MateriaPrimaController controller = new MateriaPrimaController();
            if(controller.editar(MP)){
                JOptionPane.showMessageDialog(this, "Atualização com sucesso!");
                limparCampos();
                inicializa();
                preencherTabela();
            }else
                JOptionPane.showMessageDialog(this, "Erro ao editar Materia Prima!"
                    , "Retorno BD", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        MateriaPrimaModel MP = new MateriaPrimaModel();
        if(jtxidMateriaPrima.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "Digite o código do Materia Prima!"
                    , "Retorno Tela", JOptionPane.ERROR_MESSAGE);
        else{
            MP.setIdMateriaPrima(Integer.parseInt(jtxidMateriaPrima.getText()));
            //CONTROLLER 
            MateriaPrimaController controller = new MateriaPrimaController();
            if(controller.excluir(MP)){
                JOptionPane.showMessageDialog(this, "Excluído com sucesso!");
                limparCampos();
                inicializa();
                preencherTabela();
            }else 
                JOptionPane.showMessageDialog(this, "Erro ao Excluir!"
                    , "Retorno BD", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jbFecharActionPerformed

    private void jtMateriaPrimaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtMateriaPrimaMouseClicked
        linha = jtMateriaPrima.getSelectedRow();
        if(linha !=-1){
            jtxidMateriaPrima.setText(jtMateriaPrima.getValueAt(linha, 0).toString());
            jtxNome.setText(jtMateriaPrima.getValueAt(linha, 1).toString());
            jtxCustoPorKG.setText(jtMateriaPrima.getValueAt(linha, 2).toString());
            jbNovo.setEnabled(false);
            jbSalvar.setEnabled(false);
            jbEditar.setEnabled(true);
            jbExcluir.setEnabled(true);
            jtxidMateriaPrima.setEditable(false);
            jtxNome.setEditable(true);
            jtxCustoPorKG.setEditable(true);            
            linha = -1;
        }
    }//GEN-LAST:event_jtMateriaPrimaMouseClicked

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
        MateriaPrimaModel MP = new MateriaPrimaModel();
        if(jtxidMateriaPrima.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "Preencha o código do produto!"
                    , "Retorno Tela", JOptionPane.ERROR_MESSAGE);
        else{
            MP.setIdMateriaPrima(Integer.parseInt(jtxidMateriaPrima.getText()));
            //CONTROLLER
            MateriaPrimaController controller = new MateriaPrimaController();
            MP = controller.selecionar(MP);
            //VALIDAR SE OBJETO FORNECEDOR FOI ENCONTRADO... 
            if(MP == null)
                JOptionPane.showMessageDialog(this, "Produto não encontrado!"
                    , "Retorno BD", JOptionPane.ERROR_MESSAGE);
            else{
                //PREENCHER OS CAMPOS...
                jtxNome.setText(MP.getNome());
                jtxCustoPorKG.setText(String.valueOf(MP.getCustoPorKG()));
                jtxidMateriaPrima.setText(String.valueOf(MP.getIdMateriaPrima()));
                jbNovo.setEnabled(false);
                jbSalvar.setEnabled(false);
                jbEditar.setEnabled(true);
                jbExcluir.setEnabled(true);
                jtxidMateriaPrima.setEditable(false);
                jtxCustoPorKG.setEditable(true);
                jtxNome.setEditable(true);
            }
        }
    }//GEN-LAST:event_jbPesquisarActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    private void preencherTabela(){
        MateriaPrimaController controller = new MateriaPrimaController();
        ArrayList<MateriaPrimaModel> lista = controller.selecionarTodos();
        DefaultTableModel modeloTabela = (DefaultTableModel) jtMateriaPrima.getModel();
        modeloTabela.setRowCount(0);
        if(lista.isEmpty())
            JOptionPane.showMessageDialog(this, "Nenhuma Materia Prima cadastrada!"
                    ,"Retorno Tela", JOptionPane.ERROR_MESSAGE);
        else{
            
            for(MateriaPrimaModel f: lista){
                modeloTabela.addRow(new String[]{
                    String.valueOf(f.getIdMateriaPrima()),
                    String.valueOf(f.getNome()),
                    String.valueOf(f.getCustoPorKG())
                });
            }
        }
    }
    private void inicializa(){
        jtxidMateriaPrima.setEditable(true);
        jtxCustoPorKG.setEditable(false);
        jtxNome.setEditable(false);
        jbSalvar.setEnabled(false);
        jbEditar.setEnabled(false);
        jbExcluir.setEnabled(false);
        jbPesquisar.setEnabled(true);
        jbNovo.setEnabled(true);
    }
    private void limparCampos(){
        jtxNome.setText("");
        jtxCustoPorKG.setText("");
        jtxidMateriaPrima.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JInternalFrame jifMateriaPrima;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlCustoPorKG;
    private javax.swing.JLabel jlNome;
    private javax.swing.JPanel jpMateriaPrima;
    private javax.swing.JTable jtMateriaPrima;
    private javax.swing.JTextField jtxCustoPorKG;
    private javax.swing.JTextField jtxNome;
    private javax.swing.JTextField jtxidMateriaPrima;
    // End of variables declaration//GEN-END:variables
}
