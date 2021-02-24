/*
 Programa que conecte una base de datos de Postgres con java
 */
package ejemplobasesdedatosproyect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author sebas
 */
public class BasesdeDatos {

    private Connection connection;

    // METODO PARA ESTABLECER CONEXION CON LA BASE DE DATOS
    public void EstablecerConexion() {

        if (connection != null) {
            return;
        }
        String url = "jdbc:postgresql://localhost:5432/postgres";

        try {
            Class.forName("org.postgresql.Driver");

            connection = DriverManager.getConnection(url, "postgres", "Ghostian*1092000");
            if (connection != null) {
                System.out.println("Conectando a la base de datos...");
            }
        } catch (Exception e) {
            System.out.println("Problemas de conexion" + e);
        }
    }

    // METODO PARA DETENER LA CONEXION
    public void DetenerConexion() {
        try {
            connection.close();
            System.out.println("Conexion detenida");
        } catch (Exception e) {
            System.out.println("Problema al cerrar la base de datos");
        }
    }

    public void InsertarRegistro() {
        Statement s = null;
        try {
            s = connection.createStatement();
            int z = s.executeUpdate(
                    "INSERT INTO  EMPRESA  (K_EMPRESA, N_NOMEMPRE, O_DIREMPRE, O_TELEMPRE) VALUES ('03', 'EXITO', 'CALLE 80 No. 68-25', '6777777');"
            );
        } catch (Exception e) {
            System.out.println("Problema de ingresar datos e");
        }
    }

    public void printTabla() {

        ResultSet rs = null;
        String[] datos = new String[4];
        Statement s = null;

        try {

            s = connection.createStatement();
            rs = s.executeQuery("SELECT * FROM EMPRESA;");

            while (rs.next()) {
                datos[0] = rs.getString(1);
                System.out.println(datos[0]);
                datos[1] = rs.getString(2);
                System.out.println(datos[1]);
                datos[2] = rs.getString(3);
                System.out.println(datos[2]);
                datos[3] = rs.getString(4);
                System.out.println(datos[3]);

            }

        } catch (Exception e) {

            System.out.println("Error en tabla");

        }

    }
}
