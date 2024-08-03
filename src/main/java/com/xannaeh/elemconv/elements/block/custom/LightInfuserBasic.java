package com.xannaeh.elemconv.elements.block.custom;

import com.xannaeh.elemconv.elements.item.ModItems;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

import java.util.List;

public class LightInfuserBasic extends Block {
    public LightInfuserBasic(Properties properties) {
        super(properties);
    }

//    @Override
//    protected InteractionResult useWithoutItem(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, BlockHitResult pHitResult) { // TODO: Give real functionality
//        pLevel.playSound(pPlayer, pPos, SoundEvents.ANVIL_LAND, SoundSource.BLOCKS, 1f, 1f); // just est
//        return InteractionResult.SUCCESS;
//    }

    @Override
    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity) {
        if (pEntity instanceof ItemEntity itemEntity) {
            if (isValidItem(itemEntity.getItem())) {
                itemEntity.setItem(new ItemStack(ModItems.LIGHT_AXE.get(), 1));
            }
        }
        super.stepOn(pLevel, pPos, pState, pEntity);
    }

    private boolean isValidItem(ItemStack item) {
        return item.getItem() == Items.GOLDEN_AXE; //&& item.getItem() == ModItems.LIGHT_ESSENCE.get() count 8;
    }

    public static final String SHIFT_TOOLTIP = "tooltip.elemconv.light_infuser_basic.tooltip.shift";
    public static final String TOOLTIP_LINE_1 = "tooltip.elemconv.light_infuser_basic.tooltip.1";
    @Override
    public void appendHoverText(ItemStack pStack, Item.TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
        if (Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.translatable(TOOLTIP_LINE_1));
        } else {
            pTooltipComponents.add(Component.translatable(SHIFT_TOOLTIP));
        }
        super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
    }
}
