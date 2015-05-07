package br.com.juliocnsouza.designpatterns.flyweight;

import java.util.Arrays;
import java.util.List;

/**
 * Main.java -> Job:
 * <p>
 * @since 03/08/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class Main {

    public static void main( String[] args )
            throws Exception {
        NotasMusicais notas = new NotasMusicais();
        List<Nota> musica = Arrays.asList( notas.pega( NotasMusicais.Tipo.DO ) ,
                                           notas.pega( NotasMusicais.Tipo.RE ) ,
                                           notas.pega( NotasMusicais.Tipo.MI ) ,
                                           notas.pega( NotasMusicais.Tipo.FA ) ,
                                           notas.pega( NotasMusicais.Tipo.FA ) ,
                                           notas.pega( NotasMusicais.Tipo.FA ) ,
                                           notas.pega( NotasMusicais.Tipo.DO_SUSTENIDO ) ,
                                           notas.pega( NotasMusicais.Tipo.DO_SUSTENIDO ) );

        Piano piano = new Piano();
        piano.tocar( musica );

        Thread.sleep( 800l );

        List<Nota> musica2 = Arrays.asList( notas.pega( NotasMusicais.Tipo.DO ) ,
                                            notas.pega( NotasMusicais.Tipo.RE ) ,
                                            notas.pega( NotasMusicais.Tipo.MI ) ,
                                            notas.pega( NotasMusicais.Tipo.FA ) ,
                                            notas.pega( NotasMusicais.Tipo.SOL ) ,
                                            notas.pega( NotasMusicais.Tipo.LA ) ,
                                            notas.pega( NotasMusicais.Tipo.SI ) ,
                                            notas.pega( NotasMusicais.Tipo.LA ) ,
                                            notas.pega( NotasMusicais.Tipo.SOL ) ,
                                            notas.pega( NotasMusicais.Tipo.FA ) ,
                                            notas.pega( NotasMusicais.Tipo.MI ) ,
                                            notas.pega( NotasMusicais.Tipo.RE ) ,
                                            notas.pega( NotasMusicais.Tipo.DO ) ,
                                            notas.pega( NotasMusicais.Tipo.DO ) ,
                                            notas.pega( NotasMusicais.Tipo.MI ) ,
                                            notas.pega( NotasMusicais.Tipo.SOL ) ,
                                            notas.pega( NotasMusicais.Tipo.DO ) ,
                                            notas.pega( NotasMusicais.Tipo.SOL ) ,
                                            notas.pega( NotasMusicais.Tipo.DO ) );

        piano.tocar( musica2 );

    }

}
