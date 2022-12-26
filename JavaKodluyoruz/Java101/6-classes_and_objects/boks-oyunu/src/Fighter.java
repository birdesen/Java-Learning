public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;
    int chance;

    Fighter(String name, int damage, int health, int weight, int dodge, int chance) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
        this.chance = chance;
    }

    int hit(Fighter foe) {
        System.out.println(this.name + " => " + foe.name + "  " + this.damage + " hasar vurdu.");
        if(foe.isDodge()){
            System.out.println(foe.name + " gelen hesabı blokladı.");
            return foe.health;
        }
        if (foe.health - this.damage < 0) {
            return 0;
        }
        return foe.health - this.damage;
    }

    boolean isDodge() {
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;

    }
    boolean isStart(){
        int randomNumber = (int) (Math.random() * 2);
        return randomNumber == this.chance;
    }
}
