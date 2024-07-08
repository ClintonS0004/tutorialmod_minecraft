package com.Clinton.tutorialmod.block;

import com.Clinton.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.intprovider.UniformIntProvider;

import static net.minecraft.block.Blocks.IRON_ORE;

public class ModBlocks {

    public static final Block MODBLOCK = registerBlock("modblock",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));  //  or .sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    //                                or .create()

    public static final Block RAW_MODBLOCK = registerBlock("raw_modblock",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK)));

    public static final Block MODITEM_ORE = registerBlock("moditem_ore",
            //new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.copyShallow(IRON_ORE).mapColor(MapColor.DARK_GREEN).strength(2f)));

//    public static final Block MODBLOCK_ORE = registerBlock("modblock_ore",
//            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.copyShallow(IRON_ORE).mapColor(MapColor.DARK_GREEN).strength(2f)));

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
