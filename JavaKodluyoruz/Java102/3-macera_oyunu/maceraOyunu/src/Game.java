import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);

    public void start() {
        System.out.println("Macera oyununa hoşgeldiniz.");
        System.out.print("Lütfen isim giriniz: ");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println(player.getName() + " bu karanlık ve sisli adaya hoşgeldiniz, burada yaşananların hepsi gerçek!");
        player.selectChar();
        Location location = null;
        while (true) {
            player.printPlayerInfo();
            System.out.println();
            System.out.println("-------------------------------------- BÖLGELER ----------------------------------------");
            System.out.println("1 - Güvenli ev --> burası sizin için güvenli bir bölgedir");
            System.out.println("2 - Eşya Dükkanı --> burada silah satın alabilirsiniz");
            System.out.println("3 - Mağara --> burada ayılarla savaşabilir ve yemek kazanabilirsiniz");
            System.out.println("4 - Orman --> burada vampirlerle savaşabilir ve odun kazanabilirsiniz");
            System.out.println("5 - Nehir --> burada zombilerle savaşabilir ve su kazanabilirsiniz");
            System.out.println("0 - Çıkış --> oyunu sonlandırırsınız");
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.print("Lütfen gitmek istediğiniz bölgeyi seçiniz: ");
            int selectLoc = input.nextInt();
            switch (selectLoc) {
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                case 0:
                    location = null;
                    break;
                default:
                    location = new SafeHouse(player);
                    break;
            }
            if(location == null){
                System.out.println("Oyun bitti," +
                        " görüşmek üzere");
                break;
            }
            if (!location.onLocation()) {
                System.out.println("GAME OVER");
                break;
            }
        }
    }
}
