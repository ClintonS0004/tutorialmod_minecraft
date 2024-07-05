package com.Clinton.tutorialmod.item;

import com.Clinton.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {

    public static Identifier id(String path) {
        return Identifier.of(TutorialMod.MOD_ID, path);
    }

    public static final Item RAW_MODBLOCK = registerItem("raw_modblock",
            new Item(new Item.Settings()),
            ModItemGroup.MODBLOCK);
    public static final Item MODBLOCK = registerItem("modblock",
            new Item(new Item.Settings()),
            ModItemGroup.MODBLOCK);

    private static Item registerItem(String name, Item item, RegistryKey<ItemGroup> group){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
//        return Registry.register(Registries.ITEM,
//                id(name),
//                item);
        return Registry.register(Registries.ITEM_GROUP, ModItemGroup.MOD_BLOCK, FabricItemGroup.builder()
                +       .icon(() -> new ItemStack(Items.DIAMOND_PICKAXE))
        +       .displayName(Text.translatable("example-mod.group.example"))
        +       .build()); // build() no longer registers by itself
    }

    public static void registerModItems(){
        TutorialMod.LOGGER.debug("Registering Mod Items for " + TutorialMod.MOD_ID);
    }
}
