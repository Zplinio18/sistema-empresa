
package dcc025.ControleDePontos.telas;

import dcc025.ControleDePontos.SistemaGerenciamento;
import dcc025.ControleDePontos.exception.CPFException;
import dcc025.ControleDePontos.modelos.Funcionario;
import javax.swing.JOptionPane;

public class FuncionarioPontoFrame extends javax.swing.JFrame {

    private SistemaGerenciamento sistema;
    
    public FuncionarioPontoFrame(SistemaGerenciamento sistema) throws CPFException {
        initComponents();
        this.sistema = sistema;
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTFCPF = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButtonEntrada = new javax.swing.JButton();
        jButtonSaida = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(239, 239, 239));

        jPanel1.setBackground(new java.awt.Color(239, 239, 239));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Digite seu CPF (Ex.: 123.456.789-10):");

        jTFCPF.setBackground(new java.awt.Color(227, 227, 227));
        jTFCPF.setForeground(new java.awt.Color(0, 0, 0));
        jTFCPF.setCaretColor(new java.awt.Color(51, 51, 51));
        jTFCPF.setDisabledTextColor(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTFCPF))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(239, 239, 239));

        jButtonEntrada.setBackground(new java.awt.Color(0, 153, 153));
        jButtonEntrada.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonEntrada.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEntrada.setText("Registrar entrada");
        jButtonEntrada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntradaActionPerformed(evt);
            }
        });

        jButtonSaida.setBackground(new java.awt.Color(0, 153, 153));
        jButtonSaida.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonSaida.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSaida.setText("Registrar saída");
        jButtonSaida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaidaActionPerformed(evt);
            }
        });

        jButtonVoltar.setBackground(new java.awt.Color(0, 153, 153));
        jButtonVoltar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonVoltar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonEntrada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEntrada)
                    .addComponent(jButtonSaida)
                    .addComponent(jButtonVoltar))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntradaActionPerformed
        String cpf = jTFCPF.getText();
        Funcionario funcionario = sistema.buscarFuncionario(cpf);
        if (funcionario != null) {
            if (funcionario.isAtivo()) {
                JOptionPane.showMessageDialog(null, "Entrada já registrada!");
            } else {
                sistema.adicionarFuncionarioAtivo(funcionario);
                funcionario.setAtivo(true);
                try {
                    sistema.editarFuncionario(cpf, funcionario.getNome(), cpf, funcionario.getFuncao(), funcionario.getAtivo());
                } catch (CPFException ex) {
                    JOptionPane.showConfirmDialog(null, ex);
                }
                JOptionPane.showMessageDialog(null, "Entrada registrada com sucesso!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Funcionário não encontrado!");
        }
        jTFCPF.setText("");
    }//GEN-LAST:event_jButtonEntradaActionPerformed

    private void jButtonSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaidaActionPerformed
        String cpf = jTFCPF.getText();
        Funcionario funcionario = sistema.buscarFuncionario(cpf);
        if (funcionario != null) {
            if (funcionario.isAtivo()) {
                sistema.removerFuncionarioAtivo(cpf);
                funcionario.setAtivo(false);
                try {
                    sistema.editarFuncionario(cpf, funcionario.getNome(), cpf, funcionario.getFuncao(), funcionario.getAtivo());
                } catch (CPFException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                JOptionPane.showMessageDialog(null, "Saída registrada com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Você não registrou a entrada!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Funcionário não encontrado!");
        }
        jTFCPF.setText("");
    }//GEN-LAST:event_jButtonSaidaActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        new LoginFrame(sistema).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEntrada;
    private javax.swing.JButton jButtonSaida;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTFCPF;
    // End of variables declaration//GEN-END:variables
}
