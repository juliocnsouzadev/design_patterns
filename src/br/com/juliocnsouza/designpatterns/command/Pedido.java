package br.com.juliocnsouza.designpatterns.command;

import java.util.Calendar;

/**
 * Pedido.java -> Job:
 * <p>
 * @since 15/06/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class Pedido {

    private String cliente;
    private double valor;
    private Status status;
    private Calendar dataFinalizacao;

    public Pedido( String cliente , double valor ) {
        this.cliente = cliente;
        this.valor = valor;
    }

    public void paga() {
        status = Status.PAGO;
    }

    public void finaliza() {
        dataFinalizacao = Calendar.getInstance();
        status = Status.ENTREGUE;
    }
}
