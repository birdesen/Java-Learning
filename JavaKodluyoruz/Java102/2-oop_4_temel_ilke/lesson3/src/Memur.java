public abstract class Memur extends Calisan {
    private String department;
    private String mesai;

    public Memur(String adSoyad, String telefon, String eposta, String department, String mesai) {
        super(adSoyad, telefon, eposta);
        this.department = department;
        this.mesai = mesai;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getMesai() {
        return mesai;
    }

    public void setMesai(String mesai) {
        this.mesai = mesai;
    }

    public void calis() {
        System.out.println(this.getAdSoyad() + " memur görevlerini yapıyor.");
    }

    public void giris(){
        System.out.println(this.getAdSoyad() + " memuru C kapısından giriş yaptı");
    }
}
