package br.com.juliocnsouza.designpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * NotasMusicais.java -> Job:
 * <p>
 * @since 03/08/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class NotasMusicais {

    public enum Tipo {

        DO,
        RE,
        MI,
        FA,
        SOL,
        LA,
        SI;
    }

    private static final Map<Tipo , Nota> notas = new HashMap<>();

    static {
        notas.put( Tipo.DO , new Do() );
        notas.put( Tipo.RE , new Re() );
        notas.put( Tipo.MI , new Mi() );
        notas.put( Tipo.FA , new Fa() );
        notas.put( Tipo.SOL , new Sol() );
        notas.put( Tipo.LA , new La() );
        notas.put( Tipo.SI , new Si() );
    }

    public Nota pega( Tipo tipo ) {
        return notas.get( tipo );
    }

}
