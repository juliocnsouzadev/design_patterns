package br.com.juliocnsouza.designpatterns.memento;

import java.util.Calendar;

/**
 * Estado.java -> Job:
 * <p>
 * @since 20/08/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class Estado {

    private final Calendar dataHora;

    private final OrdemDeServico ordemDeServico;

    public Estado( OrdemDeServico ordemDeServico ) {
        this.ordemDeServico = ordemDeServico;
        this.dataHora = Calendar.getInstance();
    }

    public Calendar getDataHora() {
        return dataHora;
    }

    public OrdemDeServico getOrdemDeServico() {
        return ordemDeServico;
    }

}
