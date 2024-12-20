package com.mcmoddies;

import com.mcmoddies.block.ModBlocks;
import com.mcmoddies.item.ModItemGroups;
import com.mcmoddies.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCMODDIES implements ModInitializer {
	public static final String MOD_ID = "mcmoddies";
	
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}