package modelo;

public class Empresa {
    
    private int Idempresa, Cpempresa, cliente_clienteId;
    private String RFCempresa, Rsocialempresa, Nombreempresa;
    private String Telempresa, Calleempresa, Noextempresa, Nointempresa;
    private String Colempresa, Mpioempresa, Localempresa, Estadoempresa;
    private String Paisempresa, Refempresa, Emailempresa;
    
    public Empresa(){}

    public Empresa(int Idempresa, String RFCempresa, String Rsocialempresa){
        this.Idempresa = Idempresa;
        this.RFCempresa = RFCempresa;
        this.Rsocialempresa = Rsocialempresa;
    }
    
    public Empresa(int Idempresa, String RFCempresa, String Rsocialempresa, String Nombreempresa, String Telempresa, String Callemepresa, String Noextempresa, String Nointempresa, String Colempresa, String Mpioempresa, String Localempresa, String Estadoempresa, String Paisempresa, int Cpempresa, String Refempresa, String Emailempresa, int cliente_clienteId){
        this.Idempresa = Idempresa;
        this.RFCempresa = RFCempresa;
        this.Rsocialempresa = Rsocialempresa;
        this.Nombreempresa = Nombreempresa;
        this.Telempresa = Telempresa;
        this.Calleempresa = Callemepresa;
        this.Noextempresa = Noextempresa;
        this.Nointempresa = Nointempresa;
        this.Colempresa = Colempresa;
        this.Mpioempresa = Mpioempresa;
        this.Localempresa = Localempresa;
        this.Estadoempresa = Estadoempresa;
        this.Paisempresa = Paisempresa;
        this.Cpempresa = Cpempresa;
        this.Refempresa = Refempresa;
        this.Emailempresa = Emailempresa;
        this.cliente_clienteId = cliente_clienteId;
    }
    
    public int getIdempresa() {return Idempresa;}

    public void setIdempresa(int Idempresa) {this.Idempresa = Idempresa;}

    public int getCpempresa() {return Cpempresa;}

    public void setCpempresa(int Cpempresa) {this.Cpempresa = Cpempresa;}

    public int getCliente_clienteId() {return cliente_clienteId;}

    public void setCliente_clienteId(int cliente_clienteId) {this.cliente_clienteId = cliente_clienteId;}

    public String getRFCempresa() {return RFCempresa;}

    public void setRFCempresa(String RFCempresa) {this.RFCempresa = RFCempresa;}

    public String getRsocialempresa() {return Rsocialempresa;}

    public void setRsocialempresa(String Rsocialempresa) {this.Rsocialempresa = Rsocialempresa;}

    public String getNombreempresa() {return Nombreempresa;}

    public void setNombreempresa(String Nombreempresa) {this.Nombreempresa = Nombreempresa;}

    public String getTelempresa() {return Telempresa;}

    public void setTelempresa(String Telempresa) {this.Telempresa = Telempresa;}

    public String getCalleempresa() {return Calleempresa;}

    public void setCalleempresa(String Calleempresa) {this.Calleempresa = Calleempresa;}

    public String getNoextempresa() {return Noextempresa;}

    public void setNoextempresa(String Noextempresa) {this.Noextempresa = Noextempresa;}

    public String getNointempresa() {return Nointempresa;}

    public void setNointempresa(String Nointempresa) {this.Nointempresa = Nointempresa;}

    public String getColempresa() {return Colempresa;}

    public void setColempresa(String Colempresa) {this.Colempresa = Colempresa;}

    public String getMpioempresa() {return Mpioempresa;}

    public void setMpioempresa(String Mpioempresa) {this.Mpioempresa = Mpioempresa;}

    public String getLocalempresa() {return Localempresa;}

    public void setLocalempresa(String Localempresa) {this.Localempresa = Localempresa;}

    public String getEstadoempresa() {return Estadoempresa;}

    public void setEstadoempresa(String Estadoempresa) {this.Estadoempresa = Estadoempresa;}

    public String getPaisempresa() {return Paisempresa;}

    public void setPaisempresa(String Paisempresa) {this.Paisempresa = Paisempresa;}

    public String getRefempresa() {return Refempresa;}

    public void setRefempresa(String Refempresa) {this.Refempresa = Refempresa;}

    public String getEmailempresa() {return Emailempresa;}

    public void setEmailempresa(String Emailempresa) {this.Emailempresa = Emailempresa;}
       
}
