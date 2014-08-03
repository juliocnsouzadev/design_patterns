package br.com.juliocnsouza.designpatterns.flyweight;

/**
 * Fa.java -> Job:
 * <p>
 * @since 03/08/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class Fa implements Nota {

    public Fa() {
    }

    @Override
    public String simbolo() {
        return "F";
    }

}
