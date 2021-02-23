package Controlador;

/**
 *
 * @author User
 */
import java.sql.*;

public class Conexion {

    public void conectarBD(String host, String port, String database,
            String user, String password) {
        String url = "";
        try {
            // Registro driver de Postgres
            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Error al registrar el driver de PostgreSQL: " + ex);
            }
            Connection connection = null;
            url = "jdbc:postgresql://" + host + ":" + port + "/" + database;
            // Coneccion
            connection = DriverManager.getConnection(
                    url,
                    user, password);
            boolean valid = connection.isValid(50000);
            System.out.println(valid ? "OK" : "FAIL");
        } catch (java.sql.SQLException sqle) {
            System.out.println("Error al conectar con (" + url + "): " + sqle);
        }
    }
}
