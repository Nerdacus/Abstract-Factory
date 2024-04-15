from abc import ABC, abstractmethod


# Abstract Factory interface for the forge
class BlacksmithForge(ABC):
    @abstractmethod
    def forge_weapon(self):
        pass

    @abstractmethod
    def forge_armor(self):
        pass


# Concrete Factory for the knights
class KnightFactory(BlacksmithForge):
    def forge_weapon(self):
        return Sword()

    def forge_armor(self):
        return KnightArmor()


# Concrete Factory for the barbarians
class BarbarianFactory(BlacksmithForge):
    def forge_weapon(self):
        return Axe()

    def forge_armor(self):
        return BarbarianArmor()


# Abstract Product: Weapon
class Weapon(ABC):
    @abstractmethod
    def wield(self):
        pass


# Abstract Product: Armor
class Armor(ABC):
    @abstractmethod
    def equip(self):
        pass


# Concrete Product: Sword
class Sword(Weapon):
    def wield(self):
        print("Excalibur")


# Concrete Product: Axe
class Axe(Weapon):
    def wield(self):
        print("Axe Body Spray")


# Concrete Product: KnightArmor
class KnightArmor(Armor):
    def equip(self):
        print("Knight armor")


# Concrete Product: BarbarianArmor
class BarbarianArmor(Armor):
    def equip(self):
        print("Barbarian armor")


# Client code
if __name__ == "__main__":
    # Knights
    knight_factory = KnightFactory()

    # Forge excalibur and armor
    sword = knight_factory.forge_weapon()
    knight_armor = knight_factory.forge_armor()

    # Equip and wield the weapons and armor
    sword.wield()
    knight_armor.equip()

    # Barbarians
    barbarian_factory = BarbarianFactory()

    # Forge axe body spray and armor
    axe = barbarian_factory.forge_weapon()
    barbarian_armor = barbarian_factory.forge_armor()

    # Equip and wield the weapons and armor
    axe.wield()
    barbarian_armor.equip()
