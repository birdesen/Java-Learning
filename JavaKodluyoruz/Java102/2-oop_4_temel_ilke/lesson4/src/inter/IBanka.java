package inter;

// Interface - şablon arayüz oluşturma
// bu sınıflarda metodların içine bir şey yazılmaz. metotların başına access modifiers koymaya gerek yok
//değişken tanımlayamayız,ancak değer verirsek olabilir.
// constructor metot yazılamaz. yazılan değişkenlere direkt implement edilen sınıftan ulaşılabilir.

public interface IBanka {
    final String hostIpAddress = "127.1.1.1";

    boolean connect(String ipAddress);

    boolean payment(double price, String cardNumber, String expirationDate, String cvc);


}
