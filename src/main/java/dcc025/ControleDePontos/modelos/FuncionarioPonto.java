
package dcc025.ControleDePontos.modelos;

import dcc025.ControleDePontos.exception.CPFException;
import dcc025.ControleDePontos.telas.FuncionarioPontoFrame;
import dcc025.ControleDePontos.SistemaGerenciamento;
import javax.swing.JOptionPane;

public class FuncionarioPonto extends Usuario {
    public SistemaGerenciamento sistema;

    public FuncionarioPonto(String login, String senha, SistemaGerenciamento sistema) {
        super(login, senha);
        this.sistema = sistema;
        
    }

    @Override
    public void menu() {
        try {
            new FuncionarioPontoFrame(sistema).setVisible(true); // Passa o sistema para a interface FuncionarioPontoFrame
        } catch (CPFException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}