
package dcc025.ControleDePontos.telas;

import dcc025.ControleDePontos.SistemaGerenciamento;
import dcc025.ControleDePontos.modelos.Admin;
import dcc025.ControleDePontos.modelos.FuncionarioPonto;
import dcc025.ControleDePontos.modelos.Usuario;
import javax.swing.JOptionPane;

public class LoginFrame extends javax.swing.JFrame {
    public SistemaGerenciamento sistema;
    public Usuario admin;
    public Usuario funcionarioP;
    
    public LoginFrame(SistemaGerenciamento sistema) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.sistema = sistema;
        this.admin = new Admin("admin", "admin123", sistema);
        this.funcionarioP = new FuncionarioPonto("func", "func456", sistema);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TelaLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTFLogin = new javax.swing.JTextField();
        jPFSenha = new javax.swing.JPasswordField();
        jButtonEntrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TelaLogin.setBackground(new java.awt.Color(239, 239, 239));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Acessar sistema");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Login");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Senha");

        jTFLogin.setBackground(new java.awt.Color(227, 227, 227));
        jTFLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jPFSenha.setBackground(new java.awt.Color(227, 227, 227));

        jButtonEntrar.setBackground(new java.awt.Color(0, 153, 153));
        jButtonEntrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonEntrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEntrar.setText("Entrar");
        jButtonEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TelaLoginLayout = new javax.swing.GroupLayout(TelaLogin);
        TelaLogin.setLayout(TelaLoginLayout);
        TelaLoginLayout.setHorizontalGroup(
            TelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaLoginLayout.createSequentialGroup()
                .addGroup(TelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TelaLoginLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(TelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(TelaLoginLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(TelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPFSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                                    .addComponent(jTFLogin)))))
                    .addGroup(TelaLoginLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaLoginLayout.createSequentialGroup()
                .addGap(0, 179, Short.MAX_VALUE)
                .addComponent(jButtonEntrar)
                .addGap(179, 179, 179))
        );
        TelaLoginLayout.setVerticalGroup(
            TelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaLoginLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(TelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTFLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(TelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jPFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonEntrar)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TelaLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TelaLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        String login = jTFLogin.getText();
        String senha = new String(jPFSenha.getPassword());

        // simulando autenticação
        if (login.equals(admin.getLogin()) && senha.equals(admin.getSenha())) {
            admin.menu();
            dispose();
        } else if(login.equals(funcionarioP.getLogin()) && senha.equals(funcionarioP.getSenha())){
            funcionarioP.menu();
            dispose();
        } else{
            JOptionPane.showMessageDialog(null, "Usuário inválido!");
            jTFLogin.setText("");
            jPFSenha.setText("");
        }
    }//GEN-LAST:event_jButtonEntrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TelaLogin;
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPFSenha;
    private javax.swing.JTextField jTFLogin;
    // End of variables declaration//GEN-END:variables
}
