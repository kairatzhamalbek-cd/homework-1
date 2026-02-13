package com.narxoz.rpg;
import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.factory.CharacterFactory;
import com.narxoz.rpg.factory.EquipmentFactory;
import com.narxoz.rpg.factory.FactoryProvider;


public class Main {
    public static void main(String[] args) {
        System.out.println("=== RPG Character & Equipment System ===\n");

        demoCharacterWithTheme("warrior", "Thor", "medieval");
        System.out.println("---");

        demoCharacterWithTheme("mage", "Gandalf", "magic");
        System.out.println("---");

        demoCharacterWithTheme("archer", "Legolas", "ranger");





        System.out.println("\n=== Demo Complete ===");
    }
    private static void demoCharacterWithTheme(String characterType, String name, String theme) {
        System.out.println("Creating " + characterType + "...");
        CharacterFactory characterFactory = FactoryProvider.characterFactory(characterType);
        Character character = characterFactory.createCharacter(name);

        character.displayStats();
        character.useSpecialAbility();

        System.out.println("Equipping with " + capitalize(theme) + " Set...");
        EquipmentFactory equipmentFactory = FactoryProvider.equipmentFactory(theme);
        character.equipWeapon(equipmentFactory.createWeapon());
        character.equipArmor(equipmentFactory.createArmor());

        character.displayEquipment();}
    private static String capitalize(String s) {
        if (s == null || s.isEmpty()) return s;
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }


}
