package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import modelo.Asociado;

public class controlasoc {
    private int IdAsoc;
    private String NombreAsoc, TelAsoc,EmailAsoc, UserAsoc, PassAsoc;
    
    public LinkedList <Asociado> Queryasocgeneral(){
        LinkedList<Asociado> ListadoAsociados= new LinkedList<Asociado>();
        String Query = "SELECT * FROM asociado";
        try {
            conectordb db = new conectordb();
            db.MySQLConnect();
            db.comando = db.conexion.createStatement();
            db.registro = db.comando.executeQuery(Query);
            while (db.registro.next()) {
//                System.out.println("Id: " + db.registro.getInt(1) + 
//                        "Nombre: " + db.registro.getString(2) + 
//                        "Telefono: " + db.registro.getString(3) + 
//                        "Correo: " + db.registro.getString(4) + 
//                        "User Asociado: " + db.registro.getString(5) + 
//                        "Pass Asociado: " + db.registro.getString(6));
                IdAsoc = db.registro.getInt(1);
                NombreAsoc = db.registro.getString(2);
                TelAsoc = db.registro.getString(3);
                EmailAsoc = db.registro.getString(4);
                UserAsoc = db.registro.getString(5);
                PassAsoc = db.registro.getString(6);
                
                Asociado objAsoc = new Asociado(IdAsoc, NombreAsoc, TelAsoc, EmailAsoc, UserAsoc, PassAsoc);
                ListadoAsociados.add(objAsoc);
                
            }
        } catch (Exception e) {
        }
        return ListadoAsociados;
    }

    /* REVISIÓN <-------------------
    public LinkedList <Asociado> Queryasocbuscar(String NomAsoc){
        LinkedList<Asociado> ListadoAsociados= new LinkedList<Asociado>();
        String Query = "SELECT * FROM asociado WHERE asociado = '" + NomAsoc + "'";
        try {
            conectordb db = new conectordb();
            db.MySQLConnect();
            db.comando = db.conexion.createStatement();
            db.registro = db.comando.executeQuery(Query);
            while (db.registro.next()) {
//                System.out.println("Id: " + db.registro.getInt(1) + 
//                        "Nombre: " + db.registro.getString(2) + 
//                        "Telefono: " + db.registro.getString(3) + 
//                        "Correo: " + db.registro.getString(4) + 
//                        "User Asociado: " + db.registro.getString(5) + 
//                        "Pass Asociado: " + db.registro.getString(6));
                IdAsoc = db.registro.getInt(1);
                NombreAsoc = db.registro.getString(2);
                TelAsoc = db.registro.getString(3);
                EmailAsoc = db.registro.getString(4);
                UserAsoc = db.registro.getString(5);
                PassAsoc = db.registro.getString(6);
                
                Asociado objAsoc = new Asociado(IdAsoc, NombreAsoc, TelAsoc, EmailAsoc, UserAsoc, PassAsoc);
                ListadoAsociados.add(objAsoc);
                
            }
        } catch (Exception e) {
        }
        return ListadoAsociados;
    }
      REVISIÓN <-------------------
    */
    
}
