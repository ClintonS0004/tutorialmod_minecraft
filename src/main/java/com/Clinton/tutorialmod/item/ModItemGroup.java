package com.Clinton.tutorialmod.item;

import com.Clinton.tutorialmod.TutorialMod;
import com.Clinton.tutorialmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

public class ModItemGroup {

    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            TutorialMod.id("ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.modblock"))
                    .icon(() -> new ItemStack(ModItems.MODBLOCK)).entries((displayContext, entries) -> {
                        entries.add(ModItems.MODBLOCK);
                        entries.add(ModItems.RAW_MODBLOCK);
//                        entries.add(Items.DIAMOND);
                        entries.add(ModBlocks.MODBLOCK_BLOCK);
                        entries.add(ModBlocks.RAW_MODBLOCK_BLOCK);
                    }).build());

    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering Item Groups for " + TutorialMod.MOD_ID);
    }

}
