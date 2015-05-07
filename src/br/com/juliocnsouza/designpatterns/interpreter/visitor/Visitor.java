package br.com.juliocnsouza.designpatterns.interpreter.visitor;

import br.com.juliocnsouza.designpatterns.interpreter.Expressible;

/**
 * Visitor.java -> Job:
 * <p>
 * @since 07/05/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public interface Visitor {

    void visita( Expressible expressao );

}
