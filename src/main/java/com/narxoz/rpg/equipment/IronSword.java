package com.narxoz.rpg.equipment;

/*
 * Weapons:
 * - WizardStaff (Magic theme)
 * - Longbow (Ranger theme)
 * - Other weapons you imagine...
 *
 * Armor:
 * - PlateArmor (Medieval theme)
 * - EnchantedRobes (Magic theme)
 * - LeatherArmor (Ranger theme)
 * - Other armor you imagine...
 */
public class IronSword implements Weapon {

    private final int damage;
    private final String weaponType;
    private final int manaBoost;
    private final String range;


    public IronSword(int manaBoost, String range) {
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
