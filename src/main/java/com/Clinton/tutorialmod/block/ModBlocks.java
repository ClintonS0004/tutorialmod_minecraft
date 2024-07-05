package com.Clinton.tutorialmod.block;

import com.Clinton.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;

public class ModBlocks {

    public static final Block MODBLOCK_BLOCK = registerBlock("modblock_block",
            new Block(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK)));  //  or .sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    //                                or .create()

    public static final Block RAW_MODBLOCK_BLOCK = registerBlock("raw_modblock_block",
            new Block(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, TutorialMod.id(name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, TutorialMod.id(name),
        new BlockItem(block, new Item.Settings()));
    }
    public  static void registerModBlocks(){
        TutorialMod.LOGGER.info("Registering ModBlocks for " + TutorialMod.MOD_ID);
    }
}
