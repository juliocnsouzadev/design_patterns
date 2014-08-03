package br.com.juliocnsouza.designpatterns.factory.model;

/**
 * Pessoa.java -> Job:
 * <p>
 * @since 03/08/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class Pessoa {

    private long id;

    private String nome;

    public long getId() {
        return id;
    }

    public void setId( long id ) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome( String nome ) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + ( int ) ( this.id ^ ( this.id >>> 32 ) );
        return hash;
    }

    @Override
    public boolean equals( Object obj ) {
        if ( obj == null ) {
            return false;
        }
        if ( getClass() != obj.getClass() ) {
            return false;
        }
        final Pessoa other = ( Pessoa ) obj;
        if ( this.id != other.id ) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + '}';
    }

}
