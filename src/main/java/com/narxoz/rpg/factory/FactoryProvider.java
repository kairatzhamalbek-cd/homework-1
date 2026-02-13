package com.narxoz.rpg.factory;

import java.util.Map;

public final class FactoryProvider {

    private static final Map<String, CharacterFactory> CHARACTER_FACTORIES = Map.of(
            "warrior", new WarriorFactory(),
            "mage", new MageFactory(),
            "archer", new ArcherFactory()
    );

    private static final Map<String, EquipmentFactory> EQUIPMENT_FACTORIES = Map.of(
            "medieval", new MedievalEquipmentFactory(),
            "magic", new MagicEquipmentFactory(),
            "ranger", new RangerEquipmentFactory()
    );

    private FactoryProvider() {}

    public static CharacterFactory characterFactory(String type) {
        CharacterFactory factory = CHARACTER_FACTORIES.get(type.toLowerCase());
        if (factory == null) {
            throw new IllegalArgumentException("Unknown character type: " + type);
        }
        return factory;
    }

    public static EquipmentFactory equipmentFactory(String theme) {
        EquipmentFactory factory = EQUIPMENT_FACTORIES.get(theme.toLowerCase());
        if (factory == null) {
            throw new IllegalArgumentException("Unknown equipment theme: " + theme);
        }
        return factory;
    }
}
