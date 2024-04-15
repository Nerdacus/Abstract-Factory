// Abstract Factory interface for the forge
interface BlacksmithForge {
    Weapon forgeWeapon();
    Armor forgeArmor();
}

// Concrete Factory for the knights
class KnightFactory implements BlacksmithForge {
    @Override
    public Weapon forgeWeapon() {
        return new Sword();
    }

    @Override
    public Armor forgeArmor() {
        return new KnightArmor();
    }
}

// Concrete Factory for the barbarians
class BarbarianFactory implements BlacksmithForge {
    @Override
    public Weapon forgeWeapon() {
        return new Axe();
    }

    @Override
    public Armor forgeArmor() {
        return new BarbarianArmor();
    }
}

//Next, we define the abstract product interfaces:

// Abstract Product: Weapon
interface Weapon {
    void wield();
}

// Abstract Product: Armor
interface Armor {
    void equip();
}

// Concrete Product: Sword
class Sword implements Weapon {
    @Override
    public void wield() {
        System.out.println("Excalibur");
    }
}

// Concrete Product: Axe
class Axe implements Weapon {
    @Override
    public void wield() {
        System.out.println("Axe Body Spray");
    }
}

// Concrete Product: KnightArmor
class KnightArmor implements Armor {
    @Override
    public void equip() {
        System.out.println("Knightly armor");
    }
}

// Concrete Product: BarbarianArmor
class BarbarianArmor implements Armor {
    @Override
    public void equip() {
        System.out.println("Barbarian armor");
    }
}

// Client code
public class Adventurer {
    public static void main(String[] args) {
        // Knights
        BlacksmithForge knightFactory = new KnightFactory();

        // Forge excalibur and armor
        Weapon sword = knightFactory.forgeWeapon();
        Armor knightArmor = knightFactory.forgeArmor();

        // Equip and wield the weapons and armor
        sword.wield();
        knightArmor.equip();

        // Barbarians
        BlacksmithForge barbarianFactory = new BarbarianFactory();

        // Forge axe body spray and armor
        Weapon axe = barbarianFactory.forgeWeapon();
        Armor barbarianArmor = barbarianFactory.forgeArmor();

        // Equip and wield the weapons and armor
        axe.wield();
        barbarianArmor.equip();
    }
}
