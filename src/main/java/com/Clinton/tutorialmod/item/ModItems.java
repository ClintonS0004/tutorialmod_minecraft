package com.Clinton.tutorialmod.item;

import com.Clinton.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {

    public static Identifier id(String path) {
        return Identifier.of(TutorialMod.MOD_ID, path);
    }

    public static final Item MODBLOCK = registerItem("modblock", new Item(new Item.Settings()));
    public static final Item RAW_MODBLOCK = registerItem("raw_modblock", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item, RegistryKey<ItemGroup> group){
        return registerItem(name, new Item(new Item.Settings()));
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, id(name), item);
    }

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(MODBLOCK);
        entries.add(RAW_MODBLOCK);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }

}
