package br.com.juliocnsouza.designpatterns.memento;

/**
 * OrdemDeServico.java -> Job:
 * <p>
 * @since 20/08/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class OrdemDeServico {

    public enum Status {

        AGUARDANDO_AVALIACAO,
        EM_AVALIACAO,
        PARA_ORCAMENTO,
        APROVADA,
        PRONTO,
        ENTREGUE
    }

    private String cliente;
    private Status status;

    public OrdemDeServico( String cliente ) {
        this.cliente = cliente;
        status = Status.AGUARDANDO_AVALIACAO;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente( String cliente ) {
        this.cliente = cliente;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus( Status status ) {
        this.status = status;
    }

    public void avanca() {
        switch ( status ) {
            case AGUARDANDO_AVALIACAO:
                status = Status.EM_AVALIACAO;
                break;
            case EM_AVALIACAO:
                status = Status.PARA_ORCAMENTO;
                break;

            case PARA_ORCAMENTO:
                status = Status.APROVADA;
                break;

            case APROVADA:
                status = Status.PRONTO;
                break;

            case PRONTO:
                status = Status.ENTREGUE;
                break;
            default:
                status = Status.ENTREGUE;
                break;
        }
    }

    public Estado salvaEstado() {
        return new Estado( new OrdemDeServico( cliente ) );
    }

    public void restaurar( Estado estado ) {
        this.cliente = estado.getOrdemDeServico().getCliente();
        this.status = estado.getOrdemDeServico().getStatus();
    }

}
