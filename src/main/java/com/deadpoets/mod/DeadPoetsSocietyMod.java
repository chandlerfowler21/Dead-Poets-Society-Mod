package com.deadpoets.mod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DeadPoetsSocietyMod implements ModInitializer {

	public static final String MOD_ID = "dead-poets-society-mod";

	public static final Logger LOGGER =
			LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.initialize();
		ModCreativeTabs.initialize();

		LOGGER.info("Dead Poets Society Mod initialized!");
	}

	public static ResourceLocation id(String path) {
		return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
	}
}