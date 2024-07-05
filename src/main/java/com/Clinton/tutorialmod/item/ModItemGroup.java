package com.Clinton.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.impl.itemgroup.FabricItemGroupBuilderImpl;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
//    public static final ItemGroup MODBLOCK = FabricItemGroup.builder()
//            .displayName(Text.literal("Clinton's Blocks"))
//            .icon(() -> new ItemStack(ModItems.RAW_MODBLOCK))
//            .build();
    public static final RegistryKey<ItemGroup> MOD_BLOCK = RegistryKey.of(RegistryKeys.ITEM_GROUP, ModItems.id("Clinton's Blocks"));
}
