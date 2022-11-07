package net.theredgenesect.redsinternet.painting;

import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.theredgenesect.redsinternet.RedInternet;

public class ModPaintings {
    public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS =
            DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, RedInternet.MOD_ID);

    public static final RegistryObject<PaintingVariant> ALBAN = PAINTING_VARIANTS.register("alban",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> BURNING_SKULL = PAINTING_VARIANTS.register("burning_skull",
            () -> new PaintingVariant(64, 64));
    public static final RegistryObject<PaintingVariant> DONKEY_KONG = PAINTING_VARIANTS.register("donkey_kong",
            () -> new PaintingVariant(64, 48));
    public static final RegistryObject<PaintingVariant> FIGHTERS = PAINTING_VARIANTS.register("fighters",
            () -> new PaintingVariant(64, 32));
    public static final RegistryObject<PaintingVariant> GRAHAM = PAINTING_VARIANTS.register("graham",
            () -> new PaintingVariant(16, 32));
    public static final RegistryObject<PaintingVariant> KEBAB = PAINTING_VARIANTS.register("kebab",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> MATCH = PAINTING_VARIANTS.register("match",
            () -> new PaintingVariant(32, 32));
    public static final RegistryObject<PaintingVariant> PIGSCENE = PAINTING_VARIANTS.register("pigscene",
            () -> new PaintingVariant(64, 64));
    public static final RegistryObject<PaintingVariant> POINTER = PAINTING_VARIANTS.register("pointer",
            () -> new PaintingVariant(64, 64));
    public static final RegistryObject<PaintingVariant> POOL = PAINTING_VARIANTS.register("pool",
            () -> new PaintingVariant(32, 16));
    public static final RegistryObject<PaintingVariant> SKELETON = PAINTING_VARIANTS.register("skeleton",
            () -> new PaintingVariant(64, 48));
    public static final RegistryObject<PaintingVariant> SKULL_AND_ROSES = PAINTING_VARIANTS.register("skull_and_roses",
            () -> new PaintingVariant(32, 32));
    public static final RegistryObject<PaintingVariant> STAGE = PAINTING_VARIANTS.register("stage",
            () -> new PaintingVariant(32, 32));
    public static final RegistryObject<PaintingVariant> VOID = PAINTING_VARIANTS.register("void",
            () -> new PaintingVariant(32, 32));
    public static final RegistryObject<PaintingVariant> WANDERER = PAINTING_VARIANTS.register("wanderer",
            () -> new PaintingVariant(16, 32));
    public static final RegistryObject<PaintingVariant> WITHER = PAINTING_VARIANTS.register("wither",
            () -> new PaintingVariant(32, 32));

    public static void register(IEventBus eventBus) {
        PAINTING_VARIANTS.register(eventBus);
    }
}
