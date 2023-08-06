package net.mohsenemx.creativecommand;

import net.fabricmc.api.ModInitializer;

import net.mohsenemx.creativecommand.item.ModItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreativeCommand implements ModInitializer {
	public static final String MOD_ID = "creativecommand";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		// ModItems.registerModItems();
	}
}