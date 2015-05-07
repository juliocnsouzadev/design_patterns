package br.com.juliocnsouza.designpatterns.flyweight;

/**
 * Do.java -> Job:
 * <p>
 * @since 03/08/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class DoSustenido implements Nota {

    public DoSustenido() {
    }

    @Override
    public String simbolo() {
        return "C#";
    }

}
