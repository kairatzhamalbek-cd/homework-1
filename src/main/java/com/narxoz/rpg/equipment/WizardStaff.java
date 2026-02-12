package com.narxoz.rpg.equipment;

public class WizardStaff implements Weapon{

    private final int damage;
    private final String weaponType;
    private final int manaBoost;

    public WizardStaff(){
        this.damage = 15;
        this.weaponType = "Staff";
        this.manaBoost = 20;
    }
     @Override
    public int getDamage(){
        return damage;
     }

     @Override
     public int getManaBoost(){
        return manaBoost;
     }

    @Override
    public String getRange() {
        return "";
    }

    @Override
     public String getWeaponInfo(){
        return "Wizard Staff (Magic) - Enhances magical power (Mana +" + manaBoost  + ")";
     }

     @Override
     public String getWeaponType(){
        return weaponType;
     }

}
