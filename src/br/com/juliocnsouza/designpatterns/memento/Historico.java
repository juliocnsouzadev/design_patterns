package br.com.juliocnsouza.designpatterns.memento;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Historico.java -> Job:
 * <p>
 * @since 20/08/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class Historico {

    private List<Estado> estados = new ArrayList<Estado>();

    public Estado busca( int index ) {
        return estados.get( index );
    }

    public Estado busca( int dia , int mes , int ano ) {
        mes--;
        for ( Estado estado : estados ) {
            int diaEstado = estado.getDataHora().get( Calendar.DAY_OF_MONTH );
            int mesEstado = estado.getDataHora().get( Calendar.MONTH );
            int anoEstado = estado.getDataHora().get( Calendar.YEAR );
            if ( dia == diaEstado && mes == mesEstado && ano == anoEstado ) {
                return estado;
            }
        }
        return null;
    }

    public void adiciona( Estado estado ) {
        estados.add( estado );
    }

}
