package br.com.juliocnsouza.designpatterns.interpreter;

/**
 * Numero.java -> Job:
 * <p>
 * @since 07/05/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class Numero implements Expressible {

    private final double numero;

    public Numero( double numero ) {
        this.numero = numero;
    }

    @Override
    public double avalia() {
        return numero;
    }

}
