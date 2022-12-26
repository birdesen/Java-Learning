import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int right = 3, balance = 1500, select;

        while (right > 0) {
            System.out.print("Kullanıcı adınız: ");
            userName = input.nextLine();
            System.out.print("Paralonız: ");
            password = input.nextLine();
            if (userName.equals("birdesen") && password.equals("123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Yatırılacak para miktarı: ");
                            int price = input.nextInt();
                            balance += price;
                            System.out.println("Yeni bakiyeniz: " + balance);
                            break;
                        case 2:
                            System.out.print("Para miktarı: ");
                            int volume = input.nextInt();
                            if (volume > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= volume;
                            }
                            System.out.println("Yeni bakiyeniz: " + balance);
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                    }
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}
