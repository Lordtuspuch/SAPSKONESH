package controlador;

import java.util.LinkedList;
import modelo.Empresa;

public class controlempresa {
    
    private int Idempresa, Cpempresa, cliente_clienteId;
    private String RFCempresa, Rsocialempresa, Nombreempresa;
    private String Telempresa, Calleempresa, Noextempresa, Nointempresa;
    private String Colempresa, Mpioempresa, Localempresa, Estadoempresa;
    private String Paisempresa, Refempresa, Emailempresa;
    
    //AUN NO SE EXTRAEN TODOS LOS DATOS DE LA TABLA EMPRESA
    public LinkedList <Empresa> Queryempresageneral(){
        LinkedList<Empresa> ListadoEmpresas= new LinkedList<Empresa>();
        String Query = "SELECT * FROM empresa";
        try {
            conectordb db = new conectordb();
            db.MySQLConnect();
            db.comando = db.conexion.createStatement();
            db.registro = db.comando.executeQuery(Query);
            while (db.registro.next()) {
//                System.out.println("Id: " + db.registro.getInt(1) + 
//                        "RFC: " + db.registro.getString(2) + 
//                        "Razón Social: " + db.registro.getString(3) + 
//                        "Telefono: " + db.registro.getString(4) + 
//                        "Email: " + db.registro.getString(16));
                Idempresa = db.registro.getInt(1);
                RFCempresa = db.registro.getString(2);
                Rsocialempresa = db.registro.getString(3);
                Nombreempresa = db.registro.getString(4);
                Telempresa = db.registro.getString(5);
                Calleempresa = db.registro.getString(6);
                Noextempresa = db.registro.getString(7);
                Nointempresa = db.registro.getString(8);
                Colempresa = db.registro.getString(9);
                Mpioempresa = db.registro.getString(10);
                Localempresa = db.registro.getString(11);
                Estadoempresa = db.registro.getString(12);
                Paisempresa = db.registro.getString(13);
                Cpempresa = db.registro.getInt(14);
                Refempresa = db.registro.getString(15);
                Emailempresa = db.registro.getString(16);
                cliente_clienteId = db.registro.getInt(17);
                
                Empresa objEmpresa = new Empresa(Idempresa, RFCempresa, Rsocialempresa, Nombreempresa, Telempresa, Calleempresa, Noextempresa, Nointempresa, Colempresa, Mpioempresa, Localempresa, Estadoempresa, Paisempresa, Cpempresa, Refempresa, Emailempresa, cliente_clienteId);
                ListadoEmpresas.add(objEmpresa);
                            }
        } catch (Exception e) {
        }
        return ListadoEmpresas;
    }
    
}