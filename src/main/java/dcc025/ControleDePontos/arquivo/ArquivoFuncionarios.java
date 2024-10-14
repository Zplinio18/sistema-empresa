
package dcc025.ControleDePontos.arquivo;

import dcc025.ControleDePontos.exception.CPFException;
import dcc025.ControleDePontos.modelos.Funcionario;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class ArquivoFuncionarios {

    private static final String CAMINHO_ARQUIVO = "funcionarios.txt";

    public static void salvarFuncionario(Funcionario funcionario) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CAMINHO_ARQUIVO, true))) {
            writer.write(funcionario.getNome() + " - " + funcionario.getCpf() + " - " + funcionario.getFuncao()+ " - " + funcionario.isAtivo());
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Erro ao salvar o funcionário: " + e.getMessage());
        }
    }

    public static List<Funcionario> carregarFuncionarios(){
        List<Funcionario> funcionarios = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(CAMINHO_ARQUIVO))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(" - ");
                if (dados.length == 4) {
                    String nome = dados[0];
                    String cpf = dados[1];
                    String cargo = dados[2];
                    String ativo = dados[3];
                    Funcionario funcionario = new Funcionario(nome, cpf, cargo, ativo);
                    funcionarios.add(funcionario);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar os funcionários: " + e.getMessage());
        } catch (CPFException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        return funcionarios;
    }
    
    public static List<Funcionario> carregarAtivos(){
        List<Funcionario> funcionarios = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(CAMINHO_ARQUIVO))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(" - ");
                if (dados.length == 4) {
                    String nome = dados[0];
                    String cpf = dados[1];
                    String cargo = dados[2];
                    String ativo = dados[3];
                    
                    if(ativo.equals("true")){
                        Funcionario funcionario = new Funcionario(nome, cpf, cargo, ativo);
                        funcionarios.add(funcionario);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar os funcionários: " + e.getMessage());
        } catch (CPFException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        return funcionarios;
    }

    // Método para remover um funcionário do arquivo pelo CPF
    public static void removerFuncionario(String cpf) {
        File arquivoOriginal = new File(CAMINHO_ARQUIVO);
        File arquivoTemporario = new File("funcionarios_temp.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(arquivoOriginal));
             BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoTemporario))) {

            String linha;
            while ((linha = reader.readLine()) != null) {
                if (!linha.contains(cpf)) {
                    writer.write(linha);
                    writer.newLine();
                }
            }

        } catch (IOException e) {
            System.out.println("Erro ao remover o funcionário: " + e.getMessage());
        }

        if (arquivoOriginal.delete()) {
            arquivoTemporario.renameTo(arquivoOriginal);
        } else {
            System.out.println("Erro ao deletar o arquivo original.");
        }
    }
    
    public static void atualizarFuncionario(String cpfAntigo, Funcionario funcionarioAtualizado) {
        File arquivoOriginal = new File(CAMINHO_ARQUIVO);
        File arquivoTemporario = new File("funcionarios_temp.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(arquivoOriginal)); BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoTemporario))) {

            String linha;
            while ((linha = reader.readLine()) != null) {
                if (linha.contains(cpfAntigo)) {
                    writer.write(funcionarioAtualizado.getNome() + " - " + funcionarioAtualizado.getCpf() + " - " + funcionarioAtualizado.getFuncao()+ " - " + funcionarioAtualizado.getAtivo());
                } else {
                    writer.write(linha);
                }
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao atualizar o funcionário: " + e.getMessage());
        }

        if (arquivoOriginal.delete()) {
            arquivoTemporario.renameTo(arquivoOriginal);
        } else {
            System.out.println("Erro ao deletar o arquivo original.");
        }
    }
}

