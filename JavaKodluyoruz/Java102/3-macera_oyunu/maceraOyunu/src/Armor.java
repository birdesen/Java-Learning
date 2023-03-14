public class Armor {
    private String arName;
    private int arID;
    private int block;
    private int price;

    public Armor(int arID, String arName, int block, int price) {
        this.arID = arID;
        this.arName = arName;
        this.block = block;
        this.price = price;
    }

    public static Armor[] armors() {
        Armor[] armorList = new Armor[3];
        armorList[0] = new Armor(1, "Hafif", 1, 15);
        armorList[1] = new Armor(2, "Orta", 3, 25);
        armorList[2] = new Armor(3, "Ağır", 5, 40);
        return armorList;
    }

    public static Armor getArmorObjByID(int arID) {

        for (Armor a : Armor.armors()) {
            if (a.getArID() == arID) {
                return a;
            }
        }
        return null;
    }

    public int getArID() {
        return arID;
    }

    public void setArID(int arID) {
        this.arID = arID;
    }

    public String getArName() {
        return arName;
    }

    public void setArName(String arName) {
        this.arName = arName;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
