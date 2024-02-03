package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexion {
    private static final String url = "jdbc:mysql://localhost:3306/anadirpedidos";
    private static boolean isConnected = false;

    public Connection conectar(String user, String password) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            if(!isConnected){
                JOptionPane.showMessageDialog(null, "Se ha realizado la conexión con éxito.");
                isConnected = true;
            }
            return con;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la conexión intentalo de nuevo: " + e.getMessage());
            return null;
        }
    }
}


