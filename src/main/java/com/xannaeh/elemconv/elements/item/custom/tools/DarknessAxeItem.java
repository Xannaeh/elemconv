package com.xannaeh.elemconv.elements.item.custom.tools;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Objects;

public class DarknessAxeItem extends Item {
    public DarknessAxeItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public @NotNull InteractionResult useOn(UseOnContext pContext) {
        Level level = pContext.getLevel();

        if (!level.isClientSide()) {
            if (level.getBlockState(pContext.getClickedPos()).is(BlockTags.LOGS)) { // TODO: add smelting functionality instead?
                level.destroyBlock(pContext.getClickedPos(), true, pContext.getPlayer());
                pContext.getItemInHand().hurtAndBreak(1, ((ServerLevel) level), ((ServerPlayer) pContext.getPlayer()),
                        item -> Objects.requireNonNull(pContext.getPlayer()).onEquippedItemBroken(item, EquipmentSlot.MAINHAND));
            }
        }

        return InteractionResult.CONSUME;
    }

    public static final String SHIFT_TOOLTIP = "tooltip.elemconv.darkness_axe.tooltip.shift";
    public static final String TOOLTIP_LINE_1 = "tooltip.elemconv.darkness_axe.tooltip.1";
    @Override
    public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
        if (Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.translatable(TOOLTIP_LINE_1));
        } else {
            pTooltipComponents.add(Component.translatable(SHIFT_TOOLTIP));
        }
        super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
    }
}
