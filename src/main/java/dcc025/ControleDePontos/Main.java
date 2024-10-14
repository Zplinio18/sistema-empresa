
package dcc025.ControleDePontos;

import dcc025.ControleDePontos.exception.CPFException;
import dcc025.ControleDePontos.telas.LoginFrame;

public class Main {

    public static void main(String[] args) throws CPFException {
        SistemaGerenciamento sistema = new SistemaGerenciamento();
        new LoginFrame(sistema).setVisible(true);
    }
}
