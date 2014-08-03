package br.com.juliocnsouza.designpatterns.factory.dao;

import br.com.juliocnsouza.designpatterns.factory.model.Pessoa;
import java.sql.Connection;
import java.util.List;

/**
 * PessoaDAO.java -> Job:
 * <p>
 * @since 03/08/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class PessoaDAO implements Dao<Pessoa> {

    private final Connection con;

    public PessoaDAO( Connection con ) {
        this.con = con;
    }

    @Override
    public void salvar() {
        throw new UnsupportedOperationException( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pessoa buscaPelaID( long id ) {
        throw new UnsupportedOperationException( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pessoa> buscaTodos() {
        throw new UnsupportedOperationException( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

}
