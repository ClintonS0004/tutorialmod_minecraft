package com.Clinton.tutorialexample.item;

import com.Clinton.tutorialexample.TutorialMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static Identifier id(String path) {
        return Identifier.of(TutorialMod.MOD_ID, path);
    }

    public static final Item RAW_MODBLOCK = registerItem("raw_modblock",
            new Item(new Item.Settings()));
    public static final Item MODBLOCK = registerItem("modblock",
            new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM,
                id(name),
                item);
    }
//    private static Item registerItem(String name, Item item, ItemGroup group) {
//        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
//        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
//    }


    public static void registerModItems(){
        TutorialMod.LOGGER.debug("Registering Mod Items for " + TutorialMod.MOD_ID);
    }
}
