package net.theredgenesect.redsinternet.world.feature;

import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.theredgenesect.redsinternet.RedInternet;

public class ModPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, RedInternet.MOD_ID);




    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }
}
