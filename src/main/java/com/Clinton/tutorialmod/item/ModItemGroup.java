package com.Clinton.tutorialmod.item;

import com.Clinton.tutorialmod.TutorialMod;
import com.Clinton.tutorialmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;

public class ModItemGroup {

    public static final ItemGroup MODBLOCK_GROUP = FabricItemGroup.builder()
                .displayName(Text.translatable("itemgroup.tutorialmod.modblock"))
                    .icon(() -> new ItemStack(ModItems.MODITEM)).entries((displayContext, entries) -> {
                        entries.add(ModItems.MODITEM);
                        entries.add(ModItems.MODITEM_NUGGET);
                        entries.add(ModItems.RAW_MODITEM);
                        entries.add(ModItems.METAL_DETECTOR);
//                        entries.add(Items.DIAMOND);
                        entries.add(ModBlocks.MODBLOCK);
                        entries.add(ModBlocks.MODITEM_ORE);
                        entries.add(ModBlocks.RAW_MODBLOCK);
                    }).build();

    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering Item Groups for " + TutorialMod.MOD_ID);
        Registry.register(Registries.ITEM_GROUP, TutorialMod.id("modblock"), MODBLOCK_GROUP);

    }

}