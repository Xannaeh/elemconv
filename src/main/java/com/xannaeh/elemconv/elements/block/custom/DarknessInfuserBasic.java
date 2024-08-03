package com.xannaeh.elemconv.elements.block.custom;

import com.xannaeh.elemconv.elements.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class DarknessInfuserBasic extends Block {
    public DarknessInfuserBasic(Properties properties) {
        super(properties);
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, BlockHitResult pHitResult) { // TODO: Give real functionality
        pLevel.playSound(pPlayer, pPos, SoundEvents.ANVIL_LAND, SoundSource.BLOCKS, 1f, 1f); // just est
        return InteractionResult.SUCCESS;
    }

    @Override
    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity) {
        if (pEntity instanceof ItemEntity itemEntity) {
            if (isValidItem(itemEntity.getItem())) {
                itemEntity.setItem(new ItemStack(ModItems.DARKNESS_AXE.get(), 1));
            }
        }
        super.stepOn(pLevel, pPos, pState, pEntity);
    }

    private boolean isValidItem(ItemStack item) {
        return item.getItem() == Items.GOLDEN_AXE; //&& item.getItem() == ModItems.DARKNESS_ESSENCE.get() count 8;
    }
}
