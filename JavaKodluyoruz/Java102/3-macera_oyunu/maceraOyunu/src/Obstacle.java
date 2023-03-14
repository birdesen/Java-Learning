public class Obstacle {
    private String name;
    private int obID;
    private int damage;
    private int health;
    private int loot;
    private int originalHealth;

    public Obstacle(int obID, String name, int damage, int health, int loot) {
        this.obID = obID;
        this.name = name;
        this.damage = damage;
        originalHealth = health;
        this.loot = loot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getObID() {
        return obID;
    }

    public void setObID(int obID) {
        this.obID = obID;
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
        if (health<0){
            health =0;
        }
        this.health = health;
    }

    public int getLoot() {
        return loot;
    }

    public void setLoot(int loot) {
        this.loot = loot;
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }
}
