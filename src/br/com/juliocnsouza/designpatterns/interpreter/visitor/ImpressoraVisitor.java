package br.com.juliocnsouza.designpatterns.interpreter.visitor;

import br.com.juliocnsouza.designpatterns.interpreter.Divisao;
import br.com.juliocnsouza.designpatterns.interpreter.Expressao;
import br.com.juliocnsouza.designpatterns.interpreter.Expressible;
import br.com.juliocnsouza.designpatterns.interpreter.Multiplicacao;
import br.com.juliocnsouza.designpatterns.interpreter.Numero;
import br.com.juliocnsouza.designpatterns.interpreter.RaizQuadrada;
import br.com.juliocnsouza.designpatterns.interpreter.Soma;
import br.com.juliocnsouza.designpatterns.interpreter.Subtracao;

/**
 * ImpressoraVisitor.java -> Job:
 * <p>
 * @since 07/05/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class ImpressoraVisitor implements Visitor {

    @Override
    public void visita( Expressible expressao ) {
        if ( expressao == null ) {
            return;
        }
        if ( expressao instanceof Soma ) {
            visitaSoma( ( Soma ) expressao );
        }
        if ( expressao instanceof Subtracao ) {
            visitaSubtracao( ( Subtracao ) expressao );
        }
        if ( expressao instanceof Divisao ) {
            visitaDivisao( ( Divisao ) expressao );
        }
        if ( expressao instanceof Multiplicacao ) {
            visitaMultiplicacao( ( Multiplicacao ) expressao );
        }
        if ( expressao instanceof Numero ) {
            visitaNumero( ( Numero ) expressao );
        }
        if ( expressao instanceof RaizQuadrada ) {
            visitaRaizQuadrada( ( RaizQuadrada ) expressao );
        }
    }

    private void print( Expressao expressao , String sinal ) {
        System.out.print( "(" );
        expressao.getEsquerda().aceita( this );
        System.out.print( ")" );
        System.out.print( sinal );
        System.out.print( "(" );
        expressao.getDireita().aceita( this );
        System.out.print( ")" );
    }

    private void visitaSoma( Soma expressao ) {
        print( expressao , " + " );
    }

    private void visitaSubtracao( Subtracao expressao ) {
        print( expressao , " - " );
    }

    private void visitaDivisao( Divisao expressao ) {
        print( expressao , " / " );
    }

    private void visitaMultiplicacao( Multiplicacao expressao ) {
        print( expressao , " * " );
    }

    private void visitaNumero( Numero expressao ) {
        System.out.print( expressao.getNumero() );
    }

    private void visitaRaizQuadrada( RaizQuadrada expressao ) {
        System.out.print( "V" + expressao.getExpressao() );
    }

}
