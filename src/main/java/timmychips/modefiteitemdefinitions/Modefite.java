package timmychips.modefiteitemdefinitions;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Modefite implements ModInitializer {
    public static final String MOD_ID = "modefite";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Modefite 0.1.5 initialized for Minecraft 26.2.");
        LOGGER.info("Minecraft 26.2 provides the native item-definition pipeline; Modefite keeps compatibility hooks client-side.");
    }
}
