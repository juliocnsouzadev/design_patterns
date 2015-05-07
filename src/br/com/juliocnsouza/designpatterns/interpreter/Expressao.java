package br.com.juliocnsouza.designpatterns.interpreter;

import br.com.juliocnsouza.designpatterns.interpreter.visitor.Visitor;

/**
 * Expressao.java -> Job:
 * <p>
 * @since 07/05/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public abstract class Expressao implements Expressible {

    protected Expressible esquerda;
    protected Expressible direita;

    public Expressao( Expressible esquerda , Expressible direita ) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    protected double resultadoDaDireita() {
        return direita.avalia();
    }

    protected double resultadoDaEsquerda() {
        return esquerda.avalia();
    }

    public Expressible getEsquerda() {
        return esquerda;
    }

    public Expressible getDireita() {
        return direita;
    }

    @Override
    public void aceita( Visitor visitor ) {
        visitor.visita( this );
    }

}
