package br.com.juliocnsouza.designpatterns.interpreter.visitor;

import br.com.juliocnsouza.designpatterns.interpreter.Divisao;
import br.com.juliocnsouza.designpatterns.interpreter.Expressao;
import br.com.juliocnsouza.designpatterns.interpreter.Multiplicacao;
import br.com.juliocnsouza.designpatterns.interpreter.Numero;
import br.com.juliocnsouza.designpatterns.interpreter.RaizQuadrada;
import br.com.juliocnsouza.designpatterns.interpreter.Soma;
import br.com.juliocnsouza.designpatterns.interpreter.Subtracao;

/**
 * Main.java -> Job:
 * <p>
 * @since 07/05/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class Main {

    public static void main( String[] args ) {
        Expressao esquerda = new Subtracao( new Numero( 12.2 ) , new Numero( 11.2 ) );
        Expressao direita = new Soma( new Divisao( new Numero( 400.00 ) , new RaizQuadrada(
                                                   new Numero( 144.00 ) ) ) , new Soma( new Numero(
                                                      132.1 ) , new Numero( 1.2 ) ) );
        Expressao conta = new Multiplicacao( esquerda , direita );

        Visitor visitor = new ImpressoraVisitor();
        conta.aceita( visitor );
        System.out.print( " é igual a " + conta.avalia() + "\n" );
    }

}
