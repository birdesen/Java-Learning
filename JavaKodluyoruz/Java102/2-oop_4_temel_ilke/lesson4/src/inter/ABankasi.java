package inter;

public class ABankasi implements IBanka {
    private String bankaAdi;
    private String terminalID;
    private String passsword;

    public ABankasi(String bankaAdi, String terminal_id, String passsword) {
        this.bankaAdi = bankaAdi;
        this.terminalID = terminal_id;
        this.passsword = passsword;
    }

    public boolean connect(String ipAdress) {
        System.out.println("Kullanıcı ip " + ipAdress);
        System.out.println("Makina ip " + this.hostIpAddress);
        System.out.println(this.bankaAdi + " bağlandı.");
        return true;
    }

    public boolean payment(double price, String cardNumber, String expirationDate, String cvc) {
        System.out.println("Bankadan cevap bekleniyor.");
        System.out.println("işlem başarılı");
        return true;
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
