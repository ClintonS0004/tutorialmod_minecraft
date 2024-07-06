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

public class ModItems {

    public static final Item MODITEM = registerItem("moditem", new Item(new Item.Settings()));
    public static final Item RAW_MODITEM = registerItem("raw_moditem", new Item(new Item.Settings()));

//    private static Item registerItem(String name, Item item, RegistryKey<ItemGroup> group){
//        return registerItem(name, new Item(new Item.Settings()));
//    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, TutorialMod.id(name), item);
    }

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(MODITEM);
        entries.add(RAW_MODITEM);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);
        ModItemGroup.registerItemGroups();
//        ItemGroupEvents.modifyEntriesEvent(ModItemGroup.MODBLOCK_GROUP).register(ModItems::addItemsToIngredientItemGroup);
    }

}
