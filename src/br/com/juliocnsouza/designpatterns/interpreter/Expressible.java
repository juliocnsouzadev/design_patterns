package br.com.juliocnsouza.designpatterns.interpreter;

import br.com.juliocnsouza.designpatterns.interpreter.visitor.Visitor;

/**
 * Expressible.java -> Job:
 * <p>
 * @since 07/05/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public interface Expressible {

    double avalia();

    void aceita( Visitor visitor );

}
