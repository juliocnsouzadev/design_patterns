package br.com.juliocnsouza.designpatterns.factory.dao;

import java.util.List;

/**
 * Dao.java -> Job:
 * <p>
 * @since 03/08/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
interface Dao<T> {

    void salvar();

    T buscaPelaID( long id );

    List<T> buscaTodos();

}
