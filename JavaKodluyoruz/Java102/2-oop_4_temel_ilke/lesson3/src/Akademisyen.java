public abstract class Akademisyen extends Calisan {
    private String bolum;
    private String unvan;

    public Akademisyen(String adSoyad, String telefon, String eposta, String bolum, String unvan) {
        super(adSoyad, telefon, eposta);
        // başta super olmak zorunda
        this.bolum = bolum;
        this.unvan = unvan;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    //abstract metot
    public abstract void derseGir(String dersSaati);

    @Override
    public void giris() {
        System.out.println(this.getAdSoyad() + " akademisyyeni A kapısında griş yaptı");

    }

}
