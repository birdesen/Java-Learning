import java.util.Random;

public class BattleLoc extends Location {
    private Obstacle obstacle;
    private String award;
    private int maxObstacle;

    public BattleLoc(Player player, String name, Obstacle obstacle, int maxObstacle, String award) {
        super(player, name);
        this.obstacle = obstacle;
        this.maxObstacle = maxObstacle;
        this.award = award;
    }

    @Override
    public boolean onLocation() {
        int obsNumber = this.randomObstacleNumber();
        System.out.println();
        System.out.println("Dikkatli ol! " + this.getName() + "da " + obsNumber + " tane " + this.getObstacle().getName() + " yaşıyor!");
        System.out.print("<S>avaş veya <K>aç: ");
        String selectBattleCase = input.nextLine();
        selectBattleCase = selectBattleCase.toUpperCase(); // toUpperCase() klavyeden kucuk harf girse de buyutuyor
        if (selectBattleCase.equals("S") && combat(obsNumber)) {
            System.out.println();
            System.out.println("* * * * * " + this.getName() + "da tüm düşmanları yendiniz * * * * *");
            return true;
        }
        if (this.getPlayer().getHealth() <= 0) {
            System.out.println("Öldünüz");
            return false;
        }
        return true;
    }

    public boolean combat(int obsNumber) {
        for (int i = 1; i <= obsNumber; i++) {
            this.getObstacle().setHealth(this.getObstacle().getOriginalHealth());
            playerStats();
            obstacleStats(i);
            while (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0) {
                System.out.print("<V>ur veya <K>aç: ");
                String selectCombat = input.nextLine().toUpperCase();
                if (selectCombat.equals("V")) {
                    System.out.println("Siz vurdunuz");
                    this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
                    afterHit();
                    if (this.getObstacle().getHealth() > 0) {
                        System.out.println(this.getObstacle().getName() + " size vurdu");
                        int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                        if (obstacleDamage < 0) {
                            obstacleDamage = 0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
                        afterHit();
                    }
                } else {
                    return false;
                }
            }
            if (this.getObstacle().getHealth() < this.getPlayer().getHealth()) {
                System.out.println("Düşmanı yendiniz");
                System.out.println(this.getObstacle().getLoot() + " para kazandınız");
                System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getLoot());
            } else {
                return false;
            }
        }
        return true;
    }

    public void afterHit() {
        System.out.println("Canınız: " + this.getPlayer().getHealth());
        System.out.println(this.getObstacle().getName() + " Canı: " + this.getObstacle().getHealth());
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ");
    }

    public void playerStats() {
        System.out.println();
        System.out.println("Oyuncu Değerleri -----------------------------------------------------------------------");
        System.out.println("Sağlık: " + this.getPlayer().getHealth() +
                "\t\t Hasar: " + this.getPlayer().getTotalDamage() +
                "\t\t Bloklama: " + this.getPlayer().getInventory().getArmor().getBlock() +
                "\t\t Para: " + this.getPlayer().getMoney() +
                "\t\t Silah: " + this.getPlayer().getInventory().getWeapon().getWeName() +
                "\t\t Zırh: " + this.getPlayer().getInventory().getArmor().getArName());
    }

    public void obstacleStats(int i) {
        System.out.println(i + ". " + this.getObstacle().getName() + " Değerleri" + " ------------------------------------------------------------------------");
        System.out.println("Sağlık: " + this.getObstacle().getHealth() +
                "\t\t Hasar: " + this.getObstacle().getDamage() +
                "\t\t Ganimet: " + this.getObstacle().getLoot());
        System.out.println("----------------------------------------------------------------------------------------");

    }

    public int randomObstacleNumber() {
        Random r = new Random();
        return r.nextInt(this.getMaxObstacle()) + 1;
        //randoma yazilandan bir dusugu cikar (yani 0,1,2)bu yuzden +1 ekledik
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }
}
