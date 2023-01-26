public class Patika {
    public static void main(String[] args) {
        //Calisan c1 = new Calisan("Mustafa Çetindağ", "05413651256", "mustafa.cetindag@gmail.com");


        // Akademisyen a1 = new Akademisyen("Patika Dev", "05325465689", "patika.dev@yahoo.com", "CENG", "doçent");

        // görünce şaşırma böyle şeyler olabilir ama memur sınıfına özel metotları kullanamazsın
        //Calisan m1 = new Memur("Ali Veli", "05652562356", "ali@patika.dev", "Bilgi İşlem", "09.00-17.00");

        //Memur m2 = new Memur("Ayşe Fatma", "05652564695", "ayse@patika.dev", "Bilgi İşlem", "09.00-17.00");

        OgretimGorevlisi o1 = new OgretimGorevlisi("Mahmut Çetindağ", "05465895623", "mahmut@hotmail.com", "MAT", "prof", "001");

        o1.derseGir("10.00");


        // Polymorphism
        //int[] loginUser = new int[5];
        //Calisan [] loginUser = {c1,a1,m2,o1};
        //Calisan.girisYapanlar(loginUser);




    }
}
