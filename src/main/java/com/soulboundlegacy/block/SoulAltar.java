package com.soulboundlegacy.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.InteractionHand;

public class SoulAltar extends Block {
    public SoulAltar() {
        super(Properties.copy(Blocks.OBSIDIAN)
                .strength(5.0F, 6.0F)
                .requiresCorrectToolForDrops());
    }
    
    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        if (!level.isClientSide) {
            // Otvori ce se GUI za upravljanje Soul Essence i Tree-om
            player.displayClientMessage(net.minecraft.network.chat.Component.literal("Soul Altar GUI - Uskoro"), false);
        }
        return InteractionResult.SUCCESS;
    }
}