package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

public class Mage implements Character {

    private final String name;
    private final int health;
    private final int mana;
    private final int strength;
    private final int intelligence;

    private Weapon equippedWeapon;
    private Armor equippedArmor;

    public Mage(String name) {
        this.name = name;
        this.health = 70;
        this.mana = 150;
        this.strength = 20;
        this.intelligence = 90;
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
        System.out.println("=== " + name + " (Mage) ===");
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " uses ARCANE BLAST! Powerful magic damage unleashed!");
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
