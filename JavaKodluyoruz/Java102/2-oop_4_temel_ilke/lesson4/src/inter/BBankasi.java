package inter;

public class BBankasi implements IBanka {
    private String bankaAdi;
    private String terminalID;
    private String passsword;

    public BBankasi(String bankaAdi, String terminal_id, String passsword) {
        this.bankaAdi = bankaAdi;
        this.terminalID = terminal_id;
        this.passsword = passsword;
    }

    public void connect() {
        System.out.println(this.bankaAdi + " bağlandı.");
    }

    @Override
    public boolean connect(String ipAddress) {
        return false;
    }

    public boolean payment(double price, String cardNumber, String expirationDate, String cvc) {
        System.out.println("Bankadan cevap bekleniyor.");
        System.out.println("işlem başarılı");
        return false;
    }

    public String getBankaAdi() {
        return this.bankaAdi;
    }

    public void setBankaAdi(String bankaAdi) {
        this.bankaAdi = bankaAdi;
    }

    public String getTerminalID() {
        return this.terminalID;
    }

    public void setTerminalID(String terminalID) {
        this.terminalID = terminalID;
    }

    public String getPasssword() {
        return this.passsword;
    }

    public void setPasssword(String passsword) {
        this.passsword = passsword;
    }


}