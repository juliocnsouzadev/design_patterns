package br.com.juliocnsouza.designpatterns.memento;

/**
 * Main.java -> Job:
 * <p>
 * @since 20/08/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class Main {

    public static void main( String[] args ) {
        Historico historico = new Historico();

        OrdemDeServico os = new OrdemDeServico( "Julio" );
        System.out.println( "OS status: " + os.getStatus() );
        historico.adiciona( os.salvaEstado() );
        os.avanca();
        System.out.println( "OS status: " + os.getStatus() );
        historico.adiciona( os.salvaEstado() );
        os.avanca();
        System.out.println( "OS status: " + os.getStatus() );
        Estado estado = historico.busca( 0 );
        os.restaurar( estado );
        System.out.println( "OS status: " + os.getStatus() );
    }

}
