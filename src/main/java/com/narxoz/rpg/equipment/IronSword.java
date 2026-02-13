package com.narxoz.rpg.equipment;


public class IronSword implements Weapon {

    private final int damage;
    private final String weaponType;
    private final int manaBoost;
    private final String range;


    public IronSword() {
        this.range = "Average";
        this.manaBoost = 28;
        this.damage = 25;
        this.weaponType = "Sword";
    }



    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public String getWeaponInfo() {
        return "Iron Sword (Medieval) - A sturdy blade forged from iron";
    }

    @Override
    public String getWeaponType() {
        return weaponType;
    }

    @Override
    public int getManaBoost() {
        return manaBoost;
    }

    @Override
    public String getRange() {
        return range;
    }

}
