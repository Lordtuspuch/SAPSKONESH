/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vista.LOG;

/**
 *
 * @author pc konesh 1
 */
public class conectordb {
    
//    public static final String URL = "jdbc:mysql://localhost:3306/koneshpoliza";
//    public static final String USER = "root";
//    public static final String PASS = "";
//            
    public Connection conexion = null;
    public Statement comando = null;
    public ResultSet registro;
 
    private Connection MySQLConnect() {
 
        try {
            //Driver JDBC
            Class.forName("com.mysql.jdbc.Driver");
            String servidor = "jdbc:mysql://localhost:3306/koneshpoliza";
            String usuario = "root";
            String pass = "";
            //Se inicia la conexión
            conexion = (Connection) DriverManager.getConnection(servidor, usuario, pass);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error en la conexión a la base de datos: " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion = null;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error en la conexión a la base de datos: " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion = null;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Error en la conexión a la base de datos: " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion = null;
        } finally {
//            JOptionPane.showMessageDialog(null, "Conexión Exitosa");
            return conexion;
        }
    }
    
    public int validador(String usr, String pass){
        String usrdb, passdb;
        int acceso = 0; 
        try {
//            conectordb db = new conectordb();
            MySQLConnect();
            String Query = "SELECT * FROM login WHERE loginUsuario = '" + usr + "' AND loginPass = '" + pass + "'";
            comando = conexion.createStatement();
            registro = comando.executeQuery(Query);
            if(registro.next()){
                usrdb = registro.getString(2);
                passdb = registro.getString(3);
                if(usrdb.equals(usr) && passdb.equals(pass)){
                    acceso = 1;
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(LOG.class.getName()).log(Level.SEVERE, null, e);
        }
        return acceso;
    }
    
}
