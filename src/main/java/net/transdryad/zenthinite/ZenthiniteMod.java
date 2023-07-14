package net.transdryad.zenthinite;

import net.fabricmc.api.ModInitializer;

import net.transdryad.zenthinite.item.ModItemGroups;
import net.transdryad.zenthinite.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ZenthiniteMod implements ModInitializer {
	public static final String MOD_ID = "zenthinite";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();

	}
}