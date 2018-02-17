package modelo;

public class Asociado {
    
    private int Idasociado;
    private String Nombreasociado;
    private String Telefonoasociado;
    private String Correoasociado;
    private String Userasociado;
    private String Passasociado;
    
    public Asociado(){
        
    }
    
    public Asociado(int Idasociado, String Nombreasociado, String Telefonoasociado, String Correoasociado, String Userasociado, String Passasociado){
        this.Idasociado = Idasociado;
        this.Nombreasociado = Nombreasociado;
        this.Telefonoasociado = Telefonoasociado;
        this.Correoasociado = Correoasociado;
        this.Userasociado = Userasociado;
        this.Passasociado = Passasociado;
    }

    public int getIdasociado() {return Idasociado;}

    public void setIdasociado(int Idasociado) {this.Idasociado = Idasociado;}

    public String getNombreasociado() {return Nombreasociado;}

    public void setNombreasociado(String Nombreasociado) {this.Nombreasociado = Nombreasociado;}

    public String getTelefonoasociado() {return Telefonoasociado;}

    public void setTelefonoasociado(String Telefonoasociado) {this.Telefonoasociado = Telefonoasociado;}

    public String getCorreoasociado() {return Correoasociado;}

    public void setCorreoasociado(String Correoasociado) {this.Correoasociado = Correoasociado;}

    public String getUserasociado() {return Userasociado;}

    public void setUserasociado(String Userasociado) {this.Userasociado = Userasociado;}

    public String getPassasociado() {return Passasociado;}

    public void setPassasociado(String Passasociado) {this.Passasociado = Passasociado;}
    
}
