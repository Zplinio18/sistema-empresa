
package dcc025.ControleDePontos.modelos;

import dcc025.ControleDePontos.SistemaGerenciamento;
import dcc025.ControleDePontos.exception.CPFException;
import dcc025.ControleDePontos.telas.AdminFrame;

import javax.swing.JOptionPane;

public class Admin extends Usuario {
    
    public SistemaGerenciamento sistema;

    public Admin(String login, String senha, SistemaGerenciamento sistema) {
        super(login, senha);
        this.sistema = sistema;
    }
    
    @Override
    public void menu() {
        try {
            new AdminFrame(sistema).setVisible(true); // passa o sistema para a tela do Admin
        } catch (CPFException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}