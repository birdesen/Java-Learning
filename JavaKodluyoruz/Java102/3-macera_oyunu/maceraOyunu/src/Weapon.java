public class Weapon {
    private String weName;
    private int weID;
    private int damage;
    private int price;

    public Weapon(int weID, String weName, int damage, int price) {
        this.weID = weID;
        this.weName = weName;
        this.damage = damage;
        this.price = price;
    }

    public static Weapon[] weapons() {
        Weapon[] weaponList = new Weapon[3];
        weaponList[0] = new Weapon(1, "Kılıç", 3, 20);
        weaponList[1] = new Weapon(2, "Tabanca", 5, 30);
        weaponList[2] = new Weapon(3, "Tüfek", 7, 45);
        return weaponList;
    }

    public static Weapon getWeaponObjByID(int weID) {

        for (Weapon w : Weapon.weapons()) {
            if (w.getWeID() == weID) {
                return w;
            }
        }
        return null;
    }

    public String getWeName() {
        return weName;
    }

    public void setWeName(String weName) {
        this.weName = weName;
    }

    public int getWeID() {
        return weID;
    }

    public void setWeID(int weID) {
        this.weID = weID;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
