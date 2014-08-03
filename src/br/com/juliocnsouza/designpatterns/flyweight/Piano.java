package br.com.juliocnsouza.designpatterns.flyweight;

import java.util.List;
import org.jfugue.Player;

/**
 * Piano.java -> Job:
 * <p>
 * @since 03/08/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class Piano {

    public void tocar( List<Nota> musica ) {
        Player player = new Player();
        StringBuilder notas = new StringBuilder();
        for ( Nota nota : musica ) {
            notas.append( nota.simbolo() ).append( " " );
        }
        player.play( notas.toString() );
    }

}
