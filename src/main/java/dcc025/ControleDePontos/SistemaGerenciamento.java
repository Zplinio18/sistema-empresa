
package dcc025.ControleDePontos;

import dcc025.ControleDePontos.arquivo.ArquivoFuncionarios;
import dcc025.ControleDePontos.exception.CPFException;
import dcc025.ControleDePontos.modelos.Funcionario;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class SistemaGerenciamento {
    private List<Funcionario> listaFuncionarios = new ArrayList<>();
    private List<Funcionario> funcionariosAtivos = new ArrayList<>();

    public SistemaGerenciamento() throws CPFException {
        preencheFuncionarios();
    }
    
    public void preencheFuncionarios() throws CPFException {
        listaFuncionarios = ArquivoFuncionarios.carregarFuncionarios();
        funcionariosAtivos = ArquivoFuncionarios.carregarAtivos();
    }

    // Adicionar novo funcionário à lista
     public void adicionarFuncionario(Funcionario funcionario) {
        listaFuncionarios.add(funcionario);
        ArquivoFuncionarios.salvarFuncionario(funcionario);
    }
     
    public void editarFuncionario(String cpfAntigo, String nomeNovo, String cpfNovo, String funcaoNova, String ativo) throws CPFException {
        Funcionario funcionario = buscarFuncionario(cpfAntigo);
        listaFuncionarios.removeIf(f -> f.getCpf().equals(cpfAntigo));
        
        if(funcionario.isAtivo()){
            funcionariosAtivos.removeIf(f -> f.getCpf().equals(cpfAntigo));
        }
        
        if (funcionario != null) {
            funcionario.setNome(nomeNovo);
            funcionario.setCpf(cpfNovo);
            funcionario.setFuncao(funcaoNova);
            
            if(ativo.equals("false"))
                funcionario.setAtivo(false);
            else{
                funcionario.setAtivo(true);
                funcionariosAtivos.add(funcionario);
            }
            
            ArquivoFuncionarios.atualizarFuncionario(cpfAntigo, funcionario);
            
            listaFuncionarios.add(funcionario);
        } else {
            JOptionPane.showMessageDialog(null, "Funcionário não encontrado!");
        }
    }

    public void removerFuncionario(String cpf) {
        listaFuncionarios.removeIf(f -> f.getCpf().equals(cpf));
        funcionariosAtivos.removeIf(f -> f.getCpf().equals(cpf));
        ArquivoFuncionarios.removerFuncionario(cpf);
    }

    public Funcionario buscarFuncionario(String cpf) {
        for (Funcionario f : listaFuncionarios) {
            if (f.getCpf().equals(cpf)) {
                return f;
            }
        }
        return null;
    }

    public void adicionarFuncionarioAtivo(Funcionario funcionario) {
        if (!funcionariosAtivos.contains(funcionario)) {
            funcionariosAtivos.add(funcionario);
        }
    }

    public void removerFuncionarioAtivo(String cpf) {
        funcionariosAtivos.removeIf(f -> f.getCpf().equals(cpf));
    }

    public List<Funcionario> getFuncionariosAtivos() {
        return funcionariosAtivos;
    }
    
    public List<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }
}
