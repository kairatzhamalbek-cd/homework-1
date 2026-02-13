package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

public class Archer implements Character {

    private final String name;
    private final int health;
    private final int mana;
    private final int strength;
    private final int intelligence;

    private Weapon equippedWeapon;
    private Armor equippedArmor;

    public Archer(String name) {
        this.name = name;
        // Archer stats: medium/balanced
        this.health = 110;
        this.mana = 60;
        this.strength = 55;
        this.intelligence = 45;
    }

    @Override
    public String getName() { return name; }

    @Override
    public int getHealth() { return health; }

    @Override
    public int getMana() { return mana; }

    @Override
    public int getStrength() { return strength; }

    @Override
    public int getIntelligence() { return intelligence; }

    @Override
    public void displayStats() {
        System.out.println("=== " + name + " (Archer) ===");
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " uses RAPID SHOT! Fires multiple arrows in quick succession!");
    }
    @Override
    public void equipWeapon(Weapon weapon) {
        this.equippedWeapon = weapon;
    }
    @Override
    public void equipArmor(Armor armor) {
        this.equippedArmor = armor;
    }
    @Override
    public void displayEquipment() {
        if (equippedWeapon != null) {
            System.out.println("Weapon: " + equippedWeapon.getWeaponInfo());
            System.out.println("  Damage: " + equippedWeapon.getDamage() + ", Type: " + equippedWeapon.getWeaponType());
        } else {
            System.out.println("Weapon: (none)");
        }

        if (equippedArmor != null) {
            System.out.println("Armor: " + equippedArmor.getArmorInfo());
            System.out.println("  Defense: " + equippedArmor.getDefense() + ", Type: " + equippedArmor.getArmorType());
        } else {
            System.out.println("Armor: (none)");
        }
    }
}
