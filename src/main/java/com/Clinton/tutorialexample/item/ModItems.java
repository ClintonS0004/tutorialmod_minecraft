package com.Clinton.tutorialexample.item;

import com.Clinton.tutorialexample.TutorialMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item RAW_MODBLOCK = registerItem("raw_modblock",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item resigterItem(String name, Item item){
        return Registry.register(Registries.ITEM , new Identifier(TutorialMod.MOD_ID, name), item);
    }
//    private static Item registerItem(String name, Item item, ItemGroup group) {
//        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
//        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
//    }


    public static void registerModItems(){
        TutorialMod.LOGGER.debug("Registering Mod Items for " + TutorialMod.MOD_ID);
    }
}
