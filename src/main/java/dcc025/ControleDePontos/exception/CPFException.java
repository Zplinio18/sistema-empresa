
package dcc025.ControleDePontos.exception;

public class CPFException extends Exception {
    public CPFException() {
        super("CPF inválido ou no formato incorreto (deve ser: 123.456.789-10)!");
    }
}
