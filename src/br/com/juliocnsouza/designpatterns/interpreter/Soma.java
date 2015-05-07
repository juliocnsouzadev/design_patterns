package br.com.juliocnsouza.designpatterns.interpreter;

/**
 * Soma.java -> Job:
 * <p>
 * @since 07/05/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class Soma extends Expressao {

    public Soma( Expressible esquerda , Expressible direita ) {
        super( esquerda , direita );
    }

    @Override
    public double avalia() {
        return resultadoDaDireita() + resultadoDaEsquerda();
    }

}
