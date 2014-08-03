package br.com.juliocnsouza.designpatterns.factory;

import br.com.juliocnsouza.designpatterns.factory.dao.PessoaDAO;

/**
 * Main.java -> Job:
 * <p>
 * @since 03/08/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class Main {

    public static void main( String[] args ) {
        //Criando um DAO e passando uma conexao gerada pela factory

        PessoaDAO dao = new PessoaDAO( ConnectionFactory.getInstance().getConnection(
                ConnectionFactory.Tipo.MY_SQL ) );
    }

}
