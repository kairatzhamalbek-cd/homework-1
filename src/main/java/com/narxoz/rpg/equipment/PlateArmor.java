package com.narxoz.rpg.equipment;

public class PlateArmor implements Armor {
    private final int defense;
    private final String armorType;
    private final int manaBoost;


    public PlateArmor(){
        this.defense = 30;
        this.armorType = "Plate Armor";
        this.manaBoost = 20;
    }

    @Override
    public int getDefense() {
        return defense;
    }

    @Override
    public String getArmorInfo() {
        return "Plate Armor (Medieval) - Heavy armor offering strong protection";
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
