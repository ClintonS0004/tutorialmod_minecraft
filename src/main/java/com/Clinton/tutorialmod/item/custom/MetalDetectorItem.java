package com.Clinton.tutorialmod.item.custom;

import com.Clinton.tutorialmod.block.ModBlocks;
import com.Clinton.tutorialmod.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;

import java.util.Arrays;

public class MetalDetectorItem extends Item {
    public MetalDetectorItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(!context.getWorld().isClient()) {
            BlockPos positionClicked = context.getBlockPos();
            PlayerEntity player = context.getPlayer();
            boolean foundBlock = false;

            for(int i = 0; i <= positionClicked.getY() + 64; i++) {
                BlockState state = context.getWorld().getBlockState(positionClicked.down(i));

                if(isValuableBlock(state)) {
                    outputValuableCoordinates(positionClicked.down(i), player, state.getBlock());
                    foundBlock = true;

                    break;
                }
            }

            if(!foundBlock) {
                player.sendMessage(Text.literal("No Valuables Found!"));
            }
        }

        context.getStack().damage(1, context.getPlayer(),
               EquipmentSlot.MAINHAND);

        return ActionResult.SUCCESS;
    }

    private void outputValuableCoordinates(BlockPos blockPos, PlayerEntity player, Block block) {
        player.sendMessage(Text.literal("Found " + block.asItem().getName().getString() + " at " +
                "(" + blockPos.getX() + ", " + blockPos.getY() + ", " + blockPos.getZ() + ")"), false);
    }

    private Block[] blocksToDetect = {Blocks.IRON_ORE, Blocks.DIAMOND_ORE, Blocks.COAL_ORE,
            Blocks.REDSTONE_ORE, Blocks.COPPER_ORE, Blocks.LAPIS_ORE, Blocks.EMERALD_ORE,
            Blocks.GOLD_ORE, ModBlocks.MODITEM_ORE};

    private boolean isValuableBlock(BlockState state) {
        return Arrays.stream(blocksToDetect).reduce(
                // wow so functional
                false,
                (acc, block) ->  acc || state.isOf(block),
                (block, block2) -> block || block2
        );
    }
    //        for (Block block : blocksToDetect) {
    //            if (state.isOf(block)) {
    //                return true;
    //            }
    //        }
    //        return false;
}
