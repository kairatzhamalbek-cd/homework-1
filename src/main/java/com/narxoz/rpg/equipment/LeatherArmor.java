package com.narxoz.rpg.equipment;

public class LeatherArmor implements Armor {

    private final int defense;
    private final String armorType;
    private final int agilityBonus;
    private final int manaBoost;

    public LeatherArmor() {
        this.manaBoost = 23;
        this.defense = 20;
        this.armorType = "Leather Armor";
        this.agilityBonus = 15;
    }

    @Override
    public int getDefense() {
        return defense;
    }

    public int getAgilityBonus() {
        return agilityBonus;
    }

    @Override
    public String getArmorInfo() {
        return "Leather Armor (Ranger) - Light armor for agility (Agility +" + agilityBonus + ")";
    }

    @Override
    public String getArmorType() {
        return armorType;
    }

    @Override
    public int getManaBoost() {
        return manaBoost;
    }
}

