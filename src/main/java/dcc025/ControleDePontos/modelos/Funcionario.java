
package dcc025.ControleDePontos.modelos;

import dcc025.ControleDePontos.exception.CPFException;

public class Funcionario {
    private String nome;
    private String cpf;
    private String funcao;
    private boolean ativo;

    public Funcionario(String nome, String cpf, String funcao, String ativo) throws CPFException {
        this.nome = nome;
        setCpf(cpf);
        this.funcao = funcao;
        if(ativo.equals("false"))
            this.ativo = false;
        else
            this.ativo = true;
    }

    // Getters e Setters
    public String getNome() {
        return nome; 
    }
    
    public String getCpf() { 
        return cpf; 
    }
    
    public String getFuncao() {
        return funcao; 
    }
    public boolean isAtivo() { 
        return ativo; 
    }
    public String getAtivo(){
        if(this.ativo)
            return "true";
        
        return "false";
    }

    public void setCpf(String cpf) throws CPFException {
        if(!isCPFValid(cpf))
            throw new CPFException();
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    
    public static boolean isCPFValid(String cpf) throws CPFException {
        // verifica se o cpf está no formato correto
        if(!cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}"))
            return false;
            
        // remove os . e -
        cpf = cpf.replace(".", "");
        cpf = cpf.replace("-", "");

        // verifica se o CPF tem 11 digitos
        if (cpf.length() != 11) {
            return false;
        }

        // verifica se todos os digitos são iguais
        if (cpf.equals("00000000000") || cpf.equals("11111111111") ||
            cpf.equals("22222222222") || cpf.equals("33333333333") ||
            cpf.equals("44444444444") || cpf.equals("55555555555") ||
            cpf.equals("66666666666") || cpf.equals("77777777777") ||
            cpf.equals("88888888888") || cpf.equals("99999999999")) {
            return false;
        }

        // calcula os dígitos verificadores
        if (!verificaDigitos(cpf)) {
            return false;
        }

        return true;
    }

    private static boolean verificaDigitos(String cpf) {
        // conta utilizada para criação de cpf no Brasil
        char dig10, dig11;
        int soma, i, resto, numero, peso;

        soma = 0;
        peso = 10;
            
        for (i = 0; i < 9; i++) {
            numero = (int) (cpf.charAt(i) - 48);
            soma = soma + (numero * peso);
            peso--;
        }

        resto = 11 - (soma % 11);

        if ((resto == 10) || (resto == 11)) {
            dig10 = '0';
        } else {
            dig10 = (char) (resto + 48);
        }

        soma = 0;
        peso = 11;

        for (i = 0; i < 10; i++) {
            numero = (int) (cpf.charAt(i) - 48);
            soma = soma + (numero * peso);
            peso--;
        }

        resto = 11 - (soma % 11);
        if ((resto == 10) || (resto == 11)) {
            dig11 = '0';
        } else {
            dig11 = (char) (resto + 48);
        }

        if ((dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10))) 
            return true;
        else
            return false;
    }
    
    public void setAtivo(boolean ativo) {
        this.ativo = ativo; 
    }
}
