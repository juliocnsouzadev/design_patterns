package br.com.juliocnsouza.designpatterns.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * ConnectionFactory.java -> Job:
 * <p>
 * @since 03/08/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class ConnectionFactory {

    private static ConnectionFactory connectionFactory;

    private ConnectionFactory() {
    }

    public static ConnectionFactory getInstance() {
        if ( connectionFactory == null ) {
            connectionFactory = new ConnectionFactory();
        }
        return connectionFactory;
    }

    public Connection getConnection() {
        try {
            Connection con = DriverManager.getConnection( "jdbc:mysql://localhost/banco" , "root" ,
                                                          "abc123" );
            return con;
        }
        catch ( SQLException ex ) {
            Logger.getLogger( ConnectionFactory.class.getName() ).log( Level.SEVERE , null , ex );
            throw new RuntimeException( ex.getMessage() );
        }
    }

}
