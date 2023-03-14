public abstract class GameChar {
    private String charName;
    private int charID;
    private int damage;
    private int health;
    private int money;

    public GameChar(String charName, int charID, int damage, int health, int money) {
        this.charName = charName;
        this.charID = charID;
        this.damage = damage;
        this.health = health;
        this.money = money;
    }
    public String getCharName(){
        return charName;
    }

    public void setCharName(String name){
        this.charName = name;
    }

    public int getCharID() {
        return charID;
    }

    public void setCharID(int charID) { this.charID = charID; }

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
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
