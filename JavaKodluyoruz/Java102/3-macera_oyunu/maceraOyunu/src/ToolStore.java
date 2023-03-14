public class ToolStore extends NormalLoc {
    public ToolStore(Player player) {
        super(player, "Eşya Dükkanı");
    }

    @Override
    public boolean onLocation() {
        boolean showMenu = true;

        while (showMenu) {
            System.out.println();
            System.out.println("-------------------------------------- EŞYA DÜKKANI ------------------------------------");
            System.out.println("1 - Silahlar");
            System.out.println("2 - Zırhlar");
            System.out.println("0 - Cıkış yap");
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
            int selectCase = Location.input.nextInt();
            while (selectCase < 0 || selectCase > 3) {
                System.out.print("Geçersiz değer girdiniz lütfen tekrar seçim yapınız: ");
                selectCase = input.nextInt();
            }
            switch (selectCase) {
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmour();
                    buyArmor();
                    break;
                case 0:
                    showMenu = false;
                    break;
            }
        }
        return true;
    }

    public void printWeapon() {
        System.out.println();
        System.out.println("-------------------------------------- SİLAHLAR ----------------------------------------");
        for (Weapon w : Weapon.weapons()) {
            System.out.println("Silah ID: " + w.getWeID() +
                    "\t\t Silah: " + w.getWeName() +
                    "\t\t Hasar: " + w.getDamage() +
                    "\t\t Para: " + w.getPrice());
        }
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("0 - çıkış");
    }

    public void buyWeapon() {
        System.out.print("Lütfen bir silah seçiniz: ");
        int selectWeaponID = Location.input.nextInt();
        while (selectWeaponID < 0 || selectWeaponID > Weapon.weapons().length) {
            System.out.print("Geçersiz değer girdiniz, lütfen tekrar seçim yapınız: ");
            selectWeaponID = input.nextInt();
        }

        if (selectWeaponID != 0) {
            Weapon selectedWeapon = Weapon.getWeaponObjByID(selectWeaponID);
            if (selectedWeapon != null) {
                if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yeterli paranız bulunmamaktadır");
                } else {
                    //satin almanin gerceklestigi alan
                    System.out.println(selectedWeapon.getWeName() + " silahını satın aldınız");
                    int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Önceki silahınız: " + this.getPlayer().getInventory().getWeapon().getWeName());
                    System.out.println("Kalan paranız: " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                    System.out.println("Şimdiki silahınız: " + this.getPlayer().getInventory().getWeapon().getWeName());
                }
            }
        }
    }

    public void printArmour() {
        System.out.println();
        System.out.println("-------------------------------------- ZIRHLAR -----------------------------------------");
        for (Armor a : Armor.armors()) {
            System.out.println("Zırh ID: " + a.getArID() +
                    "\t\t Zırh: " + a.getArName() +
                    "\t\t Koruma: " + a.getBlock() +
                    "\t\t Para: " + a.getPrice());
        }
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("0 - çıkış");
    }

    public void buyArmor() {
        System.out.print("Lütfen bir zırh seçiniz: ");
        int selectArmorID = Location.input.nextInt();
        while (selectArmorID < 0 || selectArmorID > Armor.armors().length) {
            System.out.print("Geçersiz değer girdiniz, lütfen tekrar seçim yapınız: ");
            selectArmorID = input.nextInt();
        }
        if (selectArmorID != 0) {
            Armor selectedArmor = Armor.getArmorObjByID(selectArmorID);
            if (selectedArmor != null) {
                if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yeterli paranız bulunmamaktadır");
                } else {
                    //satin almanin gerceklestigi alan
                    System.out.println(selectedArmor.getArName() + " zırhı satın aldınız");
                    int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Önceki zırhınız: " + this.getPlayer().getInventory().getArmor().getArName());
                    System.out.println("Kalan paranız: " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                    System.out.println("Şimdiki zırhınız: " + this.getPlayer().getInventory().getArmor().getArName());
                }
            }
        }
    }


}
