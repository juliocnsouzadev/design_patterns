package br.com.juliocnsouza.designpatterns.command;

/**
 * ConcluiPedido.java -> Job:
 * <p>
 * @since 15/06/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class ConcluiPedido implements Comando {

    private Pedido pedido;

    public ConcluiPedido( Pedido pedido ) {
        this.pedido = pedido;
    }

    @Override
    public void executa() {
        pedido.finaliza();
    }

}
