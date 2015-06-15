package br.com.juliocnsouza.designpatterns.command;

/**
 * PagaPedido.java -> Job:
 * <p>
 * @since 15/06/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class PagaPedido implements Comando {

    private Pedido pedido;

    public PagaPedido( Pedido pedido ) {
        this.pedido = pedido;
    }

    @Override
    public void executa() {
        pedido.paga();
    }

}
