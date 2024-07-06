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
            TutorialMod.id("modblock"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.modblock"))
                    .icon(() -> new ItemStack(ModItems.MODITEM)).entries((displayContext, entries) -> {
                        entries.add(ModItems.MODITEM);
                        entries.add(ModItems.RAW_MODITEM);
//                        entries.add(Items.DIAMOND);
                        entries.add(ModBlocks.MODBLOCK);
                        entries.add(ModBlocks.RAW_MODBLOCK);
                    }).build());

    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering Item Groups for " + TutorialMod.MOD_ID);
    }

}
