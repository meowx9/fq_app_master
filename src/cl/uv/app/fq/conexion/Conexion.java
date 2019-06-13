/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.uv.app.fq.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Byron Navarro
 */
public class Conexion {

    private static Connection cnn;

    public static Connection conectar() {
        try {
            if (cnn == null) {
                String userName = "root";
                String password = "";
                String port = "3306";
                String hostname = "localhost";
                String dbName = "fq_gaby";

                Class.forName("com.mysql.jdbc.Driver");
                String jdbcUrl = "jdbc:mysql://" + hostname + ":"
                        + port + "/" + dbName + "?user=" + userName + "&password=" + password;
                cnn = DriverManager.getConnection(jdbcUrl);

            } else {
//                System.out.println("xxx");
            }
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "Error en conexión con base de datos." + ex);
            System.exit(0);
        }
        return cnn;
    }

    public static void desconectar() {

        try {
            if (cnn != null) {
                cnn.close();
                cnn = null;
//                System.out.println("conexion cerrada");
            }
        } catch (SQLException ex) {
            System.out.println("Conexion ya se encuentra cerrada");
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static Connection getCnn() {
        return cnn;
    }

}
