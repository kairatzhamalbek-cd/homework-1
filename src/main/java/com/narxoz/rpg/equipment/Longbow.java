package com.narxoz.rpg.equipment;

public class Longbow implements Weapon{
    private final int damage;
    private final String weaponType;
    private final String range;
    private final int manaBoost;

    public Longbow(int manaBoost){
        this.manaBoost = 30;
        this.damage = 30;
        this.weaponType = "Bow";
        this.range = "Long";
    }
    @Override
    public int getDamage(){
        return damage;
    }
    @Override
    public String getRange(){
        return range;
    }
    @Override
    public String getWeaponInfo(){
        return "Longbow (Ranger) - High range bow for precise attacks";
    }
    @Override
    public String getWeaponType(){
        return weaponType;
    }

    @Override
    public int getManaBoost() {
        return manaBoost;
    }

}
