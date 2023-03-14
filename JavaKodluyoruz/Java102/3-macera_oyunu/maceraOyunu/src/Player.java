import java.util.Scanner;

public class Player {
    private Scanner input = new Scanner(System.in);
    private String name;
    private String charName;
    private int damage;
    private int health;
    private int originalHealth;
    private int money;
    private Inventory inventory;

    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    public void selectChar() {
        /* Samurai samurai = new Samurai();
        Archer archer = new Archer();
        Knight knight = new Knight(); */

        GameChar[] charList = {new Samurai(), new Archer(), new Knight()};
        System.out.println();
        System.out.println("-------------------------------------- KARAKTERLER -------------------------------------");
        for (GameChar gameChar : charList) {
            System.out.println("Karakter ID: " + gameChar.getCharID() +
                    "\t\t Karakter: " + gameChar.getCharName() +
                    "\t\t Hasar: " + gameChar.getDamage() +
                    "\t\t Sağlık: " + gameChar.getHealth() +
                    "\t\t Para: " + gameChar.getMoney());
        }
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.print("Lütfen bir karakter ID seçiniz: ");
        int selectChar = input.nextInt();
        switch (selectChar) {
            case 1:
                initPlayer((new Samurai()));
                break;
            case 2:
                initPlayer((new Archer()));
                break;
            case 3:
                initPlayer((new Knight()));
                break;
            default:
                initPlayer((new Samurai()));
                break;
        }
        /*System.out.println("Seçmiş olduğunuz karakter: "  + this.getCharName() +
                "\t\t Hasar: " + this.getDamage() +
                "\t\t Sağlık: " + this.getHealth() +
                "\t\t Para: " + this.getMoney());*/
    }

    public void initPlayer(GameChar gameChar) {
        this.setCharName(gameChar.getCharName());
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setOriginalHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
    }

    public void printPlayerInfo() {
        System.out.println("\nKarakteriniz: " + this.getCharName() +
                "\t\t Silahınız: " + this.getInventory().getWeapon().getWeName() +
                "\t\t Zırhınız: " + this.getInventory().getArmor().getArName() +
                "\t\t Bloklamanız: " + this.getInventory().getArmor().getBlock() +
                "\t\t Hasarınız: " + this.getTotalDamage() +
                "\t\t Sağlığınız: " + this.getHealth() +
                "\t\t Paranız: " + this.getMoney());
    }

    public int getTotalDamage() {
        return damage + this.getInventory().getWeapon().getDamage();
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0) {
            health = 0;
        }
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return this.charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Weapon getWeapon() {
        return this.getInventory().getWeapon();
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }
}
