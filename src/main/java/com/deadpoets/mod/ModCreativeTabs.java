
package com.deadpoets.mod;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTabs {

    public static final CreativeModeTab DEAD_POETS_TAB =
            Registry.register(
                    BuiltInRegistries.CREATIVE_MODE_TAB,
                    DeadPoetsSocietyMod.id("dead_poets_tab"),
                    FabricItemGroup.builder()
                            .title(Component.translatable(
                                    "itemGroup.dead-poets-society"
                            ))
                            .icon(() -> new ItemStack(
                                    ModItems.MOD_LOGO
                            ))
                            .displayItems((parameters, output) -> {
                                output.accept(ModItems.DEAD_POETS_BOOK);
                            })
                            .build()
            );

    public static void initialize() {
        DeadPoetsSocietyMod.LOGGER.info(
                "Registering Dead Poets Society creative tab"
        );
    }
}
