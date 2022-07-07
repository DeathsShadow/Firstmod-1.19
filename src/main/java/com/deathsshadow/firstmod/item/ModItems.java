package com.deathsshadow.firstmod.item;

import com.deathsshadow.firstmod.FirstMod;
import com.deathsshadow.firstmod.item.custom.EightBallItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FirstMod.MOD_ID);

    public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FIRST_TAB)));
    public static final RegistryObject<Item> RAW_ZIRCON = ITEMS.register("raw_zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FIRST_TAB)));

    public static final RegistryObject<Item> EIGHT_BALL = ITEMS.register("eight_ball",
            () -> new EightBallItem(new Item.Properties().tab(ModCreativeModeTab.FIRST_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
