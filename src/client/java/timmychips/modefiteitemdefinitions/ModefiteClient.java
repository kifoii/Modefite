package timmychips.modefiteitemdefinitions;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.loader.api.FabricLoader;

public final class ModefiteClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        if (FabricLoader.getInstance().isModLoaded("respackopts")) {
            Modefite.LOGGER.info("Respackopts detected; resource-pack configuration is provided by Respackopts, not Modefite.");
        } else {
            Modefite.LOGGER.info("Respackopts not detected. Resource-pack option menus require the Respackopts client mod.");
        }
    }
}
