package com.deadpoets.mod;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;

public class ModItems {
    public static final Item DEAD_POETS_BOOK = register(
            "dead_poets_book",
            new Item(new Item.Properties())
    );

    public static final Item MOD_LOGO = register("mod_logo",
            new Item(new Item.Properties()));

    private static Item register(String name, Item item) {
        return Registry.register(
                BuiltInRegistries.ITEM,
                DeadPoetsSocietyMod.id(name),
                item
        );
    }

    public static void initialize() {
        DeadPoetsSocietyMod.LOGGER.info("Registering Dead Poets Society items");
    }
}