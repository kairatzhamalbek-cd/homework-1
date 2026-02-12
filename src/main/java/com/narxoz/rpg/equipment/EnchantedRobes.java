package com.narxoz.rpg.equipment;

public class EnchantedRobes implements Armor {
    private final int defense;
    private final String armorType;
    private final int manaBoost;

    public EnchantedRobes(){
        this.defense = 10;
        this.armorType = "Robes";
        this.manaBoost = 25;
    }
    @Override
    public int getDefense(){
        return defense;
    }
    @Override
    public int getManaBoost(){
        return manaBoost;
        }
    @Override
    public String getArmorInfo(){
        return "Enchanted Robes (Magic) - Light robes infused with magic (Mana +" + manaBoost + ")";
    }
    @Override
    public String getArmorType(){
        return armorType;
    }

}
