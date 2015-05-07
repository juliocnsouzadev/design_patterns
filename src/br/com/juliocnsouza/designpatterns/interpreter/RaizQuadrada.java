package br.com.juliocnsouza.designpatterns.interpreter;

import br.com.juliocnsouza.designpatterns.interpreter.visitor.Visitor;

/**
 * RaizQuadrada.java -> Job:
 * <p>
 * @since 07/05/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class RaizQuadrada implements Expressible {

    private final Expressible expressao;

    public RaizQuadrada( Expressible expressao ) {
        this.expressao = expressao;

    }

    @Override
    public double avalia() {
        return Math.sqrt( expressao.avalia() );
    }

    @Override
    public void aceita( Visitor visitor ) {
        visitor.visita( this );
    }

    public double getExpressao() {
        return expressao.avalia();
    }

}
