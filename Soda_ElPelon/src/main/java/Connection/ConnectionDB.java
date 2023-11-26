package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author JafetDG
 */
public class ConnectionDB {
    public static final String CONEXION_MYSQL_STRING = "jdbc:sqlserver://localhost:1433;databaseName=Soda_ElPelon;encrypt=false";
    public static final String DRIVER_CONEXION_MYSQL = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static final String USUARIO = "Soda";
    static final String CONTRASENA = "1234";

    public static Connection conectarBaseDatos() {
        Connection conexion = null;
        try {
            Class.forName(DRIVER_CONEXION_MYSQL);
            conexion = DriverManager.getConnection(CONEXION_MYSQL_STRING, USUARIO, CONTRASENA);
        } catch (ClassNotFoundException e) {
            // Manejo de excepción en caso de que no se encuentre el controlador
            e.printStackTrace();
        } catch (SQLException e) {
            // Manejo de excepción en caso de error de SQL
            e.printStackTrace();
        }
        return conexion;
    }
}
